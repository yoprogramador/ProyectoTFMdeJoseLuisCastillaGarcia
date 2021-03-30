<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaSecYradio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultlado grados sector circular</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							AreaSecYradio objetoAreaSecYradio =(AreaSecYradio)httpSession6.getAttribute("OBJETOAREASECYRADIO");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoGradosSec(objetoAreaSecYradio.getAreaSec(), objetoAreaSecYradio.getRadio())%></h3>

</body>
</html>