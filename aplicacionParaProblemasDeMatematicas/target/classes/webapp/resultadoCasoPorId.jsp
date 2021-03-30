<%@page import="tablaRendimientoAlumnos.RendimientoAlumnosDAO"%>
<%@page import="tablaRendimientoAlumnos.TablaRendAlumnosDatasource"%>
<%@page import="tablaRendimientoAlumnos.IdentificadorCasoAlumnoProblema"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado caso alumno-problema por su identificador</title>
</head>
<body>
			<%
				HttpSession httpSession7 = request.getSession();
				IdentificadorCasoAlumnoProblema objetoCasoId =(IdentificadorCasoAlumnoProblema)httpSession7.getAttribute("OBJETOIDENTIFICADOR");
							
				TablaRendAlumnosDatasource.makeJDBCConnection();					
					
				if(TablaRendAlumnosDatasource.comprobadorExistenciaId(objetoCasoId.getIdentificadorCasoAlumnoProblema())){							
					RendimientoAlumnosDAO casoAlumnoProblema = TablaRendAlumnosDatasource.getRendimientoAlumnoById(objetoCasoId.getIdentificadorCasoAlumnoProblema());
			%>	
					<h3>El identificador del caso alumno-problema es :&nbsp <%=casoAlumnoProblema.getId() %></h3>
					<h3>El nombre y apellidos del alumno son :&nbsp <%=casoAlumnoProblema.getNombreApellidos() %></h3>
					<h3>La clase a la que pertenece al alumno es :&nbsp<%=casoAlumnoProblema.getClase() %></h3>
					<h3>El identificador del problema presentado al alumno es :&nbsp<%=casoAlumnoProblema.getIdProblema() %></h3>
					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp<%=casoAlumnoProblema.getExitoResolucion() %></h3>
					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp<%=casoAlumnoProblema.getTiempoResolucion() %></h3>
		
					<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
					<form action="DecisionSalirDeLaAplicacionServlet" method="post">
					¿Continuar?
					<input type="text" name="decisionSalirOno" value="">
						<br><br>
		  	  		<input type="submit" value="Enviar">
					</form>
					
			<%
				}else{
			%>
					<h3>No existe en la tabla un caso alumno-problema con ese identificador.</h3>
					<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>
					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>
					<form action="DecisionSalirDeLaAplicacionServlet" method="post">
					¿Continuar?
					<input type="text" name="decisionSalirOno" value="">
						<br><br>
		  	  		<input type="submit" value="Enviar">
					</form>				
			
			<%
				}
			%>

</body>
</html>