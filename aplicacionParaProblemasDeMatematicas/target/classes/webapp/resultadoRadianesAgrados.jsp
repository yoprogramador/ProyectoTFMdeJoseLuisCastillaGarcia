<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.Radianes"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de pasar radianes a grados</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							Radianes objetoRadianes =(Radianes)httpSession6.getAttribute("OBJETORADIANES");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoRadianesAgrados(objetoRadianes.getRadianes())%></h3>

</body>
</html>