<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.ArcoYangulo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud arco</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
					ArcoYangulo	objetoArcoYangulo =(ArcoYangulo)httpSession6.getAttribute("OBJETOARCOYANGULO");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudRadioBis(objetoArcoYangulo.getLongitudArco(), objetoArcoYangulo.getGradosAngulo())%></h3>

</body>
</html>