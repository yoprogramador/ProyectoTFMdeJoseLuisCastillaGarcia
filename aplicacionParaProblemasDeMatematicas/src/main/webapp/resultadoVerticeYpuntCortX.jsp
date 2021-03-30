<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FuncionCuadratica"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>resultado vértice y puntos de corte eje x</title>
</head>
<body>
				<%
					HttpSession httpSessionVPC = request.getSession();
						FuncionCuadratica funcionCuadratica = (FuncionCuadratica)httpSessionVPC.getAttribute("FUNCIONCUADRATICA");
				%>

					<h3><%=OperacionesGeometriaAnalitica.calculaVerticePuntosDeCorteConEjeXdeFuncionCuadratica(funcionCuadratica)%></h3>
					
					
</body>
</html>