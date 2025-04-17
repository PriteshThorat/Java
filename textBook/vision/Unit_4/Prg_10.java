import java.sql.*;

public class Prg_10{
    public static void main(String[] args) throws Exception{
        // Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "1234");
        Statement st = c.createStatement();
        st.execute("create table PCMODEL(Industry varchar(50), SNo int, Model varchar(50))");
        st.execute("insert into PCMODEL values('ABC', 1, 'A')");
        st.execute("insert into PCMODEL values('BCD', 2, 'B')");
        st.execute("insert into PCMODEL values('CDE', 3, 'C')");
        ResultSet rs = st.executeQuery("select * from PCMODEL");
        System.out.println("Industry" + "\t" + "SNo" + "\t" + "Model");

        while(rs.next()){
            System.out.println(rs.getString(1) + "\t" + rs.getInt(2) + "\t" + rs.getString(3));
        }
        st.close();
        c.close();
    }
};