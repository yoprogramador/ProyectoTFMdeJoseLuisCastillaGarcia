<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FocoDirectriz"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FuncionCuadratica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasTresPuntos"%>
<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.OperacionGeometriaAnaliticaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones geometría analítica</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
			OperacionGeometriaAnaliticaUsuario objetoGeometriaAnalitica = (OperacionGeometriaAnaliticaUsuario) httpSession3.getAttribute("OBJETOGEOMETRIAANALITICA");
	%>
	
		<%
			if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("D")){
		%>

						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" de los dos puntos </h3>
						<h3>de los cuales se desea calcular la distancia entre ellos</h3>
								<form action="CoordenadasDosPuntosServlet" method="post">
					  Valor de "x" del punto 1:<br>
							<input type="text" name="valorXpunto1" value="">
							<br>
					  Valor de "y" del punto 1:<br>
					  		<input type="text" name="valorYpunto1" value="">
							<br>
					  Valor de "x" del punto 2:<br>
							<input type="text" name="valorXpunto2" value="">
							<br>
					  Valor de "y" del punto 2:<br>
					  		<input type="text" name="valorYpunto2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

		
	<%
				}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("M")){
			%>
						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" de los dos puntos </h3>
						<h3>de los cuales se desea calcular el punto medio entre ellos</h3>
								<form action="CoordenadasDosPuntosBisServlet" method="post">
					  Valor de "x" del punto 1:<br>
							<input type="text" name="valorXpunto1" value="">
							<br>
					  Valor de "y" del punto 1:<br>
					  		<input type="text" name="valorYpunto1" value="">
							<br>
					  Valor de "x" del punto 2:<br>
							<input type="text" name="valorXpunto2" value="">
							<br>
					  Valor de "y" del punto 2:<br>
					  		<input type="text" name="valorYpunto2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>


	<%
		}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("PA")){
	%>

										<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" de los tres puntos </h3>
										<h3>de los cuales se desea saber si están alineados</h3>
												<form action="CoordenadasTresPuntosServlet" method="post">
									  Valor de "x" del punto 1:<br>
											<input type="text" name="valorXpunto1" value="">
											<br>
									  Valor de "y" del punto 1:<br>
									  		<input type="text" name="valorYpunto1" value="">
											<br>
									  Valor de "x" del punto 2:<br>
											<input type="text" name="valorXpunto2" value="">
											<br>
									  Valor de "y" del punto 2:<br>
									  		<input type="text" name="valorYpunto2" value="">
											<br>
									  Valor de "x" del punto 3:<br>
											<input type="text" name="valorXpunto3" value="">
											<br>
									  Valor de "y" del punto 3:<br>
									  		<input type="text" name="valorYpunto3" value="">
											<br><br>
											<input type="submit" value="Enviar">
										</form>

	<%
			}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("R")) {
		%>	

						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" de los dos puntos </h3>
						<h3>por donde pasa la recta que desea calcular</h3>
								<form action="CoordenadasDosPuntosRecServlet" method="post">
					  Valor de "x" del punto 1:<br>
							<input type="text" name="valorXpunto1" value="">
							<br>
					  Valor de "y" del punto 1:<br>
					  		<input type="text" name="valorYpunto1" value="">
							<br>
					  Valor de "x" del punto 2:<br>
							<input type="text" name="valorXpunto2" value="">
							<br>
					  Valor de "y" del punto 2:<br>
					  		<input type="text" name="valorYpunto2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>


	<%
		}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("PI")) {
	%>

						<h3>Introduzca en los siguientes casilleros los valores "a" y "b" de las ecuaciones genéricas de las dos rectas </h3>
						<h3>que se cruzan en un punto que se desea calcular. La ecuación genérica de una recta tiene la expresión "y = ax + b"</h3>
						<h3>y el punto de corte (intersección) se expresará por sus coordenadas cartesianas (x, y). Si las dos rectas</h3>
						<h3>introducidas no tuvieran punto de corte por ser paralelas se devolvería esta información</h3>
								<form action="EcuacionesDosRectasServlet" method="post">
					  Valor de "a" de la recta 1:<br>
							<input type="text" name="valorArecta1" value="">
							<br>
					  Valor de "b" de la recta 1:<br>
					  		<input type="text" name="valorBrecta1" value="">
							<br>
					  Valor de "a" de la recta 2:<br>
							<input type="text" name="valorArecta2" value="">
							<br>
					  Valor de "b" de la recta 2:<br>
					  		<input type="text" name="valorBrecta2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
						

	<%
		}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("RP")) {
	%>
	
						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" del punto </h3>
						<h3>que pasa por la recta a calcular, y los valores "a" y "b" de la ecuación de la recta, en su forma</h3>
						<h3>genérica (y = ax + b), que es paralela a la recta que se desea calcular</h3>
								<form action="CoordenadasUnPuntoEcuacionRectaServlet" method="post">
					  Valor de "x" del punto:<br>
							<input type="text" name="valorXpunto" value="">
							<br>
					  Valor de "y" del punto:<br>
					  		<input type="text" name="valorYpunto" value="">
							<br>
					  Valor de "a" de la recta:<br>
							<input type="text" name="coeficienteA" value="">
							<br>
					  Valor de "b" de la recta:<br>
					  		<input type="text" name="terminoIndependienteB" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	
	<%
			}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("RPE")) {
		%>
						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" del punto </h3>
						<h3>que pasa por la recta a calcular, y los valores "a" y "b" de la ecuación de la recta, en su forma</h3>
						<h3>genérica (y = ax + b), que es perpendicular a la recta que se desea calcular</h3>
								<form action="CoordenadasUnPuntoEcuacionRectaBisServlet" method="post">
					  Valor de "x" del punto:<br>
							<input type="text" name="valorXpunto" value="">
							<br>
					  Valor de "y" del punto:<br>
					  		<input type="text" name="valorYpunto" value="">
							<br>
					  Valor de "a" de la recta:<br>
							<input type="text" name="coeficienteA" value="">
							<br>
					  Valor de "b" de la recta:<br>
					  		<input type="text" name="terminoIndependienteB" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	<%
		}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("DPR")) {
	%>

						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas "x" e "y" del punto, </h3>
						<h3>y los valores "a" y "b" de la ecuación de la recta, en su forma</h3>
						<h3>genérica (y = ax + b), de los cuales se desea calcular la distancia</h3>
								<form action="CoordenadasUnPuntoEcuacionRectaServlet" method="post">
					  Valor de "x" del punto:<br>
							<input type="text" name="valorXpunto" value="">
							<br>
					  Valor de "y" del punto:<br>
					  		<input type="text" name="valorYpunto" value="">
							<br>
					  Valor de "a" de la recta:<br>
							<input type="text" name="coeficienteA" value="">
							<br>
					  Valor de "b" de la recta:<br>
					  		<input type="text" name="terminoIndependienteB" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	
	<%
			}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("DR")) {
		%>
						<h3>Introduzca en los siguientes casilleros los valores "a" y "b" de las ecuaciones genéricas de las dos</h3>
						<h3>rectas de las cuales se desea calcular la distancia. La ecuación genérica de una recta tiene la</h3>
						<h3>expresión "y = ax + b"</h3>
								<form action="EcuacionesDosRectasServlet" method="post">
					  Valor de "a" de la recta 1:<br>
							<input type="text" name="valorArecta1" value="">
							<br>
					  Valor de "b" de la recta 1:<br>
					  		<input type="text" name="valorBrecta1" value="">
							<br>
					  Valor de "a" de la recta 2:<br>
							<input type="text" name="valorArecta2" value="">
							<br>
					  Valor de "b" de la recta 2:<br>
					  		<input type="text" name="valorBrecta2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

					
	<%
							}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("B")) {
						%>
				
						<h3>Introduzca en los siguientes casilleros los valores "a" y "b" de las ecuaciones genéricas de las dos</h3>
						<h3>rectas de las cuales se desea calcular las bisectrices. La ecuación genérica de una recta tiene la</h3>
						<h3>expresión "y = ax + b"</h3>
								<form action="EcuacionesDosRectasBisServlet" method="post">
					  Valor de "a" de la recta 1:<br>
							<input type="text" name="valorArecta1" value="">
							<br>
					  Valor de "b" de la recta 1:<br>
					  		<input type="text" name="valorBrecta1" value="">
							<br>
					  Valor de "a" de la recta 2:<br>
							<input type="text" name="valorArecta2" value="">
							<br>
					  Valor de "b" de la recta 2:<br>
					  		<input type="text" name="valorBrecta2" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	<%
		}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("VPC")) {
	%>
					<h3>Introduzca en los siguientes casilleros los valores "a", "b" y "c" de la función cuadrática dada su</h3>
					<h3>expresión genérica (y = ax<sup>2</sup>+ bx + c)</h3>
								<form action="FuncionCuadraticaServlet" method="post">
					  Valor de "a" de la función cuadrática:<br>
							<input type="text" name="coeficienteA" value="">
							<br>
					  Valor de "b" de la función cuadrática:<br>
					  		<input type="text" name="coeficienteB" value="">
							<br>
					  Valor de "c" de la función cuadrática:<br>
							<input type="text" name="terminoIndependienteC" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

	<%
						}else if(objetoGeometriaAnalitica.getOperacionGeometriaAnalitica().equalsIgnoreCase("FC")) {
	%>
					
			        <h3>Introduzca en los siguientes casilleros los valores "x" e "y" del foco y el valor "b" la directriz </h3>
			        <h3>que corresponde con una expresión del tipo "y = b"</h3>
					<form action="FocoDirectrizServlet" method="post">
		  			  Valor de "x" del foco:<br>
							<input type="text" name="valorXfoco" value="">
							<br>
					  Valor de "y" del foco:<br>
					  		<input type="text" name="valorYfoco" value="">
							<br>
					  Valor de "b" de la directriz:<br>
					  		<input type="text" name="terminoIndependienteDirectriz" value="">
					        <br><br>
					        <input type="submit" value="Enviar">
					  </form>

							
	<%
						}else {
					%>
		<h3>Clave introducida incorrecta.</h3>
		<h3>  Para especificar la operación de geometría analítica que desea</h3>
		<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>--Para calcular la distancia entre dos puntos introduzca en el casillero la letra D.</h3>
		<h3>--Para calcular el punto medio entre dos puntos dados introduzca en el casillero la letra M.</h3>
		<h3>--Para averiguar si tres puntos están alineados introduzca en el casillero las letras PA.</h3>
		<h3>--Para calcular la ecuación genérica de una recta (y = ax + b) dados dos puntos por los que</h3>
		<h3>pasa dicha recta introduzca en el casillero la letra R.</h3>
		<h3>--Para calcular el punto de corte (intersección) entre dos rectas introduzca en el casillero</h3>
		<h3>las letras PI.</h3>
		<h3>--Para calcular la ecuación de la recta (y = ax + b) que pasa por un punto dado y que es</h3>
		<h3>paralela a otra recta dada introduzca en el casillero las letras RP.</h3>
		<h3>--Para calcular la ecuación de la recta (y = ax + b) que pasa por un punto dado y que es</h3>
		<h3>perpendicular a otra recta dada introduzca en el casillero las letras RPE.</h3>
		<h3>--Para calcular la distancia entre un punto y una recta expresada por su ecuación</h3>
		<h3>genérica (y = ax + b) introduzca las letras DPR.</h3>
		<h3>--Para calcular la distancia entre dos rectas paralelas dadas en su forma genérica (y = ax + b)</h3>
		<h3>introduzca las letras DR. Si las rectas introducidas fueran secantes o coincidentes la</h3>
		<h3>calculadora devolvería el valor de cero.</h3>
		<h3>--Para calcular las bisectrices determinadas por dos rectas que se cruzan introduzca la letra B.</h3>
		<h3>Las bisectrices son rectas que equidistan de otras dos que se cruzan. Los datos a introducir</h3>
		<h3>deben corresponder con la ecuación genérica (y = ax + b) de las rectas dadas, y las rectas</h3>
		<h3>bisectrices también se expresarán de esa forma. Si las rectas introducidas fueran paralelas</h3>
		<h3>la calculadora devolverá el mensaje de que no existen bisectrices para tales rectas.</h3>
		<h3>--Para calcular el vértice y los puntos de corte con el eje x de una función cuadrática</h3>
		<h3>(parábola) dada en su expresión genérica (y = ax<sup>2</sup>+ bx + c) introduzca las letras VPC.</h3>
		<h3>--Para calcular una función cuadrática (parábola) dados el foco y la directriz introduzca</h3>
		<h3>las letras FC. La parábola es aquella figura geométrica cuyos puntos equidistan de un punto</h3>
		<h3>llamado foco, y de una recta llamada directriz. Para el cálculo consideramos que la directriz</h3>
		<h3>es una recta paralela al eje horizontal (eje x) y que por tanto la parábola tiene una disposición</h3>
		<h3>verical. La expresión de la parábola calculada será del tipo y = ax<sup>2</sup>+ bx + c.</h3>
			<form action="OperacionGeometriaAnaliticaUsuarioServlet" method="post">
		Operación escogida:<br>
			<input type="text" name="operacionGeometriaAnalitica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
		</form>
	<%
		}
	%>

</body>
</html>