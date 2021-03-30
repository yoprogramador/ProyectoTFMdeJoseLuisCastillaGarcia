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

			<h2>TABLA DE PROBLEMAS DE MATEMÁTICAS</h2>
			<h3>Esta tabla dispone de una serie de campos que se refieren a problemas de matemáticas</h3>
			<h3>y está pensada para poder almacenar y gestionar con ella problemas de este tipo.</h3>
			<h3>El primer campo contiene el enunciado de un determinado problema.</h3>
			<h3>El segundo campo hace referencia al área de matemáticas al que pertenece dicho problema;</h3>
			<h3>en esta aplicación dichas áreas son aritmética, proporcionalidad, álgebra, geometria analítica,</h3>
			<h3>geometría euclidiana, combinatoria, estadística y trigonometría.</h3>
			<h3>El tercer campo contiene una descripción del procedimiento de resolución del problema, si un</h3>
			<h3>problema pudiera ser resuelto de varias formas en este campo estará la forma más simple</h3>
			<h3>de resolucion, aunque el profesor podrá incluir, si lo desea, una descripción de otras formas</h3>
			<h3>alternativas de resolución.</h3>
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
			<h3>la tabla, al introducir un problema en ella, y por tanto no es necesario rellenarlo por</h3>
			<h3>parte del usuario.</h3>
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

		<%}else if(objetoOpcionTablasYcalc.getOpcionTablasYcalculadora().equalsIgnoreCase("R")){
		%>
			<h2>TABLA DE RENDIMIENTO DE LOS ALUMNOS EN LA RESOLUCIÓN DE PROBLEMAS</h2>
			<h3>Esta tabla nos ofrece la posibilidad de consultar, para cada alumno de los presentes</h3>
			<h3>en esta tabla, si ha sido capaz de resolver bien un determinado problema, y cuanto</h3>
			<h3>tiempo ha tardado en resolverlo. Esta tabla consta de un primer campo que será el nombre</h3>
			<h3>y apellidos del alumno, un segundo campo que será el curso y clase al que pertenece, por ejemplo,</h3>
			<h3>primero "c" (1C), un tercer campo que será el identificador del problema que se le presentó al</h3>
			<h3>alumno. Este identificador corresponde con el identificador que aparece en la tabla de problemas</h3>
			<h3>para especificar cada uno de los problemas que aparecen en esa tabla. Un cuarto campo informará</h3>
			<h3>de si el alumno supo o no resolver el problema, pudiéndose especificar ahí la estrategia seguida</h3>
			<h3>por el alumno para resolver con éxito el problema o bien el porqué del fallo en la resolución,</h3>
			<h3>y un quinto campo informará de cuanto tiempo le llevó al alumno resolver el problema con éxito.</h3>
			<h3>Si el alumno no pudo resolver el problema con éxito en este campo se debe de especificar este</h3>
			<h3>hecho con la expresión "indeterminado".</h3>
			<h3>La tabla además dispone de un identificador para cada caso concreto en el que a un determinado</h3>
			<h3>alumno se le presentó un determinado problema.</h3>
			<h3>Ninguno de los campos es obligatorio ser rellenado, aunque es evidente que algunos campos</h3>
			<h3>son fundamentales.</h3>			
			<h3>--Para consultar la tabla de casos alumno-problema entera introduzca en el siguiente</h3>
			<h3>casillero la letra C.</h3>
			<h3>--Para consultar por su identificador un caso concreto, en el que a un determinado alumno se</h3>
			<h3>le presentó un determinado problema, introduzca en el siguiente casillero las letras AP.</h3>
			<h3>--Para consultar la tabla de casos alumno-problema sólo de una determinada clase, por ejemplo,</h3>
			<h3>primero "c" (1C), introduzca las letras CP.</h3>
			<h3>--Para introducir un caso de rendimiento de un alumno con un problema concreto introduzca</h3>
			<h3>la letra I.</h3>
			<h3>--Para modificar los datos de un caso concreto, en el que a un determinado alumno se le</h3>
			<h3>presentó un determinado problema, introduzca en el siguiente casillero la letra M.</h3>
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
			<h2>Ésta es una calculadora que realiza una serie de cálculos aritméticos y operaciones</h2>
			<h2>de una serie de áreas de las matemáticas como proporcionalidad, geometría analítica,</h2>
			<h2>geometría euclidiana, combinatoria, estadística y trigonometría. Para utilizar la calculadora</h2>
			<h2>el usuario deberá especificar a que área pertenece la operación matemática que desea realizar,</h2>
			<h2>y en cada operación la calculadora pedirá la introducción de los datos correspondientes y</h2>
			<h2>devolverá el valor o los valores buscados.</h2>
			<a href = "OpcionEscogidaParaCalculadoraServlet">Entrar</a>

		<%}else{%>	
			<h2>Clave introducida incorrecta.</h2>
			<h2>Si desea entrar en la tabla de problemas intoduzca en el siguiente casillero la letra P.</h2>
			<h2>Si desea entrar en la tabla de rendimiento de alumnos en la resolución de problemas (casos</h2>
			<h2>alumno-problema) introduzca en el casillero la letra R.</h2>
			<h2>Si desea entrar en la calculadora de operaciones matemáticas introduzca en el casillero</h2>
			<h2>la letra C.</h2>
			   	<form action="GestionOpcionTablasYcalculadora2Servlet" method="post">
			   	Opción escogida:<br>
				  <input type="text" name="opcionTablasYcalculadora" value="">
				  <br><br>
				  	  <input type="submit" value="Enviar">
				</form>
		<%} %>
</body>
</html>