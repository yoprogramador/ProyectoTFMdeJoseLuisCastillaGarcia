<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.LongitudRadioCircunferencia"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud circunferencia</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							LongitudRadioCircunferencia objetoRadio =(LongitudRadioCircunferencia)httpSession8.getAttribute("OBJETORADIO");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudCircunferencia(objetoRadio.getLongitudRadio())%></h3>

</body>
</html>