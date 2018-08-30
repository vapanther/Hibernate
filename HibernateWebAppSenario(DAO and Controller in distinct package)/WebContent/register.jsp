<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration Form</title>
</head>
<body>
	<center><h1>Registration Form</h1>
	<form action="register" method="post">
		<table cellpadding="3pt">
			<tr>
				<td>User Name :</td>
				<td><input type="text" name="userName" size="30" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="password1" size="30" /></td>
			</tr>

			<tr>
				<td>Confirm Password :</td>
				<td><input type="password" name="password2" size="30" /></td>
			</tr>
			<tr>
				<td>email :</td>
				<td><input type="text" name="email" size="30" /></td>
			</tr>
			<tr>
				<td>Phone :</td>
				<td><input type="text" name="phone" size="30" /></td>
			</tr>
			<tr>
				<td>City :</td>
				<td><input type="text" name="city" size="30" /></td>
			</tr>
		</table>
		<h1>Stock Form</h1>
		<table cellpadding="3pt">
			<tr>
				<td>Stock ID :</td>
				<td><input type="number" name="stockId" size="30"  /></td>
			</tr>
			<tr>
				<td>stockCode :</td>
				<td><input type="text" name="stockCode" size="30"  value="stockId"/></td>
			</tr>
			<tr>
				<td>StockName :</td>
				<td><input type="text" name="stockName" size="30" value="stockName"/ /></td>
			</tr>
		</table>
		</table>
		<h1>Book Form</h1>
		<table cellpadding="3pt">
			<tr>
				<td>Book ID :</td>
				<td><input type="text" name="bookid" size="30" /></td>
			</tr>
			<tr>
				<td>Book ISBN :</td>
				<td><input type="text" name="bookisbn" size="30" /></td>
			</tr>
			<tr>
				<td>Book Name :</td>
				<td><input type="text" name="bookname" size="30" /></td>
			</tr>
			<tr>
				<td>Book Author :</td>
				<td><input type="text" name="bookauthor" size="30" /></td>
			</tr>
			<tr>
				<td>Book Publisher :</td>
				<td><input type="text" name="bookpublisher" size="30" /></td>
			</tr>
			<tr>
				<td>Book Price :</td>
				<td><input type="text" name="bookprice" size="30" /></td>
			</tr>
		</table>
		<p />
		<input type="submit" value="Register" />
	</form>
	</center>
</body>
</html>