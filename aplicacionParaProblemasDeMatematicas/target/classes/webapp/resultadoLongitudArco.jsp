<%@page import="operacionesGeometriaEuclidiana.OperacionesGeometriaEuclidian"%>
<%@page import="opcionOperacionGeometriaEuclidianaUsuario.AnguloYradio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado longitud arco</title>
</head>
<body>
				<%
					HttpSession httpSession6 = request.getSession();
							AnguloYradio objetoAnguloYradio =(AnguloYradio)httpSession6.getAttribute("OBJETOANGULOYRADIO");
				%>

					<h3><%=OperacionesGeometriaEuclidian.calculoLongitudArco(objetoAnguloYradio.getGradosAngulo(), objetoAnguloYradio.getLongitudRadio())%></h3>

</body>
</html>