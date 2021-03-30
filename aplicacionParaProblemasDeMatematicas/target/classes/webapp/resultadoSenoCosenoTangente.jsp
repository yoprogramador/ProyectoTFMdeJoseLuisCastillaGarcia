<%@page import="operacionesTrigonometria.OperacionesTrigonometria"%>
<%@page import="opcionOperacionTrigonometriaUsuario.TresDatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo seno, coseno y tangente</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							TresDatos objetoTresDatos =(TresDatos)httpSession8.getAttribute("OBJETOTRESDATOS");
				%>
				
					<h3><%=OperacionesTrigonometria.calculaSenoCosenoTangente(objetoTresDatos.getPrimerDato(), objetoTresDatos.getSegundoDato(), objetoTresDatos.getTercerDato()) %></h3>
</body>
</html>