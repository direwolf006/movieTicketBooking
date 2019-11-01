/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movieticketbookingsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import movieticketbookingsystem.Authentication.LoginPage;
import movieticketbookingsystem.MainModules.HomePage;

/**
 *
 * @author ritte
 */
public class MovieTicketBookingSystem {

    /**
     * @param args the command line arguments
     */
    public static Connection connection;
    public static Statement statement;
    
   
    public static Connection getConnection() throws Exception{
    try{
        String URL="jdbc:mysql://localhost:3306/movieTicketBookingSystem";
        String userName="ritteshdbms";
        String password="27Dwl@mas27";
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        connection=DriverManager.getConnection(URL,userName,password);
        System.out.println("Driver load successful"); 
        }
        catch(SQLException exception){
            System.out.println("Driver load failed"+exception.getMessage());
        }
        return connection;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        LoginPage loginPage=new LoginPage();
        loginPage.setVisible(true);
    }
    
}
