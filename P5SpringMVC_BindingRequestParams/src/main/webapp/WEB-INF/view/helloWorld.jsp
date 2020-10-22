<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>
<h2>Hello World Of Spring</h2>
<br/>
<p>
<b>Student Name: <i>${param.studentName}</i></b><%--  ${param.studentName} --%>
</p>
<br/>
<p>
<b>The Message: <i>${message}</i></b>
</p>
</body>
</html>