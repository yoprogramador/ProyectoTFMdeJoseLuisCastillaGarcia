<%@page import="java.sql.SQLException"%>
<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaRendimientoAlumnos.RendimientoAlumnosDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado insertar caso alumno-problema</title>
</head>
<body>
<%
	HttpSession httpSession3 = request.getSession();
	RendimientoAlumnosDAO casoAlumnoProblema = (RendimientoAlumnosDAO) httpSession3.getAttribute("OBJETOCASO");
	if(casoAlumnoProblema.getClase().equalsIgnoreCase("1A")||casoAlumnoProblema.getClase().equalsIgnoreCase("1B")||casoAlumnoProblema.getClase().equalsIgnoreCase("1C")||
		casoAlumnoProblema.getClase().equalsIgnoreCase("2A")||casoAlumnoProblema.getClase().equalsIgnoreCase("2B")||casoAlumnoProblema.getClase().equalsIgnoreCase("2C")||
		casoAlumnoProblema.getClase().equalsIgnoreCase("3A")||casoAlumnoProblema.getClase().equalsIgnoreCase("3B")||casoAlumnoProblema.getClase().equalsIgnoreCase("3C")||
		casoAlumnoProblema.getClase().equalsIgnoreCase("4A")||casoAlumnoProblema.getClase().equalsIgnoreCase("4B")||casoAlumnoProblema.getClase().equalsIgnoreCase("4C")){
		
			if(TablaRendAlumnosDatasource.comprobadorEsNumero(casoAlumnoProblema.getIdProblema())){		
		
					TablaRendAlumnosDatasource.makeJDBCConnection();
					
					try{
						TablaRendAlumnosDatasource.addDataToDB(casoAlumnoProblema);
						RendimientoAlumnosDAO caso = TablaRendAlumnosDatasource.getCasoByLastId();
%>
								<h3>Caso alumno-problema introducido en la tabla de rendimiento</h3>
								<h3>El identificador del caso alumno-problema es :&nbsp <%=caso.getId() %></h3>
								<h3>El nombre y apellidos del alumno son :&nbsp <%=caso.getNombreApellidos() %></h3>
								<h3>La clase a la que pertenece al alumno es :&nbsp<%=caso.getClase() %></h3>
								<h3>El identificador del problema presentado al alumno es :&nbsp<%=caso.getIdProblema() %></h3>
								<h3>La resoluci�n del problema, con �xito o no, por parte del alumno fue :&nbsp<%=caso.getExitoResolucion() %></h3>
								<h3>El tiempo invertido en resolver el problema con �xito fue :&nbsp<%=caso.getTiempoResolucion() %></h3>
								
								<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>
								<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>
								<form action="DecisionSalirDeLaAplicacionServlet" method="post">
								�Continuar?
								<input type="text" name="decisionSalirOno" value="">
								<br><br>
							  	<input type="submit" value="Enviar">
								</form>
								
			
<%
					}catch(SQLException exception){
						exception.printStackTrace();
%>
								<h3>Se ha excedido el l�mite en el n�mero de caracteres introducido en alg�n campo.</h3>
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
					}	
					
			}else{
%>
				<h3>El dato introducido en el casillero del identificador del problema presentado al alumno no es un n�mero.</h3>
				<h3>Introduzca un n�mero en ese casillero. Si no conociera el identificador del problema introduzca en el</h3>
				<h3>casillero un cero o un n�mero negativo.</h3>
				<form action="FormularioAlumnoProblemaServlet" method="post">
				Nombre y apellidos del alumno:<br>
				<input type="text" name="nombreApellidos" value="<%=casoAlumnoProblema.getNombreApellidos()%>">
				<br>
				Clase a la que pertenece al alumno (introducir claves 1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C):<br>
				<input type="text" name="claseAlumno" value="<%=casoAlumnoProblema.getClase()%>">
				<br>
				Identificador del problema que se le presenta al alumno:<br>
				<input type="text" name="identificadorProblema" value="">
				<br>
				�xito o no en la resoluci�n del problema:<br>
				<input type="text" name="exitoResolucion" value="<%=casoAlumnoProblema.getExitoResolucion()%>">
				<br>
				Tiempo invertido en resolver el problema con �xito:<br>
				<input type="text" name="tiempoInvertido" value="<%=casoAlumnoProblema.getTiempoResolucion()%>">
				<br><br>
				<input type="submit" value="Enviar">
				</form>
				
<%
			}
	}else{
%>
		<h3>La clave introducida para determinar la clase a la que pertenece el alumno es incorrecta.</h3>
		<h3>Introduzca una clave correcta.</h3>
		<form action="FormularioAlumnoProblemaServlet" method="post">
		Nombre y apellidos del alumno:<br>
		<input type="text" name="nombreApellidos" value="<%=casoAlumnoProblema.getNombreApellidos()%>">
		<br>
		Clase a la que pertenece al alumno (introducir claves 1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C):<br>
		<input type="text" name="claseAlumno" value="">
		<br>
		Identificador del problema que se le presenta al alumno:<br>
		<input type="text" name="identificadorProblema" value="<%=casoAlumnoProblema.getIdProblema()%>">
		<br>
		�xito o no en la resoluci�n del problema:<br>
		<input type="text" name="exitoResolucion" value="<%=casoAlumnoProblema.getExitoResolucion()%>">
		<br>
		Tiempo invertido en resolver el problema con �xito:<br>
		<input type="text" name="tiempoInvertido" value="<%=casoAlumnoProblema.getTiempoResolucion()%>">
		<br><br>
		<input type="submit" value="Enviar">
		</form>



<%
	}
%>
</body>
</html>