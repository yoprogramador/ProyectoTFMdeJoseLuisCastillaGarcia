<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.NumeroLados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado número diagonales</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
					NumeroLados	objetoNumLados =(NumeroLados)httpSession8.getAttribute("OBJETONUMLADOS");
				%>

					<h3><%=OperacionesGeometriaEuclidian.numeroDeDiagonales(objetoNumLados.getNumeroLados())%></h3>
					

</body>
</html>