<%@page import="operacionesTrigonometria.OperacionesTrigonometria"%>
<%@page import="opcionOperacionTrigonometriaUsuario.UnDato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado seno y tangente</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							UnDato objetoUnDato =(UnDato)httpSession8.getAttribute("OBJETOUNDATO");
				%>
					<h3><%=OperacionesTrigonometria.calculaSenoTangente(objetoUnDato.getUnDato())%></h3>
</body>
</html>