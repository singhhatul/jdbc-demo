package com.stackroute;

import java.sql.*;

public class JdbcTransactionDemo {
    public void jdbcTransaction() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user", "root", "Root123")) {
            Statement stmt=connection.createStatement();
            connection.setAutoCommit(false);
            stmt.executeUpdate("insert into user values('abhishek',29,'m')");
            stmt.executeUpdate("insert into user values('uma',30,'f')");

            connection.commit();
            ResultSet resultSet = stmt.executeQuery("select * from user");

                while (resultSet.next()) {
                    System.out.println(resultSet.getString(1));
                }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
