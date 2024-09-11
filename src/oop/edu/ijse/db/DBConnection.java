/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.edu.ijse.db;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author dinuka
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection connection;
    
    private final String url = "jdbc:mysql://localhost/Supermarket";
    private final String user = "dinuka";
    private final String password = "Lakmal@0512";
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url,user,password);
   }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dBConnection == null){
            dBConnection = new DBConnection();
        }
        return dBConnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}
