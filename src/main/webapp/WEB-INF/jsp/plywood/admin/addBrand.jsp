<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name='robots' content='all, follow' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    <title>Great admin</title>   
    <link href="${pageContext.request.contextPath}/resources/public/css/default.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="${pageContext.request.contextPath}/resources/public/css/blue.css" rel="stylesheet" type="text/css" media="screen" /> <!-- color skin: blue / red / green / dark -->
    <link href="${pageContext.request.contextPath}/resources/public/css/datePicker.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="${pageContext.request.contextPath}/resources/public/css/wysiwyg.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="${pageContext.request.contextPath}/resources/public/css/fancybox-1.3.1.css" rel="stylesheet" type="text/css" media="screen" />
    <link href="${pageContext.request.contextPath}/resources/public/css/visualize.css" rel="stylesheet" type="text/css" media="screen" />

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
    
    <title><spring:message code="admin.title"/></title>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>
<div id="main">
    <!-- #header -->
    <div id="header"> 
      <!-- #logo --> 
      <div id="logo">
        <a href="index.html" title="Go to Homepage"><span>Great Admin</span></a>
      </div>
      <!-- /#logo -->
      <!-- #user -->                        
      <div id="user">
        <h2>Forest Gump <span>(admin)</span></h2>
        <a href="">7 messages</a> - <a href="">settings</a> - <a href="index.html">logout</a>
      </div>
      <!-- /#user -->  
    </div>
    <!-- /header -->
    <!-- #content -->
    <div id="content">

      	<!-- box>
       	<div id="tabs-statistic" class="box">
       	</div>
       	<!-- /box -->

        <!-- box>
        <div id="tabs" class="box">
        </div>
        <!-- /box -->
        
        <!-- /box -->
        <div class="box">
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
        <!-- /box -->
    

    </div>
    <!-- /#content -->
	<!-- Sidebar -->
	        <%@include file="sidebar.jsp" %>
	<!-- /#sidebar-wrapper -->    
	        
	<!-- #footer -->
    <div id="footer">
      <p>© 2010 Great Admin | <a href="#main">Top</a></p>
    </div>
    <!-- /#footer -->
	

  <!-- /#main --> 
</body>

</html>