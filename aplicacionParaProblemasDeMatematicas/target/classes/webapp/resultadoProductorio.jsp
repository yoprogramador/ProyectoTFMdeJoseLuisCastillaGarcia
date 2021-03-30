<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Productorio"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado del productorio</title>
</head>
<body>
				<%
					HttpSession httpSession8 = request.getSession();
							Productorio objetoProductorio =(Productorio)httpSession8.getAttribute("OBJETOPRODUCTORIO");
				%>

					<h3><%=OperacionesAritmeticas.productorio(objetoProductorio.getProductorio())%></h3>

</body>
</html>