/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagementsystem.project;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql?zeroDateTimeBehavior=convertToNull","root","");
            
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitalprojectone", "root", "");
            System.out.println("Connected");
            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
