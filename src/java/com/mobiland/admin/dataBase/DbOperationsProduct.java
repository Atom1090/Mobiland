/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.admin.dataBase;

import com.mobiland.model.Product;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.Part;

/**
 *
 * @author shibo
 */
public class DbOperationsProduct {

    Connection con;
    Statement st;
    ResultSet rs;
    String drivermanager;
    String url;
    String usr, psw;

    public void init() {
        usr = "root";
        psw = "root";
        drivermanager = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/mobiland";

        try {
            Class.forName(drivermanager);
            con = DriverManager.getConnection(url, usr, psw);
            st = con.createStatement();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public DbOperationsProduct() {
        init();
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

    public boolean addProduct2(Product product) throws SQLException, IOException {
        int result = 0;
        try {
            PreparedStatement insertProduct = con.prepareStatement("INSERT INTO product ( `name`, `desc`, `serialNumber`, `price`, `quantity`) VALUES  (?,?,?,?,?)");
            // InputStream is = productImage.getInputStream();;
            insertProduct.setString(1, product.getName());
            insertProduct.setString(2, product.getDesc());
            //insertProduct.setBinaryStream(3, is, (int) productImage.getSize());
            insertProduct.setString(3, product.getSerialNumber());
            insertProduct.setDouble(4, product.getPrice());
            insertProduct.setInt(5, product.getQuantity());
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

    public static void main(String[] args) throws IOException {
        Product product = new Product();
        product.setSerialNumber("2");
        product.setName("dslkds");
        product.setPrice(2);
        product.setQuantity(25);
        product.setDesc("dsjdks");
DbOperationsProduct dp=new DbOperationsProduct();
        try {
            dp.addProduct2(product);
        } catch (SQLException ex) {
            Logger.getLogger(DbOperationsProduct.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
