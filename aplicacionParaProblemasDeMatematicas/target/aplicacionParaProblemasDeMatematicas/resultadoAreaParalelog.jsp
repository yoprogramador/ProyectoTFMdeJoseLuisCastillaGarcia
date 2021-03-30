<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.BaseYaltura"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área paralelogramo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							BaseYaltura objetoAlturaYarea =(BaseYaltura)httpSession6.getAttribute("OBJETOBASEYALTURA");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoAreaParalelog(objetoAlturaYarea.getBase(), objetoAlturaYarea.getAltura())%></h3>

</body>
</html>