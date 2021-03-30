<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaRendimientoAlumnos.IdentificadorCasoAlumnoProblema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado eliminar caso alumno-problema de la tabla de rendimiento</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		IdentificadorCasoAlumnoProblema objetoId = (IdentificadorCasoAlumnoProblema) httpSession3.getAttribute("OBJETOIDENTIFICADOR");
		
		TablaRendAlumnosDatasource.makeJDBCConnection();	
	%>
	
		<h3><%=TablaRendAlumnosDatasource.eliminarCasoAlumnoProblema(objetoId.getIdentificadorCasoAlumnoProblema())%></h3>

</body>
</html>