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
                            <li><a href="#">Home</a></li>
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
                            <h2>hello mr ${object.username} </h2>

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

                                <div class="row">
                                    <form class="well form-horizontal" action="UpdateAdmin" method="post"  id="contact_form">
                                        <fieldset>
                                            <!-- Form Name -->

                                            <legend>edit  your data  </legend>
                                            <!-- Text input-->
                                            <div class="form-group">
                                                <!--  -->
                                                <label class="col-md-4 control-label">Name</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                        <input name ="id" type="hidden" value=${object.id}>
                                                        <input id="fname" name ="username" type="text" placeholder="userName" required value=${object.username}  > 


                                                    </div>
                                                </div>
                                            </div>




                                            <div class="form-group">
                                                <label class="col-md-4 control-label">email</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                        <input id="email" name="email" type="email" required value=${object.email} >
                                                    </div>
                                                </div>
                                            </div>

                                            <div class="form-group">
                                                <label class="col-md-4 control-label">password</label>
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"></span>
                                                        <input id="password"  type="password" class="form-control"  name="password" required value=${object.password} />
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Button -->
                                            <div class="form-group">
                                                <label class="col-md-4 control-label"></label>
                                                <div class="col-md-4">
                                                    <input type="submit" value="Update "/>

                                                </div>
                                            </div>
                                            ${flag}
                                        </fieldset>
                                    </form>

                                </div>

                                <div class="col-sm-6">

                                    <div role="tabpanel" class="tab-pane fade" id="profile">



                                    </div>
                                </div>
                                <div><form class="well form-horizontal" action="AdminSignup" method="post"  id="contact_form">
                                        <fieldset>
                                            <!-- Form Name -->
                                            <legend>New Admin </legend>
                                            <!-- Text input-->
                                            <div class="form-group">
                                                <label class="col-md-4 control-label">Name</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="glyphicon glyphicon-user"></i></span>
                                                        <input name ="key" type="hidden"> 
                                                        <input id="fname" name ="username1" type="text" placeholder="username" required> 

                                                    </div>
                                                </div>
                                            </div>



                                            <div class="form-group">
                                                <label class="col-md-4 control-label">email</label>  
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                                                        <center>  <input id="email" name="email1"  placeholder="email" type="email" required></center>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-4 control-label">password</label>
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"></span>
                                                        <input id="email"  type="password" class="form-control" name="password1"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label class="col-md-4 control-label">confirm password</label>
                                                <div class="col-md-4 inputGroupContainer">
                                                    <div class="input-group">
                                                        <span class="input-group-addon"></span>
                                                        <input  id="email" type="password" class="form-control" name="confrimpassword1"/>
                                                    </div>
                                                </div>
                                            </div>
                                            <!-- Button -->
                                            <div class="form-group">
                                                <label class="col-md-4 control-label"></label>
                                                <div class="col-md-4">
                                                    <input  id="add_contact_button" type="submit" value="Save Admin">
                                                </div>
                                            </div>

                                        </fieldset>
                                        ${flag2}
                                    </form></div></center>
                            </div>
                        </div>
                    </div>









                </div>
            </div>                    

    </center>

 

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
