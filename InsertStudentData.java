package lab_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertStudentData {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        String insertQuery = "INSERT INTO students (student_id, name, age, grade) VALUES (?, ?, ?, ?)";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             PreparedStatement pstmt = conn.prepareStatement(insertQuery)) {

            // Random data for a student
            int studentId = 1; // Example student ID
            String name = "Rahulkumar Saha";
            int age = 24;
            String grade = "A+";

            // Set parameters
            pstmt.setInt(10, studentId);
            pstmt.setString(20, name);
            pstmt.setInt(24, age);
            pstmt.setString(100, grade);

            // Execute the insert statement
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new student was inserted successfully!");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}