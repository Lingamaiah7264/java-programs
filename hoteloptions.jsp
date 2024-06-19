<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% Admin a=(Admin) session.getAttribute("admininfo");
    if(a!=null){
%>
${message} <br>
<a href="fetchunapprovalhotels">Approve Hotel</a>
<br>
<a href="fetchunapprovalhotels">Block Hotel</a>
<br>
<a href="fetchunapprovalhotels">Unblock Hotel</a>
<br>
<a href="fetchunapprovalhotels">Provide Discount</a>
<%
    }else{
%>
<a href="Adminlogin.jsp">Login</a>
<%
 }
%>
</body>
</html>