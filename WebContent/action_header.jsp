<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
ul{
	list-style-type: none;
	margin: 0;
	padding: 0;
	overflow: hidden;
	background-color: #dddddd;	
}
li{
float: left;
}
li a{
display: block;
padding: 8px;
background-color: #dddddd;
text-decoration: none;
}
li a:hover {
    background-color: #111;
}
</style>
</head>
<body>
<div >
<ul>
<li><a href="loginPage.san">Login</a></li>
<li><a href="signUpPage.san">SignUp</a></li>
<li><a href="studentFormPage.san">StudentForm</a></li>
<li><a href="showStudent.san">Student Detail</a></li>
<li><a href="loadFileUploadPage.san">File Upload</a>
<li><a href="viewFileDetail.san">Show File</a>
<li><a href="loadBookPage.san">Java Beans Book Test</a>
<li><a href="showBookPage.san">Show Books</a>
<li style="float:right"><a href="userLogout.san">Log Out</a></li>
</ul>
</div>
</body>
</html>