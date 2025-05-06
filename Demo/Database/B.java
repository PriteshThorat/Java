import java.io.*;
import java.sql.*;

public class B {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

            PreparedStatement pstmt = con.prepareStatement("select * from emp where eid=?");
            pstmt.setInt(1, 14);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                System.out.println("EID: " + rs.getInt("EID"));
                System.out.println("EName: " + rs.getString("EName"));
            }

            rs.close();
            pstmt.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};