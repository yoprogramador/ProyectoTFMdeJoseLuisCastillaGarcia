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
<title>Resultado lista problemas por �rea</title>
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
			<h3>El �rea al que pertenece el problema es :&nbsp<%=problema.getAreaDelProblema() %></h3>
			<h3>El procedimiento de resoluci�n del problema es :&nbsp<%=problema.getProcedimientoResolucion() %></h3>
			<h3>La soluci�n del problema es :&nbsp<%=problema.getSolucionProblema() %></h3>
			<h3>El porcentaje de resoluci�n del problema es :&nbsp<%=problema.getPorcentajeDeResolucion() %></h3>
			<h3>El tiempo medio invertido en resolver el problema es :&nbsp<%=problema.getTiempoMedioMinutosInvertidoEnProblema() %></h3>
			<h3>=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0</h3>
			<%
			}
			%>
			<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
			<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			�Continuar?
			<input type="text" name="decisionSalirOno" value="">
						<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
			
	<%
	}else{
	%>
		<h3>La clave introducida para determinar el �rea al que pertenece la lista de problemas que se desea</h3>
		<h3>consultar es incorrecta.</h3>
		<h3>Para consultar un listado de problemas por su �rea introduzca en el siguiente</h3>
		<h3>casillero la clave del �rea al que pertenecen los problemas. </h3>
		<h3>--Para consultar el listado de problemas de Aritm�tica introduzca la clave A.</h3>
		<h3>--Para consultar el listado de problemas de �lgebra introduzca la clave AL.</h3>
		<h3>--Para consultar el listado de problemas de Geometr�a Anal�tica introduzca la </h3>
		<h3>clave GA.</h3>
		<h3>--Para consultar el listado de problemas de Proporcionalidad introduzca la clave P.</h3>
		<h3>--Para consultar el listado de problemas de Geometr�a Euclidiana introduzca la</h3>
		<h3>clave GE.</h3>
		<h3>--Para consultar el listado de problemas de Combinatoria introduzca la clave C.</h3>
		<h3>--Para consultar el listado de problemas de Estad�stica introduzca la clave E.</h3>
		<h3>--Para consultar el listado de problemas de Trigonometr�a introduzca la clave T.</h3>
			<form action="ClaveAreaProblemaServlet" method="post">
			Clave del �rea:<br>
			<input type="text" name="claveArea" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>	
	
	<%
	}
	%>
</body>
</html>