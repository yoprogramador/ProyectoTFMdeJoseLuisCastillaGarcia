<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado punto de intersección rectas</title>
</head>
<body>
					<%
						HttpSession httpSessionPI = request.getSession();
								EcuacionesDosRectas ecuacionesDosRectas = (EcuacionesDosRectas)httpSessionPI.getAttribute("ECUACIONESDOSRECTAS");
					%>
					
						<h3><%=OperacionesGeometriaAnalitica.puntoInterseccionDosRectas(ecuacionesDosRectas)%></h3>
						
						
</body>
</html>