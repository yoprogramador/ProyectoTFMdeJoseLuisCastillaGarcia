<%@page import="operacionesDeProporcionalidad.OperacionesDeProporcionalidad"%>
<%@page import="opcionOperacionProporcionalidadUsuario.ReglaDeTres"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado regla de tres directa</title>
</head>
<body>
			<%
			HttpSession httpSessionRTD = request.getSession();
			ReglaDeTres objetoReglaDeTres = (ReglaDeTres)httpSessionRTD.getAttribute("OBJETOREGLADETRES");
			%>
			<h3><%=OperacionesDeProporcionalidad.reglaDe3Directa(objetoReglaDeTres.getPrimeraCantidadVariableA(),objetoReglaDeTres.getPrimeraCantidadVariableB(),objetoReglaDeTres.getSegundaCantidadVariableA() ) %></h3>
			
			
</body>
</html>