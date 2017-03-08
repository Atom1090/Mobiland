<<<<<<< HEAD
<%-- 
    Document   : AdminEditProduct
    Created on : Mar 2, 2017, 9:46:04 PM
    Author     : Doaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<!--
        ustora by freshdesignweb.com
        Twitter: https://twitter.com/freshdesignweb
        URL: https://www.freshdesignweb.com/ustora/
-->
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Admin</title>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
<%@page session="true" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<!DOCTYPE html>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP List Users Records</title>


        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
>>>>>>> 312976f4193c645a2d717a09cebb76cf2bd41ebd


        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
<<<<<<< HEAD
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">



        <script>
            function myFunction() {
            document.getElementById("editInput").readOnly = false;
            document.getElementById("priceInput").readOnly = false;
            }
            function myFunction2() {
            document.getElementById("editInput2").readOnly = false;
            document.getElementById("priceInput2").readOnly = false;
            }
            function myFunction3() {

            document.getElementById("editInput3").readOnly = false;
            document.getElementById("priceInput3").readOnly = false;
            }
            function myFunction4() {
            document.getElementById("editInput4").readOnly = false;
            document.getElementById("priceInput4").readOnly = false;
            }
            function myFunction5() {
            document.getElementById("editInput5").readOnly = false;
            document.getElementById("priceInput5").readOnly = false;
            }

            function myFunctionA() {
            document.getElementById("editInputA").readOnly = false;
            document.getElementById("priceInputA").readOnly = false;
            }
            #rad{
            background - color
                    : #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border - radius: 20px;
            cursor: pointer;
            }
            #rad:hover {
            background - color: #45a049;
            }

        </script>
    </head>
    <body>

        <div class="header-area">
            <div class="container">
                <div class="row">
                </div>
            </div>
        </div> <!-- End header area -->
    </div> <!-- End slider area -->

    <div class="maincontent-area">
        <div class="zigzag-bottom"></div>
        <div class="container">
            <div class="row">
                <div class="col-md-12">
                    <div class="latest-product">
                        <h2 class="section-title">Edit Products</h2>
                        <div class="product-carousel">
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/product-1.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="#" class="add-to-cart-link" onclick="myFunction()"><i class="material-icons" style="font-size:18px;color:red">mode_edit</i> Edit Product</a>
                                        <a href="" class="view-details-link">Delete Product</a>
                                    </div>
                                </div>

                                <h2><input type="text" value="Samsung Galaxy s4" class="field left" readonly="true" id="editInput" style="border:none"></h2>

                                <div class="product-carousel-price">

                                    <h2><input type="text" value="$700.00" class="field left" readonly="true" id="priceInput" style="border:none"> </h2>
                                </div> 
                                <input type="submit" value="Edit Image" class="add-to-cart-link" onclick="">
                                <input type="submit" value="Save"  onclick="" id="rad">
                            </div>

                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/product-2.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="#" class="add-to-cart-link"  onclick="myFunction2()"><i class="material-icons" style="font-size:18px;color:red">mode_edit</i>Edit Product</a>
                                        <a href="" class="view-details-link"> Delete Product</a>
                                    </div>
                                </div>

                                <h2><input style="border:none" readonly="true" type="text" value="Nokia Lumia 1320" id="editInput2" class="field left"  /></h2>

                                <div class="product-carousel-price">
                                    <h2><input type="text" value="$899.00" readonly="true" class="field left" readonly="true" id="priceInput2" style="border:none"></h2>
                                    <input type="submit" value="Edit Image" class="add-to-cart-link" onclick="">
                                    <input type="submit" value="Save" class="add-to-cart-link" onclick="">
                                </div> 
                            </div>
                            <!-- 3 -->

                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/product-2.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="#" class="add-to-cart-link"  onclick="myFunction3()"><i class="material-icons" style="font-size:18px;color:red">mode_edit</i>Edit Product</a>
                                        <a href="" class="view-details-link"> Delete Product</a>
                                    </div>
                                </div>

                                <h2><input style="border:none" readonly="true" type="text" value="Nokia Lumia 1320" id="editInput3" class="field left"  /></h2>

                                <div class="product-carousel-price">
                                    <h2><input type="text" value="$899.00" readonly="true" class="field left" readonly="true" id="priceInput3" style="border:none"></h2>
                                    <input type="submit" value="Edit Image" class="add-to-cart-link" onclick="">
                                    <input type="submit" value="Save" class="add-to-cart-link" onclick="">
                                </div> 
                                <!-- 3 -->	

                            </div>
                            <div class="single-product">
                                <div class="product-f-image">
                                    <img src="img/product-2.jpg" alt="">
                                    <div class="product-hover">
                                        <a href="#" class="add-to-cart-link"  onclick="myFunctionA()"><i class="material-icons" style="font-size:18px;color:red">mode_edit</i>Edit Product</a>
                                        <a href="" class="view-details-link"> Delete Product</a>
                                    </div>
                                </div>

                                <h2><input style="border:none" readonly="true" type="text" value="Nokia Lumia 1320" id="editInputA" class="field left"  /></h2>

                                <div class="product-carousel-price">
                                    <h2><input type="text" value="$899.00" readonly="true" class="field left" readonly="true" id="priceInputA" style="border:none"></h2>
                                    <input type="submit" value="Edit Image" class="add-to-cart-link" onclick="">
                                    <input type="submit" value="Save" class="add-to-cart-link" onclick="">
                                </div> 
                            </div>



=======

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.min.css">

        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="framework/style.css">
        <link rel="stylesheet" href="framework/bootstrap.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.min.css">



        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/responsive.css">

        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    </head>
    <body>
        <sql:setDataSource
            var="myDS"
            driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost:3306/mobiland"
            user="root" password="root"
            />

        <sql:query var="listUsers"   dataSource="${myDS}">
            SELECT * FROM product;
        </sql:query>
        <div class="mainmenu-area">
            <div class="container">
                <div class="row">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div> 
                    <div class="navbar-collapse collapse">
                        <ul class="nav navbar-nav">
                            <li><a href="adminProfile.jsp">Home</a></li>
                           
                            <li><a href="AdminShowCustomer.jsp">show customer</a></li>
                            <li class="active"><a href="AdminAddProduct.jsp">Add Product</a></li>
                        </ul>
                    </div>  
                </div>
            </div>
        </div> <!-- End mainmenu area -->
        <div class="product-big-title-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-12">
                        <div class="product-bit-title text-center">
                            <h2>Show All Product</h2>

                        </div>

                    </div>
                </div>
            </div>
        </div>

        <center>
            <div class="single-product-area">
                <div class="zigzag-bottom"></div>
                <div class="container">
                    <div class="row">



                        <div class="col-md-8">
                            <div class="product-content-right">
                                <div class="product-breadcroumb">
                                    <div class="col-md-4">

                                    </div>
                                    <div>
                                        <div class="container">
                                            <table class="table">
                                                <thead>
                                                    <tr class="success">
                                                        <th>Name</th>
                                                        <th>desc</th>
                                                        <th>image</th>
                                                        <th>serial</th>
                                                        <th>price</th>
                                                        <th>quantity</th>
                                                        <th>Edit</th>
                                                        <th>Delete</th>
                                                    </tr>
                                                </thead>

                                                <c:forEach var="user" items="${listUsers.rows}">
                                                    <tbody>

                                                        <tr>
                                                            <td><c:out value="${user.name}" /></td>
                                                            <td><c:out value="${user.desc}" /></td>
                                                            <td><img src="GetImage?x=${user.productId}" width="100px"/></td>
                                                            <td><c:out value="${user.serialNumber}" /></td>
                                                            <td><c:out value="${user.price}" /></td>
                                                            <td><c:out value="${user.quantity}" /></td>
                                                            <td><form action="UpdateProduct?u=${user.productId}" method="post"><input value="edit" type="submit"/></form></td>
                                                            <td><form action="DeleteProduct?u=${user.productId}" method="post"><input value="delete" type="submit"/></form></td>
                                                        </tr>
                                                    </tbody>
                                                </c:forEach>




                                            </table>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                </div>
        </center>


        <div class="footer-top-area">
            <div class="zigzag-bottom"></div>
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <div class="footer-about-us">
                            <h2>u<span>Stora</span></h2>
                            <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Perferendis sunt id doloribus vero quam laborum quas alias dolores blanditiis iusto consequatur, modi aliquid eveniet eligendi iure eaque ipsam iste, pariatur omnis sint! Suscipit, debitis, quisquam. Laborum commodi veritatis magni at?</p>
                            <div class="footer-social">
                                <a href="#" target="_blank"><i class="fa fa-facebook"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-twitter"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-youtube"></i></a>
                                <a href="#" target="_blank"><i class="fa fa-linkedin"></i></a>
                            </div>
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">User Navigation </h2>
                            <ul>
                                <li><a href="">My account</a></li>
                                <li><a href="">Order history</a></li>
                                <li><a href="">Wishlist</a></li>
                                <li><a href="">Vendor contact</a></li>
                                <li><a href="">Front page</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-menu">
                            <h2 class="footer-wid-title">Categories</h2>
                            <ul>
                                <li><a href="">Mobile Phone</a></li>
                                <li><a href="">Home accesseries</a></li>
                                <li><a href="">LED TV</a></li>
                                <li><a href="">Computer</a></li>
                                <li><a href="">Gadets</a></li>
                            </ul>                        
                        </div>
                    </div>

                    <div class="col-md-3 col-sm-6">
                        <div class="footer-newsletter">
                            <h2 class="footer-wid-title">Newsletter</h2>
                            <p>Sign up to our newsletter and get exclusive deals you wont find anywhere else straight to your inbox!</p>
                            <div class="newsletter-form">
                                <input type="email" placeholder="Type your email">
                                <input type="submit" value="Subscribe">
                            </div>
>>>>>>> 312976f4193c645a2d717a09cebb76cf2bd41ebd
                        </div>
                    </div>
                </div>
            </div>
        </div>
<<<<<<< HEAD
    </div> <!-- End main content area -->


    <div class="footer-bottom-area">
        <div class="container">
            <div class="row">
                <div class="col-md-8">
                    <div class="copyright">
                        <p>&copy; 2015 uCommerce. All Rights Reserved. <a href="http://www.freshdesignweb.com" target="_blank">freshDesignweb.com</a></p>
                    </div>
                </div>

                <div class="col-md-4">
                    <div class="footer-card-icon">
                        <i class="fa fa-cc-discover"></i>
                        <i class="fa fa-cc-mastercard"></i>
                        <i class="fa fa-cc-paypal"></i>
                        <i class="fa fa-cc-visa"></i>
=======
        <div class="footer-bottom-area">
            <div class="container">
                <div class="row">
                    <div class="col-md-8">
                        <div class="copyright">
                            <p>&copy; 2015 uCommerce. All Rights Reserved. <a href="http://www.freshdesignweb.com" target="_blank">freshDesignweb.com</a></p>
                        </div>
                    </div>

                    <div class="col-md-4">
                        <div class="footer-card-icon">
                            <i class="fa fa-cc-discover"></i>
                            <i class="fa fa-cc-mastercard"></i>
                            <i class="fa fa-cc-paypal"></i>
                            <i class="fa fa-cc-visa"></i>
                        </div>
>>>>>>> 312976f4193c645a2d717a09cebb76cf2bd41ebd
                    </div>
                </div>
            </div>
        </div>
<<<<<<< HEAD
    </div> <!-- End footer bottom area -->

    <!-- Latest jQuery form server -->
    <script src="https://code.jquery.com/jquery.min.js"></script>

    <!-- Bootstrap JS form CDN -->
    <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

    <!-- jQuery sticky menu -->
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/jquery.sticky.js"></script>

    <!-- jQuery easing -->
    <script src="js/jquery.easing.1.3.min.js"></script>

    <!-- Main Script -->
    <script src="js/main.js"></script>

    <!-- Slider -->
    <script type="text/javascript" src="js/bxslider.min.js"></script>
    <script type="text/javascript" src="js/script.slider.js"></script>
</body>
</html>
=======
        <!-- Latest jQuery form server -->
        <script src="https://code.jquery.com/jquery.min.js"></script>

        <!-- Bootstrap JS form CDN -->
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>

        <!-- jQuery sticky menu -->
        <script src="js/owl.carousel.min.js"></script>
        <script src="js/jquery.sticky.js"></script>

        <!-- jQuery easing -->
        <script src="js/jquery.easing.1.3.min.js"></script>

        <!-- Main Script -->
        <script src="js/main.js"></script>
    </body>
</html>
>>>>>>> 312976f4193c645a2d717a09cebb76cf2bd41ebd
