<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Potenciacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultados potenciación</title>
</head>
<body>
				<%
					HttpSession httpSession7 = request.getSession();
							Potenciacion potenciacion =(Potenciacion)httpSession7.getAttribute("OBJETOPOTENCIA");
				%>		

					 <h3><%=OperacionesAritmeticas.potencia(potenciacion.getBase(), potenciacion.getExponente())%></h3>
					 
</body>
</html>