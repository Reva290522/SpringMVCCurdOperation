<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
    <%@page import="com.soft.entity.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>User List</h1>
<div id="main">
<table>
<tr>
<th>userId</th>
<th>Name</th>
<th>Address</th>
<th>PhNo</th>
<th>Action</th>
</tr>
<%List<User> list= (List<User>) request.getAttribute("userList");%>
<%for(User user:list){%>
<tr>
<td><%=user.getId() %></td>
<td><%=user.getName() %></td>
<td><%=user.getAddress() %></td>
<td><%=user.getPhno() %></td>
<td><a href="updateUserForm?id=<%=user.getId() %>"><button>Update</button></a>
<a href="deleteById?id=<%=user.getId() %>" onclick="return confirm('Do You Want To Delete This Record')"
><button id="btn1">Delete</button></a></td>
</tr>
<% } %>

</table>
</div>
</body>
</html>