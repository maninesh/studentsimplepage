<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg }
<form action="fileUpload.san" method="post" enctype="multipart/form-data">
<input type="file" name="fileName" required><br>
Name: <input type="text" name="name" required><br>
address:<input type="text" name="address" required><br>
<input type="submit" value="Upload">
</form>
</body>
</html>