<%@page import="tablaProblemas.ProblemasDao"%>
<%@page import="java.util.List"%>
<%@page import="tablaProblemas.TablaProblemasDatasource"%>
<%@page import="opcionEscogidaTablaProblemas.OpcionEscogidaTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario tabla problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		OpcionEscogidaTablaProblemas objetoOpcionTablaProblemas = (OpcionEscogidaTablaProblemas) httpSession3.getAttribute("OBJETOTABLAPROBLEMAS");
	%>
	
		<%
			if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("I")){
		%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para introducir un problema en la tabla de problemas introduzca primero la clave</h3>
			<h3>necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaProblemasServlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>

		<%
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("CI")){
		%>
			<h3>Para consultar un problema por su identificador introduzca en el siguiente</h3>
			<h3>casillero el identificador del problema a consultar</h3>
			<form action="IdentificadorProblemaServlet" method="post">
			Identificador problema:<br>
			<input type="text" name="identificadorDelProblema" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>

		<%
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("CA")){
		%>	
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
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("C")){
		
			TablaProblemasDatasource.makeJDBCConnection();
			List<ProblemasDao> tablaProblemas = TablaProblemasDatasource.getDataFromDB();
				for(ProblemasDao problema : tablaProblemas){%>
					<h3>El identificador del problema es :&nbsp <%=problema.getId() %></h3>
					<h3>El enunciado del problema es :&nbsp <%=problema.getEnunciadoDelProblema() %></h3>
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
			¿Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>			
			
			<%	
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("M")){
			%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para modificar el contenido de algún campo en algún problema de la tabla de problemas</h3>
			<h3>introduzca primero la clave necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaProblemas2Servlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
			
			<%
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("E")){
			%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para eliminar un problema de la tabla de problemas introduzca primero la</h3>
			<h3>clave necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaProblemas3Servlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
			
			<%
			}else{
			%>
			<h3>Clave introducida incorrecta para gestionar la tabla de problemas de matemáticas.</h3>
			<h3>Esta tabla dispone de una serie de campos que se refieren a problemas de matemáticas</h3>
			<h3>y está pensada para poder almacenar y gestionar con ella problemas de este tipo.</h3>
			<h3>El primer campo contiene el enunciado de un determinado problema.</h3>
			<h3>El segundo campo hace referencia al área de matemáticas al que pertenece dicho problema.</h3>
			<h3>El tercer campo contiene una descripción del procedimiento de resolución del problema, si un</h3>
			<h3>problema pudiera ser resuelto de varias formas en este campo estará la forma más simple</h3>
			<h3>de resolucion.</h3>
			<h3>El cuarto campo contendrá la solución del problema.</h3>
			<h3>El quinto campo contiene el porcentaje de alumnos que consiguieron resolver el problema</h3>
			<h3>del total de alumnos a los que se les presentó el desafío.</h3>
			<h3>El sexto campo hace referencia al promedio del tiempo invertido por el alumno en resolver</h3>
			<h3>el problema.</h3>
			<h3>Ninguno de los campos es obligatorio ser rellenado, aunque es evidente que algunos campos</h3>
			<h3>son fundamentales.</h3>
			<h3>La tabla además dispone de un identificador para cada problema que consiste en un número</h3>
			<h3>único y exclusivo para ese problema, y que puede ser utilizado por el usuario para poder</h3>
			<h3>buscar expresamente un problema y consultarlo. Este campo se genera automáticamente por</h3>
			<h3>la tabla y por tanto no es necesario rellenarlo.</h3>
			<h3>--Para consultar la tabla de problemas entera introduzca en el siguiente casillero la letra C</h3>
			<h3>--Para consultar los problemas por áreas introduzca las letras CA</h3>
			<h3>--Para consultar un problema por su identificador introduzca la letra CI</h3>
			<h3>--Para introducir un problema en la tabla introduzca a letra I</h3>
			<h3>--Para modificar un problema ya existente en la tabla introduzca la letra M</h3>
			<h3>--Para eliminar de la tabla un problema introduzca la letra E</h3>
		   	<form action="OpcionEscogidaTablaProblemasServlet" method="post">
		   	Gestion escogida:<br>
			  <input type="text" name="opcionTablaProblemas" value="">
			  <br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
				
		<%
			}
		%>

</body>
</html>