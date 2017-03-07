<%@page import="com.mobiland.model.Admin"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <title>Product Page - Ustora Demo</title>

        <!-- Google Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Titillium+Web:400,200,300,700,600' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Roboto+Condensed:400,700,300' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Raleway:400,100' rel='stylesheet' type='text/css'>

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

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
        <script>
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
                            <li ><a href="AdminEditProduct.jsp">Shop info page</a></li>
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
                            <h2>Add New Product</h2>

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
                                        <form enctype="multipart/form-data" class="well form-horizontal" action="AdminAddProduct" method="post"  id="contact_form">
                                        <fieldset>
                                            <!-- Form Name -->
                                            <legend>New Product</legend>
                                            <!-- Text input-->

                                            <div class="form-group">
                                                <div class="product-f-image">
                                                    <input value="Add New Product" type='file'name="image"   onchange="readURL(this);" />
                                                    <img id="blah" src="#" alt="your image" name="image1" />
                                                </div><br><br>
                                                <div class="form-group">
                                                    <label class="col-md-4 control-label">serial Number</label>
                                                    <div class="col-md-4 inputGroupContainer">
                                                        <div class="input-group">
                                                            <span class="input-group-addon"></span>
                                                            <input id="serialNumber"  type="text" class="form-control" name="serialNumber" placeholder="serial number" required/>
                                                        </div>
                                                    </div>
                                                </div>
                                                <label class="col-md-4 control-label">Name</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i ></i></span>
                                                        <input name ="key" type="hidden"> 
                                                        <input id="fname" class="form-control" name ="productname" type="text" placeholder="product name" required> 

                                                    </div>
                                                </div>
                                            </div>



                                            <div class="form-group">
                                                <label class="col-md-4 control-label">Price</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i></i></span>
                                                        <center>  <input id="price" class="form-control" name ="productPrice" type="text" placeholder="product price" required> </center>
                                                    </div>
                                                </div>
                                            </div>
                                            
                                            <div class="form-group">
                                                <label class="col-md-4 control-label">Quantity</label>
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"></span>
                                                        <input id="quantity"  type="text" class="form-control" name="quantity"  placeholder="quantity "/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-4 control-label">Description</label>
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"></span>
                                                        <textarea rows="4" cols="50" id="description" name="description" class="form-control"  placeholder="write description"> </textarea>
                                                    </div>      
                                                </div>
                                            </div>
                                           
                                            <!-- Button -->
                                            <div class="form-group">
                                                <label class="col-md-4 control-label"></label>
                                                <div class="col-md-4">
                                                    <input  id="add_contact_button" type="submit" value="Save">
                                                </div>
                                            </div>
${flag2}
                                        </fieldset>
                                    </form>
                                </div></center>
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
                    </div>
                </div>
            </div>
        </div>
    </div>
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
    </div>

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