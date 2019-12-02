<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="./home">Home</a>
	<a href="./logout" style="float: right">Logout</a>
	<fieldset>
		<legend>Update Profile</legend>
		<form action="./update" method="post">
			<table>
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>DOJ:</td>
					<td><input type="date" name="doj"></td>
				</tr>
				<tr>
					<td><input type="submit" value="submit"></td>
				</tr>
			</table>
		</form>
		<h3>${msg}</h3>
	</fieldset>
</body>
</html>