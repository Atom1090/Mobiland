<%-- 
    Document   : AdminAddProduct
    Created on : Mar 2, 2017, 8:42:58 PM
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

        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
        <script class="jsbin" src="http://ajax.googleapis.com/ajax/libs/jqueryui/1.8.0/jquery-ui.min.js"></script>

        <!-- Custom CSS -->
        <link rel="stylesheet" href="css/owl.carousel.css">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="css/responsive.css">

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

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
            function readURL(input) {
                if (input.files && input.files[0]) {
                    var reader = new FileReader();

                    reader.onload = function (e) {
                        $('#blah')
                                .attr('src', e.target.result)
                                .width(150)
                                .height(200);
                    };

                    reader.readAsDataURL(input.files[0]);
                }
            }
        </script>
    </head>
    <body>
        <div>
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
                            <h2 class="section-title">Add Products</h2>
                            <center>
                                <div class="product-carousel">
                                    <form>
                                        <div class="single-product">

                                            <div class="product-f-image">
                                                <input value="Add New Product" type='file' onchange="readURL(this);" />
                                                <img id="blah" src="#" alt="your image" />

                                            </div><br><br>


                                            <h4>Name</h4><h2><input type="text" value=""  id="editInput" ></h2>

                                            <div class="product-carousel-price">

                                                <h4>Price</h4> <h2><input type="text" value=""  id="priceInput" > </h2><br><br>
                                                <input type="submit" value="Save" class="add-to-cart-link" onclick="">
                                            </div> 
                                        </div>
                                    </form>

                                </div>
                            </center>
                        </div>
                    </div>
                </div>
            </div>
        </div> <!-- End main content area -->




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
