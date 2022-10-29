<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>update</h1>
<form action ="update">
<input type="hidden" name="eid" value="<%= request.getParameter("id") %>">
enter new name <input type="text" name="ename" >
enter new email <input type="text" name="eemail" >
<input type ="submit" value="ok">
</form>
</body>
</html>