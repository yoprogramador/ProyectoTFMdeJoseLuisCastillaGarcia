<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.ArcoYradio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado grado ángulo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
					ArcoYradio objetoArcoYradio =(ArcoYradio)httpSession6.getAttribute("OBJETOARCOYRADIO");
				%>
				<h3><%=OperacionesGeometriaEuclidian.calculoGradosAnguloBis(objetoArcoYradio.getLongitudArco(), objetoArcoYradio.getLongitudRadio()) %></h3>

</body>
</html>