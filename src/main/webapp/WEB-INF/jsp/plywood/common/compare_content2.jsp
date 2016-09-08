<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>




<table>
<c:forEach var="i" begin="0" end="${fn:length(particleboards)}" >
	<tr>
			<c:forEach var="y" begin="0" end="${fn:length(particleboards[i])}" >
			  <td>
			     <c:out value="${particleboards[i][y]}"/>
			  </td> 
			</c:forEach>
	</tr>
</c:forEach>
</table>
