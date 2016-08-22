<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

						<table border="1" class="tab tab-drag">
								<tr class="top nodrop nodrag">
									<td>Size</td>
									<td>Color</td>
									<td>Price</td>
									<td>Photo</td>
								</tr>
								
							<c:forEach items="${particleboards}" var="particleboard">
								<tr class="top nodrop nodrag">
									<td padding="10px">${particleboard.thickness}x${particleboard.length}x${particleboard.weight}</td>
									<td>${particleboard.dirColor.name}</td>
									<td>${particleboard.price}</td>
									<td><img src="resources/pics/${particleboard.id}.jpeg" width="190" height="190"/></td>
								</tr>		
							</c:forEach>
							</table>
