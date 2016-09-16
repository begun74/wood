<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8" />
    <meta name='robots' content='all, follow' />
    <meta name="description" content="" />
    <meta name="keywords" content="" />
    
	    <link href="${pageContext.request.contextPath}/resources/public/css/login.css" rel="stylesheet" type="text/css" />
	    <link href="${pageContext.request.contextPath}/resources/public/css/login-blue.css" rel="stylesheet" type="text/css" />  <!-- color skin: blue / red / green / dark -->
	    
    
    	<!-- Check if you're referencing jquery.js BEFORE bootstrap.js and bootstrap.js is loaded only once -->
	    <!-- jQuery -->
	    <script src="resources/js/jquery.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="resources/js/bootstrap.min.js"></script>

    <title>Great admin</title>   
    
  </head>
  <body>
  <%@include file="common/nav.jsp" %>  
  <div id="main">
    <div id="content">
      <div id="login">
        
        <div id="logo"><span>Great Admin</span></div>
        <form id="loginform" role="form"  method="post"  class="formBox">
          <fieldset>
            <div class="form-col">
                <label for="username" class="lab">Username <span class="warning"></span></label>
                <input type="text" name="username" class="input" id="username" onfocus="$('#login-alert').text('');"/>
            </div>
            <div class="form-col form-col-right">
                <label for="password" class="lab">Password <span class="warning"></span></label>
                <input type="password" name="password" class="input" id="password"  onfocus="$('#login-alert').text('');"/>
            </div>
            <div class="form-col form-col-check">
              <label><input type="checkbox" name="remeber_me" class="checkbox" />Remember me on this computer</label> 
            </div>
            <div class="form-col form-col-right"> 
              <input type="submit" name="" value="Login" class="submit" />
            </div>                 
          </fieldset>
          
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
        </form>
        <div id="login-alert" class="col-sm-12 alert alert-danger" role="alert"><h2>${error}</h2></div>
        
      </div>
    </div><!-- /content -->    
  </div><!-- /main -->
  </body>
</html>