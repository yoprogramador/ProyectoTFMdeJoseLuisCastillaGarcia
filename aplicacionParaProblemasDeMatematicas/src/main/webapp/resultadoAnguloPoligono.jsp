<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AngulosPoligono"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo de un ángulo de un polígono</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
					AngulosPoligono	objetoNumeroDeLados = (AngulosPoligono)httpSession6.getAttribute("OBJETOANGULOSPOLIG");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculaAnguloPoligConvexo(objetoNumeroDeLados.getAngulosPoligono())%></h3>

</body>
</html>