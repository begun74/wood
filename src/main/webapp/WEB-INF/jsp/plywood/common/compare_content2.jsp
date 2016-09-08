<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>





<div class="col-md-2">
	<table border="0">
		<tr><td width="170" height="170"></td></tr>	
		<tr><td align="center" style="padding: 15px;"><spring:message code="brand.name"/></td></tr>	
		<tr><td align="center" style="padding: 15px;"><spring:message code="thickness"/></td></tr>	
		<tr><td align="center" style="padding: 15px;"><spring:message code="length"/></td></tr>	
		<tr><td align="center" style="padding: 15px;"><spring:message code="weight"/></td></tr>	
		<tr><td align="center" style="padding: 15px;"><spring:message code="price"/></td></tr>	
	</table>
</div>

<div class="col-md-8">
<table border="1">

		<tr>
			<c:forEach var="i" begin="0" end="${fn:length(particleboards[0])-1}" >
					<td align="center"><img src="resources/pics/${particleboards[0][i]}.jpeg" width="170" height="170" onerror="this.onerror=null;this.src='resources/assets/images/products/nopicture.jpg';"/></td>
			</c:forEach>
		</tr>
		<c:forEach var="i" begin="1" end="${fn:length(particleboards)-1}" >
			<tr align="center">
					<c:forEach var="y" begin="0" end="${fn:length(particleboards[i])-1}" >
					  <td style="padding: 15px;">
					     ${particleboards[i][y]}
					  </td> 
					</c:forEach>
			</tr>
			<c:if test="${i == fn:length(particleboards)-1}">
				<tr>
					<c:forEach var="y" begin="0" end="${fn:length(particleboards[i])-1}" >
					  <td align="center" style="padding: 15px;" >
                          <div class="col-sm-12 controls">
                             <a href="del-from-compare?id=${particleboards[0][y]}" class="btn btn-success"> <spring:message code="delete"/></a>
                             <a href="add-product-to-customer-basket?id=${particleboards[0][y]}&action=compare" class="btn btn-success"> <spring:message code="buy"/></a>
                          </div>
					  </td> 
					</c:forEach>
				</tr>
			</c:if>
		</c:forEach>
</table>
</div>
