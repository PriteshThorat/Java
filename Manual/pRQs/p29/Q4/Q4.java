import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q4 {
    public static void main(String[] args) {
        // 1. DB connection info
        String url = "jdbc:mysql://localhost:3306/student"; // Database: student
        String user = "root";                                // MySQL username
        String password = "1234";                   // Change this!

        // 2. SQL UPDATE query
        String updateQuery = "UPDATE Student SET name = ?, grade = ? WHERE id = ?";

        try {
            // 3. Connect to DB
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL.");

            // 4. Prepare the UPDATE statement
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, "Alice Cooper");  // New name
            pstmt.setString(2, "A+");            // New grade
            pstmt.setInt(3, 2);                  // Student ID to update

            // 5. Execute the update
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully!");
            } else {
                System.out.println("No record found with that ID.");
            }

            // 6. Close connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error during update.");
            e.printStackTrace();
        }
    }
};