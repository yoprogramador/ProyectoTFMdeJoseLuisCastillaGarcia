<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.OperacionGeometriaAnaliticaUsuario"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado recta paralela</title>
</head>
<body>
					<%
						HttpSession httpSessionC = request.getSession();
						  CoordenadasUnPuntoEcuacionRecta coordenadasUnPuntoEcuacionRecta =(CoordenadasUnPuntoEcuacionRecta)httpSessionC.getAttribute("COORDENADASUNPUNTOECUACIONRECTA");
					%>

						<h3><%=OperacionesGeometriaAnalitica.rectaParalela(coordenadasUnPuntoEcuacionRecta)%></h3>
						
						
</body>
</html>