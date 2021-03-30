<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado del cálculo de recta</title>
</head>
<body>
			       <%
				       	HttpSession httpSessionB = request.getSession();
				       			CoordenadasDosPuntos coordenadasDosPuntos =(CoordenadasDosPuntos)httpSessionB.getAttribute("COORDENADASDOSPUNTOS");
				   %>
				   
				   		<h3><%=OperacionesGeometriaAnalitica.calculaEcuacionRecta(coordenadasDosPuntos)%></h3>
				   		
				   		

</body>
</html>