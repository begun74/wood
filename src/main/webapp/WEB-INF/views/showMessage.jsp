<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<html>
	<head>
		<meta charset="utf-8">
		<title>Welcome</title>
	</head> 
	<body>
		<h2>${message}</h2>
		<h2>${count}</h2>
		<table>
			<tr><td>Id</td><td>name</td></tr>
           	<c:forEach var="dirCustomer" items="${dCs}">
           	<tr><td>${dirCustomer.id_dirCustomer}</td><td>${dirCustomer.name}</td></tr>
			</c:forEach>
		</table>
	</body>
</html>
