<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.RadioYanguloSec"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área sector</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							RadioYanguloSec objetoRadioYanguloSec =(RadioYanguloSec)httpSession6.getAttribute("OBJETORADIOYANGULOSEC");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoAreaSectorCir(objetoRadioYanguloSec.getRadio(), objetoRadioYanguloSec.getAnguloSec())%></h3>

</body>
</html>