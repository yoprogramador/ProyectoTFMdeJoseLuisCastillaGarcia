<%@page import="tablaProblemas.ClaveTablaProblemas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario para modificaci�n de problema</title>
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
			<h3>que se desea modificar, el campo donde se quiere realizar la modificaci�n,</h3>
			<h3>y la informaci�n actualizada que se quiere introducir en ese campo.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es el enunciado</h3>
			<h3>del problema introduzca en el casillero del campo el d�gito 1 (introduzca</h3>
			<h3>como m�ximo 1022 caracteres, incluidos espacios en blanco, en el casillero de</h3>
			<h3>la informaci�n actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es el �rea</h3>
			<h3>al que pertenece el problema (A para problemas de aritm�tica, AL para problemas de �lgebra,</h3>
			<h3>GA para problemas de geometr�a anal�tica, P para problemas de proporcionalidad,</h3>
			<h3>GE para problemas de geometr�a euclidiana, C para problemas de combinatoria</h3>
			<h3>E para problemas de estad�stica, T para problemas de trigonometr�a) introduzca</h3>
			<h3>en el casillero del campo el d�gito 2 y en el casillero de la informaci�n actualizada</h3>
			<h3>introduzca la clave de �rea correspondiente.</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es el procedimiento</h3>
			<h3>de resoluci�n del problema introduzca en el casillero del campo el d�gito 3</h3>
			<h3>(introduzca como m�ximo 1022 caracteres, incluidos espacios en blanco, en el casillero</h3>
			<h3>de la informaci�n actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es la soluci�n</h3>
			<h3>del problema introduzca en el casillero del campo el d�gito 4 (introduzca como</h3>
			<h3>m�ximo 300 caracteres, incluidos espacios en blanco, en el casillero de la informaci�n</h3>
			<h3>actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es el porcentaje</h3>
			<h3>de veces que el problema se resolvi� con �xito introduzca en el casillero</h3>
			<h3>del campo el d�gito 5 (introduzca como m�ximo 200 caracteres, incluidos espacios</h3>
			<h3>en blanco, en el casillero de la informaci�n actualizada).</h3>
			<h3>--Si el campo en el que se quiere realizar la modificaci�n es el tiempo</h3>
			<h3>medio en resolver el problema introduzca en el casillero del campo el d�gito 6</h3>
			<h3>(introduzca como m�ximo 200 caracteres, incluidos espacios en blanco, en el casillero</h3>
			<h3>de la informaci�n actualizada).</h3>	
			<form action="FormularioModificacionProblemaServlet" method="post">
			Identificador del problema:<br>
			<input type="text" name="identificador" value="">
			<br>
			Campo:<br>
			<input type="text" name="campo" value="">
			<br>
			Informaci�n actualizada:<br>
			<input type="text" name="datos" value="">
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