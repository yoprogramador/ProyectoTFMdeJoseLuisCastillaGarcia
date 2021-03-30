<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FocoDirectriz"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cálculo función cuadrática</title>
</head>
<body>
					<%
						HttpSession httpSessionFC = request.getSession();
								FocoDirectriz focoDirectriz = (FocoDirectriz)httpSessionFC.getAttribute("FOCODIRECTRIZ");
					%>

						<h3><%=OperacionesGeometriaAnalitica.calculaFuncionCuadraticaFocoDirectriz(focoDirectriz)%></h3>
						
						
</body>
</html>