<%@page import="opcionOperacionEstadisticaUsuario.OperacionEstadisticaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de operaciones de estad�stica</title>
</head>
<body>
	<%
		HttpSession httpSession2 = request.getSession();
			OperacionEstadisticaUsuario objetoOperacionEstadistica = (OperacionEstadisticaUsuario) httpSession2.getAttribute("OBJETOOPERACIONESTADISTICA");
	%>
			<%
				if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("MED")){
			%>
	
					<h3>Introduzca en el siguiente casillero los datos num�ricos de los que se va a calcular la media</h3>
					<h3>aritm�tica. Estos n�meros se han de introducir uno tras otro y separados por una coma, sin</h3>
					<h3>ning�n espacio en medio.</h3>				
					<form action="MediaServlet" method="post">
			  		Datos num�ricos:<br>
					<input type="text" name="datosParaMedia" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("VAR")){
		%>
					<h3>Introduzca en el siguiente casillero los datos num�ricos de los que se va a calcular la</h3>
					<h3>varianza. Estos n�meros se han de introducir uno tras otro y separados por una coma, sin</h3>
					<h3>ning�n espacio en medio.</h3>				
					<form action="VarianzaServlet" method="post">
			  		Datos num�ricos:<br>
					<input type="text" name="datosParaVarianza" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("DES")){
		%>
					<h3>Introduzca en el siguiente casillero los datos num�ricos de los que se va a calcular la</h3>
					<h3>desviaci�n t�pica. Estos n�meros se han de introducir uno tras otro y separados por una</h3>
					<h3>coma, sin ning�n espacio en medio.</h3>				
					<form action="DesvTipicaServlet" method="post">
			  		Datos num�ricos:<br>
					<input type="text" name="datosParaDesvTipica" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("MOD")){
		%>			
					<h3>Introduzca en el siguiente casillero los datos num�ricos de los que se va a calcular la</h3>
					<h3>moda. Estos n�meros se han de introducir uno tras otro y separados por una coma,</h3>
					<h3>sin ning�n espacio en medio.</h3>				
					<form action="ModaServlet" method="post">
			  		Datos num�ricos:<br>
					<input type="text" name="datosParaModa" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else{
		%>
					<h3>Clave introducida incorrecta.</h3>
					<h3>Para especificar la operaci�n de estad�stica que desea realizar rellene</h3>
					<h3>el siguiente casillero siguiendo las instrucciones que se indican.</h3>
					<h3>--Para calcular la media aritm�tica, tambi�n llamada promedio, introduzca</h3>
					<h3>en el casillero las letras MED.</h3>
					<h3>--Para calcular la varianza introduzca en el casillero las letras VAR.</h3>
					<h3>--Para calcular la desviaci�n t�pica introduzca en el casillero las letras DES.</h3>
					<h3>--Para calcular la moda de un grupo de datos num�ricos introduzca las letras MOD.</h3>						
						<form action="OperacionEstadisticaUsuarioServlet" method="post">
					Operaci�n escogida:<br>
					<input type="text" name="operacionEstadistica" value="">
					<br><br>
			  	  	<input type="submit" value="Enviar">
					</form>
					
		<%
			}
		%>
</body>
</html>