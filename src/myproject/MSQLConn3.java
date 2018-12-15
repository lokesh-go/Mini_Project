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
import static myproject.MSQLConnection.conn;

/**
 *
 * @author Lokesh Chandra
 */
public class MSQLConn3 {
        private static final String username = "root";
        private static final String password = "sony";
        private static final String CONN_STRING="jdbc:mysql://localhost:3306/myproject";
        static Connection conn = null;
        
        MSQLConn3()
        {
            try
            {
                     conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
                     System.out.println("Connected Database..3");  
            }
            catch(SQLException e)
            {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database Server 3 is offline..........?????");
            }
        }
        public static void main(String args[])
        {
            new MSQLConn3();
        }
}
