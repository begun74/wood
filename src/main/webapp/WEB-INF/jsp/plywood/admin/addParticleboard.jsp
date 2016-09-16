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
	    				<div class="col-md-12 alert-danger">
								<strong>${error}</strong>
	    				</div>
			         </div>

			    	<div class="row">
				    	<div class="col-md-3">
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
											 <label>Colors
								         	 <select class="form-control" id="fk_dirColor" name="fk_dirColor">
								         	 	<option value="-1"></option>
									         	 <c:forEach items="${dirColors}" var="dirColor">
									         	 	<option value="${dirColor.id}">${dirColor.name}</option>
									         	 </c:forEach>
								         	 </select>
								         	 </label>
								         </div>
								         <div style="margin-bottom: 15px" class="form-group">
											 <label>Brands
								         	 <select class="form-control" id="fk_dirBrand" name="fk_dirBrand">
								         	 	<option value="-1"></option>
									         	 <c:forEach items="${dirBrands}" var="dirBrand">
									         	 	<option value="${dirBrand.id}">${dirBrand.name}</option>
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
						         		<button type="submit" class="" value="<spring:message code="add"/>"/>
				    				</div>
						         </div>
						         
						         <input type="hidden" name ="id_particleboard" id ="id_particleboard" value="-1"/>
						         
					    	</form>
						</div>
						<div class="col-md-4">
							<div>Particleboard</div>
							<br/>
							<form name="mAdmin" method="POST" action="${pageContext.request.contextPath}/admin/generateFile?${_csrf.parameterName}=${_csrf.token}">
								
									<div align="center" style="overflow-y:scroll; overflow-x: none; height:400px; width:100%;">
									<table>
										<c:forEach items="${particleboards}" var="particleboard" varStatus="vs">
											<tr>														
												<td style="padding: 5px;"><input type="checkbox" name='chbxParts[${vs.index}]' value="${particleboard.id}" /><a href="#" onclick="editParticleboard('${particleboard.id}', 
																									'${particleboard.thickness}',
																									'${particleboard.length}',
																									'${particleboard.weight}',
																									'${particleboard.price}',
																									'${particleboard.dirColor.id}',
																									'${particleboard.dirBrand.id}');">
																		 ${particleboard.thickness}x${particleboard.length}x${particleboard.weight}   ${particleboard.dirColor.name}  ${particleboard.price}</a>
												</td>
												<td style="padding: 5px;">
							         					<select name="amountParts[${vs.index}]">
							         						<option value="1">1</option>
							         						<option value="2">2</option>
							         						<option value="3">3</option>
							         						<option value="4">4</option>
							         						<option value="5">5</option>
							         					</select>
							         			</td>
												<td style="padding: 5px;">
							         					<button type="button"  onclick="$('#id_particleboard').val(${particleboard.id}); $('#addParticleboardForm').submit();" >Update</button>
						         				</td>
												<td style="padding: 5px;">
													<button type="button"  onclick="if(confirm('Delete record?'))location.href='admin/delParticleboard?id=${particleboard.id}'">Delete</button>
												</td>
											</tr>
										</c:forEach>
									</table>
									</div>
									
								
								<p/>
							<div>
								<input type="submit" name="butPrint" value="<spring:message code="print"/> <spring:message code="commercial.offer"/>" />
							</div>
							</form>
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