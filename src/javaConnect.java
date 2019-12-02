/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purba
 */
import java.sql.*;
import javax.swing.*;
public class javaConnect {
    //Connection con=null;
    public  static Connection ConnecrDB(){
        try{
          Class.forName("org.sqlite.JDBC");
            Connection con = DriverManager.getConnection("jdbc:sqlite:AdminInfo.sqlite");
            //Connection con = DriverManager.getConnection("jdbc:sqlite:AdminInfoSS.sqlite");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
