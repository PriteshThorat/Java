import java.sql.*;

public class Prg_7{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");

            Statement st = con.createStatement();
            String query = "select * from emp";
            ResultSet rs = st.executeQuery(query);

            while(rs.next()){
                System.out.println("Emp No: " + rs.getInt(1));
                System.out.println("Emp Name: " + rs.getString(2));
                System.out.println("Emp Adddress: " + rs.getString(3));
                System.out.println("Emp Salary: " + rs.getInt(4));
                System.out.println();
            }
            con.close();
        }/*catch(ClassNotFoundException e){
            e.printStackTrace();
        }*/catch(SQLException e){
            e.printStackTrace();
        }
    }
};