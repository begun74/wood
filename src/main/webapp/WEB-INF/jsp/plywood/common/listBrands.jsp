<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<c:forEach items="${brands}" var="brand" varStatus="vs" >
			<li><input  class="le-checkbox" type="checkbox"  name = 'brands' value='${brand.id}' /><label>${brand.name}</label></li>
		</c:forEach>
