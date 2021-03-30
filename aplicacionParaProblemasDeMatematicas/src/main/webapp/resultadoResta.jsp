<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Resta"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado resta</title>
</head>
<body>
	<%
		HttpSession httpSession4 = request.getSession();
		Resta resta =(Resta)httpSession4.getAttribute("OBJETORESTA");
	%>	
	
	<h3><%=OperacionesAritmeticas.restar(resta.getMinuendo(), resta.getSustraendo())%></h3>

</body>
</html>