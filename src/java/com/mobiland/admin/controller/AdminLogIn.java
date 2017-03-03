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

/**
 *
 * @author shibo
 */
public class AdminLogIn extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet AdminLogIn</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet AdminLogIn at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
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
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        if (request.getParameter("error").equals("shibo")) {

            response.setContentType("text/html;charset=UTF-8");

            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>\n"
                        + "<!--\n"
                        + "	ustora by freshdesignweb.com\n"
                        + "	Twitter: https://twitter.com/freshdesignweb\n"
                        + "	URL: https://www.freshdesignweb.com/ustora/\n"
                        + "-->\n"
                        + "<html lang=\"en\">\n"
                        + "  <head>\n"
                        + "    <meta charset=\"utf-8\">\n"
                        + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                        + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n"
                        + "    <title>Cart Page - Ustora Demo</title>\n"
                        + "     \n"
                        + "    <!-- Google Fonts -->\n"
                        + "    <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>\n"
                        + "    <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>\n"
                        + "    <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>\n"
                        + "    \n"
                        + "    <!-- Bootstrap -->\n"
                        + "    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n"
                        + "    \n"
                        + "    <!-- Font Awesome -->\n"
                        + "    <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n"
                        + "     <link rel=\"stylesheet\" href=\"css/style.css\">\n"
                        + "    <!-- Custom CSS -->\n"
                        + "    <link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n"
                        + "    <link rel=\"stylesheet\" href=\"style.css\">\n"
                        + "    <link rel=\"stylesheet\" href=\"css/responsive.css\">\n"
                        + "\n"
                        + "    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n"
                        + "    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n"
                        + "    <!--[if lt IE 9]>\n"
                        + "      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n"
                        + "      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n"
                        + "    <![endif]-->\n"
                        + "  </head>\n"
                        + "  <body>\n"
                        + "\n"
                        + "    <div class=\"mainmenu-area\">\n"
                        + "        <div class=\"container\">\n"
                        + "            <div class=\"row\">\n"
                        + "               \n"
                        + "                <div class=\"navbar-collapse collapse\">\n"
                        + "                    <ul class=\"nav navbar-nav\">\n"
                        + "<div class=\"site-branding-area\">\n"
                        + "        <div class=\"container\">\n"
                        + "            <div class=\"row\">\n"
                        + "                <div class=\"col-sm-6\">\n"
                        + "                    <div class=\"logo\">\n"
                        + "                        <h1><a href=\"./\"><img src=\"img/logo.png\"></a></h1>\n"
                        + "\n"
                        + "                    </div>\n"
                        + "                </div>\n"
                        + "                \n"
                        + "               \n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </div> <!-- End site branding area -->\n"
                        + "                       \n"
                        + "                </div>  \n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </div> <!-- End mainmenu area -->\n"
                        + " <div class=\"product-big-title-area\">\n"
                        + "        <div class=\"container\">\n"
                        + "            <div class=\"row\">\n"
                        + "                <div class=\"col-md-12\">\n"
                        + "                    <div class=\"product-bit-title text-center\">\n"
                        + "                        <h2></h2>\n"
                        + "<center>\n"
                        + "<b>u have error in login process<b>"
                        + "<div id=\"for\">\n"
                        + " <form action=\"AdminLogIn\"  method=\"post\">\n"
                        + "  <header>Login</header>\n"
                        + "  <label>Email<span>*</span></label>\n"
                        + "  <input type=\"email\" name=\"email\"/>\n"
                        + "  <div class=\"help\"></div>\n"
                        + "  <label>Password <span>*</span></label>\n"
                        + "  <input type=\"password\" name=\"password\"/>\n"
                        + "  <div class=\"help\"></div>\n"
                        + "  <center><button>Login</button><center>\n"
                        + "</form></div>\n"
                        + "    </center>\n"
                        + "                    </div>\n"
                        + "                </div>\n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </div> <!-- End Page title area -->\n"
                        + "\n"
                        + "   \n"
                        + "  \n"
                        + "  \n"
                        + "\n"
                        + "    <div class=\"footer-top-area\">\n"
                        + "        <div class=\"zigzag-bottom\"></div>\n"
                        + "        <div class=\"container\">\n"
                        + "            <div class=\"row\">\n"
                        + "                <div class=\"col-md-3 col-sm-6\">\n"
                        + "                    <div class=\"footer-about-us\">\n"
                        + "                        <h2>u<span>Stora</span></h2>\n"
                        + "                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>\n"
                        + "                        <div class=\"footer-social\">\n"
                        + "                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-facebook\"></i></a>\n"
                        + "                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-twitter\"></i></a>\n"
                        + "                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-youtube\"></i></a>\n"
                        + "                            <a href=\"#\" target=\"_blank\"><i class=\"fa fa-linkedin\"></i></a>\n"
                        + "                        </div>\n"
                        + "                    </div>\n"
                        + "                </div>\n"
                        + "                \n"
                        + "                <div class=\"col-md-3 col-sm-6\">\n"
                        + "                    <div class=\"footer-menu\">\n"
                        + "                        <h2 class=\"footer-wid-title\">User Navigation </h2>\n"
                        + "                        <ul>\n"
                        + "                            <li><a href=\"#\">My account</a></li>\n"
                        + "                            <li><a href=\"#\">Order history</a></li>\n"
                        + "                            <li><a href=\"#\">Wishlist</a></li>\n"
                        + "                            <li><a href=\"#\">Vendor contact</a></li>\n"
                        + "                            <li><a href=\"#\">Front page</a></li>\n"
                        + "                        </ul>                        \n"
                        + "                    </div>\n"
                        + "                </div>\n"
                        + "                \n"
                        + "                <div class=\"col-md-3 col-sm-6\">\n"
                        + "                    \n"
                        + "                </div>\n"
                        + "                \n"
                        + "                <div class=\"col-md-3 col-sm-6\">\n"
                        + "                    \n"
                        + "                        \n"
                        + "                </div>\n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </div> <!-- End footer top area -->\n"
                        + "    \n"
                        + "    <div class=\"footer-bottom-area\">\n"
                        + "        <div class=\"container\">\n"
                        + "            <div class=\"row\">\n"
                        + "                <div class=\"col-md-8\">\n"
                        + "                    <div class=\"copyright\">\n"
                        + "                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href=\"http://www.freshdesignweb.com\" target=\"_blank\">freshDesignweb.com</a></p>\n"
                        + "                    </div>\n"
                        + "                </div>\n"
                        + "                \n"
                        + "                \n"
                        + "            </div>\n"
                        + "        </div>\n"
                        + "    </div> <!-- End footer bottom area -->\n"
                        + "   \n"
                        + "    <!-- Latest jQuery form server -->\n"
                        + "    <script src=\"https://code.jquery.com/jquery.min.js\"></script>\n"
                        + "    \n"
                        + "    <!-- Bootstrap JS form CDN -->\n"
                        + "    <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js\"></script>\n"
                        + "    \n"
                        + "    <!-- jQuery sticky menu -->\n"
                        + "    <script src=\"js/owl.carousel.min.js\"></script>\n"
                        + "    <script src=\"js/jquery.sticky.js\"></script>\n"
                        + "    \n"
                        + "    <!-- jQuery easing -->\n"
                        + "    <script src=\"js/jquery.easing.1.3.min.js\"></script>\n"
                        + "    \n"
                        + "    <!-- Main Script -->\n"
                        + "    <script src=\"js/main.js\"></script>\n"
                        + "  </body>\n"
                        + "</html>");

            } catch (IOException ex) {
                Logger.getLogger(AdminLogIn.class.getName()).log(Level.SEVERE, null, ex);
            }

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
