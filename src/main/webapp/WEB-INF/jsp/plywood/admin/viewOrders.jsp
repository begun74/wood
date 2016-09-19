<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html>
<html>

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
        
        <form name="mAdmin" method="POST" action="${pageContext.request.contextPath}/admin/generateFile?${_csrf.parameterName}=${_csrf.token}">
        <!-- box -->
        <div class="box">
			<div align="center" style="overflow-y:scroll; overflow-x: none; height:400px; width:100%;">
        
	        		<table  class="tab tab-drag" border="0">
								<tr  class="top nodrop nodrag">
										<th class="dragHandle" >&nbsp;</div></th>
										<!-- th class="checkbox"><input type="checkbox" name="" value="" class="check-all" /></th -->
										<th><spring:message code="id"/></th>
										<th>Id</th>
										<th><spring:message code="date"/></th>
										<th><spring:message code="name"/></th>
										<th><spring:message code="phone"/></th>
										<th><spring:message code="email"/></th>
										<th><spring:message code="photo"/></th>
										<th><spring:message code="ready"/></th>
										<th width="30%"><div style="overflow: hidden; width: 30%;"><spring:message code="description"/></div></th>
										<th>&#160;</th>
										<th><spring:message code="amount"/></th>
								</tr>
							<c:forEach items="${orders}" var="order" varStatus="vs">
								<tr align="center" style="cursor:pointer">
									<td class="dragHandle">&nbsp;</td>
									<td>${vs.count}</td>
									<td>${order.id}</td>
									<td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${order.creation_date}" /></td>
									<td>${order.name}</td>
									<td>${order.phone}</td>
									<td>${order.email}</td>
									<td><img src="resources/pics/${order.fk_particleboard}.jpeg" width="73" height="73"  onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';" /> ${order.fk_particleboard}</td>
									<td <c:if test="${order.status == 1}">bgcolor="green"</c:if>>
													<input type="checkbox" id="order_${order.id}" value="${order.id}" <c:if test="${order.status == 1}">checked="checked"</c:if> onclick="statusOrders(this,'chbxParts_${vs.index}','amountParts_${vs.index}')"/>
									</td>
									<td>${order.description}</td>
									<td>
											<input type="checkbox" name='chbxParts[${vs.index}]' id="chbxParts_${vs.index}" value="${order.fk_particleboard}" <c:if test="${order.status == 1}">disabled="disabled"</c:if> />
									</td>
									<td>
										<input type="text" name='amountParts[${vs.index}]' id="amountParts_${vs.index}" onblur="if(!isNumberValue(this.value)) this.value=1;" onkeypress="return isNumberKey(event)" maxlength="4" value="1" style="width:25px" <c:if test="${order.status == 1}">disabled="disabled"</c:if> />
									</td>
								</tr>
							</c:forEach>
					</table>
			</div>												
    	</div>
        <!-- /box -->
        
		<div>
					<input type="submit" name="butPrint" value="<spring:message code="print"/> <spring:message code="commercial.offer"/>" />
		</div>
        
    	</form>
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