<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Form</title>
</head>
<body>

<form:form action="processForm" modelAttribute="student">
First Name:<form:input path="firstName" />
<br/><br/>
Last Name:<form:input path="lastName" />
<br/><br/>
Country:<form:select path="country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="Germany" label="Germany"/>
<form:option value="India" label="India"/>
</form:select>
<br/><br/>
Country CodeJ:<form:select path="countryCode">
<form:options items="${student.countryOptions}"/>
</form:select>
<br/><br/>
Country CodeP:<form:select path="countryCodeP">
<form:options items="${countryOptions1}"/>
</form:select>
<br/><br/>
Favorite Language:
<form:radiobutton path="favoriteLanguage" value="Java"/><label>Java</label>
<form:radiobutton path="favoriteLanguage" value="Python"/><label>Python</label>
<form:radiobutton path="favoriteLanguage" value="Dart"/><label>Dart</label>
<form:radiobutton path="favoriteLanguage" value="C++"/><label>C++</label>
<br/><br/>
Favorite LanguageJ:
<form:radiobuttons path="favoriteLanguageJ" items="${student.favoriteLanguageOptions}"/>
<br/><br/>
Favorite LanguageP:
<form:radiobuttons path="favoriteLanguageP" items="${favoriteLanguageOptions1}"/>
<br/><br/>
Operating System:
<form:checkbox path="operatingSystems" value="Window"/><label>Window</label>
<form:checkbox path="operatingSystems" value="Mac"/><label>Mac</label>
<form:checkbox path="operatingSystems" value="Android"/><label>Android</label>
<form:checkbox path="operatingSystems" value="Linux"/><label>Linux</label>
<br/><br/>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>