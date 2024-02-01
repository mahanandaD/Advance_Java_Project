<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="com.EmployeeManagement.AdminData"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String msg=(String)request.getAttribute("msg");
out.println(msg);
AdminData ad=(AdminData)application.getAttribute("admin");
out.println("Welcome Admin: "+ad.getfName()+"<br>");
%>
<a href="add">AddEmployee</a>
<a href="view">ViewAllEmployee</a>
<a href="logout">Logout</a>
</body>
</html>