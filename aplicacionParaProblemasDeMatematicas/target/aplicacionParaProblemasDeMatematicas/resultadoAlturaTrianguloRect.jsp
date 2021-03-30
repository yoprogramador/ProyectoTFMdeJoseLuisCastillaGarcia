<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.HipotenusaYcatetos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado altura triángulo rectángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								HipotenusaYcatetos objetoHipotenusaYcatetos =(HipotenusaYcatetos)httpSessionAA.getAttribute("OBJETOHIPOTENUSAYCATETOS");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoAlturaTrianguloRect(objetoHipotenusaYcatetos.getHipotenusa(), objetoHipotenusaYcatetos.getCateto1(), objetoHipotenusaYcatetos.getCateto2())%></h3>

</body>
</html>