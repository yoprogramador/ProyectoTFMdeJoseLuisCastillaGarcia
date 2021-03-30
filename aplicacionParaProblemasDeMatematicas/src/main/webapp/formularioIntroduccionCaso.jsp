<%@page import="tablaRendimientoAlumnos.ClaveTablaCasos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario introducci�n caso alumno-problema</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaCasos objetoClave = (ClaveTablaCasos) httpSession3.getAttribute("OBJETOCLAVE");
	%>
	
		<%
			if(objetoClave.getClaveTablaCasos().equals("29080665V")){
		%>
			<h3>Introduzca en los siguientes casilleros la informaci�n pertinente al caso alumno-problema</h3>
			<form action="FormularioAlumnoProblemaServlet" method="post">
			Nombre y apellidos del alumno (introduzca como m�ximo 300 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="nombreApellidos" value="">
			<br>
			Clase a la que pertenece al alumno (introducir claves 1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C):<br>
			<input type="text" name="claseAlumno" value="">
			<br>
			Identificador del problema que se le presenta al alumno (introduzca un n�mero como m�ximo de 9 d�gitos):<br>
			<input type="text" name="identificadorProblema" value="">
			<br>
			�xito o no en la resoluci�n del problema (introduzca como m�ximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="exitoResolucion" value="">
			<br>
			Tiempo invertido en resolver el problema con �xito (introduzca como m�ximo 1022 caracteres incluidos espacios en blanco):<br>
			<input type="text" name="tiempoInvertido" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>


		<%
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
			<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
			<form action="DecisionSalirDeLaAplicacionServlet" method="post">
			�Continuar?<br>
			<input type="text" name="decisionSalirOno" value="">
			<br><br>
			</form>
		<%	
			}
		%>	

</body>
</html>