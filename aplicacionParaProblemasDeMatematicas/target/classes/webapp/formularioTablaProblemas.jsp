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
			<h3>Este servicio est� dirigido fundamentalmente a profesores.</h3>
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
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("C")){
		
			TablaProblemasDatasource.makeJDBCConnection();
			List<ProblemasDao> tablaProblemas = TablaProblemasDatasource.getDataFromDB();
				for(ProblemasDao problema : tablaProblemas){%>
					<h3>El identificador del problema es :&nbsp <%=problema.getId() %></h3>
					<h3>El enunciado del problema es :&nbsp <%=problema.getEnunciadoDelProblema() %></h3>
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
			�Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>			
			
			<%	
			}else if(objetoOpcionTablaProblemas.getOpcionTablaProblemas().equalsIgnoreCase("M")){
			%>
			<h3>Este servicio est� dirigido fundamentalmente a profesores.</h3>
			<h3>Para modificar el contenido de alg�n campo en alg�n problema de la tabla de problemas</h3>
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
			<h3>Este servicio est� dirigido fundamentalmente a profesores.</h3>
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
			<h3>Clave introducida incorrecta para gestionar la tabla de problemas de matem�ticas.</h3>
			<h3>Esta tabla dispone de una serie de campos que se refieren a problemas de matem�ticas</h3>
			<h3>y est� pensada para poder almacenar y gestionar con ella problemas de este tipo.</h3>
			<h3>El primer campo contiene el enunciado de un determinado problema.</h3>
			<h3>El segundo campo hace referencia al �rea de matem�ticas al que pertenece dicho problema.</h3>
			<h3>El tercer campo contiene una descripci�n del procedimiento de resoluci�n del problema, si un</h3>
			<h3>problema pudiera ser resuelto de varias formas en este campo estar� la forma m�s simple</h3>
			<h3>de resolucion.</h3>
			<h3>El cuarto campo contendr� la soluci�n del problema.</h3>
			<h3>El quinto campo contiene el porcentaje de alumnos que consiguieron resolver el problema</h3>
			<h3>del total de alumnos a los que se les present� el desaf�o.</h3>
			<h3>El sexto campo hace referencia al promedio del tiempo invertido por el alumno en resolver</h3>
			<h3>el problema.</h3>
			<h3>Ninguno de los campos es obligatorio ser rellenado, aunque es evidente que algunos campos</h3>
			<h3>son fundamentales.</h3>
			<h3>La tabla adem�s dispone de un identificador para cada problema que consiste en un n�mero</h3>
			<h3>�nico y exclusivo para ese problema, y que puede ser utilizado por el usuario para poder</h3>
			<h3>buscar expresamente un problema y consultarlo. Este campo se genera autom�ticamente por</h3>
			<h3>la tabla y por tanto no es necesario rellenarlo.</h3>
			<h3>--Para consultar la tabla de problemas entera introduzca en el siguiente casillero la letra C</h3>
			<h3>--Para consultar los problemas por �reas introduzca las letras CA</h3>
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