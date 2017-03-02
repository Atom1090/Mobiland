package com.mobiland.model;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.http.Part;

/**
 *
 * @author Eslam
 */
public class DBConnection {

    Connection con;

    public DBConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
           /* con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland?"
			+ "user=root&password=Watchdogs#45074452&autoReconnect=true&useSSL=false");*/
           
           con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland","root","");
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    //Ashour
    public int insertUser(Customer customer, Part part) throws IOException {

     int result = 0;

        try {
            PreparedStatement insert = con.prepareStatement("insert into customer(fName,lName,email,phone,password,cash,birthdate,job,address,interest,image) values(?,?,?,?,?,?,?,?,?,?,?)");
            InputStream is = part.getInputStream();
            insert.setString(1,customer.getFName());
            insert.setString(2, customer.getLName());
            insert.setString(3, customer.getEmail());          
            insert.setString(4, customer.getPhone());
            insert.setString(5, customer.getPassword());
            insert.setString(6, customer.getCash());
            insert.setString(7, customer.getBirthdate());
            insert.setString(8, customer.getJob());
            insert.setString(9, customer.getAddress());
            insert.setString(10, customer.getInterest());
            insert.setBinaryStream(11, is,(int) part.getSize());
            
            result = insert.executeUpdate();
            
        } catch (SQLException e) {            
            e.printStackTrace();
        }

        return result;
    }
    
}