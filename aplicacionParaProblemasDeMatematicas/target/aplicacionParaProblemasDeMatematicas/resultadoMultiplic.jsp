<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Multiplicacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado multiplicación</title>
</head>
<body>
		<%
			HttpSession httpSession5 = request.getSession();
					Multiplicacion multiplicacion =(Multiplicacion)httpSession5.getAttribute("OBJETOMULTIPLICACION");
		%>
		
		<h3><%=OperacionesAritmeticas.multiplicar(multiplicacion.getPrimerFactor(), multiplicacion.getSegundoFactor())%></h3>
		

</body>
</html>