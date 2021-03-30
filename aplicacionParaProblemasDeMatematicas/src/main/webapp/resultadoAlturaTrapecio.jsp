<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BasesYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado altura trapecio</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
						BasesYarea objetoBasesYarea =(BasesYarea)httpSessionAA.getAttribute("OBJETOBASESYAREA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAlturaTrapecio(objetoBasesYarea.getBaseInferior(), objetoBasesYarea.getBaseSuperior(), objetoBasesYarea.getArea())%></h3>

</body>
</html>