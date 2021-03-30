<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado distancia entre recta y punto</title>
</head>
<body>
					<%
						HttpSession httpSessionE = request.getSession();
								CoordenadasUnPuntoEcuacionRecta coordenadasUnPuntoEcuacionRecta =(CoordenadasUnPuntoEcuacionRecta)httpSessionE.getAttribute("COORDENADASUNPUNTOECUACIONRECTA");
					%>

						<h3><%=OperacionesGeometriaAnalitica.distanciaPuntoRecta(coordenadasUnPuntoEcuacionRecta)%></h3>
						
						
</body>
</html>