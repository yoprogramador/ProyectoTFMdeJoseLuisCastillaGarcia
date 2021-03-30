<%@page import="tablaProblemas.ProblemasDao"%>
<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaProblemas.FormularioToUpdate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado realización update</title>
</head>
<body>
<%
	HttpSession httpSession7 = request.getSession();
	FormularioToUpdate objetoFormUpDate = (FormularioToUpdate) httpSession7.getAttribute("OBJETOFORMTOUPDATE");
	
	TablaProblemasDatasource.makeJDBCConnection();
%>
					<h3><%=TablaProblemasDatasource.updateProblema(objetoFormUpDate)%></h3>
		

</body>
</html>