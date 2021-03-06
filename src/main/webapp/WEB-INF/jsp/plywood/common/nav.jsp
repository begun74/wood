<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<nav class="top-bar animate-dropdown">
	<div class="container">
		<div class="col-xs-12 col-sm-6 no-margin">
			<ul>
				<li><a href="index"><spring:message code="nav.menu.home"/></a></li>
				<!-- li class="dropdown">
                    <a class="dropdown-toggle"  data-toggle="dropdown" href="#change-colors">Change Colors</a>

                    <ul class="dropdown-menu" role="menu" >
                        <li role="presentation"><a role="menuitem" class="changecolor green-text" tabindex="-1" href="#" title="Green color">Green</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor blue-text" tabindex="-1" href="#" title="Blue color">Blue</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor red-text" tabindex="-1" href="#" title="Red color">Red</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor orange-text" tabindex="-1" href="#" title="Orange color">Orange</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor navy-text" tabindex="-1" href="#" title="Navy color">Navy</a></li>
                        <li role="presentation"><a role="menuitem" class="changecolor dark-green-text" tabindex="-1" href="#" title="Darkgreen color">Dark Green</a></li>
                    </ul>
                </li -->
				<!-- li><a href="video">Video</a></li -->
				<li><a href="contact"><spring:message code="nav.menu.contact"/></a></li>
			</ul>
		</div>

		<div class="col-xs-12 col-sm-6 no-margin">
			<ul class="right">
				<li>
					<c:choose>
						<c:when test="${sessionBean.time >0}">
							 <a href="admin"><spring:message code="nav.menu.admin"/></a>
							 <a href="loginPage?logout"><spring:message code="nav.menu.logout"/></a>
						</c:when>
						<c:otherwise>
							 <a href="loginPage"><spring:message code="nav.menu.login"/></a>
						</c:otherwise>
					</c:choose>
				</li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="">Язык|Lang</a>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation"><a role="menuitem" tabindex="1"
							href="index?locale=ru">RU</a></li>
						<li role="presentation"><a role="menuitem" tabindex="0"
							href="index?locale=en">EN</a></li>
					</ul>
				</li>
			</ul>
		</div>
	</div>


	<!-- <script>
  (function(i,s,o,g,r,a,m){i['GoogleAnalyticsObject']=r;i[r]=i[r]||function(){
  (i[r].q=i[r].q||[]).push(arguments)},i[r].l=1*new Date();a=s.createElement(o),
  m=s.getElementsByTagName(o)[0];a.async=1;a.src=g;m.parentNode.insertBefore(a,m)
  })(window,document,'script','//www.google-analytics.com/analytics.js','ga');

  ga('create', 'UA-75911811-1', 'auto');
  ga('send', 'pageview');

</script>-->


</nav>
<!-- /.top-bar -->