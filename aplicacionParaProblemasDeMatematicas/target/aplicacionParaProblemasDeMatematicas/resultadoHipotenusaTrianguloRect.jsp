<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AlturaYcatetos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado hipotenusa triángulo rectángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								AlturaYcatetos objetoHipotenusaYcatetos =(AlturaYcatetos)httpSessionAA.getAttribute("OBJETOALTURAYCATETOS");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoHipotenusaTrianguloRect(objetoHipotenusaYcatetos.getAltura(), objetoHipotenusaYcatetos.getCateto1(), objetoHipotenusaYcatetos.getCateto2())%></h3>

</body>
</html>