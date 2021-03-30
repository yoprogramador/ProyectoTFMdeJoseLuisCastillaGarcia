<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado punto medio entre dos puntos</title>
</head>
<body>
					<%
						HttpSession httpSessionA = request.getSession();
								CoordenadasDosPuntos coordenadasDosPuntos =(CoordenadasDosPuntos)httpSessionA.getAttribute("COORDENADASDOSPUNTOS");
					%>

						<h3><%=OperacionesGeometriaAnalitica.calculaPuntoMedioEntreDosPuntos(coordenadasDosPuntos)%></h3>
						
					
</body>
</html>