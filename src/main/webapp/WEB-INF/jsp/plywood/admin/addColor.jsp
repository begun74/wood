<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Bootstrap Core CSS -->
        <!-- link rel="stylesheet" href="resources/assets/css/bootstrap.min.css" -->

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
        <link rel="stylesheet" href="resources/assets/css/config.css">

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
        

	    <title>Manage</title>
    </head>
    
    
	<body>

		<%@include file="../common/nav.jsp" %>
	    <div id="wrapper" class="container-fluid">
	        <!-- Sidebar -->
	        <div id="sidebar-wrapper">
	            <ul class="sidebar-nav">
	                <li class="sidebar-brand">
	                    <a href="admin?act=1" >Add color</a>
	                </li>
	                <li>
	                    <a href="admin?act=2" >Add particleboard</a>
	                </li>
	            </ul>
	        </div>
	        <!-- /#sidebar-wrapper -->
	
	        <!-- Page Content -->
	        <div id="page-content-wrapper">
				<div class="container-fluid">
					<div class="row">
	    				<div class="col-md-8 alert-danger">
								<strong>${error}</strong>
	    				</div>
					</div>
				</div>
	            <div class="container-fluid">
					<div class="row">
						<div class="col-md-2">
						  	<form:form id="addColorForm" class="form-horizontal" role="form"  
						  			enctype="multipart/form-data" 
						  			action="${pageContext.request.contextPath}/admin/addColor?${_csrf.parameterName}=${_csrf.token}" 
						  			method="POST"
						  			modelAttribute="dirColor">
							         <div style='margin-bottom: 15px' class="form-group">
					                   <label>Color <input id="name" type="text" class="form-control" name="name" ></label> 
							         </div>
					         <button type="submit" class="">Add</button>
					         <input type="hidden" name ="id_dirColor" id ="id_dirColor" value="-1"/>
					    	</form:form>
						</div>
						<div class="col-md-2">
						</div>
						<div class="col-md-8">
							<div>Name</div>
									<c:forEach items="${dirColors}" var="dirColor">
									  	<div class="row span6" >
											<div class="col-md-2">
												<div><a href="#" onclick="$('#name').val('${dirColor.name}');">${dirColor.name}</a></div>
											</div>
											<div class="col-md-2">
					         					<button type="button"  onclick="$('#id_dirColor').val(${dirColor.id}); $('#addColorForm').submit();" >Update</button>
					         				</div>
											<div class="col-md-1">
												<button type="button"  onclick="if(confirm('Delete record?'))location.href='admin/delColor?id=${dirColor.id}'">Delete</button>
											</div>
										</div>
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