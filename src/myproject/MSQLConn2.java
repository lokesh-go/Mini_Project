/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lokesh Chandra
 */
public class MSQLConn2 {
        private static final String username = "2017CA21";
        private static final String password = "2@17C@21";
        private static final String CONN_STRING="jdbc:mysql://172.31.100.41:3306/db2017CA21";
        static Connection conn = null;
        static boolean check2=false;
        MSQLConn2()
        {
             try
             {
                     conn = DriverManager.getConnection(CONN_STRING,username,password); //Connection Established between netbeans and SQL
                     System.out.println("Connected Database..2");    
                     check2=true;
             }
            catch(SQLException e)
            {
                 e.printStackTrace();
                 JOptionPane.showMessageDialog(null, "Database Server 2 is offline..........?????");
            }
         /*   finally{
                 try {
                     conn.close();
                 } catch (SQLException ex) {
                     Logger.getLogger(MSQLConn2.class.getName()).log(Level.SEVERE, null, ex);
                 }
             }*/
        }
       public static void main(String args[])
       {
           new MSQLConn2();
       }
    
}
