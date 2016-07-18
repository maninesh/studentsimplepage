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
<div align="center">
<h1>Student Form</h1>
<form action="Studentsave.san" method="post">
Name:
<input type="text" name="name"><br>
Level:
<select name="level">
<option value="Masters">Masters</option>
<option value="BE">BE</option>
<option value="+2">+2</option>
<option value="SLC">SLC</option>
</SELECT>
<br>
Address:
<input type="text" name="address"><br>
Phone:
<input type="text" name="phone"><br>
Gender:
<input type="radio" value="male" name="gender">Male
<input type="radio" value="female" name="gender">Female
<input type="radio" value="other" name="gender">Other
<br>
Email:
<input type="text" name="email"><br>
<input type="submit" value="SUBMIT">

</form>
</div>
</body>
</html>