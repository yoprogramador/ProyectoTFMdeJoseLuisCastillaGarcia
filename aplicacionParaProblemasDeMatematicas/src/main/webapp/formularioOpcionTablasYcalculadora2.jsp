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

			<h2>TABLA DE PROBLEMAS DE MATEM�TICAS</h2>
			<h3>Esta tabla dispone de una serie de campos que se refieren a problemas de matem�ticas</h3>
			<h3>y est� pensada para poder almacenar y gestionar con ella problemas de este tipo.</h3>
			<h3>El primer campo contiene el enunciado de un determinado problema.</h3>
			<h3>El segundo campo hace referencia al �rea de matem�ticas al que pertenece dicho problema;</h3>
			<h3>en esta aplicaci�n dichas �reas son aritm�tica, proporcionalidad, �lgebra, geometria anal�tica,</h3>
			<h3>geometr�a euclidiana, combinatoria, estad�stica y trigonometr�a.</h3>
			<h3>El tercer campo contiene una descripci�n del procedimiento de resoluci�n del problema, si un</h3>
			<h3>problema pudiera ser resuelto de varias formas en este campo estar� la forma m�s simple</h3>
			<h3>de resolucion, aunque el profesor podr� incluir, si lo desea, una descripci�n de otras formas</h3>
			<h3>alternativas de resoluci�n.</h3>
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
			<h3>la tabla, al introducir un problema en ella, y por tanto no es necesario rellenarlo por</h3>
			<h3>parte del usuario.</h3>
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

		<%}else if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("R")){
		%>
			<h2>TABLA DE RENDIMIENTO DE LOS ALUMNOS EN LA RESOLUCI�N DE PROBLEMAS</h2>
			<h3>Esta tabla nos ofrece la posibilidad de consultar, para cada alumno de los presentes</h3>
			<h3>en esta tabla, si ha sido capaz de resolver bien un determinado problema, y cuanto</h3>
			<h3>tiempo ha tardado en resolverlo. Esta tabla consta de un primer campo que ser� el nombre</h3>
			<h3>y apellidos del alumno, un segundo campo que ser� el curso y clase al que pertenece, por ejemplo,</h3>
			<h3>primero "c" (1C), un tercer campo que ser� el identificador del problema que se le present� al</h3>
			<h3>alumno. Este identificador corresponde con el identificador que aparece en la tabla de problemas</h3>
			<h3>para especificar cada uno de los problemas que aparecen en esa tabla. Un cuarto campo informar�</h3>
			<h3>de si el alumno supo o no resolver el problema, pudi�ndose especificar ah� la estrategia seguida</h3>
			<h3>por el alumno para resolver con �xito el problema o bien el porqu� del fallo en la resoluci�n,</h3>
			<h3>y un quinto campo informar� de cuanto tiempo le llev� al alumno resolver el problema con �xito.</h3>
			<h3>Si el alumno no pudo resolver el problema con �xito en este campo se debe de especificar este</h3>
			<h3>hecho con la expresi�n "indeterminado".</h3>
			<h3>La tabla adem�s dispone de un identificador para cada caso concreto en el que a un determinado</h3>
			<h3>alumno se le present� un determinado problema.</h3>
			<h3>Ninguno de los campos es obligatorio ser rellenado, aunque es evidente que algunos campos</h3>
			<h3>son fundamentales.</h3>			
			<h3>--Para consultar la tabla de casos alumno-problema entera introduzca en el siguiente</h3>
			<h3>casillero la letra C.</h3>
			<h3>--Para consultar por su identificador un caso concreto, en el que a un determinado alumno se</h3>
			<h3>le present� un determinado problema, introduzca en el siguiente casillero las letras AP.</h3>
			<h3>--Para consultar la tabla de casos alumno-problema s�lo de una determinada clase, por ejemplo,</h3>
			<h3>primero "c" (1C), introduzca las letras CP.</h3>
			<h3>--Para introducir un caso de rendimiento de un alumno con un problema concreto introduzca</h3>
			<h3>la letra I.</h3>
			<h3>--Para modificar los datos de un caso concreto, en el que a un determinado alumno se le</h3>
			<h3>present� un determinado problema, introduzca en el siguiente casillero la letra M.</h3>
			<h3>--Para eliminar alguno de estos casos introduzca en el siguiente casillero la letra E.</h3>
		   	<form action="OpcionEscogidaTablaRendAlumnosServlet" method="post">
		   	Gestion escogida:<br>
			  <input type="text" name="opcionTablaRendAlumnos" value="">
			  <br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
			
		<%}else if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("C")){
		%>
			<h1>CALCULADORA DE OPERACIONES MATEMATICAS</h1>
			<h2>�sta es una calculadora que realiza una serie de c�lculos aritm�ticos y operaciones</h2>
			<h2>de una serie de �reas de las matem�ticas como proporcionalidad, geometr�a anal�tica,</h2>
			<h2>geometr�a euclidiana, combinatoria, estad�stica y trigonometr�a. Para utilizar la calculadora</h2>
			<h2>el usuario deber� especificar a que �rea pertenece la operaci�n matem�tica que desea realizar,</h2>
			<h2>y en cada operaci�n la calculadora pedir� la introducci�n de los datos correspondientes y</h2>
			<h2>devolver� el valor o los valores buscados.</h2>
			<a href = "OpcionEscogidaParaCalculadoraServlet">Entrar</a>

		<%}else{%>	
			<h2>Clave introducida incorrecta.</h2>
			<h2>Si desea entrar en la tabla de problemas intoduzca en el siguiente casillero la letra P.</h2>
			<h2>Si desea entrar en la tabla de rendimiento de alumnos en la resoluci�n de problemas (casos</h2>
			<h2>alumno-problema) introduzca en el casillero la letra R.</h2>
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