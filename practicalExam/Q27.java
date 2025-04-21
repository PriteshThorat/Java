// Write program to demonstrate the use of PreparedStatement.

import java.sql.*;

public class Q27 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234"; 

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            String insertSQL = "INSERT INTO employees (name, salary) VALUES (?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            pstmt.setString(1, "John Doe");
            pstmt.setDouble(2, 50000.0);
            pstmt.executeUpdate();
            System.out.println("Inserted employee record.");

            String selectSQL = "SELECT * FROM employees WHERE salary > ?";
            pstmt = conn.prepareStatement(selectSQL);
            pstmt.setDouble(1, 30000.0);

            ResultSet rs = pstmt.executeQuery();
            System.out.println("\n--- Employees with Salary > 30000 ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Salary: " + rs.getDouble("salary"));
            }

            String updateSQL = "UPDATE employees SET salary = ? WHERE name = ?";
            pstmt = conn.prepareStatement(updateSQL);
            pstmt.setDouble(1, 60000.0);
            pstmt.setString(2, "John Doe");
            int rowsUpdated = pstmt.executeUpdate();
            System.out.println("\nRows Updated: " + rowsUpdated);

            rs.close();
            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};