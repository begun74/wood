<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Meta -->
        <meta charset="utf-8">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <!-- meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no" -->
	    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">
        <meta name="keywords" content="">
        <meta name="robots" content="all">
        
        <title>Plywood</title>
        
    <!-- Bootstrap Core CSS -->
    <link href="resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="resources/css/simple-sidebar.css" rel="stylesheet">

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




    </head>
    
    
    <body>
    	<div class="wrapper">
		<%@include file="common/nav.jsp" %>      
		<%@include file="common/header2.jsp" %>     

		<div class="container">
				<div class="col-xs-12 col-sm-4 col-md-3 sidemenu-holder">

					<div class="side-menu animate-dropdown">
	    				<div class="head"><i class="fa fa-list"></i> all plywood</div>
	    				
	    				<nav class="yamm megamenu-horizontal" role="navigation">
        					<ul class="nav">
							<li class="dropdown menu-item"><a href="#" class="dropdown-toggle" data-toggle="dropdown">Pages</a>
			                <ul class="dropdown-menu mega-menu">
				                    <li class="yamm-content">
				                        <div class="row">
				                            <div class="col-md-4">
				                                <ul class="list-unstyled">
	                                                    <li><a href="index.html">Home</a></li>
	                                            </ul>
				                            </div>
				                            <div class="col-md-4">
				                                <ul class="list-unstyled">
	                                                    <li><a href="cart.html">Shopping Cart</a></li>
	                                            </ul>
				                            </div>
				                            <div class="col-md-4">
				                                <ul class="list-unstyled">
	                                                    <li><a href="blog-post.html">Blog Post</a></li>
	                                                    <li><a href="faq.html">FAQ</a></li>
	                                                    <li><a href="terms.html">Terms & Conditions</a></li>
	                                                    <li><a href="authentication.html">Login/Register</a></li>
	                                            </ul>
				                            </div>
				                        </div>
				                    </li>   
			                   </ul>   
			                   </li>  					
        					</ul>
        				
        				</nav>
	    				
	    			</div>
				</div>
		</div>
		
		    
		</div><!-- /wrapper -->
    </body>

	<!-- JavaScripts placed at the end of the document so the pages load faster -->
		<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery-migrate-1.2.1.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script src="http://maps.google.com/maps/api/js?sensor=false&amp;language=en"></script>
		<script src="${pageContext.request.contextPath}/assets/js/gmap3.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap-hover-dropdown.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/owl.carousel.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/css_browser_selector.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/echo.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/jquery.easing-1.3.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/bootstrap-slider.min.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/jquery.raty.min.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/jquery.prettyPhoto.min.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/jquery.customSelect.min.js"></script>
	    <script src="${pageContext.request.contextPath}/assets/js/wow.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/scripts.js"></script>
	
		<!-- For demo purposes – can be removed on production -->
		
		<script src="switchstylesheet/switchstylesheet.js"></script>   
		 
	    <script>
	    $(function() {
			var brnds = ${mIndex.brands};
		
			for (var item in brnds) {
                $('#brand_'+brnds[item]).attr("checked","checked");
            }

            $('#priceFrom').val('${mIndex.priceFrom}');
            $('#priceTo').val('${mIndex.priceTo}');

	    });
	    </script>
    
</html>