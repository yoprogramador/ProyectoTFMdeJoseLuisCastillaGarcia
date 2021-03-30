<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BaseYarea"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado altura paralelogramo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							BaseYarea objetoAlturaYarea =(BaseYarea)httpSession6.getAttribute("OBJETOBASEYAREA");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoAlturaParalelog(objetoAlturaYarea.getArea(), objetoAlturaYarea.getBase())%></h3>

</body>
</html>