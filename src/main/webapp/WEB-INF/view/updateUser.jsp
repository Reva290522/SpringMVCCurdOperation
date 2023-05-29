<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.soft.entity.User" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	User existUser = (User) request.getAttribute("ExistUser");
	%>
	<div id="edit">
<h1>Update Data</h1>
	<form action="updateUser" method="post">

		<label>Id</label> <br><input type="text" name="id"
			value="<%=existUser.getId()%>" readonly><br>
		<br> <label>Name</label><br> <input type="text" name="name"
			value="<%=existUser.getName()%>"><br>
		<br> <label>Address</label><br> <input type="text" name="Address"
			value="<%=existUser.getAddress()%>"><br>
		<br> <label>Phone No</label> <br><input type="number" name="Phno"
			value="<%=existUser.getPhno() %>"><br>
		<br> <input  class="i3" type="submit" value="UpdateUser">
	</form>
</div>

</body>
</html>