/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.edu.ijse;

import java.sql.SQLException;
import oop.edu.ijse.db.DBConnection;

/**
 *
 * @author dinuka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        System.out.println("Hello");
        DBConnection.getInstance().getConnection();
    }
    
}
