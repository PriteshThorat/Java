import java.sql.*;

public class Prg_3{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
            Statement st = con.createStatement();
            String query = "select * from student1 where id=2";
            ResultSet rs = st.executeQuery(query);
            rs.next();
            System.out.println("Roll No: " + rs.getInt(1));
            System.out.println("Name: " + rs.getString(2));
            System.out.println("Marks: " + rs.getInt(4));
            con.close(); 
        }/*catch(ClassNotFoundException e){
            e.printStackTrace();
        }*/catch(SQLException se){
            se.printStackTrace();
        }
    }
};