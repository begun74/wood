<!DOCTYPE html>
<html lang="en">
	<head>
		<!-- Meta -->
		<meta charset="utf-8">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
		<meta name="description" content="">
		<meta name="author" content="">
	    <meta name="keywords" content="MediaCenter, Template, eCommerce">
	    <meta name="robots" content="all">

	    <title>MediaCenter - Responsive eCommerce Template</title>

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

                
<%@include file="/WEB-INF/jsp/hmc/in/nav.jsp" %>        
<!-- ============================================================= TOP NAVIGATION : END ============================================================= -->       <!-- ============================================================= HEADER ============================================================= -->
<%@include file="/WEB-INF/jsp/hmc/in/header.jsp" %>              
                

<!-- ============================================================= HEADER : END ============================================================= -->		<main id="faq" class="inner">
	<div class="container">
		<div class="row">
			<div class="col-md-8 center-block">
				<div class="info-404 text-center">
					<h2 class="primary-color inner-bottom-xs">403</h2>
					<p class="lead">We are sorry, the page you've requested is not available.</p>
					<div class="text-center">
						<a href="j_spring_security_logout" class="btn-lg huge"> Log out</a>
					</div>
					<div class="sub-form-row inner-top-xs inner-bottom-xs">
		                <form role="form">
		                    <input placeholder="Search our product catalog" autocomplete="off">
		                    <button class="le-button">Go</button>
		                </form>
				    </div>
					<div class="text-center">
						<a href="#" class="btn-lg huge"><i class="fa fa-home"></i> Go to Home Page</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</main>		<!-- ============================================================= FOOTER ============================================================= -->

<%@include file="/WEB-INF/jsp/hmc/in/footer.jsp" %>

<!-- ============================================================= FOOTER : END ============================================================= -->	</div><!-- /.wrapper -->

	<!-- For demo purposes – can be removed on production -->
	
<!--	<div class="config open">
		<div class="config-options">
			<h4>Pages</h4>
			<ul class="list-unstyled animate-dropdown">
				<li class="dropdown">
					<button class="dropdown-toggle btn le-button btn-block" data-toggle="dropdown">View Pages</button>
					<ul class="dropdown-menu">
                                                <li><a href="index.html">Home</a></li>
                                                <li><a href="index-2.html">Home Alt</a></li>
                                                <li><a href="category-grid.html">Category - Grid/List</a></li>
                                                <li><a href="category-grid-2.html">Category 2 - Grid/List</a></li>
                                                <li><a href="single-product.html">Single Product</a></li>
                                                <li><a href="single-product-sidebar.html">Single Product with Sidebar</a></li>
                                                <li><a href="cart.html">Shopping Cart</a></li>
                                                <li><a href="checkout.html">Checkout</a></li>
                                                <li><a href="about.html">About Us</a></li>
                                                <li><a href="contact.html">Contact Us</a></li>
                                                <li><a href="blog.html">Blog</a></li>
                                                <li><a href="blog-fullwidth.html">Blog Full Width</a></li>
                                                <li><a href="blog-post.html">Blog Post</a></li>
                                                <li><a href="faq.html">FAQ</a></li>
                                                <li><a href="terms.html">Terms & Conditions</a></li>
                                                <li><a href="authentication.html">Login/Register</a></li>
                                                <li><a href="404.html">404</a></li>
                                                <li><a href="wishlist.html">Wishlist</a></li>
                                                <li><a href="compare.html">Product Comparison</a></li>
                                                <li><a href="track-your-order.html">Track your Order</a></li>
                                            </ul> 	
				</li>
			</ul>
			<h4>Header Styles</h4>
			<ul class="list-unstyled">
				<li><a href="404.html">Header 1</a></li>
				<li><a href="404.html">Header 2</a></li>
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
	<!-- For demo purposes – can be removed on production : End -->

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

	<!-- For demo purposes – can be removed on production -->
	
	<script src="switchstylesheet/switchstylesheet.js"></script>
	
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
	<!-- For demo purposes – can be removed on production : End -->

	<script src="http://w.sharethis.com/button/buttons.js"></script>

</body>
</html>