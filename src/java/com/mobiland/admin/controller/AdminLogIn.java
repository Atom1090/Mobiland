/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.admin.controller;

import com.mobiland.admin.dataBase.DbOperationsAdmin;
import com.mobiland.model.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author shibo
 */
public class AdminLogIn extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            Admin admin = new Admin(request.getParameter("email"), request.getParameter("password"));
            System.out.println("" + admin);
            DbOperationsAdmin operation = new DbOperationsAdmin();
            Admin a = operation.loginAdmin(admin);
            System.out.println("the ndnsdsn" + a);
            if (a != null) {
                
                request.setAttribute("object", a);
                RequestDispatcher dispatcher = request
                        .getRequestDispatcher("/adminProfile.jsp");                
                
                HttpSession session = request.getSession();                
                session.setAttribute("admin", a);
                dispatcher.forward(request, response);
                // response.sendRedirect("adminProfile.jsp");
            } else {
                System.out.println("wrong");
                request.setAttribute("login", "email or password wrong try again");
                RequestDispatcher dispatcher1 = request
                        .getRequestDispatcher("/AdminIndex.jsp");                
                dispatcher1.forward(request, response);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
