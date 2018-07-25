package DB;

import java.sql.*;

public class Global {
    Connection con;
    Statement stmt;
    ResultSet rs;
    
    // constructor starts
    public Global() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/dblibrary";
            con = DriverManager.getConnection(url, "root", "root");
            stmt = con.createStatement();
        }
        catch(Exception e) {
            System.out.println("e");
        }
    }
     // helper functions
    public ResultSet execute(String s) throws Exception {
        rs = stmt.executeQuery(s);
        return rs;
    }
    public void update(String s) throws Exception {
        stmt.executeUpdate(s);
    }
}
