<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Hello help!!!!!!</h1>
<%String name=(String)request.getAttribute("name"); %>
<h1><%=name %></h1>

<h1>This is name using jsp exprestsiion language :---:${name }</h1>

<h2>********************</h2>
<h1>traverse the list using jstl</h1>
<c:forEach var="item" items="${f }">
 <h1>${item }</h1>
 

</c:forEach>

</body>
</html>