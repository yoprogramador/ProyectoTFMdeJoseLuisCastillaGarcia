<%@page import="tablaRendimientoAlumnos.RendimientoAlumnosDAO"%>
<%@page import="java.util.List"%>
<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaRendimientoAlumnos.OpcionEscogidaTablaRendAlumnos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario tabla de rendimiento de alumnos</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		OpcionEscogidaTablaRendAlumnos objetoOpcionTablaRendAlumnos = (OpcionEscogidaTablaRendAlumnos) httpSession3.getAttribute("OBJETOOPCIONTABLARENDALUMNOS");
	%>
	
		<%
			if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("C")){
				TablaRendAlumnosDatasource.makeJDBCConnection();
				List<RendimientoAlumnosDAO> tablaRendAlumnos = TablaRendAlumnosDatasource.getDataFromDB();
					for(RendimientoAlumnosDAO rendAlumno : tablaRendAlumnos){%>
						<h3>Identificador del caso alumno-problema :&nbsp <%=rendAlumno.getId()%></h3>
						<h3>Nombre y apellidos del alumno :&nbsp <%=rendAlumno.getNombreApellidos()%></h3>
						<h3>Clase a la que pertenece el alumno :&nbsp <%=rendAlumno.getClase()%></h3>
						<h3>Identificador del problema presentado al alumno :&nbsp <%=rendAlumno.getIdProblema()%></h3>
						<h3>Éxito o no en la resolución del problema :&nbsp <%=rendAlumno.getExitoResolucion()%></h3>
						<h3>Tiempo invertido en resolver el problema :&nbsp <%=rendAlumno.getTiempoResolucion()%></h3>
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
			}else if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("AP")){
		%>
			<h3>Para consultar un caso alumno-problema por su identificador introduzca en el</h3>
			<h3>siguiente casillero el identificador del caso a consultar</h3>
			<form action="IdentificadorCasoAlumnoProblemaServlet" method="post">
			Identificador del caso alumno-problema:<br>
			<input type="text" name="identificadorDelCaso" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
		
		<%
			}else if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("CP")){
		%>
			<h3>Para consultar un listado de casos alumno-problema por la clase a la que pertenecen los alumnos</h3>
			<h3>introduzca en el siguiente casillero la clase a la que pertenecen los alumnos (1A, 1B, 1C,</h3>
			<h3>2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C)</h3>
			<form action="ClaveClaseAlumnosServlet" method="post">
			Clase:<br>
			<input type="text" name="claveClase" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
		
		<%
			}else if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("I")){
		%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para introducir un caso alumno-problema en la tabla de casos introduzca primero la clave</h3>
			<h3>necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaCasosServlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
		
		<%
			}else if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("M")){
		%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para modificar un caso alumno-problema en la tabla de casos introduzca primero la clave</h3>
			<h3>necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaCasos2Servlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
		
		<%
			}else if(objetoOpcionTablaRendAlumnos.getOpcionTablaRendAlumnos().equalsIgnoreCase("E")){
		%>
			<h3>Este servicio está dirigido fundamentalmente a profesores.</h3>
			<h3>Para eliminar un caso alumno-problema en la tabla de casos introduzca primero la clave</h3>
			<h3>necesaria para poder tener acceso a este servicio</h3>
			<form action="ClaveTablaCasos3Servlet" method="post">
			Clave:<br>
			<input type="password" name="password" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>
		
		<%
			}else{
		%>
			<h3>Clave introducida incorrecta para gestionar la tabla de casos problema-alumno.</h3>
			<h3>Esta tabla nos ofrece la posibilidad de consultar, para cada alumno de los presentes</h3>
			<h3>en esta tabla, si ha sido capaz de resolver bien un determinado problema, y cuanto</h3>
			<h3>tiempo ha tardado en resolverlo. Esta tabla consta de un primer campo que será el nombre</h3>
			<h3>y apellidos del alumno, un segundo campo que será el curso al que pertenece, un tercer</h3>
			<h3>campo que será el identificador del problema que se le presentó al alumno. Este identificador</h3>
			<h3>corresponde con el identificador que aparece en la tabla de problemas para espedificar</h3>
			<h3>cada uno de los problemas que aparecen en esa tabla. Un cuarto campo informará de si el</h3>
			<h3>alumno supo o no resolver el problema, pudiéndose especificar ahí el porqué del fallo</h3>
			<h3>en la resolución del problema presentado, y un quinto campo informará de cuanto tiempo le</h3>
			<h3>llevó al alumno en resolver el problema con éxito. Si el alumno no pudo resolver el</h3>
			<h3>problema con éxito en este campo se debe de especificar este hecho con la expresión</h3>
			<h3>"indeterminado".</h3>
			<h3>La tabla además dispone de un identificador para cada caso concreto en el que a un determinado</h3>
			<h3>alumno se le presentó un determinado problema.</h3>
			<h3>--Para consultar la tabla de rendimiento de alumnos entera introduzca en el siguiente</h3>
			<h3>casillero la letra C</h3>
			<h3>--Para consultar un caso concreto, en el que a un determinado alumno se le presentó un</h3>
			<h3>determinado problema, introduzca en el siguiente casillero las letras AP </h3>
			<h3>--Para consultar la tabla de rendimiento de alumnos sólo de una determinada clase introduzca</h3>
			<h3>las letras CP</h3>
			<h3>--Para introducir un caso de rendimiento de un alumno con un problema concreto introduzca</h3>
			<h3>--la letra I</h3>
			<h3>--Para modificar los datos de un caso concreto, en el que a un determinado alumno se le</h3>
			<h3>presentó un determinado problema, introduzca en el siguiente casillero la letra M</h3>
			<h3>--Para eliminar alguno de estos casos introduzca en el siguiente casillero la letra E</h3>
		   	<form action="OpcionEscogidaTablaRendAlumnosServlet" method="post">
		   	Gestion escogida:<br>
			  <input type="text" name="opcionTablaRendAlumnos" value="">
			  <br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
			
		<%
			}
		%>

</body>
</html>