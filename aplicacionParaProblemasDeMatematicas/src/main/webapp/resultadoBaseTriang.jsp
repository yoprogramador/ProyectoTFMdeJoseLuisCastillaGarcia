<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AlturaYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado base triángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						AlturaYarea objetoBaseYaltura =(AlturaYarea)httpSessionAA.getAttribute("OBJETOALTURAYAREA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoBaseTriang(objetoBaseYaltura.getArea(), objetoBaseYaltura.getAltura())%></h3>

</body>
</html>