package JDBCDemo;
import java.sql.*;

public class JDBCDemo2 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 1. loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2. creating a connection

        String url="jdbc:mysql://localhost/730batch";
        String username = "root";
        String password = "root";
        Connection con = DriverManager.getConnection(url,username,password);

        // 3 creating statement
        Statement st = con.createStatement();

        // 4. executing query //  DDL
        String sql = "select * from student";

        ResultSet rs = st.executeQuery(sql);

        while(rs.next())
        {
            System.out.print(rs.getInt("rno")+"\t");
            System.out.print(rs.getString("name")+"\t");
            System.out.print(rs.getString("branch")+"\t");
            System.out.println(rs.getInt("marks"));
        }


    }
}
