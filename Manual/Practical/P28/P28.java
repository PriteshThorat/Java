import java.sql.*;
import java.util.Scanner;

public class P28 {

    // Database credentials
    static final String JDBC_URL = "jdbc:mysql://localhost:3306/SampleDB";
    static final String JDBC_USER = "root";
    static final String JDBC_PASSWORD = "your_password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the database
            Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);

            while (true) {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Insert Record");
                System.out.println("2. Update Record");
                System.out.println("3. Delete Record");
                System.out.println("4. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter email: ");
                        String email = scanner.nextLine();
                        insertRecord(connection, name, email);
                        break;

                    case 2:
                        System.out.print("Enter ID to update: ");
                        int updateId = scanner.nextInt();
                        scanner.nextLine(); // consume newline
                        System.out.print("Enter new name: ");
                        String newName = scanner.nextLine();
                        System.out.print("Enter new email: ");
                        String newEmail = scanner.nextLine();
                        updateRecord(connection, updateId, newName, newEmail);
                        break;

                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = scanner.nextInt();
                        deleteRecord(connection, deleteId);
                        break;

                    case 4:
                        connection.close();
                        System.out.println("Connection closed. Goodbye!");
                        return;

                    default:
                        System.out.println("Invalid option.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }

    public static void insertRecord(Connection conn, String name, String email) throws SQLException {
        String sql = "INSERT INTO users (name, email) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) inserted.");
    }

    public static void updateRecord(Connection conn, int id, String name, String email) throws SQLException {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, name);
        stmt.setString(2, email);
        stmt.setInt(3, id);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) updated.");
    }

    public static void deleteRecord(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM users WHERE id = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        int rows = stmt.executeUpdate();
        System.out.println(rows + " record(s) deleted.");
    }
};