<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<table>
			<tr><td>Id</td><td>name</td><td>Creation_date</td></tr>
           	<c:forEach var="dirCustomer" items="${dirCustomers}">
           	<tr><td>${dirCustomer.id_dirCustomer}</td><td>${dirCustomer.name}</td><td>${dirCustomer.creation_date}</td></tr>
			</c:forEach>
		</table>
	</body>
</html>
