<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.NumeroDeLados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado ángulo polígono regular</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
					NumeroDeLados	objetoNumeroDeLados = (NumeroDeLados)httpSession6.getAttribute("OBJETONUMERODELADOS");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoAnguloPoligonoReg(objetoNumeroDeLados.getNumeroDeLados())%></h3>

</body>
</html>