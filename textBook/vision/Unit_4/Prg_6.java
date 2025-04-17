import java.sql.*;

public class Prg_6{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Connection has been successfully established");
        }catch(Exception e){}
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
            Statement st = con.createStatement();
            st.executeUpdate("insert into t1 values('ABC', 2356, 2390, '50MB')");
            st.executeUpdate("insert into t1 values('TATA', 2556, 3390, '2GB')");
            st.executeUpdate("insert into t1 values('ABC', 2356, 1390, '90MB')");
            st.executeUpdate("insert into t1 values('Nokia', 1356, 12390, '1GB')");
            st.executeUpdate("insert into t1 values('ABC', 2350, 23900, '3GB')");

            ResultSet rs = st.executeQuery("select * from t1 where company like 'ABC'");
            System.out.println("Mobiles belongs to ABC Company");
            int n = rs.getMetaData().getColumnCount();
            for(int i = 1; i <= n; i++){
                System.out.print(rs.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= n; i++){
                    System.out.print(rs.getString(i) + '\t');
                }
                System.out.println();
            }
            System.out.println();
            ResultSet rs1 = st.executeQuery("select * from t1 order by cost");
            System.out.println("Records in ascending order by cost");
            int n1 = rs1.getMetaData().getColumnCount();

            for(int i = 1; i <= n1; i++){
                System.out.print(rs1.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs1.next()){
                for(int i = 1; i <= n1; i++){
                    System.out.print(rs1.getString(i) + '\t');
                }
                System.out.println();
            }
            con.close();
        }catch(SQLException e){
            System.out.println(e);
        }
    }
};