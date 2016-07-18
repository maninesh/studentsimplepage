<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- scope="session" chahi dherai page ma jana paryo bhane rakhne ho..2ta page samma ko lagi chaidaina tara 3ta bhanda badi garna paryo bhane chainxa -->
<jsp:useBean id="bookInfo" class="com.mea.model.BookJavaBeanTest" scope="session"></jsp:useBean>
<jsp:setProperty property="*" name="bookInfo"/>

<!--	this will print the data of first page  -->

<jsp:getProperty property="name" name="bookInfo"/><br>
<jsp:getProperty property="price" name="bookInfo"/><br>

<form action="saveBook.san" method="post">
<input type="hidden" value="<jsp:getProperty property="name" name="bookInfo"/>" name="name">
<input type="hidden" value="<jsp:getProperty property="price" name="bookInfo"/>" name="price">
Publication:
<input type="text" name="publication"><br>
Author:
<input type="text" name="author"><br>
<input type="submit" value="submit">
</form>
</body>
</html>