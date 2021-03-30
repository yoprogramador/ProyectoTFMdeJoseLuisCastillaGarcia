<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado recta perpendicular</title>
</head>
<body>
					<%
						HttpSession httpSessionD = request.getSession();
								CoordenadasUnPuntoEcuacionRecta coordenadasUnPuntoEcuacionRecta =(CoordenadasUnPuntoEcuacionRecta)httpSessionD.getAttribute("COORDENADASUNPUNTOECUACIONRECTA");
					%>
					
						<h3><%=OperacionesGeometriaAnalitica.rectaPerpendicular(coordenadasUnPuntoEcuacionRecta)%></h3>
									

</body>
</html>