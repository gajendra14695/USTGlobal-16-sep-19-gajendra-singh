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
<form action="./form" method="post">
<h3>Register Form</h3>
 Name:
  <input type="text" name="name"><br>
Id:
  <input type="number" name="id"><br>
Password:<input name="password" type="password" value="password"><br>
  Gender: <input type="radio" name="gender" value="male" checked> Male<br>
  <input type="radio" name="gender" value="female"> Female<br>
  <input type="radio" name="gender" value="other"> Other<br>
  DOJ:<input type="date" name="doj">
  <input type="reset" name="reset" value="reset"> 
  <input type="submit" name="register" value="register"> 

</form>
</fieldset>
</body>
</html>