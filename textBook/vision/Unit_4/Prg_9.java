import java.sql.*;

public class Prg_9{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student1");
            System.out.println("Name \t\t Roll Number \t\t Percentage");
            while(rs.next()){
                System.out.println(rs.getString(2) + "\t\t" + rs.getInt(1) + "\t\t\t" + rs.getString(4));
            }
            rs.close();
            st.close();
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};