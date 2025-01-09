package javacode.PreparedStatement.src;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String uname = "postgres";
        String pass = "0000";
        String url = "jdbc:postgresql://localhost:5432/Demo";

        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connected to DB");

        String sql = "insert into test values (?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, "4");
        pst.setString(2, "Madhav");
        pst.setInt(3, 78);

        pst.execute();

        con.close();
        System.out.println("connected closed");
    }
}