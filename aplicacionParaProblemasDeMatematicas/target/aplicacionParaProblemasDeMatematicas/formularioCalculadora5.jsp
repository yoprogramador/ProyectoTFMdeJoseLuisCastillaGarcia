<%@page import="opcionOperacionGeometriaEuclidianaUsuario.OperacionGeometriaEuclidianaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones geometr�a euclidiana</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
			OperacionGeometriaEuclidianaUsuario objetoGeometriaEuclidiana = (OperacionGeometriaEuclidianaUsuario) httpSession3.getAttribute("OBJETOGEOMETRIAEUCLIDIANA");
	%>
	
		<%
			if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ND")){
		%>
			<h3>Introduzca en el siguiente casillero el n�mero de lados que posee el</h3>
			<h3>el pol�gono convexo</h3>
					<form action="NumLadosServlet" method="post">
			  N�mero de lados:<br>
					<input type="text" name="numeroLados" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("AT")){
		%>
			<h3>Introduzca en los siguientes casilleros los grados que miden los dos �ngulos</h3>
			<h3>conocidos del tri�ngulo</h3>
					<form action="DosAngulosTrianguloServlet" method="post">
			  Primer �ngulo (en grados):<br>
					<input type="text" name="angulo1" value="">
					<br>
			  Segundo �ngulo (en grados):<br>
					<input type="text" name="angulo2" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>


		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("AC")){
		%>
			<h3>Introduzca en los siguientes casilleros los grados que miden los tres �ngulos</h3>
			<h3>conocidos del cuadril�tero convexo</h3>
					<form action="TresAngulosCuadrilateroServlet" method="post">
			  Primer �ngulo (en grados):<br>
					<input type="text" name="angulo1" value="">
					<br>
			  Segundo �ngulo (en grados):<br>
					<input type="text" name="angulo2" value="">
					<br>
			  Tercer �ngulo (en grados):<br>
					<input type="text" name="angulo3" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LC")){
		%>
			<h3>Introduzca en el siguiente casillero la longitud del radio de la circunferencia</h3>
					<form action="LongitudCircunferenciaServlet" method="post">
				  Longitud del radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LA")){
				
		%>
			<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo en grados</h3>
			<h3>y la longitud del radio de la circunferencia</h3>
					<form action="LongitudArcoServlet" method="post">
				  	Grados del �ngulo:<br>
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
			<h3>Introduzca en los siguientes casilleros la longitud del arco y del</h3>
			<h3>radio de la circunferencia a la cual pertenece ese arco</h3>
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
			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados</h3>
			<h3>que mide el �ngulo</h3>
					<form action="ArcoYanguloServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Grados del �ngulo:<br>
						<input type="text" name="angulo" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LAI")){
		%>
			<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo en grados</h3>
			<h3>y la longitud del radio de la circunferencia</h3>
					<form action="LongitudArcoBisServlet" method="post">
				  	Grados del �ngulo:<br>
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
			<h3>Introduzca en los siguientes casilleros la longitud del arco y del</h3>
			<h3>radio de la circunferencia a la cual pertenece ese arco</h3>
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
			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados</h3>
			<h3>que mide el �ngulo</h3>
					<form action="ArcoYanguloBisServlet" method="post">
				  	Longitud del arco:<br>
						<input type="text" name="arco" value="">
						<br>
			  		Grados del �ngulo:<br>
						<input type="text" name="angulo" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LH")){
		%>
			<h3>Introduzca en los siguientes casilleros la longitud del primer y del segundo cateto</h3>
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
			<h3>Introduzca en los siguientes casilleros la longitud la hipotenusa y del otro cateto</h3>
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
			<h3>que tiene el tri�ngulo rect�ngulo</h3>
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
			<h3>que tiene el tri�ngulo rect�ngulo</h3>
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
			<h3>y la altura del tri�ngulo rect�ngulo</h3>
					<form action="AlturaHipotenusaYcatetoServlet" method="post">
			  Altura:<br>
					<input type="text" name="altura" value="">
					<br>
			  Hipotenusa:<br>
					<input type="text" name="hipotenusa" value="">
					<br>
			  Cateto:<br>
					<input type="text" name="cateto" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LRAD")){
		%>
			<h3>Introduzca en el siguiente casillero la longitud de la circunferencia</h3>
					<form action="LongitudCircunfServlet" method="post">
				  Longitud de la circunferencia:<br>
						<input type="text" name="circunferencia" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APR")){
		%>
			<h3>Introduzca en el siguiente casillero el n�mero de lados del pol�gono regular</h3>
					<form action="NumeroDeLadosServlet" method="post">
				  N�mero de lados:<br>
						<input type="text" name="numeroDeLados" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("NLPR")){
		%>
			<h3>Introduzca en el siguiente casillero los grados que miden los �ngulos del pol�gono regular</h3>
					<form action="GradosDeLosAngulosServlet" method="post">
				  Grados de los �ngulos:<br>
						<input type="text" name="gradosDeLosAngulos" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APL")){
		%>
			<h3>Introduzca en los siguientes casilleros la base y la altura del paralelogramo</h3>		
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
			<h3>Introduzca en los siguientes casilleros la altura y el �rea del paralelogramo</h3>		
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
			<h3>Introduzca en los siguientes casilleros la base y el �rea del paralelogramo</h3>		
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
			<h3>Introduzca en los siguientes casilleros la base y la altura del tri�ngulo</h3>			
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
			<h3>Introduzca en los siguientes casilleros la altura y el �rea del tri�ngulo</h3>		
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
			<h3>Introduzca en los siguientes casilleros la base y el �rea del tri�ngulo</h3>		
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
			<h3>trapecio</h3>
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
			<h3>Introduzca en los siguientes casilleros la longitud de las dos bases y el �rea del</h3>
			<h3>trapecio</h3>
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
			<h3>�rea del trapecio</h3>
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
			<h3>Introduzca en los siguientes casilleros las dos diagonales del rombo</h3>		
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
			<h3>Introduzca en los siguientes casilleros la diagonal conocida y el �rea del rombo</h3>		
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
			<h3>Introduzca en los siguientes casilleros el n�mero de lados del pol�gono regular, la longitud</h3>
			<h3>de un lado y el apotema.</h3>
					<form action="NumLadosLongLadoApotemaServlet" method="post">
			  N�mero de lados:<br>
					<input type="text" name="numLados" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  Apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("NPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el �rea del pol�gono regular, la longitud</h3>
			<h3>de un lado y el apotema.</h3>
					<form action="AreaLongLadoApotemaServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  Apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("LPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el �rea del pol�gono regular, el n�mero de lados</h3>
			<h3>y el apotema.</h3>
					<form action="AreaNumLadosApotemaServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  N�mero de lados:<br>
					<input type="text" name="numLados" value="">
					<br>
			  Apotema:<br>
					<input type="text" name="apotema" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("APPOLREG")){
		%>
			<h3>Introduzca en los siguientes casilleros el �rea del pol�gono regular, el n�mero de lados</h3>
			<h3>y la longitud de un lado.</h3>
					<form action="AreaNumLadosLongLadoServlet" method="post">
			  Area:<br>
					<input type="text" name="area" value="">
					<br>
			  Longitud del lado:<br>
					<input type="text" name="longLado" value="">
					<br>
			  N�mero de lados:<br>
					<input type="text" name="numLados" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ACIR")){
		%>
			<h3>Introduzca en el siguiente casillero el radio del c�rculo</h3>		
					<form action="RadioCirculoServlet" method="post">
			  		Radio:<br>
						<input type="text" name="radio" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("RCIR")){
		%>
			<h3>Introduzca en el siguiente casillero el �rea del c�rculo</h3>		
					<form action="AreaCirculoServlet" method="post">
			  		Area:<br>
						<input type="text" name="area" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("ASECIR")){
		%>
			<h3>Introduzca en los siguientes casilleros el radio y los grados del �ngulo que corresponde</h3>
			<h3>al arco</h3>
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
			<h3>Introduzca en los siguientes casilleros el �rea del sector circular y los grados del �ngulo</h3>
			<h3>que corresponde al arco</h3>	
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
			<h3>Introduzca en los siguientes casilleros el �rea del sector circular y el radio</h3>	
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
			<h3>Introduzca en el siguiente casillero los radianes que mide el �ngulo</h3>
					<form action="RadianesServlet" method="post">
				  Radianes:<br>
						<input type="text" name="radianes" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else if(objetoGeometriaEuclidiana.getOperacionGeometriaEuclidiana().equalsIgnoreCase("GRADRAD")){
		%>
			<h3>Introduzca en el siguiente casillero los grados que mide el �ngulo</h3>
					<form action="GradosServlet" method="post">
				  Grados:<br>
						<input type="text" name="grados" value="">
						<br><br>
						<input type="submit" value="Enviar">
					</form>		
		
		<%
			}else{
		%>
			<h3>Clave introducida incorrecta</h3>
			<h3>Para especificar la operaci�n de geometr�a euclidiana que desea</h3>
			<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
			<h3>que se indican.</h3>
			<h3>--Para calcular el n�mero de diagonales de un pol�gono convexo, dado su n�mero de lados,</h3>
			<h3>introduzca en el casillero las letra ND.</h3>
			<h3>--Para calcular los grados que posee un �ngulo de un tri�ngulo conocidos los otros dos,</h3>
			<h3>expresados tambi�n en grados, introduzca en el casillero la letras AT.</h3>
			<h3>--Para calcular los grados que posee un �ngulo de un cuadril�tero convexo conocidos los</h3>
			<h3>otros tres, expresados tambi�n en grados, introduzca en el casillero la letras AC.</h3>
			<h3>--Para calcular la longitud de una circunferencia conocido su radio introduzca en el casillero</h3>
			<h3>las letras LC. Si conocemos la longitud de la circunferencia, para calcular la longitud</h3>
			<h3>del radio introduzca en el casillero las letras LRAD.</h3>
			<h3>--Consideramos un �ngulo cuyo v�rtice est� en el centro de una circunferenicia, es decir,</h3>
			<h3>que ser�a un �ngulo central de esa circunferencia. Este �ngulo determina un arco en dicha circunferencia.</h3>
			<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
			<h3>arco definido por un �ngulo central, conocidos los grados que mide dicho �ngulo y la longitud del radio</h3>
			<h3>de la circunferencia, introduzca en el casillero las letras LA. Para calcular, lo que mide en grados, un </h3>
			<h3>�ngulo central conocidas la longitud del arco que determina dicho �ngulo en una circunferencia en la que</h3>
			<h3>es central y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GA. Para</h3>
			<h3>calcular la longitud del radio de la circunferencia conocidos los grados que mide el �ngulo y la longitud</h3>
			<h3>del arco, introduzca en el casillero las letras LR.</h3>
			<h3>--Consideramos un �ngulo cuyo v�rtice est� en una circunferencia y que tiene sus lados secantes a la</h3>
			<h3>misma. El v�rtice por tanto es un punto cuya distancia al centro de la circunferencia es igual al radio.</h3>
			<h3>A este tipo de �ngulos se los llama inscritos. Este �ngulo determina un arco en dicha circunferencia.</h3>
			<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
			<h3>arco definido por un �ngulo inscrito, conocidos los grados que mide dicho �ngulo y la longitud del radio</h3>
			<h3>de la circunferencia, introduzca en el casillero las letras LAI. Para calcular, lo que mide en grados, un</h3>
			<h3>�ngulo inscrito conocidas la longitud del arco que determina dicho �ngulo en una circunferencia en la que</h3>
			<h3>est� inscrito y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GAI.</h3>
			<h3>Para calcular la longitud del radio de la circunferencia conocidos los grados que mide el �ngulo y la longitud</h3>
			<h3> del arco, introduzca en el casillero las letras LRI.</h3>
			<h3>--Consideremos un tri�ngulo rect�ngulo. Dada la longitud de los dos catetos del tri�ngulo, para hallar</h3>
			<h3>la longitud de la hipotenusa introduzca en el casillero las letras LH. Para hallar la longitud de un cateto</h3>
			<h3>conocidos el otro y la hipotenusa introduzca en el casillero las letras LCAT.</h3>
			<h3>--Consideremos un tri�ngulo rect�ngulo posicionado de tal forma que su hipotenusa hace de base del tri�ngulo.</h3>
			<h3>Tal tri�ngulo posicionado de esa forma va a tener una altura y como todo tri�ngulo rect�ngulo contar� adem�s</h3>
			<h3>con dos catetos. Para calcular la altura de tal tri�ngulo rect�ngulo conocidos la longitud de la hipotenusa y</h3>
			<h3>de los dos catetos introduzca en el casillero las letras ATR. Para calcular la longitud de la hipotenusa</h3>
			<h3>conocida la longitud de los catetos y la altura del tri�ngulo introduzca en el casillero las letras HTR.</h3>
			<h3>Para calcular la longitud de un cateto conocida la longitud del otro cateto, de la hipotenusa y la altura del</h3>
			<h3>tri�ngulo, introduzca en el casillero las letras CTR.</h3>
				<form action="OperacionGeometriaEuclidianaUsuarioServlet" method="post">
			Operaci�n escogida:<br>
					<input type="text" name="operacionGeometriaEuclidiana" value="">
					<br><br>
				  	  <input type="submit" value="Enviar">
				</form>	
					
		<%
			}
		%>
</body>
</html>