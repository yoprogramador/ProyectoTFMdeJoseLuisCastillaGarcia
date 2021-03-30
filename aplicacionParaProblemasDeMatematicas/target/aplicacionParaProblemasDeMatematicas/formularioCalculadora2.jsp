<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FocoDirectriz"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FuncionCuadratica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasTresPuntos"%>
<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.OperacionGeometriaAnaliticaUsuario"%>
<%@page import="opcionOperacionAritmeticaUsuario.RaizCuadrada"%>
<%@page import="opcionOperacionAritmeticaUsuario.Potenciacion"%>
<%@page import="opcionOperacionAritmeticaUsuario.Division"%>
<%@page import="opcionOperacionAritmeticaUsuario.Multiplicacion"%>
<%@page import="opcionOperacionAritmeticaUsuario.Resta"%>
<%@page import="opcionSalirOcontinuarEnLaAplicacion.DecisionSalirDeLaAplicacion"%>
<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Suma"%>
<%@page import="opcionOperacionAritmeticaUsuario.OperacionAritmeticaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones aritméticas</title>
</head>
<body>
	<%
		HttpSession httpSession2 = request.getSession();
			OperacionAritmeticaUsuario objetoOperacionAritmetica = (OperacionAritmeticaUsuario) httpSession2.getAttribute("OBJETOOPERACIONARITMETICA");
	%>
			<%
				if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("S")){
			%>
	
				<h3>Introduzca en los siguientes casilleros el valor del primer y segundo sumando</h3>
					<form action="SumaServlet" method="post">
			  Primer sumando:<br>
					<input type="text" name="primerSumando" value="">
					<br>
			  Segundo sumando:<br>
					<input type="text" name="segundoSumando" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
	<%
		}else if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("R")){
	%>

				<h3>Introduzca en los siguientes casilleros el valor del minuendo y del sustraendo</h3>
						<form action="RestaServlet" method="post">
			  Minuendo:<br>
					<input type="text" name="minuendo" value="">
					<br>
			  Sustraendo:<br>
					<input type="text" name="sustraendo" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
	
		<%
 				}else if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("M")){
 			%>

				<h3>Introduzca en los siguientes casilleros el valor de los factores</h3>
						<form action="MultiplicacionServlet" method="post">
			  Primer Factor:<br>
					<input type="text" name="primerFactor" value="">
					<br>
			  Segundo Factor:<br>
					<input type="text" name="segundoFactor" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
				
	
		<%
				}else if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("D")){
			%>
			
						<h3>Introduzca en los siguientes casilleros el valor del numerador y del denominador</h3>
								<form action="DivisionServlet" method="post">
					  Numerador:<br>
							<input type="text" name="numerador" value="">
							<br>
					  Denominador:<br>
							<input type="text" name="denominador" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
	
		<%
				}else if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("P")){
			%>

						<h3>Introduzca en los siguientes casilleros el valor de la base y del exponente</h3>
								<form action="PotenciacionServlet" method="post">
					  Base:<br>
							<input type="text" name="base" value="">
							<br>
					  Exponente:<br>
							<input type="text" name="exponente" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	
		<%
				}else if(objetoOperacionAritmetica.getOperacionAritmetica().equalsIgnoreCase("RC")){
			%>

						<h3>Introduzca en el siguiente casillero el número del cual se desea calcular la raíz cuadrada</h3>
								<form action="RaizCuadradaServlet" method="post">
					  Radicando:<br>
							<input type="text" name="radicando" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	
				<%
						}else{
					%>
		<h3>Clave introducida incorrecta.</h3>
		<h3>Para especificar la operación aritmética que desea realizar</h3>
		<h3>rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>Si la operación a realizar es una suma introduzca en el casillero la letra S.</h3>
		<h3>Si la operación a realizar es una resta introduzca en el casillero la letra R.</h3>
		<h3>Si la operación a realizar es una multiplicación introduzca la letra M.</h3>
		<h3>Si la operación a realizar es una división introduzca la letra D.</h3>
		<h3>Si la operación a realizar es una potencia introduzca la letra P.</h3>
		<h3>Si la operación a realizar es una raíz cuadrada introduzca las letras RC.</h3>
			<form action="OperacionAritmeticaUsuarioServlet" method="post">
		Operación escogida:<br>
			<input type="text" name="operacionAritmetica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
		</form>
		<%
			}
		%>

	
	
</body>
</html>