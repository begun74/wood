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
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="${pageContext.request.contextPath}/resources/css/simple-sidebar.css" rel="stylesheet">

        <!-- Customizable CSS -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/main.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/green.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/config.css">

        <link href="${pageContext.request.contextPath}/resources/assets/css/green.css" rel="alternate stylesheet" title="Green color">
        <link href="${pageContext.request.contextPath}/resources/assets/css/blue.css" rel="alternate stylesheet" title="Blue color">
        <link href="${pageContext.request.contextPath}/resources/assets/css/red.css" rel="alternate stylesheet" title="Red color">
        <link href="${pageContext.request.contextPath}/resources/assets/css/orange.css" rel="alternate stylesheet" title="Orange color">
        <link href="${pageContext.request.contextPath}/resources/assets/css/navy.css" rel="alternate stylesheet" title="Navy color">
        <link href="${pageContext.request.contextPath}/resources/assets/css/dark-green.css" rel="alternate stylesheet" title="Darkgreen color">
        <!-- Demo Purpose Only. Should be removed in production : END -->

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700,800' rel='stylesheet' type='text/css'>
        
        <!-- Icons/Glyphs -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/font-awesome.min.css">
        
        <!-- Favicon -->
        <link rel="shortcut icon" href="${pageContext.request.contextPath}/resources/assets/images/favicon.ico">




    </head>
    
    
    <body>
    	<div class="wrapper">
		<%@include file="common/nav.jsp" %>      
		<%@include file="common/header2.jsp" %>     
		
		
		

		<div id="single-product">

			<div class="container">
				<div class="no-margin col-xs-12 col-sm-6 col-md-5 gallery-holder">
				    <div class="product-item-holder size-big single-product-gallery small-gallery">
				
				        <div id="owl-single-product">
				            <div class="single-product-gallery-item" id="slide1">
				                <a data-rel="prettyphoto" href="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg">
				                    <img class="img-responsive" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg" />
				                </a>
				            </div><!-- /.single-product-gallery-item -->
				
				            <div class="single-product-gallery-item" id="slide2">
				                <a data-rel="prettyphoto" href="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg">
				                    <img class="img-responsive" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg" />
				                </a>
				            </div><!-- /.single-product-gallery-item -->
				
				            <div class="single-product-gallery-item" id="slide3">
				                <a data-rel="prettyphoto" href="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg">
				                    <img class="img-responsive" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/product-gallery-01.jpg" />
				                </a>
				            </div><!-- /.single-product-gallery-item -->
				        </div><!-- /.single-product-slider -->
				
				
				        <div class="single-product-gallery-thumbs gallery-thumbs">
				
				            <div id="owl-single-product-thumbnails">
				                <a class="horizontal-thumb active" data-target="#owl-single-product" data-slide="0" href="#slide1">
				                    <img width="67" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/gallery-thumb-01.jpg" />
				                </a>
				
				                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="1" href="#slide2">
				                    <img width="67" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/gallery-thumb-01.jpg" />
				                </a>
				
				                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="2" href="#slide3">
				                    <img width="67" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/gallery-thumb-01.jpg" />
				                </a>
				
				                <a class="horizontal-thumb" data-target="#owl-single-product" data-slide="1" href="#slide2">
				                    <img width="67" alt="" src="${pageContext.request.contextPath}/resources/assets/images/blank.gif" data-echo="${pageContext.request.contextPath}/resources/assets/images/products/gallery-thumb-01.jpg" />
				                </a>
				            </div><!-- /#owl-single-product-thumbnails -->
				
				            <div class="nav-holder left hidden-xs">
				                <a class="prev-btn slider-prev" data-target="#owl-single-product-thumbnails" href="#prev"></a>
				            </div><!-- /.nav-holder -->
				            
				            <div class="nav-holder right hidden-xs">
				                <a class="next-btn slider-next" data-target="#owl-single-product-thumbnails" href="#next"></a>
				            </div><!-- /.nav-holder -->
				
				        </div><!-- /.gallery-thumbs -->
				
				    </div><!-- /.single-product-gallery -->
			</div><!-- /gallery-holder -->
		
		<div class="col-xs-12 col-sm-7 body-holder">
    		<div class="body">
    			<div class="star-holder inline"><div class="star" data-score="4"></div></div>
		        <div class="availability"><label>Availability:</label><span class="available">  in stock</span></div>
		
		        <div class="title"><a href="#">${particleboard.thickness}x${particleboard.length}x${particleboard.weight}</a></div>
		        <div class="brand">${particleboard.dirBrand.name}</div>
		
		        <div class="social-row">
		            <span class="st_facebook_hcount"></span>
		            <span class="st_twitter_hcount"></span>
		            <span class="st_pinterest_hcount"></span>
		        </div>
		        
		        <div class="buttons-holder">
		            <a class="btn-add-to-wishlist" href="#">add to wishlist</a>
		            <a class="btn-add-to-compare" href="#"><spring:message code="compare"/></a>
		        </div>
		
		        <div class="excerpt">
		            <p>Product ID: ${particleboard.productId}</p>
		        </div>
		        
		        <div class="prices">
		            <div class="price-current">$${particleboard.price}</div>
		            <div class="price-prev">$${particleboard.price}</div>
		        </div>
		        <div class="qnt-holder">
		            <div class="le-quantity">
		                <form>
		                    <a class="minus" href="#reduce"></a>
		                    <input id="quantity" name="quantity" readonly="readonly" type="text" value="1" />
		                    <a class="plus" href="#add"></a>
		                </form>
		            </div>
		            <a id="add-product" href="javascript:addProductToBacket(${particleboard.id});" class="le-button huge"><spring:message code="add.to.cart"/></a>
		        </div><!-- /.qnt-holder -->
    		</div><!-- /body -->
    	</div>
		
		</div><!-- single-product -->
		
		<section id="single-product-tab">
    	<div class="container">
        	<div class="tab-holder">
            
	            <ul class="nav nav-tabs simple" >
	                <li class="active"><a href="#description" data-toggle="tab"><spring:message code="description"/></a></li>
	                <li><a href="#additional-info" data-toggle="tab"><spring:message code="additional.information"/></a></li>
	                <li><a href="#reviews" data-toggle="tab"><spring:message code="reviews"/></a></li>
	            </ul><!-- /.nav-tabs -->
			</div>
		</div>
		</section>	
			
		</div><!-- /wrapper -->
    </body>

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

            $('#priceFrom').val('${mIndex.priceFrom}');
            $('#priceTo').val('${mIndex.priceTo}');

            
			$(".changecolor").switchstylesheet( { seperator:"color"} );
			$('.show-theme-options').click(function(){
				$(this).parent().toggleClass('open');
				return false;
			});
			

		});

		$(window).bind("load", function() {
		   $('.show-theme-options').delay(2000).trigger('click');
		});

		function addProductToBacket(id)
		{
			alert(id);
			location.href='add-product-to-customer-basket?id='+id+'&quantity='+$(quantity).val();
		}
		
		
		</script>
	<!-- For demo purposes – can be removed on production : End -->

	<script src="http://w.sharethis.com/button/buttons.js"></script>
		 
    
</html>