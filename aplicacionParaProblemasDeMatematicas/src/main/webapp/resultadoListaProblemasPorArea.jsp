<%@page import="tablaProblemas.ProblemasDao"%>
<%@page import="java.util.List"%>
<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="tablaProblemas.ClaveAreaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado lista problemas por área</title>
</head>
<body>
	<%
	HttpSession httpSession3 = request.getSession();
	ClaveAreaProblemas objetoClaveArea = (ClaveAreaProblemas) httpSession3.getAttribute("OBJETOCLAVEAREA");
	if(objetoClaveArea.getAreaProblemas().equalsIgnoreCase("A")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("AL")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("GA")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("P")
       ||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("GE")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("C")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("E")||objetoClaveArea.getAreaProblemas().equalsIgnoreCase("T")){
			TablaProblemasDatasource.makeJDBCConnection();
			List<ProblemasDao> listaProblemasPorArea = TablaProblemasDatasource.getProblemasByArea(objetoClaveArea.getAreaProblemas());
			for(ProblemasDao problema : listaProblemasPorArea){%>
			<h3>El identificador del problema es :&nbsp<%=problema.getId() %></h3>
			<h3>El enunciado del problema es :&nbsp<%=problema.getEnunciadoDelProblema() %></h3>
			<h3>El área al que pertenece el problema es :&nbsp<%=problema.getAreaDelProblema() %></h3>
			<h3>El procedimiento de resolución del problema es :&nbsp<%=problema.getProcedimientoResolucion() %></h3>
			<h3>La solución del problema es :&nbsp<%=problema.getSolucionProblema() %></h3>
			<h3>El porcentaje de resolución del problema es :&nbsp<%=problema.getPorcentajeDeResolucion() %></h3>
			<h3>El tiempo medio invertido en resolver el problema es :&nbsp<%=problema.getTiempoMedioMinutosInvertidoEnProblema() %></h3>
			<h3>=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0</h3>
			<%
			}
			%>
			<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
			<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			¿Continuar?
			<input type="text" name="decisionSalirOno" value="">
						<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
			
	<%
	}else{
	%>
		<h3>La clave introducida para determinar el área al que pertenece la lista de problemas que se desea</h3>
		<h3>consultar es incorrecta.</h3>
		<h3>Para consultar un listado de problemas por su área introduzca en el siguiente</h3>
		<h3>casillero la clave del área al que pertenecen los problemas. </h3>
		<h3>--Para consultar el listado de problemas de Aritmética introduzca la clave A.</h3>
		<h3>--Para consultar el listado de problemas de Álgebra introduzca la clave AL.</h3>
		<h3>--Para consultar el listado de problemas de Geometría Analítica introduzca la </h3>
		<h3>clave GA.</h3>
		<h3>--Para consultar el listado de problemas de Proporcionalidad introduzca la clave P.</h3>
		<h3>--Para consultar el listado de problemas de Geometría Euclidiana introduzca la</h3>
		<h3>clave GE.</h3>
		<h3>--Para consultar el listado de problemas de Combinatoria introduzca la clave C.</h3>
		<h3>--Para consultar el listado de problemas de Estadística introduzca la clave E.</h3>
		<h3>--Para consultar el listado de problemas de Trigonometría introduzca la clave T.</h3>
			<form action="ClaveAreaProblemaServlet" method="post">
			Clave del área:<br>
			<input type="text" name="claveArea" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>	
	
	<%
	}
	%>
</body>
</html>