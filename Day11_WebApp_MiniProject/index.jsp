<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link href="EmsStyle.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="./AjaxScript.js">

</script>
</head>

<body>
	<div class="header">
		<h2>Employee Management System</h2>
	</div>
	<br>
	<form action="EmployeeController" method="post">
		<div class="content">
			<table class="table-hover">
				<tr>
					<td>Employee ID :</td>
					<td><input type="number" name="eid" id="eid" onblur="getEmployeeDetails()"/><br></td>

				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="ename" id="ename"/><br></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><input type="number" name="esalary" id="esalary"/><br></td>
				</tr>
				<tr>
					<td>Department Number :</td>
					<td><input type="number" name="dno" id="dno"/><br></td>
				</tr>
			</table>
			<br> <input type="submit" value="Insert" class="btn-primary"
				name="emsButton" /> &nbsp;&nbsp; <input type="submit"
				value="Update" class="btn-warning" name="emsButton" /> &nbsp;&nbsp;
			<input type="submit" value="Delete" class="btn-danger"
				name="emsButton" /> &nbsp;&nbsp; <input type="submit" value="Find"
				class="btn-success" name="emsButton" /> &nbsp;&nbsp; <input
				type="submit" value="FindAll" class="btn-info" name="emsButton" />
			<br>

		</div>
	</form>

	<div class="alert alert-primary">
		<font align="center"><b><%= request.getParameter("result") %></b></font>
	</div>

</body>
</html>