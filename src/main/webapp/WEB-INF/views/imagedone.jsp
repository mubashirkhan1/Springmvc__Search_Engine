<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored = "false" %>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> file upload done</h1>

<h1 style="color: olive;">${ msg}</h1>
<img alt=" my image" src="<c:url value="/resources/image/${iname}"/>"/>
</body>
</html>