package com.stackroute;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RowSetDemo {
    public void rowSetDemo() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //Creating and Executing RowSet
        try (JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();) {
            rowSet.setUrl("jdbc:mysql://localhost:3306/user");
            rowSet.setUsername("root");
            rowSet.setPassword("Root123");

            rowSet.setCommand("select * from user");
            rowSet.execute();

            while (rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Name: " + rowSet.getString(1)+" Age: " + rowSet.getInt(2)+" Gender: " + rowSet.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
