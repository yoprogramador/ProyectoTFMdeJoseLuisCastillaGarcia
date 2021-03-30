<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.Grados"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado de pasar grados a radianes</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							Grados objetoGrados =(Grados)httpSession6.getAttribute("OBJETOGRADOS");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoGradosAradianes(objetoGrados.getGrados())%></h3>

</body>
</html>