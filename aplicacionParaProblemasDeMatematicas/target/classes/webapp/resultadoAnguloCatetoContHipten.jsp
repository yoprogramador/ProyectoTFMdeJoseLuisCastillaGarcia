<%@page import="operacionesTrigonometria.OperacionesTrigonometria"%>
<%@page import="opcionOperacionTrigonometriaUsuario.DosDatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado ángulo agudo, cateto contiguo e hipotenusa </title>
</head>
<body>
				<%
					HttpSession httpSession3 = request.getSession();
							DosDatos objetoDosDatos = (DosDatos)httpSession3.getAttribute("OBJETODOSDATOS");
				%>

					<h3><%=OperacionesTrigonometria.devuelveAnguloCatetoConHipotenusa(objetoDosDatos.getPrimerDato(), objetoDosDatos.getSegundoDato())%></h3>
</body>
</html>