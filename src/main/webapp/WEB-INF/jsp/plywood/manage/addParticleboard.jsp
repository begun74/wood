<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <!-- Bootstrap Core CSS -->
        <link rel="stylesheet" href="resources/assets/css/bootstrap.min.css">

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
    	<div class="row">
    	
    	</div>
    	<div class="container">
    		<div class="row">
		    	<div class="col-md-12"></div>
    		</div>
    		
	    	<div class="row">
		    	<div class="col-md-4">
			      	<form:form id="addParticleboardForm" class="form-horizontal" role="form"  action="${pageContext.request.contextPath}/manage/addParticleboard" method="post">
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
					         	 <c:forEach items="${dirColors}" var="dirColor">
					         	 	<option value="${dirColor.id_dirColor}">${dirColor.name}</option>
					         	 </c:forEach>
				         	 </select>
				         	 </label>
				         </div>
				         <button type="submit" class="">Add</button>
			    	</form:form>
				</div>
				<div class="col-md-8">
					<div>Particleboard</div>
					<c:forEach items="${particleboards}" var="particleboard">
						<div>${particleboard.id}    ${particleboard.thickness}x${particleboard.length}x${particleboard.weight}   ${particleboard.dirColor.name}  ${particleboard.price}</div>
					</c:forEach>
				</div>
			</div>
			
		</div>		
	</body>
	
	
</html>