<%@page import="tablaRendimientoAlumnos.RendimientoAlumnosDAO"%>
<%@page import="java.util.List"%>
<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaRendimientoAlumnos.ClaveClaseAlumnos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de casos alumno-problema por clase</title>
</head>
<body>
<%
	HttpSession httpSession3 = request.getSession();
	ClaveClaseAlumnos objetoClaseAlumnos = (ClaveClaseAlumnos) httpSession3.getAttribute("OBJETOCLASEALUMNOS");
	if(objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("1A")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("1B")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("1C")||
		objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("2A")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("2B")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("2C")||
		objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("3A")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("3B")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("3C")||
		objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("4A")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("4B")||objetoClaseAlumnos.getClaveClaseAlumnos().equalsIgnoreCase("4C")){
			TablaRendAlumnosDatasource.makeJDBCConnection();
			List<RendimientoAlumnosDAO> listaCasosPorClase = TablaRendAlumnosDatasource.getCasosByClase(objetoClaseAlumnos.getClaveClaseAlumnos());
			for(RendimientoAlumnosDAO casoAlumnoProblema : listaCasosPorClase){%>
				<h3>El identificador del caso alumno-problema es :&nbsp <%=casoAlumnoProblema.getId() %></h3>
				<h3>El nombre y apellidos del alumno son :&nbsp <%=casoAlumnoProblema.getNombreApellidos() %></h3>
				<h3>La clase a la que pertenece al alumno es :&nbsp<%=casoAlumnoProblema.getClase() %></h3>
				<h3>El identificador del problema presentado al alumno es :&nbsp<%=casoAlumnoProblema.getIdProblema() %></h3>
				<h3>La resoluci�n del problema, con �xito o no, por parte del alumno fue :&nbsp<%=casoAlumnoProblema.getExitoResolucion() %></h3>
				<h3>El tiempo invertido en resolver el problema con �xito fue :&nbsp<%=casoAlumnoProblema.getTiempoResolucion() %></h3>
				<h3>=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0=0</h3>
			<%
			}
			if(listaCasosPorClase.size() == 0){
			%>
				<h3>No existe en la tabla ning�n alumno de la clase <%=objetoClaseAlumnos.getClaveClaseAlumnos() %>.</h3>
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
		<h3>La clave introducida para determinar la clase a la que pertenecen los alumnos es incorrecta.</h3>
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
	}
%>
</body>
</html>