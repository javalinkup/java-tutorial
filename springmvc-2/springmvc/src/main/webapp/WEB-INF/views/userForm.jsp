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
    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
            </tr>
        </thead>

         <tbody>
                    <c:forEach var="user" items="${userInfo}">
                        <tr>
                            <td>${user.id}</td>
                            <td>${user.name}</td>
                            <td>${user.email}</td>
                        </tr>

                </tbody>

                <a href = "/users/edit/${user.id}">Edit user</a>
</c:forEach>
    </table>


</body>
</html>
