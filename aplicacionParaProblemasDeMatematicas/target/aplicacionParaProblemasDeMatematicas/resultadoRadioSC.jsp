<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaYanguloSec"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado radio</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							AreaYanguloSec objetoAreaYanguloSec =(AreaYanguloSec)httpSession6.getAttribute("OBJETOAREAYANGULOSEC");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoRadioSC(objetoAreaYanguloSec.getAreaSec(), objetoAreaYanguloSec.getAnguloSec())%></h3>

</body>
</html>