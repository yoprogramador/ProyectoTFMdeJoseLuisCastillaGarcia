<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Factorial"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado factorial de número</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
					Factorial objetoNumero =(Factorial)httpSession8.getAttribute("OBJETOFACTORIAL");
				%>

					<h3><%=OperacionesAritmeticas.numeroFactorial(objetoNumero.getNumero())%></h3>

</body>
</html>