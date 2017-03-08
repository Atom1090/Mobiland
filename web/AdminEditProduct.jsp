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


        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>
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



                        </div>
                    </div>
                </div>
            </div>
        </div>
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
                    </div>
                </div>
            </div>
        </div>
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
