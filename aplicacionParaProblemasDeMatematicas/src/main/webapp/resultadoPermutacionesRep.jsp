<%@page import="operacionesCombinatoria.OperacionesCombinatoria"%>
<%@page import="opcionOperacionCombinatoriaUsuario.UnDato"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo permutaciones con repetición</title>
</head>
<body>
		<%
			HttpSession httpSession5 = request.getSession();
					UnDato objetoUnDato =(UnDato)httpSession5.getAttribute("OBJETORS");
		%>
		
		<h3><%=OperacionesCombinatoria.calculoPermutacionesRep(objetoUnDato.getUnDato())%></h3>

</body>
</html>