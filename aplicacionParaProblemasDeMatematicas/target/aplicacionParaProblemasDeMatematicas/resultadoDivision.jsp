<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Division"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado division</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							Division division =(Division)httpSession6.getAttribute("OBJETODIVISION");
				%>

					<h3><%=OperacionesAritmeticas.dividir(division.getNumerador(), division.getDenominador())%></h3>
					
</body>
</html>