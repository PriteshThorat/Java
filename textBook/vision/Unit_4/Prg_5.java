import java.sql.*;

public class Prg_5{
    public static void main(String[] args){
        try{
            // Class.forName("sun.jdbc.odbc.JdbcODbcDriver");
            System.out.println("Driver Loaded");
            String url = "jdbc:mysql://localhost:3306/student";
            String username = "root";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection to Database created");
            Statement stmt = con.createStatement();
            String querySel = "select * from student1";
            ResultSet rs = stmt.executeQuery(querySel);
            System.out.println("Before Changes");
            int n1 = rs.getMetaData().getColumnCount();
            for(int i = 1; i <= n1; i++){
                System.out.print(rs.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= n1; i++){
                    System.out.print(rs.getString(i) + '\t');
                }
                System.out.println();
            }
            String queryIns = "insert into student1(id, name, place, marks) values (9, 'Satish', '', 95)";
            String queryDel = "delete from student1 where id=6";
            String queryUpd = "update student1 set name='John' where id=5";
            
            stmt.executeUpdate(queryIns);
            stmt.executeUpdate(queryDel);
            stmt.executeUpdate(queryUpd);

            rs = stmt.executeQuery(querySel);
            System.out.println("After Changes");

            for(int i = 1; i <= n1; i++){
                System.out.print(rs.getMetaData().getColumnLabel(i) + '\t');
            }
            System.out.println();
            while(rs.next()){
                for(int i = 1; i <= n1; i++){
                    System.out.print(rs.getString(i) + '\t');
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