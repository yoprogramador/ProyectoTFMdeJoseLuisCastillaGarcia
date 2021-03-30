<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.GradosDeLosAngulos"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AnguloYradio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado número de lados polígono regular</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
					GradosDeLosAngulos	objetoGradAng = (GradosDeLosAngulos)httpSession6.getAttribute("OBJETOGRADANG");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoNumeroLadosPolReg(objetoGradAng.getGradosDeLosAngulos())%></h3>

</body>
</html>