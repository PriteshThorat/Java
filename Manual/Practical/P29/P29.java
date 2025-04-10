import java.sql.*;
import java.util.Scanner;

public class P29 {

    static final String JDBC_URL = "jdbc:mysql://localhost:3306/SampleDB";
    static final String JDBC_USER = "root";
    static final String JDBC_PASSWORD = "your_password";

    public static void main(String[] args) {
        try (
            Connection conn = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
            Scanner scanner = new Scanner(System.in)
        ) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Connected to database.");

            // INSERT
            System.out.println("\n--- Insert Record ---");
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter email: ");
            String email = scanner.nextLine();
            insertUser(conn, name, email);

            // UPDATE
            System.out.println("\n--- Update Record ---");
            System.out.print("Enter ID to update: ");
            int updateId = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Enter new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter new email: ");
            String newEmail = scanner.nextLine();
            updateUser(conn, updateId, newName, newEmail);

            // DELETE
            System.out.println("\n--- Delete Record ---");
            System.out.print("Enter ID to delete: ");
            int deleteId = scanner.nextInt();
            deleteUser(conn, deleteId);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Insert using PreparedStatement
    public static void insertUser(Connection conn, String name, String email) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) inserted.");
    }

    // Update using PreparedStatement
    public static void updateUser(Connection conn, int id, String name, String email) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setInt(3, id);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) updated.");
    }

    // Delete using PreparedStatement
    public static void deleteUser(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) deleted.");
    }
}
