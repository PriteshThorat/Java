import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Q3 {
    public static void main(String[] args) {
        // 1. DB connection info
        String url = "jdbc:mysql://localhost:3306/student";
        String user = "root";
        String password = "1234"; // Replace with your password

        // 2. SQL SELECT query
        String selectQuery = "SELECT * FROM Student";

        try {
            // 3. Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to MySQL!");

            // 4. Create Statement & Execute Query
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);

            // 5. Process and display results
            System.out.println("Student Records:");
            System.out.println("-------------------------------");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String grade = rs.getString("grade");

                System.out.println("ID: " + id + ", Name: " + name +
                                   ", Age: " + age + ", Grade: " + grade);
            }

            // 6. Close connection
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error retrieving data.");
            e.printStackTrace();
        }
    }
};