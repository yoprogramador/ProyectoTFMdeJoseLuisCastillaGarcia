<%@page import="tablaRendimientoAlumnos.ClaveTablaCasos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario introducción caso alumno-problema</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaCasos objetoClave = (ClaveTablaCasos) httpSession3.getAttribute("OBJETOCLAVE");
	%>
	
		<%
			if(objetoClave.getClaveTablaCasos().equals("29080665V")){
		%>
			<h3>Introduzca en los siguientes casilleros la información pertinente al caso alumno-problema</h3>
			<form action="FormularioAlumnoProblemaServlet" method="post">
			Nombre y apellidos del alumno (introduzca como máximo 300 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="nombreApellidos" value="">
			<br>
			Clase a la que pertenece al alumno (introducir claves 1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C):<br>
			<input type="text" name="claseAlumno" value="">
			<br>
			Identificador del problema que se le presenta al alumno (introduzca un número como máximo de 9 dígitos):<br>
			<input type="text" name="identificadorProblema" value="">
			<br>
			Éxito o no en la resolución del problema (introduzca como máximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="exitoResolucion" value="">
			<br>
			Tiempo invertido en resolver el problema con éxito (introduzca como máximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="tiempoInvertido" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>


		<%
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
			<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			¿Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>
		<%	
			}
		%>	

</body>
</html>