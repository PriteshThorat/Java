import java.sql.*;

public class Prg_4{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver Loaded");
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to Database created");
            Statement stmt = con.createStatement();
            String querySel = "select * from student1";
            ResultSet rs = stmt.executeQuery(querySel);
            System.out.println("Before Delete a Record");
            int n1 = rs.getMetaData().getColumnCount();
            for(int i = 1; i <= n1; i++){
                System.out.print(rs.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= n1; i++){
                    System.out.println(rs.getString(i) + '\t');
                }
                System.out.println();
            }
            String queryDel = "delete from student1 where id=14";
            stmt.executeUpdate(queryDel);
            rs = stmt.executeQuery(querySel);
            System.out.println("After Delete a Record");

            for(int i = 1; i <= n1; i++){
                System.out.println(rs.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= n1; i++){
                    System.out.println(rs.getString(i) + '\t');
                }
                System.out.println();
            }
        }catch(SQLException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};