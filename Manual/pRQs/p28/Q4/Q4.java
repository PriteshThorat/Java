import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q4 {
    public static void main(String[] args) {
        // 1. Database connection info
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234"; // Replace with your MySQL password

        // 2. SQL update query
        String updateQuery = "UPDATE Student SET grade = ? WHERE id = ?";

        try {
            // 3. Connect to database
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // 4. Prepare the statement
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);
            pstmt.setString(1, "A+"); // New grade
            pstmt.setInt(2, 1);       // Student ID to update

            // 5. Execute update
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