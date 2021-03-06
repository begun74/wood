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



    	<!-- Check if you're referencing jquery.js BEFORE bootstrap.js and bootstrap.js is loaded only once -->
	    <!-- jQuery -->
	    <script src="resources/js/jquery.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="resources/js/bootstrap.min.js"></script>

			<script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery-1.4.2.min.js"></script>   
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.dimensions.min.js"></script>
    
    <!-- // Tabs // -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/ui.core.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.ui.tabs.min.js"></script>

    <!-- // Table drag and drop rows // -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/tablednd.js"></script>

    <!-- // Date Picker // -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/date.js"></script>
    <!--[if IE]><script type="text/javascript" src="public/js/jquery.bgiframe.js"></script><![endif]-->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.datePicker.js"></script>

    <!-- // Wysiwyg // -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.wysiwyg.js"></script>

    <!-- // Graphs // -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/excanvas.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.visualize.js"></script>

    <!-- // Fancybox // -->
  	<script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.fancybox-1.3.1.js"></script>

    <!-- // File upload // --> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/jquery.filestyle.js"></script>
    
    <script type="text/javascript" src="${pageContext.request.contextPath}/resources/public/js/init.js"></script>

    
        <!-- HTML5 elements and media queries Support for IE8 : HTML5 shim and Respond.js -->
        <!--[if lt IE 9]>
            <script src="resources/assets/js/html5shiv.js"></script>
            <script src="resources/assets/js/respond.min.js"></script>
        <![endif]-->
        
    </head>
    
    
    <body>
    	<div class="container">
		<%@include file="common/nav.jsp" %>      
		<%@include file="common/header2.jsp" %>     
    
				<div class="widget col-md-3">
				    <h1>Product Filters</h1>
		    		<form  method="GET" name="mIndex" 
		    			action="${pageContext.request.contextPath}/search">
				    
				    <div class="body bordered">
				        <div class="category-filter">
				            <h2>Brands</h2>
				            <hr>
				            <ul>    
								<c:forEach items="${brands}" var="brand" varStatus="vs" >
									<li><input  class="le-checkbox" type="checkbox"  name="brands" id="brand_${brand.id}" value="${brand.id}" /><label>${brand.name}</label></li>
								</c:forEach>
							</ul>   
							<hr> 
							<div><spring:message code="price"/></div>
							<div class="col-md-12">
								<div class="col-md-5">
									<label><spring:message code="from"/><input class="form-control" name="priceFrom" id="priceFrom" type="text" maxlength="3" placeholder="<spring:message code="from"/>"/></label>
								</div>					
								<div class="col-md-5">
									<spring:message code="to"/><input class="form-control" name="priceTo" id="priceTo" type="text" maxlength="3" placeholder="<spring:message code="to"/>"/>
								</div>
							</div>
							<hr> 
							<input  type="submit" name="submit" value="<spring:message code="label.button.select"/>"/>
		    			</div>
		    		</div>
    				</form>
		    		
		    	</div>
		
				<div class="col-md-9 no-margin sidebar">
											<!-- div class="grid-list-buttons">
												<div class="control-bar">
								                <ul>
								                    <li class="grid-list-button-item active"><a data-toggle="tab" href="#grid-view"><i class="fa fa-th-large"></i>Grid</a></li>
								                    <li class="grid-list-button-item "><a data-toggle="tab" href="#list-view"><i class="fa fa-th-list"></i>List</a></li>
								                </ul>
								                </div>
								            </div -->
		
					    		<div class="col-md-12">
									<div>
										<!-- Main content  -->
											<%@include file="common/content4.jsp" %>      
										<!-- Main content  -->
									</div>
								</div>
				</div>
    	</div>

    </body>
    
        <!-- Menu Toggle Script -->
	    <script>
	    $(function() {
			var brnds = ${mIndex.brands};
		
			for (var item in brnds) {
                $('#brand_'+brnds[item]).attr("checked","checked");
            }

            //alert(${mIndex.priceFrom}+'  '+${mIndex.priceTo});
            $('#priceFrom').val('${mIndex.priceFrom}');
            $('#priceTo').val('${mIndex.priceTo}');

	    });
	    </script>
    
</html>