<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

						<table border="0" class="tab tab-drag">
							<c:forEach items="${particleboards}" var="particleboard" varStatus="vs" >
								<c:if test="${vs.count % 2 == 1}" >
									<tr class="top nodrop nodrag">
							    </c:if>							
										<td padding="10px">${vs.count}  ${particleboard.thickness}x${particleboard.length}x${particleboard.weight}</td>
										<td>${particleboard.dirColor.name}</td>
										<td>${particleboard.price}</td>
										<td><img src="resources/pics/${particleboard.id}.jpeg" width="190" height="190"/></td>
								<c:if test="${rowCounter.count % 2 == 1}" >
							      </tr>
							    </c:if>
							</c:forEach>
						</table>
