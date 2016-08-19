<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Manage</title>

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
								<td width="15px"><div style="width: 15px;">id</div></td>
								<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
								<td width="50px"><div style="overflow: hidden; width: 50px;">thickness</div></td>
								<td width="50px"><div style="overflow: hidden; width: 50px;">length</div></td>
								<td width="50px"><div style="overflow: hidden; width: 50px;">weight</div></td>
								<td width="50px"><div style="overflow: hidden; width: 50px;">Price</div></td>
								<td width="8px"><div style="overflow: hidden; width: 8px;">&#160;</div></td>
							</tr>				
						</table>
						
					<div align="center" style="overflow-y:scroll; overflow-x: none; height:200px; width="98%"">
						<table border="1" width="100%">
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
								<tr align="center">
									<td width="15px"><div style="width: 15px;">id</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">1250</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">50</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">48</div></td>
								</tr>
						</table>
					</div>	
					<br/>           
                <div class="row">
                	<form:form id="processFileForm" role="form"  
						  			enctype="multipart/form-data" 
						  			action="${pageContext.request.contextPath}/admin/processFile?${_csrf.parameterName}=${_csrf.token}" 
						  			method="POST">
                	
								 <div class="row">
				    				<div class="col-md-4">
										<input type="file" name="file">
									</div>
				    				<div style="margin-bottom: 15px" class="col-md-4">
		                				<button type="submit">Load file</button>
									</div>			
								</div>
                	</form:form>
                    <div class="col-lg-12">
                        <a href="#menu-toggle" class="btn btn-default" id="menu-toggle">Toggle Menu</a>
                    </div>
                </div>
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