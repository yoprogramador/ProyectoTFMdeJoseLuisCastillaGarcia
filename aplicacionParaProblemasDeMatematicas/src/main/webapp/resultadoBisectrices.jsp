<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo bisectrices</title>
</head>
<body>
				<%
					HttpSession httpSessionBB = request.getSession();
						EcuacionesDosRectas ecuacionesDosRectas = (EcuacionesDosRectas)httpSessionBB.getAttribute("ECUACIONESDOSRECTAS");
				%>

						<h3><%=OperacionesGeometriaAnalitica.bisectrices(ecuacionesDosRectas)%></h3>
						
						
</body>
</html>