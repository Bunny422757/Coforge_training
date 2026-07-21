<<<<<<< HEAD
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b><font color = 'green'>Welcome <%= session.getAttribute("username") %></font></b>
	<%
		Cookie[] cookies = request.getCookies();
		out.println("<p><b><font color='green'>Welcome "+ cookies[1].getValue()+ "</font></b></p>");
	%>
</body>
=======
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<b><font color = 'green'>Welcome <%= session.getAttribute("username") %></font></b>
	<%
		Cookie[] cookies = request.getCookies();
		out.println("<p><b><font color='green'>Welcome "+ cookies[1].getValue()+ "</font></b></p>");
	%>
</body>
>>>>>>> 9000e4a41b7cba1efe4c4b79e07e5aa2b21e0613
</html>