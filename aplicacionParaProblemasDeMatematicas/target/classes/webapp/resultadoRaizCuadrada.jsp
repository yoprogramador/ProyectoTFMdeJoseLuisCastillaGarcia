<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.RaizCuadrada"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado raíz cuadrada</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							RaizCuadrada raizCuadrada =(RaizCuadrada)httpSession8.getAttribute("OBJETORAIZ");
				%>

					<h3><%=OperacionesAritmeticas.raizCuadrada(raizCuadrada.getRadicando())%></h3>
					
</body>
</html>