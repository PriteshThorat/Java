import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q5 {
    public static void main(String[] args) {
        // 1. Database connection details
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234";  // Replace with your actual password

        // 2. SQL delete statement
        String deleteQuery = "DELETE FROM Student WHERE id = ?";

        try {
            // 3. Connect to MySQL
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // 4. Prepare and set the ID
            PreparedStatement pstmt = conn.prepareStatement(deleteQuery);
            pstmt.setInt(1, 1);  // Delete student with id = 1

            // 5. Execute delete
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student record deleted successfully!");
            } else {
                System.out.println("No student found with the given ID.");
            }

            // 6. Close connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error during deletion.");
            e.printStackTrace();
        }
    }
};