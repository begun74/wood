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
        <link rel="stylesheet" href="resources/assets/css/green.css">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/owl.carousel.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/owl.transitions.css">
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/animate.min.css">

        <!-- Demo Purpose Only. Should be removed in production -->
        <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/assets/css/config.css">

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
	        <%@include file="sidebar.jsp" %>
	        <!-- /#sidebar-wrapper -->
	
	        <!-- Page Content -->
	        <div id="page-content-wrapper">
	            <div class="container-fluid">
					 <div class="row">
	    				<div class="col-md-12 alert-danger">
								<strong>${error}</strong>
	    				</div>
			         </div>

			    	<div class="row">
				    	<div class="col-md-4">
					      	<form id="addParticleboardForm" method="POST" enctype="multipart/form-data" class="form-horizontal" role="form"  
								      	action="${pageContext.request.contextPath}/admin/addParticleboard?${_csrf.parameterName}=${_csrf.token}">
								 <div class="row">
				    				<div class="col-md-12">
								         <div style="margin-bottom: 15px"  class="form-group">
						                   <label>Thickness<input id="thickness" type="text" class="form-control" name="thickness" value="15" ></label>
								         </div>
								         <div style="margin-bottom: 15px" class="form-group">
						                   <label>Length<input id="length" type="text" class="form-control" name="length" value="1250" ></label> 
								         </div>
								         <div style="margin-bottom: 15px" class="form-group">
						                   <label>Weight<input id="weight" type="text" class="form-control" name="weight" value="1250" ></label> 
								         </div>
								         <div style="margin-bottom: 15px" class="form-group">
						                   <label>Price<input id="price" type="text" class="form-control" name="price" value="0" ></label> 
								         </div>
								         <div style="margin-bottom: 15px" class="form-group">
											 <label>Color
								         	 <select class="form-control" id="fk_dirColor" name="fk_dirColor">
								         	 	<option value="-1"></option>
									         	 <c:forEach items="${dirColors}" var="dirColor">
									         	 	<option value="${dirColor.id}">${dirColor.name}</option>
									         	 </c:forEach>
								         	 </select>
								         	 </label>
								         </div>
								         <input type="hidden" name="fileName" value="" />
								         
								         <div style="margin-bottom: 15px" class="form-group">
								         	<p>Press here to upload pic: <input type="file" name="file"></p>
										 </div>
									</div>
								 </div>
								 <div class="row">
				    				<div class="col-md-12">
						         		<button type="submit" class="">Add</button>
				    				</div>
						         </div>
						         
						         <input type="hidden" name ="id_particleboard" id ="id_particleboard" value="-1"/>
					    	</form>
						</div>
						<div class="col-md-8">
							<div>Particleboard</div>
							<c:forEach items="${particleboards}" var="particleboard">
								<div class="row">
									<div class="col-md-7">
											<div><a href="#" onclick="editParticleboard(${particleboard.id}, 
																						${particleboard.thickness},
																						${particleboard.length},
																						${particleboard.weight},
																						${particleboard.price},
																						${particleboard.dirColor.id})">
													${particleboard.id}</a>    ${particleboard.thickness}x${particleboard.length}x${particleboard.weight}   ${particleboard.dirColor.name}  ${particleboard.price}
											</div>
									</div>
									<div class="col-md-2">
				         					<button type="button"  onclick="$('#id_particleboard').val(${particleboard.id}); $('#addParticleboardForm').submit();" >Update</button>
			         				</div>
									<div class="col-md-1">
										<button type="button"  onclick="if(confirm('Delete record?'))location.href='admin/delParticleboard?id=${particleboard.id}'">Delete</button>
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

	    function editParticleboard(id,thickness,length,weight,price, fk_dirColor) {
			$("#thickness").val(thickness);
			$("#length").val(length);
			$("#weight").val(weight);
			$("#price").val(price);
	    }
	    </script>

		<script type="text/javascript">

		</script>

	</body>
	
</html>