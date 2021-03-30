<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo distancia entre dos puntos</title>
</head>
<body>
				<%
					HttpSession httpSession9 = request.getSession();
							CoordenadasDosPuntos coordenadasDosPuntos =(CoordenadasDosPuntos)httpSession9.getAttribute("COORDENADASDOSPUNTOS");
				%>

					<h3><%=OperacionesGeometriaAnalitica.calculaDistanciaEntreDosPuntos(coordenadasDosPuntos)%></h3>
					
					
</body>
</html>