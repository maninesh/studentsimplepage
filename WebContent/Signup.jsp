<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="main_header.jsp"></jsp:include>
<jsp:include page="action_header.jsp"></jsp:include>

<h1>Sign UP</h1>
<form action="Signup.san" method="post">
Name:
<input type="text" name="name"><br>
Password:
<input type="password" name="password"><br>
Address:
<input type="text" name="address"><br>
Gender:
<input type="radio" value="male" name="Gender">male
<input type="radio" value="female" name="Gender">female
<br>
Email:
<input type="text" name="email"><br>
Phone:
<input type="text" name="phone"><br>
<input type="submit" value="SignUp">
</form>
</body>
</html>