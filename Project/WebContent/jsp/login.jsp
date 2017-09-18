<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<div align="center">
		<h1>Hello unknown user!</h1>
		<jsp:useBean id="user" class="by.htp.project.entity.SimpleBean"></jsp:useBean>
		<jsp:getProperty property="surname" name="user" />
		<jsp:setProperty property="name" name="user" value="Roma" />
		<jsp:getProperty property="name" name="user" />
		<jsp:getProperty property="date" name="user" />

		<form action="MainServlet" method="get">
			<input type="hidden" name="action" value="login" /> <input
				type="text" name="login" placeholder="Login" /></br> <input
				type="password" name="pass" placeholder="Password" /></br> <input
				type="submit" value="login" />
		</form>
	</div>
</body>
</html>