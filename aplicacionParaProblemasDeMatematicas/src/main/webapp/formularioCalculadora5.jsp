<%@page import="opcionOperacionGeometriaEuclidianaUsuario.OperacionGeometriaEuclidianaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones geometría euclidiana</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
			OperacionGeometriaEuclidianaUsuario objetoGeometriaEuclidiana = (OperacionGeometriaEuclidianaUsuario) httpSession3.getAttribute("OBJETOGEOMETRIAEUCLIDIANA");
	%>
	
		<%
			if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ND")){
		%>
			<h3>Introduzca en el siguiente casillero el número de lados que posee el</h3>
			<h3>el polígono convexo</h3>
					<form action="NumLadosServlet" method="post">
			  Número de lados:<br>
					<input type="text" name="numeroLados" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("AT")){
		%>
			<h3>Introduzca en los siguientes casilleros los grados (sistema sexagesimal) que miden los</h3>
			<h3>dos ángulos conocidos del triángulo. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="DosAngulosTrianguloServlet" method="post">
			  Primer ángulo (en grados):<br>
					<input type="text" name="angulo1" value="">
					<br>
			  Segundo ángulo (en grados):<br>
					<input type="text" name="angulo2" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>


		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("AC")){
		%>
			<h3>Introduzca en los siguientes casilleros los grados (sistema sexagesimal) que miden los</h3>
			<h3>tres ángulos conocidos del cuadrilátero convexo. Los datos introducidos han de ser</h3>
			<h3>exclusivamente numéricos.</h3>
					<form action="TresAngulosCuadrilateroServlet" method="post">
			  Primer ángulo (en grados):<br>
					<input type="text" name="angulo1" value="">
					<br>
			  Segundo ángulo (en grados):<br>
					<input type="text" name="angulo2" value="">
					<br>
			  Tercer ángulo (en grados):<br>
					<input type="text" name="angulo3" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LC")){
		%>
			<h3>Introduzca en el siguiente casillero la longitud del radio de la circunferencia.</h3>
			<h3>El dato introducido ha de ser exclusivamente numérico.</h3>
					<form action="LongitudCircunferenciaServlet" method="post">
				  Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LA")){
				
		%>
			<h3>Introduzca en los siguientes casilleros lo que mide el ángulo en grados (sistema sexagesimal)</h3>
			<h3>y la longitud del radio de la circunferencia. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="LongitudArcoServlet" method="post">
				  	Grados del ángulo:<br>
						<input type="text" name="angulo" value="">
						<br>
			  		Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("GA")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del arco y del radio de la</h3>
			<h3>circunferencia a la cual pertenece ese arco. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="ArcoYradioServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LR")){
		%>	
			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados (sistema sexagesimal)</h3>
			<h3>que mide el ángulo. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="ArcoYanguloServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Grados del ángulo:<br>
						<input type="text" name="angulo" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LAI")){
		%>
			<h3>Introduzca en los siguientes casilleros lo que mide el ángulo en grados (sistema sexagesimal)</h3>
			<h3>y la longitud del radio de la circunferencia. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="LongitudArcoBisServlet" method="post">
				  	Grados del ángulo:<br>
						<input type="text" name="angulo" value="">
						<br>
			  		Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("GAI")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del arco y del radio de la</h3>
			<h3>circunferencia a la cual pertenece ese arco. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="ArcoYradioBisServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LRI")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados (sistema sexagesimal)</h3>
			<h3>que mide el ángulo. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="ArcoYanguloBisServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Grados del ángulo:<br>
						<input type="text" name="angulo" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LH")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del primer y del segundo cateto.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="Cateto1yCateto2Servlet" method="post">
				  	Longitud del primer cateto:<br>
						<input type="text" name="cateto1" value="">
						<br>
			  		Longitud del segundo cateto:<br>
						<input type="text" name="cateto2" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LCAT")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud la hipotenusa y del otro cateto.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="HipotenusayCatetoServlet" method="post">
				  	Longitud de la hipotenusa:<br>
						<input type="text" name="hipotenusa" value="">
						<br>
			  		Longitud del otro cateto:<br>
						<input type="text" name="cateto" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ATR")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y de los dos catetos</h3>
			<h3>que tiene el triángulo rectángulo. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="HipotenusaYcatetosServlet" method="post">
			  Hipotenusa:<br>
					<input type="text" name="hipotenusa" value="">
					<br>
			  Primer cateto:<br>
					<input type="text" name="cateto1" value="">
					<br>
			  Segundo cateto:<br>
					<input type="text" name="cateto2" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("HTR")){	
		%>
			<h3>Introduzca en los siguientes casilleros la altura y longitud de los dos catetos</h3>
			<h3>que tiene el triángulo rectángulo. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="AlturaYcatetosServlet" method="post">
			  Altura:<br>
					<input type="text" name="altura" value="">
					<br>
			  Primer cateto:<br>
					<input type="text" name="cateto1" value="">
					<br>
			  Segundo cateto:<br>
					<input type="text" name="cateto2" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("CTR")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del cateto conocido, de la hipotenusa</h3>
			<h3>y la altura del triángulo rectángulo. Los datos introducidos han de ser exclusivamente</h3>
			<h3>numéricos.</h3>
					<form action="AlturaHipotenusaYcatetoServlet" method="post">
			  Altura:<br>
					<input type="text" name="altura" value="">
					<br>
			  Hipotenusa:<br>
					<input type="text" name="hipotenusa" value="">
					<br>
			  Cateto conocido:<br>
					<input type="text" name="cateto" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LRAD")){
		%>
			<h3>Introduzca en el siguiente casillero la longitud de la circunferencia.</h3>
			<h3>El dato introducido ha de ser exclusivamente numérico.</h3>
					<form action="LongitudCircunfServlet" method="post">
				  Longitud de la circunferencia:<br>
						<input type="text" name="circunferencia" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APR")){
		%>
			<h3>Introduzca en el siguiente casillero el número de lados del polígono regular</h3>
					<form action="NumeroDeLadosServlet" method="post">
				  Número de lados:<br>
						<input type="text" name="numeroDeLados" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("NLPR")){
		%>
			<h3>Introduzca en el siguiente casillero los grados (sistema sexagesimal) que miden los ángulos</h3>
			<h3>del polígono regular. El dato introducido ha de ser exclusivamente numérico.</h3>
					<form action="GradosDeLosAngulosServlet" method="post">
				  Grados de los ángulos:<br>
						<input type="text" name="gradosDeLosAngulos" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APL")){
		%>
			<h3>Introduzca en los siguientes casilleros la base y la altura del paralelogramo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>	
					<form action="BaseYalturaServlet" method="post">
				  	Base:<br>
						<input type="text" name="base" value="">
						<br>
			  		Altura:<br>
						<input type="text" name="altura" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("BPL")){
		%>
			<h3>Introduzca en los siguientes casilleros la altura y el área del paralelogramo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="AlturaYareaServlet" method="post">
				  	Altura:<br>
						<input type="text" name="altura" value="">
						<br>
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ALPL")){
		%>
			<h3>Introduzca en los siguientes casilleros la base y el área del paralelogramo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="BaseYareaServlet" method="post">
				  	Base:<br>
						<input type="text" name="base" value="">
						<br>
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ARTR")){
		%>
			<h3>Introduzca en los siguientes casilleros la base y la altura del triángulo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="BaseYalturaBisServlet" method="post">
				  	Base:<br>
						<input type="text" name="base" value="">
						<br>
			  		Altura:<br>
						<input type="text" name="altura" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
					
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("BTR")){
		%>	
			<h3>Introduzca en los siguientes casilleros la altura y el área del triángulo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>	
					<form action="AlturaYareaBisServlet" method="post">
				  	Altura:<br>
						<input type="text" name="altura" value="">
						<br>
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ALTR")){
		%>
			<h3>Introduzca en los siguientes casilleros la base y el área del triángulo</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="BaseYareaBisServlet" method="post">
				  	Base:<br>
						<input type="text" name="base" value="">
						<br>
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ARTRA")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de las dos bases y la altura del</h3>
			<h3>trapecio. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="BasesYalturaServlet" method="post">
			  Base inferior:<br>
					<input type="text" name="baseInferior" value="">
					<br>
			  Base superior:<br>
					<input type="text" name="baseSuperior" value="">
					<br>
			  Altura:<br>
					<input type="text" name="altura" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ALTRA")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de las dos bases y el área del</h3>
			<h3>trapecio. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="BasesYareaServlet" method="post">
			  Base inferior:<br>
					<input type="text" name="baseInferior" value="">
					<br>
			  Base superior:<br>
					<input type="text" name="baseSuperior" value="">
					<br>
			  Area:<br>
					<input type="text" name="area" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("BATRA")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de la base conocida, la altura y el</h3>
			<h3>área del trapecio. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="BaseAlturaYareaServlet" method="post">
			  Base conocida:<br>
					<input type="text" name="baseConocida" value="">
					<br>
			  Altura:<br>
					<input type="text" name="altura" value="">
					<br>
			  Area:<br>
					<input type="text" name="area" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("AROM")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de las dos diagonales del rombo.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="DosDiagonalesServlet" method="post">
				  	Diagonal mayor:<br>
						<input type="text" name="diagonalMayor" value="">
						<br>
			  		Diagonal menor:<br>
						<input type="text" name="diagonalMenor" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("DROM")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud de la diagonal conocida y</h3>
			<h3>el área del rombo. Los datos introducidos han de ser exclusivamente numéricos.</h3>		
					<form action="DiagonalYareaServlet" method="post">
				  	Diagonal conocida:<br>
						<input type="text" name="diagonalConocida" value="">
						<br>
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el número de lados del polígono regular, la longitud</h3>
			<h3>de un lado y del apotema. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="NumLadosLongLadoApotemaServlet" method="post">
			  Número de lados:<br>
					<input type="text" name="numLados" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  Longitud del apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("NPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el área del polígono regular, la longitud</h3>
			<h3>de un lado y del apotema. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="AreaLongLadoApotemaServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  Longitud del apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el área del polígono regular, el número de lados</h3>
			<h3>y longitud del apotema. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="AreaNumLadosApotemaServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  Número de lados:<br>
					<input type="text" name="numLados" value="">
					<br>
			  Longitud del apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el área del polígono regular, el número de lados</h3>
			<h3>y la longitud de un lado. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="AreaNumLadosLongLadoServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  Número de lados:<br>
					<input type="text" name="numLados" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ACIR")){
		%>
			<h3>Introduzca en el siguiente casillero la longitud del radio del círculo. El dato introducido</h3>
			<h3>han de ser exclusivamente numérico.</h3>
					<form action="RadioCirculoServlet" method="post">
			  		Radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("RCIR")){
		%>
			<h3>Introduzca en el siguiente casillero el área del círculo.</h3>
			<h3>El dato introducido han de ser exclusivamente numérico.</h3>		
					<form action="AreaCirculoServlet" method="post">
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ASECIR")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del radio y los grados (sistema sexagesimal)</h3>
			<h3>del ángulo que corresponde al arco. Los datos introducidos han de ser exclusivamente numéricos.</h3>
					<form action="RadioYanguloSecServlet" method="post">
				  	radio:<br>
						<input type="text" name="radio" value="">
						<br>
			  		Angulo del sector (en grados):<br>
						<input type="text" name="anguloSec" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("RSECIR")){
		%>
			<h3>Introduzca en los siguientes casilleros el área del sector circular y los grados (sistema sexagesimal)</h3>
			<h3>del ángulo que corresponde al arco. Los datos introducidos han de ser exclusivamente numéricos.</h3>	
					<form action="AreaYanguloSecServlet" method="post">
				  	Area del sector:<br>
						<input type="text" name="areaSec" value="">
						<br>
			  		Angulo del sector (en grados):<br>
						<input type="text" name="anguloSec" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ANSECIR")){
		%>
			<h3>Introduzca en los siguientes casilleros el área del sector circular y la longitud del radio.</h3>
			<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>	
					<form action="AreaSecYradioServlet" method="post">
				  	Area del sector:<br>
						<input type="text" name="areaSec" value="">
						<br>
			  		Radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("RADGRAD")){
		%>
			<h3>Introduzca en el siguiente casillero los radianes que mide el ángulo.</h3>
			<h3>El dato introducido han de ser exclusivamente numérico.</h3>
					<form action="RadianesServlet" method="post">
				  Radianes:<br>
						<input type="text" name="radianes" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("GRADRAD")){
		%>
			<h3>Introduzca en el siguiente casillero los grados (sistema sexagesimal) que mide el ángulo.</h3>
			<h3>El dato introducido han de ser exclusivamente numérico.</h3>
					<form action="GradosServlet" method="post">
				  Grados:<br>
						<input type="text" name="grados" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APC")){
		%>	
			 <h3>Introduzca en el siguiente casillero los valores de los ángulos conocidos, que han de ser</h3>
			 <h3>todos los del polígono menos el valor del ángulo queremos calcular.</h3>
			 <h3>Estos valores, que han de ser exclusivamente numéricos (en grados del sistema sexagesimal),</h3>
			 <h3>se han de introducir uno tras otro y separados por una coma, sin ningún espacio en medio.</h3>
						<form action="AngulosPoligonoServlet" method="post">
				  Listado de valores:<br>
						<input type="text" name="angulosPoligono" value="">
						<br><br>
						<input type="submit" value="Enviar">
						</form>
		
		<%
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>Para especificar la operación de geometría euclidiana que desea</h3>
			<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
			<h3>que se indican.</h3>
			<h3>--Para calcular el número de diagonales de un polígono convexo, dado su número de lados,</h3>
			<h3>introduzca en el casillero las letra ND.</h3>
			<h3>--Para calcular los grados (sistema sexagesimal) que posee un ángulo de un triángulo conocidos los otros dos,</h3>
			<h3>expresados también en grados, introduzca en el casillero la letras AT.</h3>
			<h3>--Para calcular los grados (sistema sexagesimal) que posee un ángulo de un cuadrilátero convexo conocidos los</h3>
			<h3>otros tres, expresados también en grados, introduzca en el casillero la letras AC.</h3>
			<h3>--Para calcular los grados (sistema sexagesimal) que posee un ángulo de un polígono convexo de "n" lados, conocidos</h3>
			<h3>los otros ángulos, expresados también en grados, introduzca en el casillero la letras APC.</h3>
			<h3>--Para calcular la longitud de una circunferencia conocido su radio introduzca en el casillero</h3>
			<h3>las letras LC. Si conocemos la longitud de la circunferencia, para calcular la longitud</h3>
			<h3>del radio introduzca en el casillero las letras LRAD.</h3>
			<h3>--Consideramos un ángulo cuyo vértice está en el centro de una circunferenicia, es decir,</h3>
			<h3>que sería un ángulo central de esa circunferencia. Este ángulo determina un arco en dicha circunferencia.</h3>
			<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
			<h3>arco definido por un ángulo central, conocidos los grados (sistema sexagesimal) que mide dicho ángulo y la longitud</h3>
			<h3>del radio de la circunferencia, introduzca en el casillero las letras LA. Para calcular, lo que mide en grados, un </h3>
			<h3>ángulo central conocidas la longitud del arco que determina dicho ángulo en una circunferencia en la que</h3>
			<h3>es central y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GA. Para</h3>
			<h3>calcular la longitud del radio de la circunferencia conocidos los grados que mide el ángulo y la longitud</h3>
			<h3>del arco, introduzca en el casillero las letras LR.</h3>
			<h3>--Consideramos un ángulo cuyo vértice está en una circunferencia y que tiene sus lados secantes a la</h3>
			<h3>misma. El vértice por tanto es un punto cuya distancia al centro de la circunferencia es igual al radio.</h3>
			<h3>A este tipo de ángulos se los llama inscritos. Este ángulo determina un arco en dicha circunferencia.</h3>
			<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
			<h3>arco definido por un ángulo inscrito, conocidos los grados (sistema sexagesimal) que mide dicho ángulo y la longitud</h3>
			<h3>del radio de la circunferencia, introduzca en el casillero las letras LAI. Para calcular, lo que mide en grados, un</h3>
			<h3>ángulo inscrito conocidas la longitud del arco que determina dicho ángulo en una circunferencia en la que</h3>
			<h3>está inscrito y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GAI.</h3>
			<h3>Para calcular la longitud del radio de la circunferencia conocidos los grados que mide el ángulo y la longitud</h3>
			<h3>del arco, introduzca en el casillero las letras LRI.</h3>
			<h3>--Consideremos un triángulo rectángulo. Dada la longitud de los dos catetos del triángulo, para hallar</h3>
			<h3>la longitud de la hipotenusa introduzca en el casillero las letras LH. Para hallar la longitud de un cateto</h3>
			<h3>conocidos el otro y la hipotenusa introduzca en el casillero las letras LCAT.</h3>
			<h3>--Consideremos un triángulo rectángulo posicionado de tal forma que su hipotenusa hace de base del triángulo.</h3>
			<h3>Tal triángulo posicionado de esa forma va a tener una altura y como todo triángulo rectángulo contará además</h3>
			<h3>con dos catetos. Para calcular la altura de tal triángulo rectángulo conocidos la longitud de la hipotenusa y</h3>
			<h3>de los dos catetos introduzca en el casillero las letras ATR. Para calcular la longitud de la hipotenusa</h3>
			<h3>conocida la longitud de los catetos y la altura del triángulo introduzca en el casillero las letras HTR.</h3>
			<h3>Para calcular la longitud de un cateto conocida la longitud del otro cateto, de la hipotenusa y la altura del</h3>
			<h3>triángulo, introduzca en el casillero las letras CTR.</h3>
			<h3>--Consideramos un polígono regular que es aquel que tiene todos sus lados y sus ángulos iguales. Para calcular</h3>
			<h3>lo que miden sus ángulos en grados (sistema sexagesimal), conocido el número de lados que tiene el polígono, introduzca</h3>
			<h3>en el casillero las letras APR. Para calcular el número de lados que tiene el polígono conocido los grados que miden</h3>
			<h3>los ángulos introduzca en el casillero las letras NLPR.</h3>
			<h3>--Consideremos un paralelogramo, cuadrilátero cuyos lados opuesto son paralelos. Para hallar el área de</h3>
			<h3>un paralelogramo conocidos su base y su altura introduzca en el casillero los letras APL. Para calcular la</h3>
			<h3>base conocidos el área y la altura introduzca en el casillero las letras BPL. Para calcular la altura conocidos</h3>
			<h3>el área y la base introduzca en el casillero las letras ALPL.</h3>
			<h3>--Consideremos un triángulo. Para calcular el área de un triángulo, conocidos su base y su altura, introduzca</h3>
			<h3>en el casillero las letras ARTR. Para calcular su base conocidos su altura y su área introduzca en el casillero</h3>
			<h3>las letras BTR. Para calcular su altura conocidos su base y su área introduzca las letras ALTR.</h3>
			<h3>--Consideremos un trapecio, cuadrilátero que tiene dos lados paralelos. Para calcular el área de un trapecio,</h3>
			<h3>conocidas sus dos bases : inferior y superior (consideramos que sus bases son sus lados paralelos), y su altura, introduzca</h3>
			<h3>en el casillero las letras ARTRA. Para calcular su altura, conocidas las dos bases y el área, introduzca en el casillero</h3>
			<h3>las letras ALTRA. Para calcular una de sus bases, conocidas la otra, el área y la altura, introduzca en el casillero las</h3>
			<h3>letras BATRA.</h3>
			<h3>--Consideremos un rombo, que es el paralelogramo cuyos lados son iguales. En todo rombo distinguimos dos diagonales que</h3>
			<h3>van desde cada vértice al vértice opuesto. Conocidas la longitud de las diagonales para calcular el área del rombo</h3>
			<h3>introduzca en el casillero las letras AROM. Para calcular la longitud de una diagonal, conocida la otra y el área del</h3>
			<h3>rombo introduzca en el casillero las letras DROM.</h3>
			<h3>--Consideremos un polígono regular. Para calcular el área de dicho polígono, sabiendo el número de lados que</h3>
			<h3>tiene, la longitud de un lado y el apotema, introduzca en el casillero las letras APOLREG. Para hallar el número</h3>
			<h3>de lados que tiene, conocidos la longitud de un lado, el apotema y el área, introduzca en el casillero las letras</h3>
			<h3>NPOLREG. Para hallar la longitud de los lados, conocidos al área, el número de lados y el apotema, introduzca en</h3>
			<h3>casillero las letras LPOLREG. Para hallar el apotema, conocidos el área, el número de lados, la longitud de los</h3>
			<h3>lados, introduzca en el casillero las letras APPOLREG.</h3>
			<h3>--Círculo es la porción de plano comprendida dentro de la circunferencia. Para hallar el área de un círculo</h3>
			<h3>conocido su radio introduzca en el casillero las letras ACIR. Para hallar el radio del círculo conocido su área</h3>
			<h3>introduzca en el casillero las letras RCIR.</h3>
			<h3>--El sector circular es la porción de círculo limitada por un arco de circunferencia y los radios correspondientes</h3>
			<h3>que llegan a los extremos de este arco. Para calcular el área del sector circular, concidos el radio y el ángulo en</h3>
			<h3>grados (sistema sexagesimal) que corresponde al arco, introduzca en el casillero las letras ASECIR. Para calcular el radio</h3>
			<h3>del círculo, conocidos el área del sector circular y el ángulo en grados que corresponde con el arco, introduzca en el</h3>
			<h3>casillero las letras RSECIR. Para calcular los grados del ángulo asociado al sector circular, conocidos el radio y el</h3>
			<h3>área del sector circular, introduzca en el casillero las letras ANSECIR.</h3>
			<h3>--Para calcular (aproximadamente) los grados (sistema sexagesimal) que mide un ángulo conociendo los radianes que mide,</h3>
			<h3>introduzca en el casillero las letras RADGRAD. Para calcular (aproximadamente) los radianes que mide un ángulo conociendo</h3>
			<h3>los grados (sistema sexagesimal) que mide, introduzca en el casillero las letras GRADRAD.</h3>			
			<form action="OperacionGeometriaEuclidianaUsuarioServlet" method="post">
			Operación escogida:<br>
				<input type="text" name="operacionGeometriaEuclidiana" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
					
		<%
			}
		%>
</body>
</html>