<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>


<table class="tab tab-drag">
			<tr align="center">
				<th style="padding: 15px;">Id</th>
				<th style="padding: 15px;">Brand name</th>
				<th style="padding: 15px;">thickness</th>
				<th style="padding: 15px;">length</th>
				<th style="padding: 15px;">weight</th>
				<th style="padding: 15px;">price</th>
			</tr>
			<c:forEach items="${particleboards}" var="particleboard" varStatus="vs">
				<tr align="center">
					<td>${particleboard.id}</td>
					<td>${particleboard.dirBrand.name}</td>
					<td>${particleboard.thickness}</td>
					<td>${particleboard.length}</td>
					<td>${particleboard.weight}</td>
					<td>${particleboard.price}</td>
					<td><div class="col col-md-12 buybtns"><a href="del-from-compare?id=${particleboard.id}">Delete from compare</a></div></td>
				</tr>

			</c:forEach>
</table>