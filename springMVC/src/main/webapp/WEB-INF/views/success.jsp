<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>${Header }</h1>
<p>${Desc}</p>

<h1>${user.user_name}</h1>
<h1>${user.email}</h1>
<h1>${user.password}</h1>

</body>
</html>