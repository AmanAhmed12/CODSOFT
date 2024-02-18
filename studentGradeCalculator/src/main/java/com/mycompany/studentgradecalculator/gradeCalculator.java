
package com.mycompany.studentgradecalculator;

import java.awt.Window;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class gradeCalculator extends javax.swing.JFrame {
int totalMarks=0;
    public gradeCalculator() {
        initComponents();
        
    }
    
    private boolean isInRange(int value) {
    return value >= 0 && value <= 100;
}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIt = new javax.swing.JTextField();
        txtMath = new javax.swing.JTextField();
        txtSci = new javax.swing.JTextField();
        txtEng = new javax.swing.JTextField();
        txtTam = new javax.swing.JTextField();
        btnCal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetail = new javax.swing.JTable();
        btnAnalysis = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnQuitBut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 51));
        jLabel3.setText("Subjects");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 73, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("IT");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 54, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Science");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 54, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tamil");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 460, 54, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("English");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, 54, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Maths");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 54, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 0, 51));
        jLabel9.setText("Marks");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 270, 61, -1));

        txtIt.setBackground(new java.awt.Color(204, 204, 204));
        txtIt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtIt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtIt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 304, 180, -1));

        txtMath.setBackground(new java.awt.Color(204, 204, 204));
        txtMath.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtMath.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtMath, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 342, 180, -1));

        txtSci.setBackground(new java.awt.Color(204, 204, 204));
        txtSci.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtSci.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtSci, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 380, 180, -1));

        txtEng.setBackground(new java.awt.Color(204, 204, 204));
        txtEng.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtEng.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtEng, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 180, -1));

        txtTam.setBackground(new java.awt.Color(204, 204, 204));
        txtTam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtTam.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtTam, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 180, -1));

        btnCal.setBackground(new java.awt.Color(204, 204, 204));
        btnCal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCal.setForeground(new java.awt.Color(153, 0, 51));
        btnCal.setText("Calculate");
        btnCal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalMouseEntered(evt);
            }
        });
        btnCal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalActionPerformed(evt);
            }
        });
        jPanel1.add(btnCal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 540, -1, 30));

        tblDetail.setBackground(new java.awt.Color(204, 204, 204));
        tblDetail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        tblDetail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tblDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "<html><b>NAME</b></html>", "<html><b>SUBJECTS</b></html>", "<html><b>MARKS</b></html>"
            }
        ));
        jScrollPane1.setViewportView(tblDetail);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 530, 172));

        btnAnalysis.setBackground(new java.awt.Color(204, 204, 204));
        btnAnalysis.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btnAnalysis.setForeground(new java.awt.Color(153, 0, 51));
        btnAnalysis.setText("Analyze");
        btnAnalysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalysisActionPerformed(evt);
            }
        });
        jPanel1.add(btnAnalysis, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, 120, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Student Name:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 110, -1));

        txtName.setBackground(new java.awt.Color(204, 204, 204));
        txtName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtName.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(102, 102, 102), null, null));
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 260, 40));

        btnClear.setBackground(new java.awt.Color(204, 204, 204));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(153, 0, 51));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel1.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, 120, 30));

        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 1, 50)); // NOI18N
        jLabel1.setText("Student Grade Calculator");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 770, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/codeSoft.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 433, 100));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 0, 51));
        jLabel11.setText("Marks_Details");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        btnQuitBut.setBackground(new java.awt.Color(204, 204, 204));
        btnQuitBut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQuitBut.setForeground(new java.awt.Color(153, 0, 51));
        btnQuitBut.setText("Quit");
        btnQuitBut.setBorder(null);
        btnQuitBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnQuitButMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnQuitButMouseExited(evt);
            }
        });
        btnQuitBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitButActionPerformed(evt);
            }
        });
        jPanel1.add(btnQuitBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 30, 100, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg1.jpeg"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalActionPerformed
        String it = txtIt.getText();
        String math = txtMath.getText();
        String science = txtSci.getText();
        String english = txtEng.getText();
        String tamil = txtTam.getText();

        if (it.equals("") || math.equals("") || science.equals("") || english.equals("") || tamil.equals("")) {
            JOptionPane.showMessageDialog(null, "Please Enter the marks for each subject");
        } else {
            DefaultTableModel model = (DefaultTableModel) tblDetail.getModel();

            try {
                int itMarks = Integer.parseInt(it);
                int mathMarks = Integer.parseInt(math);
                int scienceMarks = Integer.parseInt(science);
                int englishMarks = Integer.parseInt(english);
                int tamilMarks = Integer.parseInt(tamil);
                String name=txtName.getText();

                if (isInRange(itMarks) && isInRange(mathMarks) && isInRange(scienceMarks) && isInRange(englishMarks) && isInRange(tamilMarks)) {
                    
                    Object[] row1 = {name, "IT", itMarks};
                    Object[] row2 = {"", "Math", mathMarks};
                    Object[] row3 = {"", "Science", scienceMarks};
                    Object[] row4 = {"", "English", englishMarks};
                    Object[] row5 = {"", "Tamil", tamilMarks};

                    model.insertRow(0, row1);
                    model.insertRow(1, row2);
                    model.insertRow(2, row3);
                    model.insertRow(3, row4);
                    model.insertRow(4, row5);
                   
                    for(int j=0;j<=4;j++){
                            int value=(int) model.getValueAt(j, 2);
                          
                            totalMarks=totalMarks+value;
                        }
                        
                      model.setValueAt("Total Marks:", 6, 0);
                    model.setValueAt(totalMarks, 6, 2);

                    model.setValueAt("Average Percentage(%):", 7, 0);
                    double avgPercentage = totalMarks / 500.0 * 100;
                    model.setValueAt(avgPercentage, 7, 2);
                        
                        
                         model.setValueAt("Grade:",8,0);
                         
                         if(avgPercentage>=75){
                              model.setValueAt("A",8,2);
                         }
                         else if(avgPercentage>=65){
                               model.setValueAt("B",8,2);
                         }
                          else if(avgPercentage>=55){
                               model.setValueAt("C",8,2);
                         }
                          else if(avgPercentage>=35){
                               model.setValueAt("S",8,2);
                         }
                          else{
                              model.setValueAt("W",8,2);
                          }
                       
                        
                        
                        
                } else {
                    JOptionPane.showMessageDialog(null, "Marks should be between 0 and 100");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Invalid input. Please enter valid numeric marks.");
            }
        }
    }//GEN-LAST:event_btnCalActionPerformed

    private void btnAnalysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalysisActionPerformed
        Analysis a1=new Analysis();
        a1.showChart(tblDetail,a1);
       
    }//GEN-LAST:event_btnAnalysisActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtIt.setText("");
        txtMath.setText("");
        txtSci.setText("");
        txtEng.setText("");
        txtTam.setText("");
        txtName.setText("");
        totalMarks=0;

        DefaultTableModel model = (DefaultTableModel) tblDetail.getModel();

        int rowCount = model.getRowCount();
        int columnCount = model.getColumnCount();

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < columnCount; col++) {
                model.setValueAt("", row, col); // Set cell value to an empty string
            }
    }//GEN-LAST:event_btnClearActionPerformed
}
    private void btnCalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCalMouseEntered

    private void btnQuitButMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitButMouseEntered
       
    }//GEN-LAST:event_btnQuitButMouseEntered

    private void btnQuitButMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnQuitButMouseExited
       
    }//GEN-LAST:event_btnQuitButMouseExited

    private void btnQuitButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitButActionPerformed
        int result = JOptionPane.showConfirmDialog(this, "Are you sure you want to quit?", "Confirmation", JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {

            for (Window window : Window.getWindows()) {
                if (window instanceof gradeCalculator) {
                    ((gradeCalculator) window).dispose();
                }
            }
        }
    }//GEN-LAST:event_btnQuitButActionPerformed
    

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gradeCalculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalysis;
    private javax.swing.JButton btnCal;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnQuitBut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDetail;
    private javax.swing.JTextField txtEng;
    private javax.swing.JTextField txtIt;
    private javax.swing.JTextField txtMath;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSci;
    private javax.swing.JTextField txtTam;
    // End of variables declaration//GEN-END:variables
}
