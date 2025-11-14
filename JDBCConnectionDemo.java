import java.sql.*;
public class JDBCConnectionDemo {
    public static void main(String[] args) throws Exception {
        Connection con = DriverManager.getConnection(
          "jdbc:mysql://localhost:3306/mydb", "root", "pass");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM users");
        while(rs.next()) {
            System.out.println(rs.getString("name"));
        }
        con.close();
    }
}
