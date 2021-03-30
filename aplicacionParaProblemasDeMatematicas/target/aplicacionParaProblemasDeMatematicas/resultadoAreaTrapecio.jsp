<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BasesYaltura"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área trapecio</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						BasesYaltura objetoBasesYaltura =(BasesYaltura)httpSessionAA.getAttribute("OBJETOBASESYALTURA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAreaTrapecio(objetoBasesYaltura.getBaseInferior(), objetoBasesYaltura.getBaseSuperior(), objetoBasesYaltura.getAltura())%></h3>

</body>
</html>