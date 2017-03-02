/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.controller;

import com.mobiland.model.Customer;
import com.mobiland.model.DBConnection;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author Eslam
 */
@MultipartConfig(maxFileSize = 16177216)
public class SignupServlet extends HttpServlet {

   
    DBConnection db=new DBConnection();
    Customer customer;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        PrintWriter out=response.getWriter();
        
        String address=request.getParameter("billing_country");
        String fname=request.getParameter("billing_first_name");
        String lname=request.getParameter("billing_last_name");
        String job=request.getParameter("billing_company");
        String date=request.getParameter("billing_date");
        String interests=request.getParameter("billing_state");
        String email=request.getParameter("billing_email");
        String phone=request.getParameter("billing_phone");
        String password=request.getParameter("account_password");
        Part part = request.getPart("image");
        
        customer=new Customer();
        
        customer.setAddress(address);
        customer.setFName(fname);
        customer.setLName(lname);
        customer.setJob(job);
        customer.setBirthdate(date);
        customer.setInterest(interests);
        customer.setEmail(email);
        customer.setPhone(phone);
        customer.setPassword(password);
        customer.setCash("0");
        
        InputStream is = part.getInputStream();
        
        db.insertUser(customer,part);
        
        response.sendRedirect("signup.jsp");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
