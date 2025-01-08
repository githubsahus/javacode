package javacode.CRUDOperation.src;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        /*steps to connect to database
         * 1.import package
         * 2.load and register driver
         * 3.create connection
         * 4.create and execute statement
         * 5.process the result
         * 6.close connection
         * */
        String url = "jdbc:postgresql://localhost:5432/Demo";
        String uname = "postgres";
        String pass = "0000";

//        String sql = "select * from test";
//        String sql = "insert into test values ('4', 'Mahesh', 53)";
//        String sql = "update test set sname='cherry' where sid='1'";
        String sql = "delete from test where sid='4'";
        //load and resgister driver which is optional since from jdbc 4, its done internally
        Class.forName("org.postgresql.Driver");
        //create connection by passing creds
        Connection con = DriverManager.getConnection(url, uname, pass);
        System.out.println("Connection Success..");
        //create statement
        Statement st = con.createStatement();
        //execute statement
        ResultSet rs = st.executeQuery(sql);
        //process the result
//        rs.next();
//        System.out.println("Student name - "+rs.getString("sname"));

        //process all the result
        while(rs.next()){
            System.out.print("sid - "+rs.getString(1));
            System.out.print(", sname - "+rs.getString(2)+", marks - "+rs.getInt(3));
            System.out.println(", marks - "+rs.getInt(3));
        }
        //close connection
        con.close();
        System.out.println("Connected closed...");
    }
}