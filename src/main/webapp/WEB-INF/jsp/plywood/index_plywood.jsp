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
        <meta name="keywords" content="">
        <meta name="robots" content="all">
        
        <title>Plywood</title>
        
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">
        
        <!-- Customizable CSS -->
        <link rel="stylesheet" href="<c:url value="resources/assets/css/main.css" />">
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
		<%@include file="common/nav.jsp" %>      
		<!-- %@include file="common/header.jsp" % -->     
    
    	</div>

		<div class="container">
			<div class="row">
					<div class="col-md-2"></div> 
		    		<div class="col-md-8">
		    			<div class="box-content">
							<div class="headlines">
								<h2>Particleboard</h2>
							</div>
							<table class="tab tab-drag">
								<tr class="top nodrop nodrag">
									<td>Size</td>
									<td>Color</td>
									<td>Price</td>
									<td>Photo</td>
								</tr>
								
							<c:forEach items="${particleboards}" var="particleboard">
								<tr class="top nodrop nodrag">
									<td padding="10px">${particleboard.thickness}x${particleboard.length}x${particleboard.weight}</td>
									<td>${particleboard.dirColor.name}</td>
									<td>${particleboard.price}</td>
									<td><img src="resources/pics/${particleboard.id}.jpeg"/></td>
								</tr>		
							</c:forEach>
							</table>
						</div>
					</div>
					<div class="col-md-2"></div> 
			</div>		
		</div>

    </body>
    
</html>