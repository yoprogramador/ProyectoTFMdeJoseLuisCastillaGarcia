<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.DosAngulosTriangulo"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado ángulo triángulo conocidos los otros dos ángulos</title>
</head>
<body>
				<%
					HttpSession httpSession3 = request.getSession();
							DosAngulosTriangulo objetoDosAngTriang = (DosAngulosTriangulo)httpSession3.getAttribute("OBJETO2ANGULOSTRIANGULO");
				%>
				
			<h3><%=OperacionesGeometriaEuclidian.calculoAnguloTriangulo(objetoDosAngTriang.getAngulo1(), objetoDosAngTriang.getAngulo2())%></h3>

</body>
</html>