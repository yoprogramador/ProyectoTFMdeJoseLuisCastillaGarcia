<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.DosDiagonales"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área rombo</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							DosDiagonales objetoDosDiagonales =(DosDiagonales)httpSession6.getAttribute("OBJETODOSDIAGONALES");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoAreaRombo(objetoDosDiagonales.getDiagonalMayor(), objetoDosDiagonales.getDiagonalMenor())%></h3>

</body>
</html>