import java.sql.*;

public class P30{

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/SampleDB";
    static final String JDBC_USER = "root";
    static final String JDBC_PASSWORD = "your_password";

    public static void main(String[] args) {
        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            // Create scrollable, read-only ResultSet
            Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY
            );

            // Execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            System.out.println("\n--- FORWARD DIRECTION (next()) ---");
            while (rs.next()) {
                printRow(rs);
            }

            System.out.println("\n--- BACKWARD DIRECTION (previous()) ---");
            while (rs.previous()) {
                printRow(rs);
            }

            System.out.println("\n--- FIRST ROW ---");
            if (rs.first()) {
                printRow(rs);
            }

            System.out.println("\n--- LAST ROW ---");
            if (rs.last()) {
                printRow(rs);
            }

            System.out.println("\n--- ABSOLUTE (Row 2) ---");
            if (rs.absolute(2)) {
                printRow(rs);
            }

            System.out.println("\n--- RELATIVE (+1 from current) ---");
            if (rs.relative(1)) {
                printRow(rs);
            }

            System.out.println("\n--- BEFORE FIRST ---");
            rs.beforeFirst();
            if (rs.next()) {
                System.out.println("After beforeFirst(), first row is:");
                printRow(rs);
            }

            System.out.println("\n--- AFTER LAST ---");
            rs.afterLast();
            if (rs.previous()) {
                System.out.println("After afterLast(), last row is:");
                printRow(rs);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Helper method to print a row
    private static void printRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        String email = rs.getString("email");
        System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
    }
};