<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

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

    	<!-- Check if you're referencing jquery.js BEFORE bootstrap.js and bootstrap.js is loaded only once -->
	    <!-- jQuery -->
	    <script src="resources/js/jquery.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="resources/js/bootstrap.min.js"></script>

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

		<!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
		<!--[if lt IE 9]>
			<script src="resources/assets/js/html5shiv.js"></script>
			<script src="resources/assets/js/respond.min.js"></script>
		<![endif]-->


	</head>
<body>
	
<h2>Subscribe to the gym</h2>
	    <form method="POST" commandName="member" name="member"
	    		action="${pageContext.request.contextPath}/test?${_csrf.parameterName}=${_csrf.token}" >
	        <table>
	            <tr>
	                <td><label>Are you a new member?  
	                			<input type="checkbox" class="le-checkbox" name="newMember" id="newMember"></input>
	                	</label>
	                </td>
	            </tr>
	            <tr>
	                <td>Choose the courses you like:</td>
	                <td>
	                	<c:forEach items="${courses}" var="course" >
	                		<input type="checkbox" class="le-checkbox" name="courses" value="${course}" id="${course}">${course}</input>
	                	</c:forEach>
	                </td>
	            </tr>
	            <tr>
	                <td>Choose the radios you like:</td>
	                <td>
	                	<c:forEach items="${radios}" var="radio" >
	                		<input type="radio" class="le-checkbox" name="radios" value="${radio}" id="${radio}">${radio}</input>
	                	</c:forEach>
	                </td>
	            </tr>
	            <tr>
	            	<td>
	            		<!-- select name="ops" id="ops" multiple="true">
	            			<c:forEach items="${ops}" var="op" >
	            				<option value="${op}">${op}</option>
	            			</c:forEach>
	            		</select -->
	            	</td>
	            </tr>
	            <tr>
	                <td><input type="submit" name="submit" value="Submit"></td>
	            </tr>
	            <tr>
	        </table>
	    </form>
</body>
	<script>
		$(function(){ 
			
			var arr = ${member.courses};
			$.each(arr,function(){
				$(this).attr("checked","checked");
			});

			arr = ${member.radios};
			$.each(arr,function(){
				$(this).attr("checked","checked");
			});


		});


	</script>
</html>