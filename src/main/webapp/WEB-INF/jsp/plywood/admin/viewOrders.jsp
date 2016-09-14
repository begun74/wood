<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>
	
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<meta name="_csrf" content="${_csrf.token}"/>
	<meta name="_csrf_header" content="${_csrf.headerName}"/>

    <title>Orders</title>

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
	    <script src="resources/js/app.js"></script>
        

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

	<%@include file="../common/nav.jsp" %>
    <div id="wrapper" class="container-fluid">
        <!-- Sidebar -->
		<%@include file="sidebar.jsp" %>
        <!-- /#sidebar-wrapper -->

		<form name="mAdmin" method="POST" action="${pageContext.request.contextPath}/admin/generateFile?${_csrf.parameterName}=${_csrf.token}">
        <!-- Page Content -->
        <div class="container-fluid">
                <div class="row">
                	<div class="col-md-12">
					<table border="1" width="100%" align="center">
							<tr align="center">
								<td width="25px"><div style="overflow: hidden; width: 25px;">&#160;</div></td>
								<td width="35px"><div style="overflow: hidden; width: 35px;"><spring:message code="id"/></div></td>
								<td width="150px"><div style="overflow: hidden; width: 150px;"><spring:message code="date"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="name"/></div></td>
								<td width="150px"><div style="overflow: hidden; width: 150px;"><spring:message code="phone"/></div></td>
								<td width="220px"><div style="overflow: hidden; width: 220px;"><spring:message code="email"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="photo"/></div></td>
								<td width="45px"><div style="overflow: hidden; width: 45px;"><spring:message code="ready"/></div></td>
								<td width="100%"><div style="overflow: hidden; width: 100%;"><spring:message code="description"/></div></td>
								<td width="20px"><div style="overflow: hidden; width: 20px;">&#160;</div></td>
								<td width="45px"><div style="overflow: hidden; width: 45px;"><spring:message code="amount"/></div></td>
								<td width="15px"><div style="overflow: hidden; width: 15px;">&#160;</div></td>
							</tr>				
					</table>
					<div align="center" style="overflow-y:scroll; overflow-x: none; height:400px; width:100%">
						<table border="1" width="100%">
							<c:forEach items="${orders}" var="order" varStatus="vs">
								<tr align="center" style="cursor:pointer">
									<td width="25px"><div style="overflow: hidden; width: 25px;">${vs.count}</div></td>
									<td width="35px"><div style="overflow: hidden; width: 35px;">${order.id}</div></td>
									<td width="150px"><div style="overflow: hidden; width: 150px;"><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${order.creation_date}" /></div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;">${order.name}</div></td>
									<td width="150px"><div style="overflow: hidden; width: 150px;">${order.phone}</div></td>
									<td width="220px"><div style="overflow: hidden; width: 220px;">${order.email}</div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;"><img src="resources/pics/${order.fk_particleboard}.jpeg" width="73" height="73"  onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';" /> ${order.fk_particleboard}</div></td>
									<td width="45px" id="td_order_${order.id}" <c:if test="${order.status == 1}">bgcolor="green"</c:if>>
											<div style="overflow: hidden; width: 45px;">
													<input type="checkbox" id="order_${order.id}" value="${order.id}" <c:if test="${order.status == 1}">checked="checked"</c:if> onclick="statusOrders(this,'chbxParts_${order.fk_particleboard}','amountParts[${vs.index}]')"/>
											</div></td>
									<td width="100%"><div style="overflow: hidden; width: 100%;">${order.description}</div></td>
									<td width="20px">
										<div style="overflow: hidden; width: 20px;">
											<input type="checkbox" name='chbxParts[${vs.index}]' id="chbxParts_${order.fk_particleboard}" value="${order.fk_particleboard}" <c:if test="${order.status == 1}">disabled="disabled"</c:if> />
										</div>
									</td>
									<td width="45px"><div style="overflow: hidden; width: 45px;"><input type="text" name='amountParts[${vs.index}]' id="amountParts_${order.fk_particleboard}" maxlength="4" <c:if test="${order.status == 1}">disabled="disabled"</c:if> /></div></td>
								</tr>
							</c:forEach>
						</table>
					</div>	
					<br/>           
            </div>
        <!-- /#page-content-wrapper -->
        </div>
		<div>
					<input type="submit" name="butPrint" value="<spring:message code="print"/> <spring:message code="commercial.offer"/>" />
		</div>
        
        </form>

    </div>
    <!-- /#wrapper -->

    <div class="row">
          <div class="col-md-12">
               <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
          </div>
    </div>
    
    <!-- jQuery -->
    <script src="resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="resources/js/bootstrap.min.js"></script>

    <!-- Menu Toggle Script -->
    <script>
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#wrapper").toggleClass("toggled");
    });

    
    </script>

</body>

</html>