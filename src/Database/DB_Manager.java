/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Eldridge
 */
public class DB_Manager {
   
    public boolean add_textile(String customer_name)
    {
        DBConnection dbc = new DBConnection();
        Connection conn = dbc.getConnection();
        
        ResultSet rs = null;
    }
    
    
}
