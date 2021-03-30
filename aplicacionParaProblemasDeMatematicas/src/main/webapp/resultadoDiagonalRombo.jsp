<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.DiagonalYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado diagonal rombo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							DiagonalYarea objetoDosDiagonales =(DiagonalYarea)httpSession6.getAttribute("OBJETODIAGONALYAREA");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoDiagonalRombo(objetoDosDiagonales.getArea(), objetoDosDiagonales.getDiagonalConocida())%></h3>

</body>
</html>