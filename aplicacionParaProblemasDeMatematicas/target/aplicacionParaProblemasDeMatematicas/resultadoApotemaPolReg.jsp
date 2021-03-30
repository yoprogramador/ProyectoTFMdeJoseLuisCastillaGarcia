<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaNumLadosLongLado"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado apotema polígono regular</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								AreaNumLadosLongLado objetoAreaNumLadosLongLado =(AreaNumLadosLongLado)httpSessionAA.getAttribute("OBJETOAREANUMLADOSLONGLADO");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoApotemaPoligonoReg(objetoAreaNumLadosLongLado.getArea(), objetoAreaNumLadosLongLado.getLongLado(), objetoAreaNumLadosLongLado.getNumLados())%></h3>

</body>
</html>