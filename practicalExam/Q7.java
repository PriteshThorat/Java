/*
Write program to implement following operations on database:
    1.Insert record.
    2.Update record.
    3.Delete record.
*/

import java.sql.*;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/student"; 
        String user = "root"; 
        String password = "1234"; 

        Scanner sc = new Scanner(System.in);

        try {
            // Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            while (true) {
                System.out.println("\nChoose Operation:");
                System.out.println("1. Insert Record");
                System.out.println("2. Update Record");
                System.out.println("3. Delete Record");
                System.out.println("4. Exit");
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        String insertSQL = "INSERT INTO students (id, name, age) VALUES (?, ?, ?)";
                        PreparedStatement insertStmt = con.prepareStatement(insertSQL);
                        insertStmt.setInt(1, id);
                        insertStmt.setString(2, name);
                        insertStmt.setInt(3, age);
                        insertStmt.executeUpdate();
                        System.out.println("Record inserted successfully!");
                        break;

                    case 2:
                        System.out.print("Enter ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine(); // consume newline
                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new age: ");
                        int newAge = sc.nextInt();

                        String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                        PreparedStatement updateStmt = con.prepareStatement(updateSQL);
                        updateStmt.setString(1, newName);
                        updateStmt.setInt(2, newAge);
                        updateStmt.setInt(3, updateId);
                        int rowsUpdated = updateStmt.executeUpdate();
                        if (rowsUpdated > 0) {
                            System.out.println("Record updated successfully!");
                        } else {
                            System.out.println("Record not found.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter ID to delete: ");
                        int deleteId = sc.nextInt();

                        String deleteSQL = "DELETE FROM students WHERE id = ?";
                        PreparedStatement deleteStmt = con.prepareStatement(deleteSQL);
                        deleteStmt.setInt(1, deleteId);
                        int rowsDeleted = deleteStmt.executeUpdate();
                        if (rowsDeleted > 0) {
                            System.out.println("Record deleted successfully!");
                        } else {
                            System.out.println("Record not found.");
                        }
                        break;

                    case 4:
                        System.out.println("Exiting program.");
                        con.close();
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
};