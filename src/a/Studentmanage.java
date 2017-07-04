/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

  
public class Studentmanage {
  private Connection Studentmanage;
public Connection connect() {
      try {
          Class.forName("com.mysql.jdbc.Driver");
      } catch (ClassNotFoundException ep) {
          System.out.println("errornotimp"+ep);
    
      }  
      try {
          Studentmanage =DriverManager.getConnection("jdbc:mysql://localhost:3306/management","root", "rohit");
      } catch (SQLException ex) {
           System.out.println("errornotimp"+ex);
      }
         
     
      return Studentmanage;
 

}
     public static void main(String[] args) {

         System.out.println("connection successful");
        // TODO code application logic here
    }
    
}
