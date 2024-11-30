<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "https://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<title>First JSP</title>
</head>
<%@ page import="java.util.Date" %>
<body>
<h2> User List </h2>
<table border = "1" >
<thead>
<tr>
<th> ID</th>
<th> Name</th>
<th> Email</th>
</tr>
</thead>
<tbody>
<s: forEach var = "user" items = "${users}">
<tr>
<td>${user.id}</td>
<td>${user.name}</td>
<td>${user.email}</td>
</tr>
</s: forEach>
</tbody>
</table>

</body>
</html>