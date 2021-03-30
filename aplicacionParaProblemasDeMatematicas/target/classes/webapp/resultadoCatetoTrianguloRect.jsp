<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AlturaHipotenusaYcateto"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado cateto triángulo rectángulo</title>
</head>
<body>
					<%
						HttpSession httpSessionAA = request.getSession();
								AlturaHipotenusaYcateto objetoAlturaHipotenusaYcateto =(AlturaHipotenusaYcateto)httpSessionAA.getAttribute("OBJETOALTURAHIPOTENUSAYCATETO");
					%>

						<h3><%=OperacionesGeometriaEuclidian.calculoCatetoTrianguloRect(objetoAlturaHipotenusaYcateto.getAltura(), objetoAlturaHipotenusaYcateto.getHipotenusa(), objetoAlturaHipotenusaYcateto.getCateto())%></h3>

</body>
</html>