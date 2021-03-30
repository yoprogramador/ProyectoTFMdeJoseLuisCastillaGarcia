<%@page import="opcionSalirOcontinuarEnLaAplicacion.DecisionSalirDeLaAplicacion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Decisión salir o no de la aplicación</title>
</head>
<body>
				<%
					HttpSession httpSessionX1 = request.getSession();
							DecisionSalirDeLaAplicacion objetoSalirOnoSalir =(DecisionSalirDeLaAplicacion)httpSessionX1.getAttribute("OBJETOSALIRONOSALIR");
				%>

				<%
					if(objetoSalirOnoSalir.getDecisionSalirOno().equalsIgnoreCase("1")){
				%>
						<h1>Aplicación para problemas de matemáticas</h1>
						<h2>Esta aplicación ofrece al usuario una tabla que contiene enunciados de problemas</h2>
						<h2>de Matemáticas, procedimiento de resolución, y solución, también ofrece otra tabla</h2>
						<h2>donde figuran alumnos, problema que se le propone resolver, éxito o no en resolverlo </h2>
						<h2>y tiempo de resolución, por último ofrece también una calculadora que puede realizar</h2>
						<h2>operaciones aritméticas y otras más especiales relacionadas con diversos campos de</h2>
						<h2>las matemáticas como proporcionalidad, geometría analítica, geometría euclideana y</h2>
						<h2>combinatoria.</h2>
						<h2>La aplicación ofrece a los alumnos la posibilidad de consultar la tabla de problemas</h2>
						<h2>y de utilizar la calculadora, y a los profesores además la posibilidad de gestionar</h2>
						<h2>de forma más completa las dos tablas.</h2>
						<a href="GestionOpcionTablasYcalculadoraServlet">Entrar</a>
						
				<%	
					}else{
				%>
						<h3>Gracias por haber utilizado la aplicación para problemas de Matemáticas</h3>
				<%	
					}
				%>

</body>
</html>