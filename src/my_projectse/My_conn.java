

package my_projectse;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class My_conn {
    
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="my_projectse";
    private static Integer portname=3306;
    private static String pass="";
    private static String conn_string="jdbc:mysql://localhost:3306/my_projectse";
//  private static  String host = "jdbc:mysql://" 
//              + System.getenv().get("OPENSHIFT_MYSQL_DB_HOST") 
//              + ":" 
//              + System.getenv().get("OPENSHIFT_MYSQL_DB_PORT") 
//              + "/serverside";
    
    
    public static Connection getConnection(){
      Connection conn=null;
      
        
//                    MysqlDataSource datasource=new MysqlDataSource();
//        datasource.setServerName(servername);
//       // datasource.setServerName(host);
//        datasource.setUser(username);
//        datasource.setPassword(pass);
//        datasource.setDatabaseName(dbname);
//        datasource.setPortNumber(portname);
//
//        
//        try {
//            conn=datasource.getConnection();
//        } catch (SQLException ex) {
//            Logger.getLogger("Get Connection ->"+My_conn.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        
        
//        try {
//                conn=DriverManager.getConnection(conn_string,username,pass);
//                System.out.println("Connected");
//        } catch (SQLException ex) {
//            Logger.getLogger(My_conn.class.getName()).log(Level.SEVERE, null, ex);
//        }


        try {
            Class.forName("com.mysql.jdbc.Driver");
          try {
               conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/my_projectse","root","");
          } catch (SQLException ex) {
              Logger.getLogger(My_conn.class.getName()).log(Level.SEVERE, null, ex);
          }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(My_conn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
        
    }
}
