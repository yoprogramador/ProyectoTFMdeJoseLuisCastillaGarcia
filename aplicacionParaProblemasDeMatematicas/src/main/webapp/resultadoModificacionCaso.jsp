<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaProblemas.FormularioToUpdate"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado modificación caso alumno-problema</title>
</head>
<body>
<%
	HttpSession httpSession7 = request.getSession();
	FormularioToUpdate objetoFormUpDate = (FormularioToUpdate) httpSession7.getAttribute("OBJETOFORMTOUPDATE");
	
	TablaRendAlumnosDatasource.makeJDBCConnection();
%>
					<h3><%=TablaRendAlumnosDatasource.updateCasoAlumnoProblema(objetoFormUpDate)%></h3>

</body>
</html>