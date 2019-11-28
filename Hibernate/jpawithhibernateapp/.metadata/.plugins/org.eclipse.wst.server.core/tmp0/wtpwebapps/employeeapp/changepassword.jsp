<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>

<body>
<a href="./home">Home</a> <a style="float:right"  href="./logout">logout</a>
<h4><%=msg %></h4>
<fieldset algin="center">

<legend>change password</legend>

	<form action="./changepassword" method ="post">
		<table align ="center">
			<tr>
				<td>New Password</td>
				<td><input type ="password" name="password"></td>
			</tr>
			<tr>
					<td>conform Password</td>
					<td><input type ="password" name="conformpassword"></td>
			</tr>

			<tr>
						<td><input type ="reset" value="reset"></td>
						<td><input type ="submit" value="change pasword"></td>
			</tr>
         
         </table>
		</form>
</fieldset>
</body>
</html>