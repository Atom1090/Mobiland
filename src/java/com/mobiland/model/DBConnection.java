package com.mobiland.model;

import com.mobiland.controller.StatusHandler;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.http.Part;

/**
 *
 * @author Eslam
 */
public class DBConnection {

    Connection con;

    public DBConnection() throws SQLException{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
//Hatem Alamir driver
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland?"
			+ "user=root&password=Splinter_Cell#4507&autoReconnect=true&useSSL=false");

//Islam Ashour driver
           //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland","root","");
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
    
	//Added  by Hatem Al-Amir
	public int sigIn(String email, String password)
	{
		try{
			PreparedStatement stmnt = con.prepareStatement("select  password from customer where email=(?);");
			
			stmnt.setString(1, email);
			
			ResultSet rs = stmnt.executeQuery();
			
			if(rs.next())
			{
				String passwd = rs.getString("password");
				
				if(passwd != null && passwd.equals(passwd))
					return StatusHandler.SUCCESS;
				return StatusHandler.ERR_LOGIN_PASSWD;
			}

			return StatusHandler.ERR_LOGIN_EMAIL;
		} catch(SQLException ex)
		{
			ex.printStackTrace();
			return StatusHandler.ERR_DB_CONN;
		}
	}
	
	public Customer getCustomer(String email)
	{
		try{
			PreparedStatement stmnt = con.prepareStatement("select  * from customer where email=(?);");
			
			stmnt.setString(1, email);
			
			ResultSet rs = stmnt.executeQuery();
			
			if(rs.next())
			{
				Customer customer = new Customer();
				
				customer.setId(rs.getInt("id"));
				customer.setFName(rs.getString("fName"));
				customer.setLName(rs.getString("lName"));
				customer.setEmail(rs.getString("email"));
				customer.setImage(rs.getBytes("image"));
				customer.setPhone(rs.getString("phone"));
				customer.setPassword(rs.getString("password"));
				customer.setCash(rs.getString("cash"));
				customer.setBirthdate(rs.getDate("birthdate").toString());
				customer.setJob(rs.getString("job"));
				customer.setAddress(rs.getString("address"));
				customer.setInterest(rs.getString("interest"));
				
				return customer;
			}

			return null;
		} catch(SQLException ex)
		{
			ex.printStackTrace();
			return null;
		}
	}
	//End of Hatem Al-Amir additions
}
