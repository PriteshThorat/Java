import java.sql.*;
import java.io.*;
import java.util.*;

public class A {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); 

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("select * from emp");

            while(rs.next()){
                System.out.println("EID: " + rs.getInt("EID"));
                System.out.println("EName: " + rs.getString("EName"));
                System.out.println("-------------------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};