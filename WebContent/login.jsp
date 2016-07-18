<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="bootstrap/bootstrap.min.css">
  	<script src="bootstrap/bootstrap.min.js"></script>
  	<script src="bootstrap/bootstrap.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<jsp:include page="main_header.jsp"></jsp:include>
<jsp:include page="action_header.jsp"></jsp:include>

<div align="center">
<h1>LOGIN</h1>
<form action="login.san" method="post">
Username:
<input type = "text" name = "Username" required><br>
Password:
<input type = "password" name = "Password" required><br>
<input type="submit" class="btn btn-primary" value="login">
</form>
</div>
</body>
</html>