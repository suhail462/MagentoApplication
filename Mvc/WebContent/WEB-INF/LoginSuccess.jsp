<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.mvc.LoginBean" %>
<h1>login successfully </h1>
LoginBean b=(LoginBean)request.getAttribute("bean");
out.println(""Welcome" +b.getName());
</body>
</html>