package com.stackroute;

import java.sql.*;

public class JdbcBasicDemo {

    public void displayUser() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Root123");
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("select * from user");) {

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
        //demo to use prepared statement
        public void getUserByName(String name){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Root123")){

                 PreparedStatement statement = connection.prepareStatement("select age from user where name= ?");
                 statement.setString(1,name);
                 ResultSet resultSet = statement.executeQuery(); {

                while (resultSet.next()) {
                    System.out.println(resultSet.getInt(1));
                }
            }
            }catch (SQLException e) {
                e.printStackTrace();
            }


        }
    }

