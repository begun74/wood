<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<!-- html lang="en" -->
<html>
    <head>
        <!-- Bootstrap Core CSS -->
        <!-- link rel="stylesheet" href="resources/assets/css/bootstrap.min.css" -->

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

	    <title>Manage</title>
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
	    				<div class="col-md-8 alert-danger">
								<strong>${error}</strong>
	    				</div>
					</div>
				</div>
	            <div class="container-fluid">
					<div class="row">
						<div class="col-md-2">
						  	<form:form id="addBrandForm" class="form-horizontal" role="form"
						  			commandName="addBrandForm"
						  			enctype="multipart/form-data" 
						  			action="${pageContext.request.contextPath}/admin/addBrand?${_csrf.parameterName}=${_csrf.token}" 
						  			method="POST"
						  			modelAttribute="dirBrand">
							         <div style='margin-bottom: 15px' class="form-group">
					                   <label>Brand <input name="name" id="name" type="text" class="form-control"  ></label> 
							         </div>
							         <div style='margin-bottom: 15px' class="form-group">
					                   <label>Description </label>
					                   <!-- input name="description" id="description" type="text" class="form-control"  / -->
					                   <textarea name="description" id="description" class="form-control" maxlength = "45"
					                   rows="2" cols="5"></textarea> 
							         </div>
							         
					         <button type="submit" class=""><spring:message code="label.button.add"/></button>
					         <input type="hidden" name ="id_dirBrand" id ="id_dirBrand" value="-1"/>
					    	</form:form>
						</div>
						<div class="col-md-2">
						</div>
						<div class="col-md-8">
							<div>Name</div>
									<c:forEach items="${dirBrands}" var="dirBrand">
									  	<div class="row span6" >
											<div class="col-md-4">
												<div><a href="#" onclick="$('#name').val('${dirBrand.name}'); $('#description').val('${dirBrand.description}');">${dirBrand.name}</a></div>
											</div>
											<div class="col-md-2">
					         					<button type="button"  onclick="$('#id_dirBrand').val(${dirBrand.id}); $('#addBrandForm').submit();" ><spring:message code="label.button.update"/></button>
					         				</div>
											<div class="col-md-1">
												<button type="button"  onclick="if(confirm('Delete record?'))location.href='admin/delBrand?id=${dirBrand.id}'"><spring:message code="label.button.delete"/></button>
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

	
	    <!-- Menu Toggle Script -->
	    <script>
	    $("#menu-toggle").click(function(e) {
	        e.preventDefault();
	        $("#wrapper").toggleClass("toggled");
	    });

	    </script>
		
	</body>
	
</html>