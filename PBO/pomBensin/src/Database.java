
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tiwi tidak diakui
 */
public class Database {
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/pombensin";
    
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "";
    
    static Connection conn = null;
    static Statement stmt = null;
      
    static Connection connection(){
        
        try{
            Class.forName(JDBC_DRIVER);
            System.out.println("Connecting to database");
            System.out.println("...");
            conn = (Connection) DriverManager.getConnection(DB_URL, DB_USERNAME,DB_PASSWORD);
            
            if(conn != null){
                System.out.println("SUKSES");
            }
            
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
