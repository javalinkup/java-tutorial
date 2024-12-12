<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Fom</title>
</head>
<body>
    <h2>Create New User</h2>
    <form action ="/users/form" method="post">
    <label for ="name" >Name</label>
    <input type="text" id = "name" name="name" />
    <br/>
      <label for ="email" >Email</label>
        <input type="text" id = "email" name="email" />
        <br/>
        <button type = "submit">Submit</button>
</form>
<a href = "/users"> View Users</a>
</body>
</html>
