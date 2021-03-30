<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado distancia entre dos rectas</title>
</head>
<body>
					<%
						HttpSession httpSessionDR = request.getSession();
								EcuacionesDosRectas ecuacionesDosRectas = (EcuacionesDosRectas)httpSessionDR.getAttribute("ECUACIONESDOSRECTAS");
					%>
						<h3><%=OperacionesGeometriaAnalitica.distanciaRectasParalelas(ecuacionesDosRectas)%></h3>
						
						
</body>
</html>