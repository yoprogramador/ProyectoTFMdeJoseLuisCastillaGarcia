<%@page import="operacionesCombinatoria.OperacionesCombinatoria"%>
<%@page import="opcionOperacionCombinatoriaUsuario.DosDatos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado c�lculo variaciones con repetici�n</title>
</head>
<body>
		<%
			HttpSession httpSession5 = request.getSession();
					DosDatos objetoNyR =(DosDatos)httpSession5.getAttribute("OBJETONYR");
		%>
		
		<h3><%=OperacionesCombinatoria.calculoVariacionesRep(objetoNyR.getN(), objetoNyR.getR())%></h3>

</body>
</html>