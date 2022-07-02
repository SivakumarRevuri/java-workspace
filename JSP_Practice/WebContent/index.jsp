<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Title goes here </title>
</head>
<body>
	<h1>Hello World!!!</h1>
	<% int i = 10; %>
	<% out.println(java.util.Calendar.getInstance().getTime()); %>
	<!-- this also do the same  using expression tag-->
	<br>
	<hr>
	Current time: <%= java.util.Calendar.getInstance().getTime() %>
</body>
</html>