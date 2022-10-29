<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="java.util.*" %>
    <%@ page import="updatePro.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
List<User> list=(List<User>)request.getAttribute("list");
int id=(int)request.getAttribute("i");
%>

<table border="1"> 
<tr><th>User id</th><th>User name</th><th>User email</th><th>Edit</th></tr>
<%for(User e:list){
if(e.getUid()==id){ %>
<tr><td><%=e.getUid() %></td><td><%=e.getUname() %></td><td><%=e.getEmail() %></td><td><a href="update.jsp?id=<%=e.getUid()%>">Edit</a></td></tr>
<%}
}
%>
</table>

		
</body>
</html>