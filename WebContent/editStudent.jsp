<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>edit Student</title>
</head>
<body>
<jsp:include page="main_header.jsp"></jsp:include>
<jsp:include page="action_header.jsp"></jsp:include>

<div align="center">
<h1>Edit Student</h1>
<form action="studentUpdate.san?id=${STUDENT.id}" method="post">
Name:
<input type="text" name="name" value="${STUDENT.name}"><br>
Level:
<select name="level">
<option value="${STUDENT.name}">${STUDENT.level}</option>
<option value="Masters">Masters</option>
<option value="BE">BE</option>
<option value="+2">+2</option>
<option value="SLC">SLC</option>
</SELECT>
<br>
Address:
<input type="text" name="address" value="${STUDENT.address}"><br>
Phone:
<input type="text" name="phone" value="${STUDENT.phone}"><br>
Gender:
<input type="radio" value="male" name="gender" <c:if test="${STUDENT.gender eq 'male'}"> checked=checked</c:if>>Male
<input type="radio" value="female" name="gender" <c:if test="${STUDENT.gender eq 'female'}"> checked=checked</c:if>>Female
<input type="radio" value="other" name="gender" <c:if test="${STUDENT.gender eq 'other'}"> checked=checked</c:if>>Other
<br>
Email:
<input type="text" name="email" value="${STUDENT.email}"><br>
<input type="submit" value="Update">

</form>
</div>
</body>
</html>