<%@page import="opcionOperacionEstadisticaUsuario.OperacionEstadisticaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de operaciones de estadística</title>
</head>
<body>
	<%
		HttpSession httpSession2 = request.getSession();
			OperacionEstadisticaUsuario objetoOperacionEstadistica = (OperacionEstadisticaUsuario) httpSession2.getAttribute("OBJETOOPERACIONESTADISTICA");
	%>
			<%
				if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("MED")){
			%>
	
					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la media</h3>
					<h3>aritmética. Estos números se han de introducir uno tras otro y separados por una coma, sin</h3>
					<h3>ningún espacio en medio.</h3>				
					<form action="MediaServlet" method="post">
			  		Datos numéricos:<br>
					<input type="text" name="datosParaMedia" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("VAR")){
		%>
					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>
					<h3>varianza. Estos números se han de introducir uno tras otro y separados por una coma, sin</h3>
					<h3>ningún espacio en medio.</h3>				
					<form action="VarianzaServlet" method="post">
			  		Datos numéricos:<br>
					<input type="text" name="datosParaVarianza" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("DES")){
		%>
					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>
					<h3>desviación típica. Estos números se han de introducir uno tras otro y separados por una</h3>
					<h3>coma, sin ningún espacio en medio.</h3>				
					<form action="DesvTipicaServlet" method="post">
			  		Datos numéricos:<br>
					<input type="text" name="datosParaDesvTipica" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionEstadistica.getOperacionEstadistica().equalsIgnoreCase("MOD")){
		%>			
					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>
					<h3>moda. Estos números se han de introducir uno tras otro y separados por una coma,</h3>
					<h3>sin ningún espacio en medio.</h3>				
					<form action="ModaServlet" method="post">
			  		Datos numéricos:<br>
					<input type="text" name="datosParaModa" value="">
					<br><br>
					<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else{
		%>
					<h3>Clave introducida incorrecta.</h3>
					<h3>Para especificar la operación de estadística que desea realizar rellene</h3>
					<h3>el siguiente casillero siguiendo las instrucciones que se indican.</h3>
					<h3>--Para calcular la media aritmética, también llamada promedio, introduzca</h3>
					<h3>en el casillero las letras MED.</h3>
					<h3>--Para calcular la varianza introduzca en el casillero las letras VAR.</h3>
					<h3>--Para calcular la desviación típica introduzca en el casillero las letras DES.</h3>
					<h3>--Para calcular la moda de un grupo de datos numéricos introduzca las letras MOD.</h3>						
						<form action="OperacionEstadisticaUsuarioServlet" method="post">
					Operación escogida:<br>
					<input type="text" name="operacionEstadistica" value="">
					<br><br>
			  	  	<input type="submit" value="Enviar">
					</form>
					
		<%
			}
		%>
</body>
</html>