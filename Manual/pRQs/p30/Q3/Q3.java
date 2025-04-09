import java.sql.*;

public class Q3 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234"; // Replace with your MySQL password

        String query = "SELECT * FROM Student";

        try {
            // 1. Load and connect
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database.");

            // 2. Create scrollable ResultSet
            Statement stmt = conn.createStatement(
                    ResultSet.TYPE_SCROLL_INSENSITIVE,
                    ResultSet.CONCUR_READ_ONLY
            );

            ResultSet rs = stmt.executeQuery(query);

            // 3. Navigate: Move to first
            if (rs.first()) {
                System.out.println("\n First Record:");
                printRow(rs);
            }

            // 4. Navigate: Move to last
            if (rs.last()) {
                System.out.println("\n Last Record:");
                printRow(rs);
            }

            // 5. Navigate: Move to 2nd row using absolute()
            if (rs.absolute(2)) {
                System.out.println("\n Absolute(2):");
                printRow(rs);
            }

            // 6. Navigate: Move back one row using relative()
            if (rs.relative(-1)) {
                System.out.println("\n Relative(-1):");
                printRow(rs);
            }

            // 7. Navigate: Iterate all rows forward using next()
            System.out.println("\n All Records using next():");
            rs.beforeFirst(); // Reset cursor before first
            while (rs.next()) {
                printRow(rs);
            }

            // 8. Optional: Iterate backward using previous()
            System.out.println("\n All Records using previous():");
            rs.afterLast(); // Set cursor after last
            while (rs.previous()) {
                printRow(rs);
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println(" Database error:");
            e.printStackTrace();
        }
    }

    // Helper method to print one row
    public static void printRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String name = rs.getString("name");
        int age = rs.getInt("age");
        String grade = rs.getString("grade");

        System.out.println("ID: " + id + ", Name: " + name +
                           ", Age: " + age + ", Grade: " + grade);
    }
};