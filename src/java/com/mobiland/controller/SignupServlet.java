/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.controller;

import com.mobiland.model.Customer;
import com.mobiland.model.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Eslam
 */
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
        
        System.out.println(customer.getFName());
        
        db.insertUser(customer);
        
        response.sendRedirect("signup.html");
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
