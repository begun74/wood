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
    	<div class="container">
		<%@include file="common/nav.jsp" %>      
		<%@include file="common/header2.jsp" %>     
    
		<div class="widget col-md-3">
		    
    	</div>
    	
		<div class="col-md-10 no-margin sidebar">
									

			<div class="container">
						<div align="center" margin-bottom: 25px" class="col col-md-12">
							<label>Заказ товара</label>
						</div>
										
			    		<div class="col col-md-4">
							<form:form method="post" modelAttribute ="requestForm" id="requestForm"  
								action="createOrder">
							<div style="margin-bottom: 5px" class="input-group">
								<label>Имя</label>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<input type="text" name="name" value="${requestForm.name}"/>
							</div>
							<div>
								 <font color="red"><form:errors path="name" cssClass="formError"/></font>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<label>Телефон</label>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<input type="text" name="phone" value="${requestForm.phone}" placeholder="+375 1234 123-12-12"/>
							</div>
							<div>
								 <font color="red"><form:errors path="phone" cssClass="formError"/></font>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<label>Эл. почта</label>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<input type="text" name="email" value="${requestForm.email}"/>
							</div>
							
							<div style="margin-bottom: 5px" class="input-group">
								<label>Комментарии</label>
							</div>
							<div style="margin-bottom: 5px" class="input-group">
								<textarea name="description" id="description"   class="form-control" maxlength = "45"
					                   rows="2" cols="20">${requestForm.description}</textarea>
							</div>

							
							<input  type="submit" name="toOrder" value="<spring:message code="label.button.toOrder"/>"/>

							<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
							</form:form>
						</div>
				<div class="col col-md-8">
				<p/>
					<c:forEach items="${backetBean.itemsTM}" var="particleboard" varStatus="vs">
	                    <div class="basket-item">
	                        <div class="row">
	                            <div class="col-xs-4 col-sm-4 no-margin text-center">
	                                <div class="thumb">
	                                    <img src="resources/pics/${particleboard.key.id}.jpeg" width="73" height="73"  onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';" />
	                                </div>
	                            </div>
	                            <div class="col-xs-8 col-sm-8 no-margin">
	                                <div class="title">${particleboard.key.dirBrand.name}</div>
	                                <div class="title">${particleboard.key.thickness}x${particleboard.key.length}x${particleboard.key.weight}  (${particleboard.value})</div>
	                                <div class="price">$${particleboard.key.price}</div>
	                            </div>
	                        </div>
	                        <a class="close-btn" href="del-from-backet?id=${particleboard.key.id}"></a>
	                    </div>
	                </c:forEach>

				</div>
			</div>
		</div>

    	</div>

    </body>
    
        <!-- Menu Toggle Script -->
	    <script>
	    $("#menu-toggle").click(function(e) {
	        e.preventDefault();
	        $("#wrapper").toggleClass("toggled");
	    });
	    
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