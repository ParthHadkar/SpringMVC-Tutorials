<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
<h2>The customer is confirmed: ${customer.firstName} ${customer.lastName}</h2>
<h2>Free Passes: ${customer.freePasses}</h2>
</body>
</html>