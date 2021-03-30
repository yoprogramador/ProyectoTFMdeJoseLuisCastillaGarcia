<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BaseAlturaYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado base trapecio</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						BaseAlturaYarea objetoBaseAlturaYarea =(BaseAlturaYarea)httpSessionAA.getAttribute("OBJETOBASEALTURAYAREA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoBaseTrapecio(objetoBaseAlturaYarea.getBaseConocida(), objetoBaseAlturaYarea.getArea(), objetoBaseAlturaYarea.getAltura())%></h3>

</body>
</html>