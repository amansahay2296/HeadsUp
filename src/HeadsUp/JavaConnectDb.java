/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HeadsUp;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.*;


/**
 *
 * @author MAHE
 */
public class JavaConnectDb {
    Connection con=null;
    public static Connection ConnecNDb () {
                
                
                try
                {
                
                        Class.forName("oracle.jdbc.driver.OracleDriver");
                  
                        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","C##AMAN","password");
                        return con;
                } catch(Exception e)
                {
                        JOptionPane.showMessageDialog(null,e);
                }
                
    return null;
    
            }
    
}
