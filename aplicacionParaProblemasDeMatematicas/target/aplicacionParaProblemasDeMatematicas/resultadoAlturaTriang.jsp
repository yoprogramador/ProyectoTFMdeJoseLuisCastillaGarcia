<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BaseYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado altura triángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						BaseYarea objetoBaseYaltura =(BaseYarea)httpSessionAA.getAttribute("OBJETOBASEYAREA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAlturaTriang(objetoBaseYaltura.getArea(), objetoBaseYaltura.getBase())%></h3>

</body>
</html>