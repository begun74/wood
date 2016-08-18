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

	    <title>Test</title>

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

<!--                
<%--<%@include file="in/nav.jsp" %>--%>        
 ============================================================= TOP NAVIGATION : END =============================================================         ============================================================= HEADER ============================================================= 
<%--<%@include file="in/header.jsp" %>--%>                   
                -->

<!-- ============================================================= HEADER : END ============================================================= -->		
<main id="faq" class="inner">
	<div class="container">
		<div class="row">
			<div class="col-md-8 center-block">
				<div class="info-404 text-center">
					<h2 class="primary-color inner-bottom-xs">Test</h2>
					<p class="lead">We are sorry, the page you've requested is test.</p>
					<div class="text-center">
						<!--<a href="j_spring_security_logout" class="btn-lg huge"> Log out</a>-->
					</div>
					<div class="sub-form-row inner-top-xs inner-bottom-xs">
<!--		                <form role="form">
		                    <input placeholder="Search our product catalog" autocomplete="off">
		                    <button class="le-button">Go</button>
		                </form>-->
				    </div>
					<div class="text-center">
						<a href="index" class="btn-lg huge"><i class="fa fa-home"></i> Go to Home Page</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</main>		

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