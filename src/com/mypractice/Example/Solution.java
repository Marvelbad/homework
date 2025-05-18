package com.mypractice.Example;

import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException, SQLException {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String userName = "root";
        String password = "password";
        String sql = "SELECT id, name, age FROM users WHERE age > ?";

        try (Connection connection = DriverManager.getConnection(url, userName, password);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, 18);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("Connecting to database: ");

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.printf("Пользователь: id=%d, name=%s, age=%d\n", id, name, age);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}