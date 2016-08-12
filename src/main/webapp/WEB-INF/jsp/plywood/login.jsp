<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
	    <link href="${pageContext.request.contextPath}/resources/public/css/login.css" rel="stylesheet" type="text/css" />
	    <link href="${pageContext.request.contextPath}/resources/public/css/login-blue.css" rel="stylesheet" type="text/css" />  <!-- color skin: blue / red / green / dark -->
	    
	    <title>Login</title>
    </head>
    
    
    <body>
    	<%@include file="common/nav.jsp" %>      
    	
		  <div id="main">
		    <div id="content">
		      <div id="login">
		        
		        <div id="logo"><span>Login</span></div>
		                
		        <form method="post" action="${pageContext.request.contextPath}/j_spring_security_check" id="form-login" class="formBox">
		          <fieldset>
		            <div class="form-col">
		                <label for="username" class="lab">Username <span class="warning"></span></label>
		                <input type="text" name="j_username" class="input" id="username" />
		            </div>
		            <div class="form-col form-col-right">
		                <label for="password" class="lab">Password <span class="warning"></span></label>
		                <input type="password" name="j_password" class="input" id="password" />
		            </div>
		            <div class="form-col form-col-check">
		              <label><input type="checkbox" name="_spring_security_remember_me" class="checkbox" />Remember me on this computer</label> 
		            </div>
		            <div class="form-col form-col-right"> 
		              <input type="submit" name="" value="Login" class="submit" />
		            </div>                 
		          </fieldset>
		        </form>
		        
		      </div>
		    </div><!-- /content -->    
		  </div><!-- /main -->    	
    	
    </body>
</html>