<%@page import="tablaRendimientoAlumnos.ClaveTablaCasos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado eliminaci�n caso alumno-problema de la tabla de rendimiento de alumnos</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaCasos objetoClave = (ClaveTablaCasos) httpSession3.getAttribute("OBJETOCLAVE");
	%>

	<%
		if(objetoClave.getClaveTablaCasos().equals("29080665V")){
	%>
			<h3>Para eliminar un caso alumno-problema de la tabla de rendimiento introduzca</h3>
			<h3>en el siguiente casillero el identificador del caso a eliminar</h3>
			<form action="IdentificadorCasoEliminarServlet" method="post">
			Identificador del caso alumno-problema:<br>
			<input type="text" name="identificadorDelCaso" value="">
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