package lab_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateCustomer {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        // SQL query to update data in the Customer table
        String updateQuery = "UPDATE Customer SET name = ?, email = ?, phone = ? WHERE customerID = ?";

        try (ConnectionDemo conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(updateQuery)) {

            // Set the values for the placeholders in the SQL query
            pstmt.setString(1, "ram");
            pstmt.setString(2, "janake@example.com");
            pstmt.setString(3, "0987654321");
            pstmt.setInt(4, 1); // updating the existing data

            // Execute the update operation
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("An existing customer was updated successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}