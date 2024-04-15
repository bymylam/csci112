import java.sql.*;

public class JDBCDemo{
    public static void main(String[] args) throws SQLException{
        try{Class.forName("org.sqlite.JDBC"); }
        catch(Exception e) {e.printStackTrace();}

        String url = "jdbc:sqlite:/C:\\Users\\nlam12\\Desktop\\Data.db";
        Connection con = DriverManager.getConnection(url);

        Statement statement = con.createStatement();

        String sql = "DROP TABLE Division";
        statement.execute(sql);

        //create table
        sql = "CREATE TABLE Division (\n"
        + "Division_ID integer PRIMARY KEY,\n"
        + "name text);";
        statement.execute(sql);

        //inserting a value into a table:
        sql = "INSERT INTO Division (Division_ID, name)"
        + "VALUES(001, 'div1');";
        statement.execute(sql);

        System.out.println("Hello");
    }
}