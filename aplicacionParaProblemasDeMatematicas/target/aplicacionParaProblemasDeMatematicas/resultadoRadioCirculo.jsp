<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaCirculo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado radio círculo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								AreaCirculo objetoAreaCirculo =(AreaCirculo)httpSessionAA.getAttribute("OBJETOAREA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoRadioCirculo(objetoAreaCirculo.getAreaCirculo())%></h3>

</body>
</html>