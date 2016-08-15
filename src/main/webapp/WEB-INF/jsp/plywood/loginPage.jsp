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
        

	    <title>Login</title>
    </head>
    
    
    <body>
    	<%@include file="common/nav.jsp" %>      
		<div class="container">
			<div id="loginbox" style="margin-top:50px;" class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">                    
            	<div class="panel panel-info" >
            		<div class="panel-heading">
                        <div class="panel-title">Sign In</div>
                        
                        <div style="padding-top:30px" class="panel-body" >
                        	<div id="login-alert" class="col-sm-12">${error}</div>

						<form id="loginform" class="form-horizontal" role="form"  method="post">
                                    
                            <div style="margin-bottom: 25px" class="input-group">
                                        <input id="login-username" type="text" class="form-control" name="username" value="" placeholder="username or email">                                        
                            </div>
                                
                            <div style="margin-bottom: 25px" class="input-group">
                                        <input id="login-password" type="password" class="form-control" name="password" placeholder="password">
                            </div>
                                    

                                
                            <div class="input-group">
                                      <div class="checkbox">
                                        <label>
                                          <input id="login-remember" type="checkbox" name="remember" value="1"> Remember me
                                        </label>
                                      </div>
                                    </div>


                                <div style="margin-top:10px" class="form-group">
                                    <!-- Button -->
                                    <div class="col-sm-12 controls">
                                      <a id="btn-login" href="#" onClick="document.forms['loginform'].submit(); return false;" class="btn btn-success">Login  </a>
                                    </div>
                                </div>


                                <div class="form-group">
                                </div>    
                                
                                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        </form>                        	
                        </div>
                        
                    </div>     
            	</div>
            </div>
		</div>    	
    </body>
</html>