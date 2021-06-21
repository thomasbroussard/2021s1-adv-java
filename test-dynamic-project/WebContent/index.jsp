<%@page import="java.sql.Connection"%>
<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%=session.getId()%> 
<%List<Enumeration<String>> customers = Arrays.asList(request.getParameterNames()); 

Connection connection = DriverManager.getConnection("jdbc://", "","");
connection.prepareStatement(sql);

//List<String> customers = Arrays.asList("A","B","C");
for (Enumeration<String> customer : customers){
	%>
		<p>
		<%=customer %>
		</p>
	<%
}
%>
</body>
</html>