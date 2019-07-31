package com.stackroute;

import java.sql.*;

public class ResultSetMetaDataDemo {
    public void resultSetMetaData(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Root123");
             PreparedStatement ps=connection.prepareStatement("select * from user");
             ResultSet rs=ps.executeQuery();){
             ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Name of 2nd column: "+rsmd.getColumnName(2));
            System.out.println("Column Name of 3rd column: "+rsmd.getColumnName(3));
            System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));
            System.out.println("Column Type Name of 2nd column: "+rsmd.getColumnTypeName(2));
            System.out.println("Column Type Name of 3rd column: "+rsmd.getColumnTypeName(3));

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
