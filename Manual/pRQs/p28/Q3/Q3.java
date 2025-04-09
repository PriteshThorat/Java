import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q3 {
    public static void main(String[] args) {
        // 1. DB Connection details
        String url = "jdbc:mysql://localhost:3306/student"; // DB name = student
        String user = "root";                                // Your MySQL username
        String password = "1234";                   // Your MySQL password

        // 2. SQL Insert Query
        String insertQuery = "INSERT INTO Student (id, name, age, grade) VALUES (?, ?, ?, ?)";

        try {
            // 3. Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("✅ Connected to MySQL!");

            // 4. Prepare and set values
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            pstmt.setInt(1, 2);                   // id
            pstmt.setString(2, "Alice Johnson");  // name
            pstmt.setInt(3, 20);                  // age
            pstmt.setString(4, "A");              // grade

            // 5. Execute insert
            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("✅ Record inserted successfully!");
            }

            // 6. Close connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error during insertion.");
            e.printStackTrace();
        }
    }
};