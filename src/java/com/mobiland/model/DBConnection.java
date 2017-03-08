package com.mobiland.model;

import com.mobiland.controller.StatusHandler;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

/**
 *
 * @author Eslam
 */
public class DBConnection {

    private final Connection con;

    public DBConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

//Hatem Alamir driver
           /*con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland?"
         + "user=hatem&password=Splinter_Cell#4507&autoReconnect=true&useSSL=false");*/
//Islam Ashour driver
        //    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland","root","");
        //shaaban drive 
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland", "root", "root");
    }

    //Added by Ashour-----------------------------
    public int insertUser(Customer customer, Part part) throws IOException {

        int result = StatusHandler.ERR_DB_PROC;

        try {
            PreparedStatement check = con.prepareStatement("select email from customer where email=(?)");
            check.setString(1, customer.getEmail());
            ResultSet rs = check.executeQuery();
            if (rs.next()) {
                result = StatusHandler.ERR_SIGNUP_EMAIL;
            } else {
                PreparedStatement insert = con.prepareStatement("insert into customer(fName,lName,email,phone,password,cash,birthdate,job,address,interest,image) values(?,?,?,?,?,?,?,?,?,?,?)");
                InputStream is = part.getInputStream();
                insert.setString(1, customer.getFName());
                insert.setString(2, customer.getLName());
                insert.setString(3, customer.getEmail());
                insert.setString(4, customer.getPhone());
                insert.setString(5, customer.getPassword());
                insert.setDouble(6, customer.getCash());
                insert.setString(7, customer.getBirthdate());
                insert.setString(8, customer.getJob());
                insert.setString(9, customer.getAddress());
                insert.setString(10, customer.getInterest());
                insert.setBinaryStream(11, is, (int) part.getSize());

                if (insert.executeUpdate() != 0) {
                    result = StatusHandler.SUCCESS;
                }
            }

        } catch (SQLException e) {
            if (e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException) {
                result = StatusHandler.ERR_SIGNUP_EMAIL;
            }
            e.printStackTrace();
        }
        return result;
    }

    public int updateUser(Customer customer) throws IOException {

        int result = StatusHandler.ERR_DB_PROC;

        try {
            PreparedStatement update = con.prepareStatement("update customer set fName=? ,lName=? ,phone=? ,email=? ,address=? where id=?");

            update.setString(1, customer.getFName());
            System.out.println("fname is" + customer.getFName());
            update.setString(2, customer.getLName());
            update.setString(3, customer.getPhone());
            update.setString(4, customer.getEmail());
            update.setString(5, customer.getAddress());

            update.setInt(6, customer.getId());

            if (update.executeUpdate() != 0) {
                result = StatusHandler.SUCCESS;
            }

        } catch (SQLException e) {
            if (e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException) {
                result = StatusHandler.ERR_SIGNUP_EMAIL;
            }
            e.printStackTrace();
        }
        System.out.println("update statement" + result);
        return result;
    }

    public int updateUserPhoto(Customer customer, Part part) {
        int result = StatusHandler.ERR_DB_PROC;
        try {

            PreparedStatement pr = con.prepareStatement("update customer set image=? where id=? ");
            InputStream is = part.getInputStream();
            pr.setBinaryStream(1, is, (int) part.getSize());
            pr.setInt(2, customer.getId());
            if (pr.executeUpdate() != 0) {
                result = StatusHandler.SUCCESS;
            }
            System.out.println("result inside updatefunction" + result);

        } catch (SQLException ex) {
            ex.printStackTrace();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return result;
    }

    public Cards getCard(String serial) {
        try {
            PreparedStatement pr = con.prepareStatement("select * from cards where serial=?");
            pr.setString(1, serial);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                Cards card = new Cards();
                card.setAmount(rs.getDouble("amount"));
                card.setCardId(rs.getInt("cardId"));
                card.setSerial(rs.getString("serial"));

                return card;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public int updateUserCash(Customer customer, double cash) {
        int result = StatusHandler.ERR_DB_PROC;
        try {
            PreparedStatement pr = con.prepareStatement("update customer set cash=? where id=?");
            pr.setDouble(1, cash);
            pr.setInt(2, customer.getId());
            if (pr.executeUpdate() != 0) {
                result = StatusHandler.SUCCESS;
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return result;
    }

    public void deleteCard(String serial) {
        try {
            PreparedStatement pr = con.prepareStatement("delete from cards where serial=?");
            pr.setString(1, serial);
            pr.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
	//End of Ashour Addition -------------------------

    //Added  by Hatem Al-Amir
    public int sigIn(String email, String password) {
        try {
            PreparedStatement stmnt = con.prepareStatement("select  password from customer where email=(?);");

            stmnt.setString(1, email);

            ResultSet rs = stmnt.executeQuery();

            if (rs.next()) {
                String passwd = rs.getString("password");

                if (passwd != null && passwd.equals(passwd)) {
                    return StatusHandler.SUCCESS;
                }
                return StatusHandler.ERR_LOGIN_PASSWD;
            }

            return StatusHandler.ERR_LOGIN_EMAIL;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return StatusHandler.ERR_DB_CONN;
        }
    }

    public Customer getCustomer(String email) throws SQLException {
        try {
            PreparedStatement stmnt = con.prepareStatement("select  * from customer where email=(?);");

            stmnt.setString(1, email);

            ResultSet rs = stmnt.executeQuery();

            if (rs.next()) {
                Customer customer = new Customer();

                customer.setId(rs.getInt("id"));
                customer.setFName(rs.getString("fName"));
                customer.setLName(rs.getString("lName"));
                customer.setEmail(rs.getString("email"));
                Blob blob = rs.getBlob("image");
                customer.setImage(blob.getBytes(1, (int) blob.length()));
                customer.setPhone(rs.getString("phone"));
                customer.setPassword(rs.getString("password"));
                customer.setCash(rs.getDouble("cash"));
                customer.setBirthdate(rs.getString("birthdate").toString());
                customer.setJob(rs.getString("job"));
                customer.setAddress(rs.getString("address"));
                customer.setInterest(rs.getString("interest"));

                return customer;
            }

            return null;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<Product> getProducts() throws SQLException {
        PreparedStatement ps = con.prepareStatement("select  * from product;");

        ResultSet productSet = ps.executeQuery();

        ArrayList<Product> products = new ArrayList<>();

        Product product;
        while (productSet.next()) {
            product = new Product();

            product.setProductId(productSet.getInt("productId"));
            product.setName(productSet.getString("name"));
            product.setDesc(productSet.getString("desc"));
            product.setImage(productSet.getBytes("image"));
            product.setSerialNumber(productSet.getString("serialNumber"));
            product.setPrice(productSet.getDouble("price"));
            product.setQuantity(productSet.getInt("quantity"));
        }
        return null;
    }
    //End of Hatem Al-Amir additions
//start of shaaban 

    public Admin loginAdmin(Admin admin) throws SQLException {
        Admin newadmin = null;

        String sql = "select * from admin where email =? and password =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, admin.getEmail());
        pst.setString(2, admin.getPassword());
        ResultSet rs = pst.executeQuery();
        while (rs.next()) {
            newadmin = new Admin();
            newadmin.setId(rs.getInt(1));
            newadmin.setUsername(rs.getString(2));
            newadmin.setEmail(rs.getString(3));
            newadmin.setPassword(rs.getString(4));

        }

        return newadmin;
    }

    public boolean signUp(Admin admin) throws SQLException {

        String sql = "insert into admin values()where email =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, admin.getUsername());
        pst.setString(1, admin.getEmail());
        pst.setString(1, admin.getPassword());
        int i = pst.executeUpdate();
        if (i > 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean update(Admin admin) throws SQLException {

        String sql = "update admin set username =? , email=?, password= ? where id =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, admin.getUsername());
        pst.setString(2, admin.getEmail());
        pst.setString(3, admin.getPassword());
        pst.setInt(4, admin.getId());
        int i = pst.executeUpdate();
        if (i > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean insertAdmin(Admin admin) throws IOException {

        int result = 0;

        try {
            PreparedStatement insert = con.prepareStatement("insert into admin(username,email,password) values(?,?,?)");

            insert.setString(1, admin.getUsername());
            insert.setString(2, admin.getEmail());
            insert.setString(3, admin.getPassword());
            result = insert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean addProduct(Product product, Part productImage) throws SQLException, IOException {
        int result = 0;
        try {
            PreparedStatement insertProduct = con.prepareStatement("INSERT INTO product ( `name`, `desc`, `image` , `serialNumber`, `price`, `quantity`) VALUES  (?,?,?,?,?,?)");
            InputStream is = productImage.getInputStream();
            insertProduct.setString(1, product.getName());
            insertProduct.setString(2, product.getDesc());
            insertProduct.setBinaryStream(3, is, (int) productImage.getSize());
            insertProduct.setString(4, product.getSerialNumber());
            insertProduct.setDouble(5, product.getPrice());
            insertProduct.setInt(6, product.getQuantity());
            result = insertProduct.executeUpdate();

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }
        if (result > 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean deleteProduct(int id) {
        int flag = 0;
        try {
            PreparedStatement pst = con.prepareStatement("delete from product where productId=? ");
            pst.setInt(1, id);
            flag = pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }

        if (flag > 0) {
            return true;
        }
        return false;
    }

    public boolean updateProduct(Product product, Part p) {
        int flag = 0;

        try {
            InputStream is = p.getInputStream();
            PreparedStatement pst = con.prepareStatement("update product set `price`=? ,`desc`=?, `image`=? ,`quantity`=? where `productId`=? ");
            pst.setDouble(1, product.getPrice());
            pst.setString(2, product.getDesc());
            pst.setBinaryStream(3, is, (int) p.getSize());
            pst.setInt(4, product.getQuantity());
            pst.setInt(5, product.getProductId());

            flag = pst.executeUpdate();

        } catch (Exception e) {
            System.out.println("" + e.getMessage());
            return false;
        }

        if (flag > 0) {
            return true;
        }
        return false;
    }
    
    
     public Product searchProduct(int id) {
        Product product = null;
        try {
            PreparedStatement pst = con.prepareStatement("select * from product  where productId=? ");
            pst.setDouble(1, id);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));

            }
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return product;
    }
     public boolean deleteProductCart(int id) {
        int flag = 0;
        try {
            PreparedStatement pst = con.prepareStatement("delete from cart where productId=? ");
            pst.setInt(1, id);
            flag = pst.executeUpdate();

        } catch (SQLException e) {
            System.out.println("" + e.getMessage());
        }

        if (flag > 0) {
            return true;
        }
        return false;
    }
        //End of shaaban 
}
