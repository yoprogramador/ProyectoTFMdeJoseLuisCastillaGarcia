<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de �reas la calculadora</title>
</head>
<body>
	<h2>CALCULADORA DE OPERACIONES MATEMATICAS</h2>
   	<h3>Para especificar a que �rea pertenece la operaci�n</h3>
   	<h3>matem�tica que desea realizar rellene el siguiente </h3>
   	<h3>casillero siguiendo las instrucciones que se indican.</h3>
   	<h3>--Si la operaci�n que desea realizar es de tipo aritm�tico</h3>
   	<h3>introduzca en el casillero letra A.</h3>
   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   	<h3>de geometr�a anal�tica introduzca en el casillero las letras GA.</h3>
   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   	<h3>de proporcionalidad introduzca en el casillero la letra P.</h3>
   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   	<h3>de geometr�a euclidiana introduzca en el casillero las letras GE.</h3>
   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   	<h3>de la combinatoria introduzca en el casillero la letra C.</h3>
   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   	<h3>de la estad�stica introduzca en el casillero la letra E.</h3>
    <h3>--Si la operaci�n que desea realizar pertence al �rea</h3>
   	<h3>de la trigonometr�a introduzca en el casillero la letra T.</h3>
   	<form action="OpcionEscogidaParaCalculadora2Servlet" method="post">
   	Area escogida:<br>
	  <input type="text" name="opcionAreaMatematicas" value="">
	  <br><br>
	  	  <input type="submit" value="Enviar">
	</form>

</body>
</html>