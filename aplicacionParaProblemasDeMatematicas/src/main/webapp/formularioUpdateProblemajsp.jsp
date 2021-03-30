<%@page import="tablaProblemas.ClaveTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario para modificación de problema</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
		ClaveTablaProblemas objetoClave = (ClaveTablaProblemas) httpSession3.getAttribute("OBJETOCLAVE");
	%>
	
		<%
			if(objetoClave.getClaveTablaProblemas().equals("29080665V")){
		%>
			<h3>Introduzca en los siguientes casilleros el identificador del problema</h3>
			<h3>que se desea modificar, el campo donde se quiere realizar la modificación,</h3>
			<h3>y la información actualizada que se quiere introducir en ese campo.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el enunciado</h3>
			<h3>del problema introduzca en el casillero del campo el dígito 1 (introduzca</h3>
			<h3>como máximo 1022 caracteres, incluidos espacios en blanco, en el casillero de</h3>
			<h3>la información actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el área</h3>
			<h3>al que pertenece el problema (A para problemas de aritmética, AL para problemas de álgebra,</h3>
			<h3>GA para problemas de geometría analítica, P para problemas de proporcionalidad,</h3>
			<h3>GE para problemas de geometría euclidiana, C para problemas de combinatoria</h3>
			<h3>E para problemas de estadística, T para problemas de trigonometría) introduzca</h3>
			<h3>en el casillero del campo el dígito 2 y en el casillero de la información actualizada</h3>
			<h3>introduzca la clave de área correspondiente.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el procedimiento</h3>
			<h3>de resolución del problema introduzca en el casillero del campo el dígito 3</h3>
			<h3>(introduzca como máximo 1022 caracteres, incluidos espacios en blanco, en el casillero</h3>
			<h3>de la información actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es la solución</h3>
			<h3>del problema introduzca en el casillero del campo el dígito 4 (introduzca como</h3>
			<h3>máximo 300 caracteres, incluidos espacios en blanco, en el casillero de la información</h3>
			<h3>actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el porcentaje</h3>
			<h3>de veces que el problema se resolvió con éxito introduzca en el casillero</h3>
			<h3>del campo el dígito 5 (introduzca como máximo 200 caracteres, incluidos espacios</h3>
			<h3>en blanco, en el casillero de la información actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificación es el tiempo</h3>
			<h3>medio en resolver el problema introduzca en el casillero del campo el dígito 6</h3>
			<h3>(introduzca como máximo 200 caracteres, incluidos espacios en blanco, en el casillero</h3>
			<h3>de la información actualizada).</h3>	
			<form action="FormularioModificacionProblemaServlet" method="post">
			Identificador del problema:<br>
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