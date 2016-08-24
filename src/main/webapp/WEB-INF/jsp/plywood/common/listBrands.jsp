<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

		<c:forEach items="${brands}" var="brand" varStatus="vs" >
			<li><input  class="le-checkbox" type="checkbox"  name = 'chbrand${brand.id}' value='1' /><label>${brand.name}</label></li>

		</c:forEach>
