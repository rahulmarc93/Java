package lab_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDatabaseExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        ConnectionDemo connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            statement = connection.createStatement();

            String createTableSQL = "CREATE TABLE Customer ("
                    + "ID INT PRIMARY KEY AUTO_INCREMENT, "
                    + "Name VARCHAR(100), "
                    + "Email VARCHAR(100), "
                    + "Phone VARCHAR(15))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Customer table created successfully!");

            String insertDataSQL = "INSERT INTO Customer (Name, Email, Phone) VALUES "
                    + "('rahul', 'rahul.do@example.com', '1234567890'), "
                    + "('Janav', 'janav.df@example.com', '0987654321')";
            statement.executeUpdate(insertDataSQL);
            System.out.println("Sample data inserted successfully!");

            String selectSQL = "SELECT * FROM Customer";
            resultSet = statement.executeQuery(selectSQL);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String name = resultSet.getString("Name");
                String email = resultSet.getString("Email");
                String phone = resultSet.getString("Phone");

                System.out.println("ID: " + id);
                System.out.println("Name: " + name);
                System.out.println("Email: " + email);
                System.out.println("Phone: " + phone);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}