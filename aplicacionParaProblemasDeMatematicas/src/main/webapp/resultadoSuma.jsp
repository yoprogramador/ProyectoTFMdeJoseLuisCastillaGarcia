<%@page import="opcionSalirOcontinuarEnLaAplicacion.DecisionSalirDeLaAplicacion"%>
<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Suma"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado suma</title>
</head>
<body>
				<%
					HttpSession httpSession3 = request.getSession();
							Suma suma = (Suma)httpSession3.getAttribute("OBJETOSUMA");
				%>
				
			<h3><%=OperacionesAritmeticas.sumar(suma.getPrimerSumando(), suma.getSegundoSumando())%></h3>
			
				
			
</body>
</html>