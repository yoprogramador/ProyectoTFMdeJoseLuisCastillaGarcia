<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.Cateto1yCateto2"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud hipotenusa</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							Cateto1yCateto2 objetoCateto1yCateto2 =(Cateto1yCateto2)httpSession6.getAttribute("OBJETOCATETO1YCATETO2");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudHipotenusa(objetoCateto1yCateto2.getCateto1(), objetoCateto1yCateto2.getCateto2())%></h3>

</body>
</html>