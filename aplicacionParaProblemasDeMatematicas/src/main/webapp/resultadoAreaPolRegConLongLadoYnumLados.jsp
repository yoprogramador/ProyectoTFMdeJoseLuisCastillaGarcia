<%@page import="operacionesTrigonometria.OperacionesTrigonometria"%>
<%@page import="opcionOperacionTrigonometriaUsuario.DosDatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado área de polígono regular con longitud de lado y número de lados</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							DosDatos objetoLongLadoYnumLados =(DosDatos)httpSession6.getAttribute("OBJETODOSDATOS");
				%>

					<h3><%=OperacionesTrigonometria.calculaAreaConLongLadoYnumLados(objetoLongLadoYnumLados.getPrimerDato(), objetoLongLadoYnumLados.getSegundoDato())%></h3>

</body>
</html>