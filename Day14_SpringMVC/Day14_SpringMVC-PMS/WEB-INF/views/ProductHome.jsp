<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
	<div class="header">
		<h1>Product Management System</h1>
	</div>
	<br />
	<form action="product" method="post">
	<div class="content">
		<table>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="pid"></td>
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="pprice"></td>
			</tr>

			<tr>
				<td>Product Quantity</td>
				<td><input type="text" name="pqnt"></td>
			</tr>
		</table>
		<br />
		<input type="submit" name="Insert" value="Insert" class="btn btn-primary">
<input type="submit" name="Update" value="Update" class="btn btn-warning">
<input type="submit" name="Delete" value="Delete" class="btn btn-danger">
<input type="submit" name="Find" value="Find" class="btn btn-info">
<input type="submit" name="FindAll" value="FindAll" class="btn btn-info">

		<br/><br/>
	</div>
	</form>
	
	<br>
	<div>
	<!-- Expression Language -->
		<b>${result}</b>
	</div>

=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management System</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
</head>
<body>
	<div class="header">
		<h1>Product Management System</h1>
	</div>
	<br />
	<form action="product" method="post">
	<div class="content">
		<table>
			<tr>
				<td>Product Id</td>
				<td><input type="text" name="pid"></td>
			</tr>

			<tr>
				<td>Product Name</td>
				<td><input type="text" name="pname"></td>
			</tr>
			<tr>
				<td>Product Price</td>
				<td><input type="text" name="pprice"></td>
			</tr>

			<tr>
				<td>Product Quantity</td>
				<td><input type="text" name="pqnt"></td>
			</tr>
		</table>
		<br />
		<input type="submit" name="Insert" value="Insert" class="btn btn-primary">
<input type="submit" name="Update" value="Update" class="btn btn-warning">
<input type="submit" name="Delete" value="Delete" class="btn btn-danger">
<input type="submit" name="Find" value="Find" class="btn btn-info">
<input type="submit" name="FindAll" value="FindAll" class="btn btn-info">

		<br/><br/>
	</div>
	</form>
	
	<br>
	<div>
	<!-- Expression Language -->
		<b>${result}</b>
	</div>

>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
</html>