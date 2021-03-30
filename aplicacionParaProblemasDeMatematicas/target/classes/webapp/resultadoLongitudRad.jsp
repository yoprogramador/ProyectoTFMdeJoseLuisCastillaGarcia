<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.LongitudCircunf"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud radio</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							LongitudCircunf objetoLongCircunf =(LongitudCircunf)httpSession8.getAttribute("OBJETOLONGCIRCUNF");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudRad(objetoLongCircunf.getLongitudCircunferencia())%></h3>

</body>
</html>