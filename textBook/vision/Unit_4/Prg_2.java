import java.sql.*;

public class Prg_2{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Connection has been successfully established");
        }catch(Exception e){ }
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
            Statement st = con.createStatement();
            st.executeUpdate("insert into student1 values(1, 'Vijay', 'Thane', 80)");
            st.executeUpdate("insert into student1 values(2, 'Sanjay', 'Kalyan', 70)");
            st.executeUpdate("insert into student1 values(3, 'Umesh', 'Pune', 60)");
            st.executeUpdate("insert into student1 values(4, 'Santosh', 'Thane', 75)");
            st.executeUpdate("insert into student1 values(5, 'Anjum', 'Mumbai', 60)");

            System.out.println();
            ResultSet rs = st.executeQuery("select * from student1");
            while(rs.next()){
                System.out.println("Roll No: " + rs.getInt(1));
                System.out.println("Studnet Name: " + rs.getString(2));
                System.out.println("Student Address: " + rs.getString(3));
                System.out.println("Studnet Marks: " + rs.getInt(4));
                System.out.println();
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
};