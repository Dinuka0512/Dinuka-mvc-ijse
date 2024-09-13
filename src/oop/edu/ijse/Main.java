/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.edu.ijse;

import java.sql.SQLException;
import oop.edu.ijse.view.CustomerView;

/**
 *
 * @author dinuka
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        CustomerView v1 = new CustomerView();
        v1.setLocationRelativeTo(null);
        v1.setVisible(true);
    }
    
}
