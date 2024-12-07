package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SalaryLogTrigger {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        try (ConnectionDemo conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Create Salary_Log table for data in this file only
            String createTableSQL = "CREATE TABLE Salary_Log (" +
                                    "log_id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "employee_id INT, " +
                                    "new_salary DECIMAL(10,2), " +
                                    "change_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP)";
            stmt.executeUpdate(createTableSQL);

            // Create trigger
            String createTriggerSQL = "CREATE TRIGGER after_salary_insert " +
                                      "AFTER INSERT ON Salary_Log " +
                                      "FOR EACH ROW " +
                                      "BEGIN " +
                                      "INSERT INTO Salary_Log (employee_id, new_salary) " +
                                      "VALUES (NEW.employee_id, NEW.new_salary); " +
                                      "END";
            stmt.executeUpdate(createTriggerSQL);

            System.out.println("Table and trigger created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
