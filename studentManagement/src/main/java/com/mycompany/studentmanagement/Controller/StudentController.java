package com.mycompany.studentmanagement.Controller;

import com.mycompany.studentmanagement.Database.Database;
import com.mycompany.studentmanagement.View.DisplayStudent;
import com.mycompany.studentmanagement.View.Model.Student;
import com.mycompany.studentmanagement.View.UpdateStudent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StudentController {
   
    private Connection con;
    
      public StudentController() {
        // Initialize the connection in the constructor
        Database d1 = new Database();
        this.con = d1.getConnection();
    }

    public void addStudent(Student student)  {
       PreparedStatement stmt=null;
       String rollNo=student.getRollNo();
       String name=student.getName();
       int age=student.getAge();
       String grade=student.getGrade();
        try{
           String addQuery="INSERT INTO student_details(rollNo,stuName,stuAge,stuGrade) VALUES(?,?,?,?)";
           stmt=con.prepareStatement(addQuery);
           stmt.setString(1, rollNo);
           stmt.setString(2, name);
           stmt.setInt(3, age);
           stmt.setString(4, grade);
           stmt.executeUpdate();
           JOptionPane.showMessageDialog(null, "Student detail added successfully...");
       }
       catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Check the fields and Try Again..");
       }
        catch(SQLException e){
             JOptionPane.showMessageDialog(null, "SqlException");
        }
    }

    public void removeStudent(String rollNo) {
    PreparedStatement stmt = null;
    try {
        String deleteQuery = "DELETE FROM student_details WHERE rollNo=?";
        stmt = con.prepareStatement(deleteQuery);
        stmt.setString(1, rollNo); 
        int rowsAffected = stmt.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Student details removed successfully...");
            
        } else {
            JOptionPane.showMessageDialog(null, "Student not found with Roll No: " + rollNo);
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Check the fields and Try Again...");
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "SQLException: " + e.getMessage());
    } finally {
       
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
    public void searchStudent(String columnName, String val, JTable tblSearchDetails) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String rollNo = "";
        String name = "";
        String grade = "";
        int age = 0;
        int i = 0;
        try {
            String selectQuery = "";
            switch (columnName) {
                case "RollNo":
                    selectQuery = "SELECT * FROM student_details WHERE rollNo=?";

                    break;
                case "Name":
                    selectQuery = "SELECT * FROM student_details WHERE stuName=?";

                    break;
                case "Age":
                    selectQuery = "SELECT * FROM student_details WHERE stuAge=?";

                    break;
                case "Grade":
                    selectQuery = "SELECT * FROM student_details WHERE stuGrade=?";

                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Search criteria !!!");
                    return;
            }

            stmt = con.prepareStatement(selectQuery);
            if ("RollNo".equals(columnName) || "Name".equals(columnName) || "Grade".equals(columnName)) {
                stmt.setString(1, val);
            } else if ("Age".equals(columnName)) {
                stmt.setInt(1, Integer.parseInt(val));
            }
            DefaultTableModel model = (DefaultTableModel) tblSearchDetails.getModel();
          model.setRowCount(0);
            rs = stmt.executeQuery();

            while (rs.next()) {
                rollNo = rs.getString("rollNo");
                name = rs.getString("stuName");
                grade = rs.getString("stuGrade");
                age = rs.getInt("stuAge");

                model.insertRow(i, new Object[]{rollNo, name, age, grade});
                i++;
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No student details available.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Check the fields and Try Again...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException: " + e.getMessage());
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void displayAllStudents(JTable tblDetails, DisplayStudent d1) {
        PreparedStatement stmt = null;
        ResultSet rs = null;
        String rollNo = "";
        String name = "";
        String grade = "";
        int age = 0;
         int i = 0;
        try {
            String selectQuery = "SELECT * FROM student_details";
            stmt = con.prepareStatement(selectQuery);
            DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();

            rs = stmt.executeQuery();
           
            while (rs.next()) {
                rollNo = rs.getString("rollNo");
                name = rs.getString("stuName");
                grade = rs.getString("stuGrade");
                age = rs.getInt("stuAge");

                model.insertRow(i, new Object[]{rollNo, name, age, grade});
                i++;
            }

            if (model.getRowCount() == 0) {
                JOptionPane.showMessageDialog(null, "No student details available.");
            }

            d1.setVisible(true);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Check the fields and Try Again...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException: " + e.getMessage());
        } finally {

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void updateStudentInfo(String rollNo, String columnName, String updateValue) {
        PreparedStatement stmt = null;
        try {
            String updateQuery = "UPDATE student_details SET " + columnName + "=? WHERE rollNo=?";
            stmt = con.prepareStatement(updateQuery);
            stmt.setString(1, updateValue); 
             stmt.setString(2, rollNo); 
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Student details Updated successfully...");

            } else {
                JOptionPane.showMessageDialog(null, "Student not found with Roll No: " + rollNo);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Check the fields and Try Again...");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "SQLException: " + e.getMessage());
        } finally {
            
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
