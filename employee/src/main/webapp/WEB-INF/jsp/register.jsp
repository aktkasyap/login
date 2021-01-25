<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
</head>
<body>
	<div style="margin-top: 5%; margin-right: 30%; width: 30%">
		<form action="/register" method="post">
			<input type="text" name="uname" placeholder="Enter user name"
				required="required" autofocus="autofocus"> <input
				type="password" name="password" placeholder="Enter password"
				required="required"> <input type="submit" value="Signup">
		</form>
	</div>
</body>
</html>