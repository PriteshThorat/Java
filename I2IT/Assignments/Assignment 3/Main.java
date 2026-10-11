import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

class Database {
    static String fileName = "database.csv";

    static void initial () {
        try {
            File file = new File(fileName);

            file.createNewFile();

            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.write("Roll No.,Name,Email,Enrollment No.,Phone No.");

            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    void insertData (String rollNo, String name, String email, String enrollmentNo, String phoneNo) throws Exception {
        FileWriter fileWriter = new FileWriter(fileName, true);

        fileWriter.append("\n");

        fileWriter.append(rollNo + ",");
        fileWriter.append(name + ",");
        fileWriter.append(email + ",");
        fileWriter.append(enrollmentNo + ",");
        fileWriter.append(phoneNo + ",");

        fileWriter.close();
    }

    void updateData (String rollNo, String name, String email, String enrollmentNo, String phoneNo) throws Exception {
        File file = new File(fileName);

        Scanner fileData = new Scanner(file);
        String updatedData = "";

        while (fileData.hasNextLine()) {
            String line = fileData.nextLine();

            if (line.contains(rollNo)) {
                updatedData += rollNo;
                updatedData += ",";
                updatedData += name;
                updatedData += ",";
                updatedData += email;
                updatedData += ",";
                updatedData += enrollmentNo;
                updatedData += ",";
                updatedData += phoneNo;
                updatedData += "\n";
            } else {
            	updatedData += line;
            	updatedData += '\n';
            }
        }
        
        FileWriter fileWriter = new FileWriter(fileName);
        
        fileWriter.write(updatedData);

        fileData.close();
        fileWriter.close();
    }

    Boolean searchData (String rollNo) throws Exception {
        File file = new File(fileName);
        FileWriter fileWriter = new FileWriter(fileName, true);

        Scanner fileData = new Scanner(file);

        while (fileData.hasNextLine()) {
            String line = fileData.nextLine();

            if (line.contains(rollNo)) {
                System.out.println(line);
                
                fileData.close();
                fileWriter.close();
                
                return true;
            }
        }

        fileData.close();
        fileWriter.close();
        
        return false;
    }


    void deleteData () throws Exception {
    	File file = new File(fileName);

        Scanner fileData = new Scanner(file);
        String updatedData = "";

        while (fileData.hasNextLine()) {
            String line = fileData.nextLine();

            if (line.contains("Roll")) {
            	updatedData += line;
            }
        }
        
        FileWriter fileWriter = new FileWriter(fileName);
        
        fileWriter.write(updatedData);

        fileData.close();
        fileWriter.close();
    }

    void showData () throws Exception {
        File file = new File(fileName);

        Scanner fileData = new Scanner(file);

        while (fileData.hasNextLine()) {
            System.out.println(fileData.nextLine());
        }

        fileData.close();
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            Database database = new Database();
            Scanner sc = new Scanner(System.in);
            File file = new File("database.csv");

            file.createNewFile();

            FileWriter fileWriter = new FileWriter(file.getName());

            int choice = 7;

            Database.initial();

            do {
                System.out.println("----- MENU -----");
                System.out.println("1. Insert the Record");
                System.out.println("2. Update the Record");
                System.out.println("3. Search the Record");
                System.out.println("4. Delete the Record");
                System.out.println("5. Display the Record");
                System.out.println("6. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                String rollNo, name, email, enrollmentNo, phoneNo;

                try {
                    switch (choice) {
                        case 1:
                            System.out.print("Enter the Roll No.: ");
                            rollNo = sc.next();
                            System.out.print("Enter the Name: ");
                            name = sc.next();
                            System.out.print("Enter the Email: ");
                            email = sc.next();
                            System.out.print("Enter the Enrollment No: ");
                            enrollmentNo = sc.next();
                            System.out.print("Enter the Phone No.: ");
                            phoneNo = sc.next();

                            database.insertData(rollNo, name, email, enrollmentNo, phoneNo);
                            break;
                        case 2:
                            System.out.print("Enter the Roll No. of which you want to update the data: ");
                            rollNo = sc.next();
                            
                            Boolean isAvailable = database.searchData(rollNo);
                            
                            if (!isAvailable) {
                            	System.out.println("Roll No. not found in Database.");
                            	
                            	break;
                            }
                            
                            System.out.print("Enter the Name: ");
                            name = sc.next();
                            System.out.print("Enter the Email: ");
                            email = sc.next();
                            System.out.print("Enter the Enrollment No: ");
                            enrollmentNo = sc.next();
                            System.out.print("Enter the Phone No.: ");
                            phoneNo = sc.next();

                            database.updateData(rollNo, name, email, enrollmentNo, phoneNo);
                            break;
                        case 3:
                            System.out.print("Enter the Roll No.: ");
                            rollNo = sc.next();

                            Boolean isFind = database.searchData(rollNo);
                            
                            if (!isFind) {
                            	System.out.println("Roll No. not found in Database.");
                            }
                            break;
                        case 5:
                            database.showData();
                            break;
                        case 4:
                            database.deleteData();
                            break;
                        case 6:
                            System.out.println("Program Terminated.");
                            break;
                        default:
                            break;
                    }
                } catch (Exception e) {
                    System.out.println(e);
                }
            } while (choice != 6);

            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}