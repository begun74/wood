<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<nav class="top-bar animate-dropdown">
	<div class="container">
		<div class="col-xs-12 col-sm-6 no-margin">
			<ul>
				<!--<li>${nombersofenters}</li>-->

				<c:if test="${nombersofquerys>0}">
					<li>${nombersofquerys}</li>
				</c:if>

				<li><a href="index">Home</a></li>
				<!-- li><a href="video">Video</a></li -->
				<li><a href="contact">Contact</a></li>
			</ul>
		</div>

		<div class="col-xs-12 col-sm-6 no-margin">
			<ul class="right">
				<li><a href="loginPage">Login</a></li>
				<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="index.htm">EN</a>
					<ul class="dropdown-menu" role="menu">
						<li role="presentation"><a role="menuitem" tabindex="-1"
							href="#">RU</a></li>
						<!--                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Tamil</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">French</a></li>
                        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Russian</a></li>-->
					</ul></li>
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