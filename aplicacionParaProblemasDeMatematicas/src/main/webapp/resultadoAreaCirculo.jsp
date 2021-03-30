<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.RadioCirculo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área círculo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								RadioCirculo objetoRadioCirculo =(RadioCirculo)httpSessionAA.getAttribute("OBJETORADIO");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAreaCirculo(objetoRadioCirculo.getRadioCirculo())%></h3>

</body>
</html>