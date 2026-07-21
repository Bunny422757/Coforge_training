<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Current Date and Time</h2>

	<%
	LocalDateTime currentDate = LocalDateTime.now();

	out.println("<h3>" + currentDate + "</h3>");
	%>
</body>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.time.LocalDateTime"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h2>Current Date and Time</h2>

	<%
	LocalDateTime currentDate = LocalDateTime.now();

	out.println("<h3>" + currentDate + "</h3>");
	%>
</body>
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
</html>