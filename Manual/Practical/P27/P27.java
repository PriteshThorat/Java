import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class P27 {

    // JDBC URL, username and password of MySQL server
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/";
    static final String JDBC_USER = "root";
    static final String JDBC_PASSWORD = "1234";

    // Database name
    static final String DB_NAME = "SampleDB";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL server (without selecting a database)
            connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            statement = connection.createStatement();

            // Create database
            String createDatabaseSQL = "CREATE DATABASE IF NOT EXISTS " + DB_NAME;
            statement.executeUpdate(createDatabaseSQL);
            System.out.println("Database created successfully or already exists.");

            // Now connect to the newly created database
            connection = DriverManager.getConnection(JDBC_URL + DB_NAME, JDBC_USER, JDBC_PASSWORD);
            statement = connection.createStatement();

            // Optional: Create a sample table
            /*
            String createTableSQL = "CREATE TABLE IF NOT EXISTS users (" +
                                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                                    "name VARCHAR(100), " +
                                    "email VARCHAR(100))";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'users' created.");

            // Optional: Insert sample data
            String insertDataSQL = "INSERT INTO users (name, email) VALUES ('Alice', 'alice@example.com')";
            statement.executeUpdate(insertDataSQL);
            System.out.println("Sample data inserted.");
            */

        } catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Database error occurred.");
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
