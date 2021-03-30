<%@page import="tablaProblemas.ClaveTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eliminación de problema de la tabla de problemas</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaProblemas objetoClave = (ClaveTablaProblemas) httpSession3.getAttribute("OBJETOCLAVE");
	%>

	<%
		if(objetoClave.getClaveTablaProblemas().equals("29080665V")){
	%>
			<h3>Para eliminar un problema de la tabla introduzca en el siguiente</h3>
			<h3>casillero el identificador del problema a eliminar</h3>
			<form action="IdentificadorProblemaEliminarServlet" method="post">
			Identificador problema:<br>
			<input type="text" name="identificadorDelProblema" value="">
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