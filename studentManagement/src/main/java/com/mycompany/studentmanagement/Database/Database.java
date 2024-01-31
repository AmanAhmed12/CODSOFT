package com.mycompany.studentmanagement.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {

    private static final String JDBC_URL = "jdbc:mysql://localhost/codsoft";
    private static final String USER = "Aman";
    private static final String PASSWORD = "amn@3078";

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error connecting to the database: " + e.getMessage(), e);
        }
    }
}
