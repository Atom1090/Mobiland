package com.mobiland.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Eslam
 */
public class DBConnection {

    Connection con;

    public DBConnection() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland", "root", "");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public int insertUser(Customer customer) {
        int result = 0;

        try {
            PreparedStatement insert = con.prepareStatement("insert into customer(fName,lName,email,phone,password,cash,birthdate,job,address,interest) values(?,?,?,?,?,?,?,?,?,?)");
            
            insert.setString(1,customer.getFName());
            insert.setString(2, customer.getLName());
            insert.setString(3, customer.getEmail());
            //insert.setString(4, );
            insert.setString(4, customer.getPhone());
            insert.setString(5, customer.getPassword());
            insert.setString(6, customer.getCash());
            insert.setString(7, customer.getBirthdate());
            insert.setString(8, customer.getJob());
            insert.setString(9, customer.getAddress());
            insert.setString(10, customer.getInterest());
            
            result = insert.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return result;

    }
}
