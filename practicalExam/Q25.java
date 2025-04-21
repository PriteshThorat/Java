// Write program to Create sample database and Make connectivity with database.

import java.sql.*;

public class Q25 {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/student";  
        String username = "root";                         
        String password = "1234";                  

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to MySQL database!");

            Statement stmt = conn.createStatement();

            String createTable = "CREATE TABLE IF NOT EXISTS students1 (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY," +
                    "name VARCHAR(100)," +
                    "age INT)";
            stmt.executeUpdate(createTable);
            System.out.println("Table 'students1' created or already exists.");

            String insert = "INSERT INTO students1 (name, age) VALUES ('Alice', 22)";
            stmt.executeUpdate(insert);
            System.out.println("Inserted sample student record.");

            ResultSet rs = stmt.executeQuery("SELECT * FROM students1");
            System.out.println("\n--- Student Records ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Age: " + rs.getInt("age"));
            }

            rs.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();  
        } finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
};