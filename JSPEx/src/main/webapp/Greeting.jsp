<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Greeting</title>
</head>
<body>
<%
	String username,password,role;
	username= request.getParameter("username");
	role= request.getParameter("role");
	password= request.getParameter("password");
	if(password.equals("admin"))
    	out.println("Hello "+username+"\nYou are "+role);
	else
    	out.println("Wrong credentials entered");
%>

</body>
</html>