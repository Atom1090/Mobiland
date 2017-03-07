///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mobiland.admin.dataBase;
//
//import com.mobiland.model.Customer;
//import com.mobiland.model.Product;
//import java.io.IOException;
//import java.io.InputStream;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.http.Part;
//
///**
// *
// * @author shibo
// */
//public class DbOperationsProduct {
//
//    Connection con;
//    Statement st;
//    ResultSet rs;
//    String drivermanager;
//    String url;
//    String usr, psw;
//
//    public void init() {
//        usr = "root";
//        psw = "root";
//     //shaaban driver 
//		/*  drivermanager = "com.mysql.jdbc.Driver";
//        url = "jdbc:mysql://localhost:3306/mobiland";*/
//		
//		//eslam driver 
//		
//
//        try {
//          //  Class.forName(drivermanager);
//		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mobiland","root","");
//            //con = DriverManager.getConnection(url, usr, psw);
//            st = con.createStatement();
//
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//
//    }
//
//    public DbOperationsProduct() {
//        init();
//    }
//
//    public boolean addProduct(Product product, Part productImage) throws SQLException, IOException {
//        int result = 0;
//        try {
//            PreparedStatement insertProduct = con.prepareStatement("INSERT INTO product ( `name`, `desc`, `image` , `serialNumber`, `price`, `quantity`) VALUES  (?,?,?,?,?,?)");
//            InputStream is = productImage.getInputStream();
//            insertProduct.setString(1, product.getName());
//            insertProduct.setString(2, product.getDesc());
//            insertProduct.setBinaryStream(3, is, (int) productImage.getSize());
//            insertProduct.setString(4, product.getSerialNumber());
//            insertProduct.setDouble(5, product.getPrice());
//            insertProduct.setInt(6, product.getQuantity());
//            result = insertProduct.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println("" + e.getMessage());
//        }
//        if (result > 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
//
//    public boolean addProduct2(Product product) throws SQLException, IOException {
//        int result = 0;
//        try {
//            PreparedStatement insertProduct = con.prepareStatement("INSERT INTO product ( `name`, `desc`, `serialNumber`, `price`, `quantity`) VALUES  (?,?,?,?,?)");
//            // InputStream is = productImage.getInputStream();;
//            insertProduct.setString(1, product.getName());
//            insertProduct.setString(2, product.getDesc());
//            //insertProduct.setBinaryStream(3, is, (int) productImage.getSize());
//            insertProduct.setString(3, product.getSerialNumber());
//            insertProduct.setDouble(4, product.getPrice());
//            insertProduct.setInt(5, product.getQuantity());
//            result = insertProduct.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println("" + e.getMessage());
//        }
//        if (result > 0) {
//            return true;
//        } else {
//            return false;
//        }
//
//    }
////////////////////////shibo
//
//    public ArrayList<Customer> getAllData() {
//        ArrayList<Customer> list = new ArrayList<>();
//        try {
//            PreparedStatement pst = con.prepareStatement("select * from customer");
//            // InputStream is = productImage.getInputStream();;
//
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                Customer cust = new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBytes(5), rs.getString(6), rs.getString(7), rs.getDouble(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12));
//                System.out.println("" + cust);
//                list.add(cust);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("" + e.getMessage());
//        }
//        return list;
//
//    }
//
//    public ArrayList<Product> getAllProduct() {
//        ArrayList<Product> list = new ArrayList<>();
//        try {
//            PreparedStatement pst = con.prepareStatement("select * from product");
//            // InputStream is = productImage.getInputStream();;
//
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));
//                System.out.println("" + product);
//                list.add(product);
//            }
//
//        } catch (SQLException e) {
//            System.out.println("" + e.getMessage());
//        }
//        return list;
//
//    }
//
//    public boolean deleteProduct(int id) {
//        int flag = 0;
//        try {
//            PreparedStatement pst = con.prepareStatement("delete from product where productId=? ");
//            pst.setInt(1, id);
//            flag = pst.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println("" + e.getMessage());
//        }
//
//        if (flag > 0) {
//            return true;
//        }
//        return false;
//    }
//
//    public boolean updateProduct(Product product, Part p) {
//        int flag = 0;
//
//        try {
//            InputStream is = p.getInputStream();
//            PreparedStatement pst = con.prepareStatement("update product set `price`=? ,`desc`=?, `image`=? ,`quantity`=? where `productId`=? ");
//            pst.setDouble(1, product.getPrice());
//            pst.setString(2, product.getDesc());
//            pst.setBinaryStream(3, is, (int) p.getSize());
//            pst.setInt(4, product.getQuantity());
//            pst.setInt(5, product.getProductId());
//                    
//                    
//            flag = pst.executeUpdate();
//
//        } catch (Exception e) {
//            System.out.println("" + e.getMessage());
//            return false;
//        }
//
//        if (flag > 0) {
//            return true;
//        }
//        return false;
//    }
//
////    public static void main(String[] args) throws IOException {
////        DbOperationsProduct dp = new DbOperationsProduct();
////        System.out.println("" + dp.deleteProduct(14));
////        dp.getAllProduct();
////
////    }
//////        Product product = new Product();
//////        product.setSerialNumber("2");
//////        product.setName("dslkds");
//////        product.setPrice(2);
//////        product.setQuantity(25);
//////        product.setDesc("dsjdks");
//////DbOperationsProduct dp=new DbOperationsProduct();
//////        try {
//////            dp.addProduct2(product);
//////        } catch (SQLException ex) {
//////            Logger.getLogger(DbOperationsProduct.class.getName()).log(Level.SEVERE, null, ex);
//////        }
//////    }
//    public Product searchProduct(int id) {
//        Product product = null;
//        try {
//            PreparedStatement pst = con.prepareStatement("select * from product  where productId=? ");
//            pst.setDouble(1, id);
//            rs = pst.executeQuery();
//            while (rs.next()) {
//                product = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBytes(4), rs.getString(5), rs.getDouble(6), rs.getInt(7));
//
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(DbOperationsProduct.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return product;
//    }
//}
