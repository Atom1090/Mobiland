/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mobiland.controller;

import com.mobiland.model.DBConnection;
import com.mobiland.model.Product;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author atom
 */
@WebServlet(name = "ProductServlet", urlPatterns = {"/product-serv"})
public class ProductServlet extends HttpServlet {

	DBConnection conn  = null;
	
	@Override
	public void init()
	{
		try{
			conn = new DBConnection();
		} catch(SQLException ex)
		{
			ex.printStackTrace();
		}
	}
	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("application/octet-stream");
		PrintWriter out = response.getWriter();
		
		String page = request.getParameter("page");
		
		try{
			if(conn == null)
				conn = new DBConnection();
			
			String id = (String)request.getParameter("id");
			if(id != null)
			{
				int prodId = -1;
				try{
					prodId = Integer.parseInt(id);
				} catch(NumberFormatException ex)
				{
					ex.printStackTrace();
				}
				Product product = conn.getProductById(prodId);
				if(product != null)
				{
					out.print(product);
				}
			}

			else
			{
				String category = request.getParameter("category");
				String index = request.getParameter("index");
				
				if(category != null && index != null)
				{
					int i = 0;
					try{
					i = Integer.parseInt(index);
					} catch(NumberFormatException ex)
					{
						ex.printStackTrace();
					}
					Product product = conn.getProductByCategory(category, i);
					if(product != null)
					{
						out.print(product);
					}
				}
			}
		} catch(SQLException ex)
		{
			ex.printStackTrace();
			if(page != null)
				response.sendRedirect(page + "?status=" + StatusHandler.ERR_DB_PROC);
		}
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request servlet request
	 * @param response servlet response
	 * @throws ServletException if a servlet-specific error occurs
	 * @throws IOException if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

	/**
	 * Returns a short description of the servlet.
	 *
	 * @return a String containing servlet description
	 */
	@Override
	public String getServletInfo() {
		return "Handles product loading and handling";
	}// </editor-fold>

}
