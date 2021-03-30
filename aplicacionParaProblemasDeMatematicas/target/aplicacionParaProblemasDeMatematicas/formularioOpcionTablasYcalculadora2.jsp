<%@page import="opcionEscogidaTablaProblemas.OpcionEscogidaTablaProblemas"%>
<%@page import="opcionTablasYcalculadora.OpcionTablasYcalculadora"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de tablas y calculadora</title>
</head>
<body>
	<%
	HttpSession httpSession = request.getSession();
	OpcionTablasYcalculadora objetoOpcionTablasYcalc = (OpcionTablasYcalculadora) httpSession.getAttribute("OBJETOOPCTABLASYCALC");
	%>
	
	<%
	if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("P")){
	%>
			<%
			HttpSession httpSessionP = request.getSession();
			OpcionEscogidaTablaProblemas objetoTablaProb = (OpcionEscogidaTablaProblemas) httpSession.getAttribute("OBJETOTABLAPROBLEMAS");
			%>
			<%if(objetoTablaProb == null){ %>
			<h2>TABLA DE PROBLEMAS DE MATEM�TICAS</h2>
			<h3>Esta tabla dispone de una serie de campos que se refieren a problemas de matem�ticas</h3>
			<h3>y est� pensada para poder almacenar y gestionar con ella problemas de esta tipo.</h3>
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
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("C")){%>
				<h3>Tabla de problemas de matem�ticas</h3>
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("CA")){%>
				<h3>Escoja el �rea del cual quiere consultar los problemas</h3>
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("CI")){%>
				<h3>Introduzca el identificador que corresponde con el problema que quiere consultar</h3>
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("I")){%>
				<h3>Introduzca en los siguientes campos los datos correspondientes</h3>
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("M")){%>
				<h3>Introduzca el identificador que corresponda con el problema que quiere modificar</h3>
			<%}else if(objetoTablaProb.getOpcionTablaProblemas().equalsIgnoreCase("E")){%>
				<h3>Introduzca el identificador que corresponda con el problema que quiere eliminar</h3>
			<%}else{%>
				<h2>Clave introducida incorrecta.</h2>
			<%}%>
		<%}else if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("R")){
		%>
			<h2>TABLA DE RENDIMIENTO DE LOS ALUMNOS EN LA RESOLUCI�N DE PROBLEMAS</h2>	
		<%}else if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("C")){
		%>
			<h1>CALCULADORA DE OPERACIONES MATEMATICAS</h1>
			<h2>�sta es una calculadora que realiza una serie de c�lculos aritm�ticos y operaciones</h2>
			<h2>de una serie de �reas de las matem�ticas como proporcionalidad, geometr�a anal�tica,</h2>
			<h2>geometr�a euclidiana y combinatoria. Para utilizar la calculadora el usuario deber�</h2>
			<h2>especificar a que �rea pertenece la operaci�n matem�tica que desea realizar, y en cada</h2>
			<h2>operaci�n la calculadora pedir� la introducci�n de los datos correspondientes y</h2>
			<h2>devolver� el valor o los valores buscados.</h2>
			<a href = "OpcionEscogidaParaCalculadoraServlet">Entrar</a>

		<%}else{%>	
			<h2>Clave introducida incorrecta.</h2>
			<h2>Si desea entrar en la tabla de problemas intoduzca en el siguiente casillero la letra P.</h2>
			<h2>Si desea entrar en la tabla de rendimiento de alumnos en la resoluci�n de problemas</h2>
			<h2>introduzca en el casillero la letra R.</h2>
			<h2>Si desea entrar en la calculadora de operaciones matem�ticas introduzca en el casillero</h2>
			<h2>la letra C.</h2>
			   	<form action="GestionOpcionTablasYcalculadora2Servlet" method="post">
			   	Opci�n escogida:<br>
				  <input type="text" name="opcionTablasYcalculadora" value="">
				  <br><br>
				  	  <input type="submit" value="Enviar">
				</form>
		<%} %>
</body>
</html>