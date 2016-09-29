<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="Vertical and horizontal centers - contacts">
        <meta name="robots" content="all">

        <title>Vertical and horizontal centers - contacts</title>

        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="resources/assets/css/main.css">
        <link rel="stylesheet" href="resources/assets/css/green.css">
        <link rel="stylesheet" href="resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="resources/assets/css/config.css">

        <link href="resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="resources/assets/images/favicon.ico">

        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="resources/assets/js/html5shiv.js"></script>
            <script src="resources/assets/js/respond.min.js"></script>
        <![endif]-->
   


    </head>
<body>
    
    <div class="wrapper">
        <!-- ============================================================= TOP NAVIGATION ============================================================= -->

        
<!-- ============================================================= TOP NAVIGATION ============================================================= -->
<!-- %@include file="in/nav.jsp" % -->        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<!-- %@include file="in/header.jsp" % -->
<!-- ============================================================= HEADER : END ============================================================= --><div class="animate-dropdown"><!-- ========================================= BREADCRUMB ========================================= -->

        
        
<!-- ============================================================= HEADER : END ============================================================= -->       <!-- ========================================= MAIN ========================================= -->
<main id="contact-us" class="inner-bottom-md">
<!--    <section class="google-map map-holder">
        <div id="map" class="map center"></div>
        <form role="form" class="get-direction">
            <div class="container">
                <div class="row">
                    <div class="center-block col-lg-10">
                        <div class="input-group">
                            <input type="text" class="le-input input-lg form-control" placeholder="Enter Your Starting Point">
                            <span class="input-group-btn">
                                <button class="btn btn-lg le-button" type="button">Get Directions</button>
                            </span>
                        </div> 
                        /input-group 
                    </div> 
                    /.col-lg-6 
                </div> 
                /.row 
            </div>
        </form>
    </section>-->

    <div class="container">
        <div class="row">
            
            <div class="col-md-8">
                <section class="section leave-a-message">
                    <h2 class="bordered">Leave a Message</h2>
                    <h3 style="color:green;" ></h3>
                    <!--<p>Maecenas dolor elit, semper a sem sed, pulvinar molestie lacus. Aliquam dignissim, elit non mattis ultrices, neque odio ultricies tellus, eu porttitor nisl ipsum eu massa.</p>-->
                    <!--<form id="contact-form" class="contact-form cf-style-1 inner-top-xs" method="post" >-->
    <form:form action="${pageContext.request.contextPath}/contact" method="POST" commandName="message">
                       
                    <div class="row field-row">
                            <div class="col-xs-12 col-sm-6">
                                <label>Your Name*</label>
                                <!--<input class="le-input" >-->
             <form:input  class="le-input"  path="name" name="name" type="text"/> <br/> <form:errors style="color:red;" path="name" cssClass="error" ></form:errors>                    
                            </div>
                            <div class="col-xs-12 col-sm-6">
                                <label>Your Email*</label>
                                <!--<input class="le-input" >-->
             <form:input  class="le-input"  path="email" name="email" type="text"/> <br/> <form:errors style="color:red;" path="email" cssClass="error" ></form:errors>
                            </div>
                        </div><!-- /.field-row -->
                        
                        <div class="field-row">
                            <label>Subject</label>
                            <!--<input type="text" class="le-input">-->
            <form:input  class="le-input"  path="subject" name="subject" type="text"/> <br/> <form:errors style="color:red;" path="subject" cssClass="error" ></form:errors>
                        </div><!-- /.field-row -->

                        <div class="field-row">
                            <label>Your Message</label>
                            <!--<textarea rows="8" class="le-input"></textarea>-->
            <form:textarea  rows="8" class="le-input" path="message" name="message"/>  <br/> <form:errors style="color:red;" path="message" cssClass="error" ></form:errors>
                        </div><!-- /.field-row -->

                        <div class="buttons-holder">
                            <button type="submit" class="le-button huge">Send Message</button>
                        </div><!-- /.buttons-holder -->
    </form:form> 
                    <!--</form> /.contact-form -->
                </section><!-- /.leave-a-message -->
            </div><!-- /.col -->

            <div class="col-md-4">
                <section class="our-store section inner-left-xs">
                    <h2 class="bordered">Our Contacts</h2>
                    
                    <h3>USA</h3>
                    <address>
                        Yury Smirnov <br/>                        
                        "Evelin of America Corporation" <br/>                        
                        ESTERO, FL 33928, USA <br/>
                        Contact phone: +1(203) 556-50-69
                    </address>
                       
<!--                    <h3>Russia</h3>
                        <address>
                            Амитиров Андрей <br/>
                            OOO "Sapr-Center" <br/>
                            Новосибирск <br/>
                            ул. Станционная 30а офис 608 <br/>
                            +7 (903) 930-22-24 <br/>
                            факс: 8(383)211-93-07 <br/>  
                        </address>
                        <address>
                            Андрей Худяков  <br/>
                            OOO "Anmiko" <br/>
                            Москва <br/>
                            2-ой Кожуховский проезд, д. 29, корпус 5 <br/>
                            +7 (903) 930-22-24 <br/>
                            факс: 8(383)211-93-07 <br/>  
                        </address>
                      
                        <h3>Беларусь</h3>
                        <address>
                            Dmitry Prokopenko <br/>
                            OOO "Белстанкосистема" <br/>
                            Минский обл. г.Фаниполь, <br/>
                            ул. Заводская 4, офис 102а; <br/>
                            +375 29 255-88-88<br/>

                        </address>-->
                    
                    <h3>Hours of Operation</h3>
                    
                    
                    
                    <ul class="list-unstyled operation-hours">
                        <li class="clearfix">
                            <span class="day">Monday:</span>
                            <span class="pull-right hours">9 a.m.-5 p.m.</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Tuesday:</span>
                            <span class="pull-right hours">9 a.m.-5 p.m.</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Wednesday:</span>
                            <span class="pull-right hours">9 a.m.-5 p.m.</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Thursday:</span>
                            <span class="pull-right hours">9 a.m.-5 p.m.</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Friday:</span>
                            <span class="pull-right hours">9 a.m.-5 p.m.</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Saturday:</span>
                            <span class="pull-right hours">Closed</span>
                        </li>
                        <li class="clearfix">
                            <span class="day">Sunday</span>
                            <span class="pull-right hours">Closed</span>
                        </li>
                    </ul>
                    <h3></h3>
                    <p>Please email us: <a href="mailto:contact@vmccnc.com">contact@vmccnc.com</a></p>
                </section><!-- /.our-store -->
            </div><!-- /.col -->

        </div><!-- /.row -->
    </div><!-- /.container -->
</main>
<!-- ========================================= MAIN : END ========================================= -->     <!-- ============================================================= FOOTER ============================================================= -->

<!-- %@include file="in/footer.jsp" % -->


<!-- ============================================================= FOOTER : END ============================================================= -->   </div><!-- /.wrapper -->

    <!-- For demo purposes â can be removed on production -->
    
<!--    <div class="config open">
        <div class="config-options">
            <h4>Pages</h4>
            <ul class="list-unstyled animate-dropdown">
                <li class="dropdown">
                    <button class="dropdown-toggle btn le-button btn-block" data-toggle="dropdown">View Pages</button>
                    <ul class="dropdown-menu">
                                                <li><a href="index.html&amp;style=alt">Home</a></li>
                                                <li><a href="index-2.html&amp;style=alt">Home Alt</a></li>
                                                <li><a href="category-grid.html&amp;style=alt">Category - Grid/List</a></li>
                                                <li><a href="category-grid-2.html&amp;style=alt">Category 2 - Grid/List</a></li>
                                                <li><a href="single-product.html&amp;style=alt">Single Product</a></li>
                                                <li><a href="single-product-sidebar.html&amp;style=alt">Single Product with Sidebar</a></li>
                                                <li><a href="cart.html&amp;style=alt">Shopping Cart</a></li>
                                                <li><a href="checkout.html&amp;style=alt">Checkout</a></li>
                                                <li><a href="about.html&amp;style=alt">About Us</a></li>
                                                <li><a href="contact.html&amp;style=alt">Contact Us</a></li>
                                                <li><a href="blog.html&amp;style=alt">Blog</a></li>
                                                <li><a href="blog-fullwidth.html&amp;style=alt">Blog Full Width</a></li>
                                                <li><a href="blog-post.html&amp;style=alt">Blog Post</a></li>
                                                <li><a href="faq.html&amp;style=alt">FAQ</a></li>
                                                <li><a href="terms.html&amp;style=alt">Terms & Conditions</a></li>
                                                <li><a href="authentication.html&amp;style=alt">Login/Register</a></li>
                                                <li><a href="404.html&amp;style=alt">404</a></li>
                                                <li><a href="wishlist.html&amp;style=alt">Wishlist</a></li>
                                                <li><a href="compare.html&amp;style=alt">Product Comparison</a></li>
                                                <li><a href="track-your-order.html&amp;style=alt">Track your Order</a></li>
                                            </ul>   
                </li>
            </ul>
            <h4>Header Styles</h4>
            <ul class="list-unstyled">
                <li><a href="contact.html&amp;style=alt1">Header 1</a></li>
                <li><a href="contact.html&amp;style=alt">Header 2</a></li>
            </ul>
            <h4>Colors</h4>
            <ul class="list-unstyled">
                <li><a class="changecolor green-text" href="#" title="Green color">Green</a></li>
                <li><a class="changecolor blue-text" href="#" title="Blue color">Blue</a></li>
                <li><a class="changecolor red-text" href="#" title="Red color">Red</a></li>
                <li><a class="changecolor orange-text" href="#" title="Orange color">Orange</a></li>
                <li><a class="changecolor navy-text" href="#" title="Navy color">Navy</a></li>
                <li><a class="changecolor dark-green-text" href="#" title="Darkgreen color">Dark Green</a></li>
            </ul>
        </div>
        <a class="show-theme-options" href="#"><i class="fa fa-wrench"></i></a>
    </div>-->
    <!-- For demo purposes â can be removed on production : End -->

    <!-- JavaScripts placed at the end of the document so the pages load faster -->
    <script src="resources/assets/js/jquery-1.10.2.min.js"></script>
    <script src="resources/assets/js/jquery-migrate-1.2.1.js"></script>
    <script src="resources/assets/js/bootstrap.min.js"></script>
    <script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
    <script src="resources/assets/js/gmap3.min.js"></script>
    <script src="resources/assets/js/bootstrap-hover-dropdown.min.js"></script>
    <script src="resources/assets/js/owl.carousel.min.js"></script>
    <script src="resources/assets/js/css_browser_selector.min.js"></script>
    <script src="resources/assets/js/echo.min.js"></script>
    <script src="resources/assets/js/jquery.easing-1.3.min.js"></script>
    <script src="resources/assets/js/bootstrap-slider.min.js"></script>
    <script src="resources/assets/js/jquery.raty.min.js"></script>
    <script src="resources/assets/js/jquery.prettyPhoto.min.js"></script>
    <script src="resources/assets/js/jquery.customSelect.min.js"></script>
    <script src="resources/assets/js/wow.min.js"></script>
    <script src="resources/assets/js/scripts.js"></script>

    <!-- For demo purposes â can be removed on production -->
    
    <script src="resources/assets/switchstylesheet/switchstylesheet.js"></script>
    
    <script>
        $(document).ready(function(){ 
            $(".changecolor").switchstylesheet( { seperator:"color"} );
            $('.show-theme-options').click(function(){
                $(this).parent().toggleClass('open');
                return false;
            });
        });

        $(window).bind("load", function() {
           $('.show-theme-options').delay(2000).trigger('click');
        });
    </script>
    <!-- For demo purposes â can be removed on production : End -->

    <script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>