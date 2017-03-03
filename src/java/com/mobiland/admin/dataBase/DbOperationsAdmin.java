/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.admin.dataBase;

import com.mobiland.model.Admin;
import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author shibo
 */
public class DbOperationsAdmin {

    Connection con;
    Statement st;
    ResultSet rs;
    String drivermanager;
    String url;
    String usr, psw;
// init();

    public void init() {
        usr = "root";

        psw = "ROOT";

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

    public DbOperationsAdmin() {
        init();
    }

    public Admin loginAdmin(Admin admin) throws SQLException {
        Admin newadmin = null;

        
        String sql = "select * from admin where email =? and password =?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, admin.getEmail());
        pst.setString(2, admin.getPassword());
        rs = pst.executeQuery();
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
    
  
    
    

//    public boolean signUp(Admin admin) throws SQLException {
//
//        String sql = "insert into admin values()where email =?";
//        PreparedStatement pst = con.prepareStatement(sql);
//        pst.setString(1, admin.getUsername());
//        pst.setString(1, admin.getEmail());
//        pst.setString(1, admin.getPassword());
//        int i = pst.executeUpdate();
//        if (i > 0) {
//            return false;
//        } else {
//            return true;
//        }
//    }
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

}
