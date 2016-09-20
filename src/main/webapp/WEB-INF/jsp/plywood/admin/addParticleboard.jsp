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
    
    <!--  My script -->
    <script src="${pageContext.request.contextPath}/resources/js/app.js"></script>
    
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
		            	<h2><span><spring:message code="admin.add.particleboard" /></span></h2>
		            	<a href="#help" class="help"></a>
		          	</div>
	<!-- Page Content -->
					 <div class="row">
	    					<div class="col-md-12 alert-danger">
								<strong>${error}</strong>
	    					</div>
	    					
				    		 <div class="box-content">
				    		 <div class="form-cols">
				    		 
				    		 <div class="col1">
						      	<form id="addParticleboardForm" method="POST" enctype="multipart/form-data" class="formBox" role="form"  
									      	action="${pageContext.request.contextPath}/admin/addParticleboard?${_csrf.parameterName}=${_csrf.token}">

					    					 <div class="clearfix">
										         <div class="lab">
								                    <label>ProductId</label>
										         </div>
										         <div class="con">
													<input id="productId" type="text" class="input" name="productId" placeholder="Product Id" maxlength = "45">										         
										         </div>
											 </div>
					    					 <div class="clearfix">
										         <div class="lab">
								                    <label>Thickness</label>
										         </div>
										         <div class="con">
													<input id="thickness" type="text" class="input" onblur="if(!isNumberValue(this.value)) this.value=15;" onkeypress="return isNumberKey(event)" name="thickness" value="15" >										         
										         </div>
											 </div>
											 <div class="clearfix">										     		
										         <div class="lab">
								                   <label>Length</label> 
										         </div>
										         <div class="con">
										         	<input id="length" type="text" class="input" onblur="if(!isNumberValue(this.value)) this.value=1250;" onkeypress="return isNumberKey(event)" name="length" value="1250" >
										         </div>
									         </div>
					    					 <div class="clearfix">
										         <div class="lab">
								                   <label>Weight</label> 
										         </div>
										         <div class="con">
										         	<input id="weight" type="text" class="input" onblur="if(!isNumberValue(this.value)) this.value=1250;" onkeypress="return isNumberKey(event)" name="weight" value="1250" >
										         </div>
										     </div>
										     <div class="clearfix">
										         <div class="lab">
								                   <label>Price</label> 
										         </div>
										         <div class="con">
													<input id="price" type="text" class="input" onblur="if(!isNumberValue(this.value)) this.value=0;" onkeypress="return isNumberKeyDouble(event)" name="price" value="0" >										         
										         </div>
										      </div>
									         <div class="clearfix">
									         		<div class="lab">
												 		<label>Colors</label>
												 	</div>
												 	<div class="con">
											         	 <select class="select" id="fk_dirColor" name="fk_dirColor">
											         	 	<option value="-1"></option>
												         	 <c:forEach items="${dirColors}" var="dirColor">
												         	 	<option value="${dirColor.id}">${dirColor.name}</option>
												         	 </c:forEach>
											         	 </select>
											         </div>
									         </div>

									         <div class="clearfix">
											 	<div class="lab">
												 <label>Brands</label>
												</div>
											 	<div class="con">
									         	 <select class="select" id="fk_dirBrand" name="fk_dirBrand">
									         	 	<option value="-1"></option>
										         	 <c:forEach items="${dirBrands}" var="dirBrand">
										         	 	<option value="${dirBrand.id}">${dirBrand.name}</option>
										         	 </c:forEach>
									         	 </select>
									         	 </div>
									         </div>
									         
									         <div class="clearfix">
									         	<div class="lab">
									         		<spring:message code="sanded" />
									         	</div>
										         <div class="con">
										         	 <input type="checkbox" class="checkbox" id="sanded" name="sanded"/>
										         </div>
									         </div>
	
									         <input type="hidden" name="fileName" value="" />
									         
									         <div style="margin-bottom: 15px" class="form-group">
									         	<p>Photo: <input type="file" name="file"></p>
											 </div>
					    			<div class="col-md-12">
							         		<input type="submit" class="" value="<spring:message code="add"/>"/>
					    			</div>
							         
							         <input type="hidden" name ="id_particleboard" id ="id_particleboard" value="-1"/>
							         
						    	</form>
							</div>
							
							<div class="col2">
								<div><h3 align="center"><span><spring:message code="particleboard"/></span></h3></div>
								<br/>
								<div class="clearfix">
								<form name="mAdmin" method="POST" action="${pageContext.request.contextPath}/admin/generateFile?${_csrf.parameterName}=${_csrf.token}">
										<div align="center" style="overflow-y:scroll; overflow-x: none; height:400px; width:100%;">
										<table class="tab tab-drag">
											<tr  class="top nodrop nodrag">
												<th class="dragHandle">&nbsp;</th>
												<th class="checkbox"><input type="checkbox" name="" value="" class="check-all" /></th>
												<th><spring:message code="amount"/></th>
												<th>ProductID</th>
												<th><spring:message code="size"/></th>
												<th><spring:message code="color"/></th>
												<th><spring:message code="price"/></th>
												<th class="action"><spring:message code="action"/></th>
											</tr>
											<c:forEach items="${particleboards}" var="particleboard" varStatus="vs">
												<tr>		
													<td class="dragHandle">&nbsp;</td>
													<td class="checkbox"><input type="checkbox" name='chbxParts[${vs.index}]' value="${particleboard.id}" /><//td>
													<td>												
								         				<input type="text" class="input" name='amountParts[${vs.index}]' id="amountParts_${vs.index}" onblur="if(!isNumberValue(this.value)) this.value=1;" onkeypress="return isNumberKey(event)" maxlength="4" value="1" style="width:25px"/>
								         			</td>
								         			<td  style="cursor:pointer;" onclick="editParticleboard('${particleboard.id}', '${particleboard.productId}',
																										'${particleboard.thickness}',
																										'${particleboard.length}',
																										'${particleboard.weight}',
																										'${particleboard.price}',
																										'${particleboard.sanded}',
																										'${particleboard.dirColor.id}',
																										'${particleboard.dirBrand.id}');">${particleboard.productId}
													</td>
													<td style="padding: 5px;">${particleboard.thickness}x${particleboard.length}x${particleboard.weight}</td>
													<td> ${particleboard.dirColor.name}</td>
													<td>${particleboard.price}</td>
													
							         				<td>
							         					<a href="javascript:editPart(${particleboard.id});" class="ico ico-edit" onclick=""></a>
							         					<a href="javascript:delPart(${particleboard.id});" class="ico ico-delete" onclick=""></a>
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
							
							</div><!-- form-cols -->
						</div> <!-- row -->
						
						
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
	    function editParticleboard(id, productId, thickness, length, weight, price, sanded, fk_dirColor, fk_dirBrand) 
	    {
	    	$("#productId").val(productId);
			$("#thickness").val(thickness);
			$("#length").val(length);
			$("#weight").val(weight);
			$("#price").val(price);
			
			if(sanded == 'true')
				$("#sanded").attr('checked', true);
			else
				$("#sanded").removeAttr('checked');
			
			fk_dirColor.length >0?$("#fk_dirColor").val(fk_dirColor):$("#fk_dirColor").val('-1');
			fk_dirBrand.length >0?$("#fk_dirBrand").val(fk_dirBrand):$("#fk_dirBrand").val('-1');
	    }
	    
		function editPart(id)
		{
			$('#id_particleboard').val(id); $('#addParticleboardForm').submit();
		}

		function delPart(id)
		{
			if(confirm('Delete record?'))location.href='admin/delParticleboard?id='+id;
		}

	 </script>

  <!-- /#main --> 
</body>

</html>