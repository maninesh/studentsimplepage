<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function hideMsg(){
	   document.getElementById("msg").style.display = "none";
		
}
</script>
</head>
<body onload="setTimeout(hideMsg,4000)">
<jsp:include page="main_header.jsp"></jsp:include>
<jsp:include page="action_header.jsp"></jsp:include>

<div align="center">
<h1>Student Detail</h1>
</div>
<div align="center">
<form action="searchStudent.san" method="post">
<input type="text" name="searchKey" required>
<input type="submit" value="search">
</form>
<br>
${BAR }
<table border="1" >
<tr>
<th>S.No.</th>
<th>Id</th>
<th>Name</th>
<th>Level</th>
<th>Address</th>
<th>Phone</th>
<th>Gender</th>
<th>Email</th>
<th>Edit</th>
<th>Delete</th>
</tr>
<tbody>
<%!int c=0; %>
<c:forEach items="${STUDENTLIST}" var="print">
<%
c++;
%>
<tr>
<td><%=c %></td>
<td>${print.id }</td>
<td>${print.name}</td>
<td>${print.level }</td>
<td>${print.address }</td>
<td>${print.phone }</td>
<td>${print.gender }</td>
<td>${print.email }</td>
<td><a href="editStudent.san?id=${print.id}">edit </a></td>
<td><a href="deleteStudent.san?id=${print.id}">delete </a></td>
</tr>
</c:forEach>
<%c=0; %>
</tbody>
</table>
</div>
<div id="msg">
${MSG }
${CSG }
</div>
</body>
</html>