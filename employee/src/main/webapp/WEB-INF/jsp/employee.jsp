<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Home</title>
</head>
<body>
	<%
		String uname = (String) request.getAttribute("uname");
	%>
	<div style="margin-left: 90%">
		<form action="/">
			<input type="submit" value="Logout">
		</form>
	</div>
	<h1
		style="text-align: center; margin-top: 5%; color: green; font-weight: bold;">
		Hi
		<%=uname%>, Welcome to Employee Home
	</h1>
</body>
</html>