<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri ="http://www.springframework.org/tags/form" prefix ="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${delete}
<form:form method="post">
<input type="number" name="id">
<input type="submit" value="delete">
</form:form>
</body>
</html>