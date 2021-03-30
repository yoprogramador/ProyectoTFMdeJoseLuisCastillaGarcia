<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaLongLadoApotema"%>
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
						HttpSession httpSessionAA = request.getSession();
								AreaLongLadoApotema objetoAreaLongLadoApotema =(AreaLongLadoApotema)httpSessionAA.getAttribute("OBJETOAREALONGLADOAPOTEMA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoNumLadosPoligonoReg(objetoAreaLongLadoApotema.getArea(), objetoAreaLongLadoApotema.getApotema(), objetoAreaLongLadoApotema.getLongLado())%></h3>

</body>
</html>