<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AlturaYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado base paralelogramo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							AlturaYarea objetoAlturaYarea =(AlturaYarea)httpSession6.getAttribute("OBJETOALTURAYAREA");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoBaseParalelog(objetoAlturaYarea.getArea(), objetoAlturaYarea.getAltura())%></h3>

</body>
</html>