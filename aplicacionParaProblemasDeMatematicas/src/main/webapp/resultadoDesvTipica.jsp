<%@page import="operacionesDeEstadistica.OperacionesDeEstadistica"%>
<%@page import="opcionOperacionEstadisticaUsuario.GrupoDeDatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado c�lculo desviaci�n t�pica</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							GrupoDeDatos objetoGrupoDeDatos =(GrupoDeDatos)httpSession8.getAttribute("OBJETOGRUPODEDATOS");
				%>

					<h3><%=OperacionesDeEstadistica.calculaDesvTipica(objetoGrupoDeDatos.getGrupoDeDatos())%></h3>
</body>
</html>