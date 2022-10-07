<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>bsfvk ljfbxdklz</h1>
<%  String name=(String)request.getAttribute("name"); %>
<h1>hello!! you are <%=name %>.... </h1>
<%Integer id=(Integer)request.getAttribute("id"); %>
<h1>your id is :<%=id %></h1>
<h1>Your friend list is ---</h1>
<%List<String>list=(List<String>)request.getAttribute("friend"); 

for(String s:list){
	%>
	<h1><%=s %></h1>
	<%
}

%>



</body>
</html>