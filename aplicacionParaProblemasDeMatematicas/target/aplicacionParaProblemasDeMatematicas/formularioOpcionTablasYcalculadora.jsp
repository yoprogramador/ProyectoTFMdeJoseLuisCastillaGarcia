<%@page import="opcionEscogidaTablaProblemas.OpcionEscogidaTablaProblemas"%>
<%@page import="opcionTablasYcalculadora.OpcionTablasYcalculadora"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario para escoger entre tablas y calculadora</title>
</head>
<body>

<h2>Si desea entrar en la tabla de problemas intoduzca en el siguiente casillero la letra P.</h2>
<h2>Si desea entrar en la tabla de rendimiento de alumnos en la resoluci�n de problemas</h2>
<h2>introduzca en el casillero la letra R.</h2>
<h2>Si desea entrar en la calculadora de operaciones matem�ticas introduzca en el casillero</h2>
<h2>la letra C.</h2>
   	<form action="GestionOpcionTablasYcalculadora2Servlet" method="post">
   	Opci�n escogida:<br>
	  <input type="text" name="opcionTablasYcalculadora" value="">
	  <br><br>
	  	  <input type="submit" value="Enviar">
	</form>


</body>
</html>