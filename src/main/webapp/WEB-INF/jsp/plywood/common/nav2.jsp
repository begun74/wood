<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="">

	<ul class="inline">
		<li class="breadcrumb-item"> 
                   <ol  class="breadcrumb">
                   		<li class="breadcrumb-item">
                            <a href="index"><spring:message code="nav.menu.home"/></a>
                        </li> 

                        <li class="breadcrumb-item active">
                            <a><c:if test="${empty mIndex.partType.messageSource}">${mIndex.partType.name}</c:if><c:if test="${not empty mIndex.partType.messageSource}"><spring:message code="${mIndex.partType.messageSource}" /></c:if></a>
                        </li> 
                   </ol>
        </li> 
	</ul>

</div>