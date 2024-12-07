package lab_14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteCustomer {
    public static void main(String[] args) {
        // Database connection details
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        // SQL query to delete data from the Customer table
        String deleteQuery = "DELETE FROM Customer WHERE customerID = ?";

        try (ConnectionDemo conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(deleteQuery)) {

            // Set the value for the placeholder in the SQL query
            pstmt.setInt(1, 1); // customer ID

            // Execute the delete operation
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("A customer was deleted successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}