package lab_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCustomer {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        // SQL query to insert data into the Customer table
        String insertQuery = "INSERT INTO Customer (customerID, name, email, phone) VALUES (?, ?, ?, ?)";

        try (ConnectionDemo conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            // Set the values for the placeholders in the SQL query
            pstmt.setInt(1, 1); // Example customer ID
            pstmt.setString(2, "John Doe");
            pstmt.setString(3, "john.doe@example.com");
            pstmt.setString(4, "1234567890");

            // Execute the insert operation
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new customer was inserted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
