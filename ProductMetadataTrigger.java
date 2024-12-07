package mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ProductMetadataTrigger {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anudip";
        String user = "root";
        String password = "1Rahulaman@";

        try (ConnectionDemo conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            // Create products table
            String createProductsTableSQL = "CREATE TABLE products (" + 
            								"product_id INT PRIMARY KEY AUTO_INCREMENT, " +
                                            "product_name VARCHAR(10), " +
                                            "price DECIMAL(10,2))";
            stmt.executeUpdate(createProductsTableSQL);

            // Create Product_Metadata table
            String createProductMetadataTableSQL = "CREATE TABLE Product_Metadata (" +
                                                   "product_id INT, " +
                                                   "last_modified TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP)";
            stmt.executeUpdate(createProductMetadataTableSQL);

            // Create trigger
            String createTriggerSQL = "CREATE TRIGGER after_product_insert " +
                                      "AFTER INSERT ON products " +
                                      "FOR EACH ROW " +
                                      "BEGIN " +
                                      "INSERT INTO Product_Metadata (product_id) " +
                                      "VALUES (NEW.product_id); " +
                                      "END";
            stmt.executeUpdate(createTriggerSQL);

            System.out.println("Tables and trigger created successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
