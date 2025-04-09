import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class Q1 {

    public static void main(String[] args) {
        // MySQL database credentials
        String jdbcURL = "jdbc:mysql://localhost:3306/student"; // 'school' is the database name
        String username = "root"; // replace with your MySQL username
        String password = "1234"; // replace with your MySQL password

        Connection connection = null;

        try {
            // Connect to database
            connection = DriverManager.getConnection(jdbcURL, username, password);
            Statement statement = connection.createStatement();

            // Create Student table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" +
                                    "id INT PRIMARY KEY," +
                                    "name VARCHAR(100)," +
                                    "age INT," +
                                    "grade VARCHAR(10)" +
                                    ")";
            statement.executeUpdate(createTableSQL);
            System.out.println("Table 'Student' created successfully.");

            // Insert a record into Student table
            String insertSQL = "INSERT INTO Student (id, name, age, grade) " +
                               "VALUES (1, 'John Doe', 20, 'A')";
            statement.executeUpdate(insertSQL);
            System.out.println("Record inserted successfully.");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
};