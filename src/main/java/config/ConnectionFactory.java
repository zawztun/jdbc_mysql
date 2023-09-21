package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectionFactory {
    Connection con = null;

    public ConnectionFactory() throws SQLException {
        ResourceBundle bundle = ResourceBundle.getBundle("dbconfig");

        String url = bundle.getString("jdbc.url");
        String user = bundle.getString("jdbc.username");
        String psw = bundle.getString("jdbc.password");

        con = DriverManager.getConnection(url, user, psw);
        System.out.println(con);
    }
  public Connection getDBConnection(){
        return this.con;
  }

}
