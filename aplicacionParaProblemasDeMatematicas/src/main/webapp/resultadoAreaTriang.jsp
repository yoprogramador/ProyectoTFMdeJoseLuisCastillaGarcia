<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BaseYaltura"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área triángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						BaseYaltura objetoBaseYaltura =(BaseYaltura)httpSessionAA.getAttribute("OBJETOBASEYALTURA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAreaTriang(objetoBaseYaltura.getBase(), objetoBaseYaltura.getAltura())%></h3>

</body>
</html>