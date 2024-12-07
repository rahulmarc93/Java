package lab_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.CallableStatement;
import java.sql.SQLException;

public class InsertStudentDataCallable {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        String insertProcedure = "{CALL insert_student(?, ?, ?, ?)}";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             CallableStatement cstmt = conn.prepareCall(insertProcedure)) {

            // Random data for a student
            int studentId = 1; // Example student ID
            String name = "Rahulkumar Saha";
            int age = 24;
            String grade = "A+";

            // Set parameters
            cstmt.setInt(10, studentId);
            cstmt.setString(20, name);
            cstmt.setInt(24, age);
            cstmt.setString(100, grade);

            // Execute the callable statement
            cstmt.execute();
            System.out.println("A new student was inserted successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}