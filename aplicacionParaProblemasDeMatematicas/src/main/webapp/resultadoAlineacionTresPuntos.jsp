<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasTresPuntos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado sobre la alineación de tres puntos</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								CoordenadasTresPuntos coordenadasTresPuntos =(CoordenadasTresPuntos)httpSessionAA.getAttribute("COORDENADASTRESPUNTOS");
					%>

						<h3><%=OperacionesGeometriaAnalitica.alineacionDeTresPuntos(coordenadasTresPuntos)%></h3>
						
							
</body>
</html>