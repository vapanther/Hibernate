<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
<style>
p1{
font-size=10px;
font-color=blue;
}
</style>
</head>
<body bgcolor="pink">
	<h1>Registration Form for JPA Hibernate</h1>
	<form action="person" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>Person Id :</td>
				<td><input type="text" name="id"  size="30" /></td>
			</tr>
			<tr>
				<td>Person FirstName :</td>
				<td><input type="text" name="firstName"  size="30" /></td>
			</tr>
			<tr>
				<td>Person LastName:</td>
				<td><input type="text" name="lastName" value="Crosscode"  size="30" /></td>
			</tr>

			<tr>
				<td>Person email_ID :</td>
				<td><input type="text" name="email"  value="abc@crosscode.com" size="30" /></td>
			</tr>			
		</table>
		<p /></p><input type="submit" value="Submit">
		
	</form>
</body>
</html>