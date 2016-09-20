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
				<!-- breadcrumbs -->
		        <div class="breadcrumbs">
		          <ul>
		            <li class="home"><a href="index">Homepage</a></li>
		          </ul>
		        </div>
		        <!-- /breadcrumbs -->
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
       				<div class="headlines">
		            	<h2><span><spring:message code="admin.add.brand" /></span></h2>
		            	<a href="#help" class="help"></a>
		          	</div>
        <!-- Page Content -->
	        <div id="page-content-wrapper">
					<div class="row">
	    				<div class="col-md-8 alert-danger">
								<strong>${error}</strong>
	    				</div>
					</div>
					<div class="box-content">
					    <div class="form-cols">
				    		<div class="col1">
							  	<form:form id="addBrandForm" class="formBox" role="form"
							  			commandName="addBrandForm"
							  			enctype="multipart/form-data" 
							  			action="${pageContext.request.contextPath}/admin/addBrand?${_csrf.parameterName}=${_csrf.token}" 
							  			method="POST"
							  			modelAttribute="dirBrand">
							  			
							  			<div class="clearfix">
										         <div class="lab">
								                    <label><spring:message code="name2"/></label> 
										         </div>
										         <div class="con">
													<input name="name" id="name" type="text" class="input" value="" >										         
										         </div>
										 </div>
							  			<div class="clearfix">
										         <div class="lab">
						                   			<label><spring:message code="description" /> </label>
										         </div>
										         <div class="con">
						                   			<textarea name="description" id="description" cols="" rows="" class="textarea" maxlength = "45" ></textarea> 
										         </div>
										 </div>
								         
						         <button type="submit" class=""><spring:message code="label.button.add"/></button>
						         <input type="hidden" name ="id_dirBrand" id ="id_dirBrand" value="-1"/>
						    	</form:form>
							</div>					    
				    		<div class="col2">
 				    			<table class="tab" border="0">
				    				<tr align="center">
					    				<th width="70%"><spring:message code="name2"/></th>
					    				<th width="30%">Action</th>
				    				</tr>
				    			</table>

									<div align="center" style="overflow-y:scroll; overflow-x: none; height:400px; width:100%;">
										<table class="tab tab-drag">
											<c:forEach items="${dirBrands}" var="dirBrand">
												<tr>
													<td class="dragHandle">&nbsp;</td>
													<td><a href="#" onclick="$('#name').val('${dirBrand.name}'); $('#description').val('${dirBrand.description}');">(${dirBrand.id}) ${dirBrand.name}</a></td>
							         				<!-- td><button type="button"  onclick="$('#id_dirBrand').val(${dirBrand.id}); $('#addBrandForm').submit();" ><spring:message code="label.button.update"/></button></td>
													<td><button type="button"  onclick="if(confirm('Delete record?'))location.href='admin/delBrand?id=${dirBrand.id}'"><spring:message code="label.button.delete"/></button></td -->
							         				<td>
							         					<a href="javascript:editBrand(${dirBrand.id});" class="ico ico-edit" onclick=""></a>
							         					<a href="javascript:delBrand(${dirBrand.id});" class="ico ico-delete" onclick=""></a>
							         				</td>
												</tr>
											</c:forEach>
										</table>
									</div>
							</div>
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
	
	<script>
	
	function editBrand(id)
	{
		$('#id_dirBrand').val(id); $('#addBrandForm').submit();
	}

	function delBrand(id)
	{
		if(confirm('Delete record?'))location.href='admin/delBrand?id='+id;
	}

	</script>

  <!-- /#main --> 
</body>

</html>