<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de áreas la calculadora</title>
</head>
<body>
	<h2>CALCULADORA DE OPERACIONES MATEMATICAS</h2>
   	<h3>Para especificar a que área pertenece la operación</h3>
   	<h3>matemática que desea realizar rellene el siguiente </h3>
   	<h3>casillero siguiendo las instrucciones que se indican.</h3>
   	<h3>--Si la operación que desea realizar es de tipo aritmético</h3>
   	<h3>introduzca en el casillero letra A.</h3>
   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   	<h3>de geometría analítica introduzca en el casillero las letras GA.</h3>
   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   	<h3>de proporcionalidad introduzca en el casillero la letra P.</h3>
   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   	<h3>de geometría euclidiana introduzca en el casillero las letras GE.</h3>
   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   	<h3>de la combinatoria introduzca en el casillero la letra C.</h3>
   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   	<h3>de la estadística introduzca en el casillero la letra E.</h3>
    <h3>--Si la operación que desea realizar pertence al área</h3>
   	<h3>de la trigonometría introduzca en el casillero la letra T.</h3>
   	<form action="OpcionEscogidaParaCalculadora2Servlet" method="post">
   	Area escogida:<br>
	  <input type="text" name="opcionAreaMatematicas" value="">
	  <br><br>
	  	  <input type="submit" value="Enviar">
	</form>

</body>
</html>