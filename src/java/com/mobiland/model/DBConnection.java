package com.mobiland.model;

import com.mobiland.controller.StatusHandler;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.http.Part;

/**
 *
 * @author Eslam
 */
public class DBConnection {

    private final Connection con;

    public DBConnection() throws SQLException{
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
//Hatem Alamir driver
           con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland?"
			+ "user=hatem&password=Splinter_Cell#4507&autoReconnect=true&useSSL=false");

//Islam Ashour driver
           //con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland","root","");
    }
    
    //Ashour
    public int insertUser(Customer customer, Part part) throws IOException {

     int result = StatusHandler.ERR_DB_PROC;

        try {
			PreparedStatement check = con.prepareStatement("select email from customer where email=(?)");
			check.setString(1, customer.getEmail());
			ResultSet rs = check.executeQuery();
			if(rs.next())
				result = StatusHandler.ERR_SIGNUP_EMAIL;
			else
			{
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

				if(insert.executeUpdate() != 0)
					result = StatusHandler.SUCCESS;
			}
            
        } catch (SQLException e) {
			if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException)
				result = StatusHandler.ERR_SIGNUP_EMAIL;
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
	
	public Customer getCustomer(String email) throws SQLException
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
				Blob blob = rs.getBlob("image");
				customer.setImage(blob.getBytes(1, (int)blob.length()));
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
	
	public Product getProductById(int prodId) throws SQLException
	{
		PreparedStatement statement = con.prepareStatement("select  * from product where productId=(?);");
		statement.setInt(1, prodId);
		
		ResultSet rs = statement.executeQuery();
		
		if(rs.next())
		{
			Product product = new Product();
			product.setProductId(rs.getInt("productId"));
			product.setName(rs.getString("name"));
			product.setDesc(rs.getString("desc"));
			Blob img = rs.getBlob("image");
			product.setImage(img.getBytes(1, (int)img.length()));
			product.setSerialNumber(rs.getString("serialNumber"));
			product.setPrice(rs.getDouble("price"));
			product.setQuantity(rs.getInt("quantity"));
			return product;
		}
		
		return null;
	}
	
	public Product getProductByCategory(String category, int index) throws SQLException
	{
		if(index >= 0)
		{
			PreparedStatement statement = con.prepareStatement("select * from product;");

			ResultSet rs = statement.executeQuery();

			if(category.equals("latest"))
			{
				rs.afterLast();
				while(rs.previous())
				{
					if(index == 0)
					{
						Product product = new Product();
						product.setProductId(rs.getInt("productId"));
						product.setName(rs.getString("name"));
						product.setDesc(rs.getString("desc"));
						Blob img = rs.getBlob("image");
						product.setImage(img.getBytes(1, (int)img.length()));
						product.setSerialNumber(rs.getString("serialNumber"));
						product.setPrice(rs.getDouble("price"));
						product.setQuantity(rs.getInt("quantity"));
						return product;
					}
					else if(index > 0)
						index--;
					else
						break;
				}
			}
		}
		return null;
	}
	
	public ArrayList<Product> getProducts() throws SQLException
	{
		PreparedStatement ps = con.prepareStatement("select  * from product;");
		
		ResultSet productSet = ps.executeQuery();
		
		ArrayList<Product> products = new ArrayList<>();
		
		Product product;
		while(productSet.next())
		{
			product = new Product();
			
			product.setProductId(productSet.getInt("productId"));
			product.setName(productSet.getString("name"));
			product.setDesc(productSet.getString("desc"));
			product.setImage(productSet.getBytes("image"));
			product.setSerialNumber(productSet.getString("serialNumber"));
			product.setPrice(productSet.getDouble("price"));
			product.setQuantity(productSet.getInt("quantity"));
			
			products.add(product);
		}
		
		return products;
	}
	//End of Hatem Al-Amir additions
}
