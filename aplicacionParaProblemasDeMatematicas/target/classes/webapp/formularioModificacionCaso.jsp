<%@page import="tablaRendimientoAlumnos.ClaveTablaCasos"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario modificación caso alumno-problema</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaCasos objetoClave = (ClaveTablaCasos) httpSession3.getAttribute("OBJETOCLAVE");
	%>

		<%
			if(objetoClave.getClaveTablaCasos().equals("29080665V")){
		%>
			<h3>Introduzca en los siguientes casilleros el identificador del caso alumno-problema</h3>
			<h3>que se desea modificar, el campo donde se quiere realizar la modificación,</h3>
			<h3>y la información actualizada que se quiere introducir en ese campo.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el nombre y</h3>
			<h3>apellidos del alumno introduzca en el casillero del campo el dígito 1 (introduzca</h3>
			<h3>como máximo 300 caracteres, incluidos espacios en blanco, en el casillero de la</h3>
			<h3>información actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es la clase a</h3>
			<h3>la que pertenece el alumno (1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C)</h3>
			<h3>introduzca en el casillero del campo el dígito 2 y en el casillero de la información</h3>
			<h3>actualizada la clave de la clase correspondiente.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el identificador</h3>
			<h3>del problema que se le presenta al alumno introduzca en el casillero del campo</h3>
			<h3>el dígito 3. Introduzca un número como máximo de 9 dígitos en el casillero de la</h3>
			<h3>información actualizada. Este número debe coincidir con el identificador del</h3>
			<h3>problema presentado. Si no conoce el identificador de ese problema introduzca un cero</h3>
			<h3>o un número negativo.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el éxito (o no)</h3>
			<h3>en la resolución del problema introduzca en el casillero del campo el dígito 4</h3>
			<h3>(introduzca como máximo 1022 caracteres, incluidos espacios en blanco, en el</h3>
			<h3>casillero de la información actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el tiempo que tardó</h3>
			<h3>el alumno en resolver con éxito el problema introduzca en el casillero del campo</h3>
			<h3>el dígito 5 (introduzca como máximo 1022 caracteres, incluidos espacios en blanco,</h3>
			<h3>en el casillero de la información actualizada.</h3>
			<form action="FormularioModificacionCasoServlet" method="post">
			Identificador del caso alumno-problema:<br>
			<input type="text" name="identificador" value="">
			<br>
			Campo:<br>
			<input type="text" name="campo" value="">
			<br>
			Información actualizada:<br>
			<input type="text" name="datos" value="">
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