// Write program to retrieve data from table using ResultSet interface.(Use various methods of navigation methods).

import java.sql.*;

public class Q28 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234"; 

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            System.out.println("\n--- Using next() ---");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " | " + rs.getString("name") + " | " + rs.getDouble("salary"));
            }

            System.out.println("\n--- Using last() ---");
            if (rs.last()) {
                System.out.println("Last row: " + rs.getString("name"));
            }

            System.out.println("\n--- Using first() ---");
            if (rs.first()) {
                System.out.println("First row: " + rs.getString("name"));
            }

            System.out.println("\n--- Using absolute(3) ---");
            if (rs.absolute(3)) {
                System.out.println("Row 3: " + rs.getString("name"));
            }

            System.out.println("\n--- Using relative(-1) ---");
            if (rs.relative(-1)) {
                System.out.println("Move 1 row back: " + rs.getString("name"));
            }

            System.out.println("\n--- Using previous() ---");
            if (rs.previous()) {
                System.out.println("Move 1 row back again: " + rs.getString("name"));
            }

            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};