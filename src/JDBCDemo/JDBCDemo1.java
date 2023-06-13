package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String url="jdbc:mysql://localhost/db8am";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);

        // 3 creating statement
        Statement st = con.createStatement();

        // 4. executing a query (insert / update /delete) - DML
    //    String sql = "insert into student values(1,'Amol','Comp',67)";

      //  String sql = "update student set branch='IT',marks=100 where rno=1";
        String sql = "delete from student where rno=1";


        st.executeUpdate(sql);

    }
}
