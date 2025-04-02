import java.sql.*;

public class Q1 {
    // Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/school"; // Change database name
    private static final String USER = "root"; // Change to your MySQL username
    private static final String PASSWORD = "password"; // Change to your MySQL password

    public static void main(String[] args) {
        try {
            // 1. Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the database!");

            // 3. Create Student table if not exists
            String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" +
                                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                                    "name VARCHAR(100), " +
                                    "age INT, " +
                                    "grade VARCHAR(10))";

            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTableSQL);
            System.out.println("Student table created successfully!");

            // 4. Insert a student record
            String insertSQL = "INSERT INTO Student (name, age, grade) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            pstmt.setString(1, "John Doe");
            pstmt.setInt(2, 20);
            pstmt.setString(3, "A");

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Record inserted successfully!");
            }

            // 5. Close resources
            pstmt.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

/*
Ensure MySQL is installed and running.

Create a Database in MySQL:

sql
Copy
Edit
CREATE DATABASE school;
Compile and Run the Program:

Add MySQL JDBC driver (mysql-connector-java.jar) to your project.

Compile the program:

nginx
Copy
Edit
javac StudentDatabase.java
Run the program:

nginx
Copy
Edit
java StudentDatabase
Check the Database:

Run this SQL query to verify the record insertion:

sql
Copy
Edit
SELECT * FROM Student;
Expected Output in Console
pgsql
Copy
Edit
Connected to the database!
Student table created successfully!
Record inserted successfully!*/