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
		<div class="row">
				<div class="col-xs-12 col-sm-4 col-md-3 sidemenu-holder">

						<div class="side-menu animate-dropdown">
							<div class="widget">
	    					<div class="head"><i class="fa fa-list"></i><spring:message code="product.filter"/></div>
		    				<form  method="GET" name="mIndex"	action="${pageContext.request.contextPath}/search">
				    
				    		<div class="body bordered"> 
				        		<div class="category-filter">
					            	<h2><spring:message code="brand.name"/></h2>
					            	<ul>    
										<c:forEach items="${brands}" var="brand" varStatus="vs" >
											<li><input  class="le-checkbox" type="checkbox"  name="brands" id="brand_${brand.id}" value="${brand.id}" /><label>${brand.name}</label></li>
										</c:forEach>
									</ul>   
									<hr/>
									<h2><spring:message code="price"/></h2>
									<ul>
											<div class="col-xs-5">
												<label><spring:message code="from"/><input class="form-control" name="priceFrom" id="priceFrom" type="text" maxlength="5"/></label>
											</div>
											<div class="col-xs-5">
												<label><spring:message code="to"/><input class="form-control" name="priceTo" id="priceTo" type="text" maxlength="5" /></label>
											</div>
									</ul>
									<h2><spring:message code="thickness"/></h2>
									<ul>
											<div class="col-xs-10">
												<select class="select" id="thickness" name="thickness">
													<option value=""></option>
													<c:forEach items="${thickness}" var="t">
														<option value="${t}">${t}</option>
													</c:forEach>
												</select>												
											</div>
									</ul>
									<h2><spring:message code="weight"/></h2>
									<ul>
											<div class="col-xs-10">
												<select class="select" id="weight" name="weight">
													<option value=""></option>
													<c:forEach items="${weight}" var="w">
														<option value="${w}">${w}</option>
													</c:forEach>
												</select>												
											</div>
									</ul>
									<h2><spring:message code="length"/></h2>
									<ul>
											<div class="col-xs-10">
												<select class="select" id="length" name="length">
													<option value=""></option>
													<c:forEach items="${length}" var="l">
														<option value="${l}">${l}</option>
													</c:forEach>
												</select>												
											</div>
									</ul>
									<hr/>
								</div>
							
							<input type="hidden" name="pg" value="${param.pg}"/>
							
							<button class="le-button small"><spring:message code="label.button.select"/></button>
		    				</div>
    						</form>
		    		
		    			</div>
		    			</div>
	    										    				
	    			
				</div>
		    <div class="col-xs-12 col-sm-12 col-md-9">
									<div>
										<!-- Main content  -->
											<%@include file="common/nav2.jsp" %>      
										<!-- Main content  -->
									</div>

									<div>
										<!-- Main content  -->
											<%@include file="common/content4.jsp" %>      
										<!-- Main content  -->
									</div>
									
			</div>
						<div class="col col-md-12">
							<div class="col col-md-5"></div>
							<div class="pagination col-md-4">
										<ul  class="pagination">
							              
											<c:forEach begin="0" end="${allItems/perPage}" var="pN">
												<li><a href="index?pg=${param.pg}&pageNumber=${pN+1}">${pN+1}</a></li>
											</c:forEach>
							              
										</ul>
							</div>
							<div class="col col-md-3"></div>
						</div>						
			
				
		</div><!-- row -->
								
		</div><!-- /container -->
		</div><!-- /wrapper -->
		
		<!-- %@include file="common/contact_info.jsp" % -->
		
		<%@include file="common/footer.jsp" %>
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
	    $(function() {
				var brnds = ${mIndex.brands};
							
				for (var item in brnds) {
	                $('#brand_'+brnds[item]).attr("checked","checked");
	            }
	
	            $('#priceFrom').val('${mIndex.priceFrom}');
	            $('#priceTo').val('${mIndex.priceTo}');

	            $('#thickness').val('${mIndex.thickness}');
	            $('#weight').val('${mIndex.weight}');
	            $('#length').val('${mIndex.length}');

	    });
    </script>
	
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
		 
    
</html>