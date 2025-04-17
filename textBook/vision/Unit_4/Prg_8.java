import java.sql.*;

public class Prg_8{
    public static void main(String[] args){
        System.out.println("Listing all table name in database");
        Connection con = null;

        String url = "jdbc:mysql://localhost:3306/";
        String db = "student";
        String driver = "com.mysql.jdbc.Driver";
        String username = "root";
        String pass = "1234";
        try{
            // Class.forName(driver);
            con = DriverManager.getConnection((url + db), username, pass);
            try{
                DatabaseMetaData dbm = con.getMetaData();
                String[] types = {"TABLE"};
                ResultSet rs = dbm.getTables(null, null, "%", types);
                System.out.println("Table name: ");
                while(rs.next()){
                    String table = rs.getString("TABLE_NAME");
                    System.out.println(table);
                }
                con.close();
            }catch(SQLException e){
                System.out.println("No any table in the database");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
};