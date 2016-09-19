<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, shrink-to-fit=no, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<meta name="_csrf" content="${_csrf.token}"/>
	<meta name="_csrf_header" content="${_csrf.headerName}"/>

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

	<!--  My script -->
    <script src="${pageContext.request.contextPath}/resources/js/app.js"></script>

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
        
        <!-- box -->
        <div class="box">
        			<div>
        				<table border="0" width="100%"  class="tab-drag">
        					<tr align="center">
        						<th width="1px"><div style="width: 1px;" >&nbsp;</div></th>
        						<th width="15px"><div style="width: 15px;">ID</div></th>
        						<th width="50%"><div style="overflow: hidden; width: 50%;">Model</div></th>
        						<th width="50px"><div style="overflow: hidden; width: 50px;">thickness</div></th>
        						<th width="50px"><div style="overflow: hidden; width: 50px;">length</div></th>
        						<th width="50px"><div style="overflow: hidden; width: 50px;">weight</div></th>
        						<th width="50px"><div style="overflow: hidden; width: 50px;">price</div></th>
        						<th width="8px"><div style="overflow: hidden; width: 8px;">&#160;</div></th>
        					</tr>
        				</table>
					</div>
					<div align="center" style="overflow-y:scroll; overflow-x: none; height:200px; width="98%"">
						<table border="0" width="100%"  class="tab tab-drag">
							<c:forEach items="${particleboards}" var="particleboard">
								<tr align="center">
									<td class="dragHandle" >&nbsp;</div></td>
									<td width="15px"><div style="width: 15px;">${particleboard.id}</div></td>
									<td width="50%"><div style="overflow: hidden; width: 50%;">Model</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">${particleboard.thickness}</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">${particleboard.length}</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">${particleboard.weight}</div></td>
									<td width="50px"><div style="overflow: hidden; width: 50px;">${particleboard.price}</div></td>
								</tr>
							</c:forEach>
						</table>
					</div>	

    	</div>
        <!-- /box -->
        
		<div>
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
		</div>
        
    </div>
    
    </div>
    
       

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