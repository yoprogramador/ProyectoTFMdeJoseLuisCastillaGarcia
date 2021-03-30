<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AreaNumLadosApotema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud lado polígono regular</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								AreaNumLadosApotema objetoAreaNumLadosApotema =(AreaNumLadosApotema)httpSessionAA.getAttribute("OBJETOAREANUMLADOSAPOTEMA");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoLongitudLadoPoligonoReg(objetoAreaNumLadosApotema.getArea(), objetoAreaNumLadosApotema.getApotema(), objetoAreaNumLadosApotema.getNumLados())%></h3>

</body>
</html>