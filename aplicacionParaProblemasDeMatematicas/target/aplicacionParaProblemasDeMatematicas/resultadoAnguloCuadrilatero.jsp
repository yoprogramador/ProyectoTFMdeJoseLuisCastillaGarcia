<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.TresAngulosCuadrilatero"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado ángulo cuadrilátero conocidos los otros tres ángulos</title>
</head>
<body>
				<%
					HttpSession httpSession3 = request.getSession();
							TresAngulosCuadrilatero objetoTresAngCuadril = (TresAngulosCuadrilatero)httpSession3.getAttribute("OBJETO3ANGULOSCUADRILATERO");
				%>
				
					<h3><%=OperacionesGeometriaEuclidian.calculoAnguloCuadrilatero(objetoTresAngCuadril.getAngulo1(), objetoTresAngCuadril.getAngulo2(), objetoTresAngCuadril.getAngulo3()) %></h3>

</body>
</html>