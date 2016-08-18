<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="en">
    <head>
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

	    <title>Manage</title>
    </head>
    
	<body>
	<%@include file="../common/nav.jsp" %>
    <div id="wrapper">

        <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul class="sidebar-nav">
                <li>
                    <a href="manage?act=1" >Add color</a>
                </li>
                <li>
                    <div><a href="manage?act=2" >Add particleboard</a>
                </li>
            </ul>
        </div>
        <!-- /#sidebar-wrapper -->

        <!-- Page Content -->
        <div id="page-content-wrapper">
            <div class="container-fluid">

			<div class="row">
				<div class="col-md-2">
				  	<form:form id="addColorForm" class="form-horizontal" role="form"  action="${pageContext.request.contextPath}/manage/addColor" method="post">
				         <div style='margin-bottom: 15px' class="form-group">
		                   <label>Color<input id="weight" type="text" class="form-control" name="name" ></label> 
				         </div>
				         <button type="submit" class="">Add</button>
			    	</form:form>
				</div>
				<div class="col-md-2">
				</div>
				<div class="col-md-8">
					<div>Name</div>
					<c:forEach items="${dirColors}" var="dirColor">
						<div>${dirColor.name}</div>
					</c:forEach>			
				</div>
			</div>

                <div class="row">
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