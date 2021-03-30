<%@page import="operacionesDeProporcionalidad.OperacionesDeProporcionalidad"%>
<%@page import="opcionOperacionProporcionalidadUsuario.Porcentaje"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado porcentaje</title>
</head>
<body>
				<%
					HttpSession httpSessionPRO = request.getSession();
					Porcentaje objetoPorcentaje = (Porcentaje)httpSessionPRO.getAttribute("OBJETOPORCENTAJE");
				%>

					<h3><%=OperacionesDeProporcionalidad.porcentaje(objetoPorcentaje.getCantidad(), objetoPorcentaje.getPorcentaje())%></h3>
					
					
</body>
</html>