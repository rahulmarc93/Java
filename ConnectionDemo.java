package lab_13;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            ConnectionDemo connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connection established successfully!");

            connection.close();	
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}