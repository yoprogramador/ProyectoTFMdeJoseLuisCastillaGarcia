<%@page import="operacionesTrigonometria.OperacionesTrigonometria"%>
<%@page import="opcionOperacionTrigonometriaUsuario.UnDato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado arcoseno</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							UnDato objetoUnDato =(UnDato)httpSession8.getAttribute("OBJETOUNDATO");
				%>
					<h3><%=OperacionesTrigonometria.calculaArcoSeno(objetoUnDato.getUnDato())%></h3>
</body>
</html>