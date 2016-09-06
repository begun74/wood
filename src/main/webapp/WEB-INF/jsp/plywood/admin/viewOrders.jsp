<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

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

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row">
                	<div class="col-lg-12">
						<table border="1" width="100%" align="center">
							<tr align="center">
								<td width="25px"><div style="overflow: hidden; width: 25px;">&#160;</div></td>
								<td width="35px"><div style="overflow: hidden; width: 35px;"><spring:message code="id"/></div></td>
								<td width="200px"><div style="overflow: hidden; width: 200px;"><spring:message code="date"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="name"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="phone"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="email"/></div></td>
								<td width="120px"><div style="overflow: hidden; width: 120px;"><spring:message code="photo"/></div></td>
								<td width="100%"><div style="overflow: hidden; width: 100%;"><spring:message code="description"/></div></td>
								<td width="15px"><div style="overflow: hidden; width: 15px;">&#160;</div></td>
							</tr>				
						</table>
						
					<div align="center" style="overflow-y:scroll; overflow-x: none; height:200px; width="98%"">
						<table border="1" width="100%">
							<c:forEach items="${orders}" var="order" varStatus="vs">
								<tr align="center" style="cursor:pointer">
									<td width="25px"><div style="overflow: hidden; width: 25px;">${vs.count}</div></td>
									<td width="35px"><div style="overflow: hidden; width: 35px;">${order.id}</div></td>
									<td width="200px"><div style="overflow: hidden; width: 200px;">${order.creation_date}</div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;">${order.name}</div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;">${order.phone}</div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;">${order.email}</div></td>
									<td width="120px"><div style="overflow: hidden; width: 120px;"><img src="resources/pics/${particleboard.key.id}.jpeg" width="73" height="73"  onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';" /></div></td>
									<td width="100%"><div style="overflow: hidden; width: 100%;">${order.description}</div></td>
								</tr>
							</c:forEach>
						</table>
					</div>	
					<br/>           
            </div>
        </div>
        <!-- /#page-content-wrapper -->

    </div>
    <!-- /#wrapper -->

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