<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Sumatorio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado del sumatorio</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							Sumatorio objetoSumatorio =(Sumatorio)httpSession8.getAttribute("OBJETOSUMATORIO");
				%>

					<h3><%=OperacionesAritmeticas.sumatorio(objetoSumatorio.getSumatorio())%></h3>

</body>
</html>