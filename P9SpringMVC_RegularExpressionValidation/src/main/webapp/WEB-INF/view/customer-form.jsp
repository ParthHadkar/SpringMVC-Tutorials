<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Customer Form</title>
<style type="text/css">
.error{
color: red;
}
</style>
</head>
<body>
<i>Fill Out The Form. Asterisk (*) Is Required.</i>
<form:form action="processForm" modelAttribute="customer">
 First Name:<form:input path="firstName"/>
 <br/><br/>
 Last Name (*):<form:input path="lastName"/>
 <form:errors path="lastName" cssClass="error"/>
 <br/><br/>
 Free Passes:<form:input path="freePasses"/>
 <form:errors path="freePasses" cssClass="error"/>
 <br/><br/>
 Postal Code:<form:input path="postalCode"/>
 <form:errors path="postalCode" cssClass="error"/>
 <br/><br/>
 <input type="submit" value="Submit"/>
 <br/><br/>
</form:form>
</body>
</html>