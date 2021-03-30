<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.HipotenusayCateto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud cateto</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							HipotenusayCateto objetoHipotenusayCateto =(HipotenusayCateto)httpSession6.getAttribute("OBJETOHIPOTENUSAYCATETO");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudCateto(objetoHipotenusayCateto.getHipotenusa(), objetoHipotenusayCateto.getCateto())%></h3>

</body>
</html>