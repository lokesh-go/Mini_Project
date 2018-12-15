/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Lokesh Chandra
 */
public class MSQLConnection {
        private static final String username = "cyber";
        private static final String password = "cyber";
        private static final String CONN_STRING="jdbc:mysql://172.31.77.251:3307/MiniProject";
        static Connection conn = null;
        static boolean check = false;
        MSQLConnection()
        {
             try
             {
                     conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
                     System.out.println("Connected Database..1");                          //Database connection Successful message
                     check = true;
             }
            catch(SQLException e)
            {
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Database Server 1 is offline..........????");
            }
        }
       public static void main(String args[])
       {
           new MSQLConnection();
       }
}
