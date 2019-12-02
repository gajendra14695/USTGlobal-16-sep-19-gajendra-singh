<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>Register</legend>
<form action="./register" method="post">


<table>
<tr>
<td>Name:
</td>
<td><input type="text" name="name">
</td>

</tr>

<tr>
<td>Email:
</td>
<td><input type="email" name="email">
</td>

</tr>

<tr>
<td>password:
</td>
<td><input type="password" name="password">
</td>

</tr>
<tr>
<td>DOJ:
</td>
<td><input type="date" name="doj">
</td>
<tr>
<td>Gender:
</td>
<td><select name="gender">
<option>-----select------</option>
<option value="M">male</option>
<option value="F">female</option>
</select>
</td>

</tr>

</tr>

<tr>
<td><input type="reset" value="Reset"></td>
<td><input type="submit" value="login"></td>
</tr>
</form>

</fieldset>
<a href "./login">click Here To Login</a>

</body>
</html>