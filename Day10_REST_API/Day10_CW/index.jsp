<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Management System</title>
<link href="EmsStyle.css" rel="stylesheet">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
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
					<td><input type="number" name="eid" /><br></td>

				</tr>
				<tr>
					<td>Employee Name :</td>
					<td><input type="text" name="ename" /><br></td>
				</tr>
				<tr>
					<td>Employee Salary :</td>
					<td><input type="number" name="esalary" /><br></td>
				</tr>
				<tr>
					<td>Department Number :</td>
					<td><input type="number" name="dno" /><br></td>
				</tr>
			</table>
			<br> <input type="submit" value="Insert" class="btn-primary"
				name="emsButton" /> &nbsp;&nbsp; <input type="submit" value="Update"
				class="btn-warning" name="emsButton" /> &nbsp;&nbsp; <input
				type="submit" value="Delete" class="btn-danger" name="emsButton" />
			&nbsp;&nbsp; <input type="submit" value="Find" class="btn-success"
				name="emsButton" /> &nbsp;&nbsp; <input type="submit"
				value="FindAll" class="btn-info" name="emsButton" /> <br>

		</div>
	</form>
	<%
	if(request.getParameter("result")!= null){
	%>
			<div class="alert alert-primary">
				<font align="center"><b><%= request.getParameter("result") %></b></font>
			</div>
		<%
	}else if(request.getParameter("eid")!=null){
	%>
			<div class="alert alert-info">
				<b>Employee ID :</b>
				<%= request.getParameter("eid") %><br> <b>Employee Name :</b>
				<%= request.getParameter("ename") %><br> <b>Employee Salary :</b>
				<%= request.getParameter("esalary") %><br> <b>Department No :</b>
				<%= request.getParameter("dno") %>
			</div>
		<%
    }
    }

</body>
</html>