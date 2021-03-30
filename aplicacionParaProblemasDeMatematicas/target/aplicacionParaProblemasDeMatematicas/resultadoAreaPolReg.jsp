<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.NumLadosLongLadoApotema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área polígono regular</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								NumLadosLongLadoApotema objetoNumLadosLongLadoApotema =(NumLadosLongLadoApotema)httpSessionAA.getAttribute("OBJETONUMLADOSLONGLADOAPOTEMA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAreaPoligonoReg(objetoNumLadosLongLadoApotema.getNumLados(), objetoNumLadosLongLadoApotema.getLongLado(), objetoNumLadosLongLadoApotema.getApotema())%></h3>

</body>
</html>