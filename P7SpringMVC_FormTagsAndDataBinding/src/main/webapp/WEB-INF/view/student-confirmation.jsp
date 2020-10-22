<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Confirmation</title>
</head>
<body>
<h3>The student is confirmed: ${student.firstName} ${student.lastName}</h3>
<h4>Country: ${student.country}</h4>
<h4>Country Code Java Code: ${student.countryCode}</h4>
<h4>Country Code Properties File: ${student.countryCodeP}</h4>
<h4>Favorite Language: ${student.favoriteLanguage}</h4>
<h4>Favorite Language Java Code: ${student.favoriteLanguageJ}</h4>
<h4>Favorite Language Properties File: ${student.favoriteLanguageP}</h4>
<h4>Operating Systems:</h4>
<ul>
<c:forEach var="os" items="${student.operatingSystems}">
<li> ${os}</li>
</c:forEach>
</ul>
</body>
</html>