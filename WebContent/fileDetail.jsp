<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Detail</title>
</head>
<body>
<jsp:include page="main_header.jsp"></jsp:include>
<jsp:include page="action_header.jsp"></jsp:include>

<div align="center">
<h1>File Detail</h1>
</div>
<div align="center">
<br>
<table border="1" bordercolor="red">
<tr>
<th>Id</th>
<th>Image Name</th>
<th>Name</th>
<th>Address</th>
</tr>
<tbody>
<c:forEach items="${File_Detail}" var="print">
<tr>
<td>${print.id }</td>
<td><img alt="image not found" src="images/${print.image_name }"></td>
<td>${print.name}</td>
<td>${print.address }</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</body>
</html>