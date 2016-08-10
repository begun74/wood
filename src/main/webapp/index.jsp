<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Index</title>
	</head> 
	<body>
		<c:url value="hello" var="message" />
		<a href="${message}">To hello</a>
		<c:url value="hello2" var="message2" />
		<a href="${message2}">To Hello2</a>
	</body>
</html>
