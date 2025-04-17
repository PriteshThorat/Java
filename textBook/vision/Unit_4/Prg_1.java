import java.sql.*;

public class Prg_1{
    public static void main(String[] args){
        try{
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            //System.out.println("Driver Loaded");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
            System.out.println("Connection to Database Created");
        }catch(SQLException e){
            System.out.println("Error " + e);
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
};