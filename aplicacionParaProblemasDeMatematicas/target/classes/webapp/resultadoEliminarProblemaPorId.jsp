<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaProblemas.IdentificadorProblema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminación problema de tabla de problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		IdentificadorProblema objetoId = (IdentificadorProblema) httpSession3.getAttribute("OBJETOIDENTIFICADOR");
		
		TablaProblemasDatasource.makeJDBCConnection();		
	%>
	
		<h3><%=TablaProblemasDatasource.eliminarProblema(objetoId.getIdentificadorProblema())%></h3>

</body>
</html>