<%@page import="opcionOperacionTrigonometriaUsuario.OperacionTrigonometriaUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de operaciones de trigonometria</title>
</head>
<body>
	<%
		HttpSession httpSession2 = request.getSession();
			OperacionTrigonometriaUsuario objetoOperacionTrignomet = (OperacionTrigonometriaUsuario) httpSession2.getAttribute("OBJETOOPERACIONTRIGONOMETRIA");
	%>
			<%
				if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ACC")){
			%>
	
					<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y lo que mide el �ngulo agudo</h3>
					<h3>conocido, este �ltimo valor expresado �nicamente en grados. Los datos introducidos han de ser </h3>
					<h3>exclusivamente num�ricos.</h3>				
					<form action="AnguloCatetosServlet" method="post">
					  Longitud de la hipotenusa:<br>
							<input type="text" name="hipotenusa" value="">
							<br>
					  �ngulo agudo conocido (en grados):<br>
							<input type="text" name="anguloConocido" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ACONH")){
		%>
					<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo agudo conocido (este valor expresado</h3>
					<h3>�nicamente en grados) y la longitud del cateto opuesto a dicho �ngulo. Los datos introducidos han de ser</h3>
					<h3>exclusivamente num�ricos.</h3>				
					<form action="AnguloCatetoContHiptenServlet" method="post">
					  �ngulo agudo conocido (en grados):<br>
							<input type="text" name="anguloConocido" value="">
							<br>
					  Longitud del cateto opuesto:<br>
							<input type="text" name="catetoOpuesto" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("AOPH")){
		%>
					<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo agudo conocido (este valor expresado</h3>
					<h3>�nicamente en grados) y la longitud del cateto contiguo a dicho �ngulo. Los datos introducidos han de ser</h3>
					<h3>exclusivamente num�ricos.</h3>
					<form action="AnguloCatetoOpuestoHipotenServlet" method="post">
					  �ngulo agudo conocido (en grados):<br>
							<input type="text" name="anguloConocido" value="">
							<br>
					  Longitud del cateto contiguo:<br>
							<input type="text" name="catetoContiguo" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("CAA")){
		%>
					<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y del cateto conocido.</h3>
					<h3>Los datos introducidos han de ser exclusivamente num�ricos.</h3>
					<form action="CatetoAngulosServlet" method="post">
					  Longitud de la hipotenusa:<br>
							<input type="text" name="hipotenusa" value="">
							<br>
					  Longitud del cateto conocido:<br>
							<input type="text" name="catetoConocido" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>

		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("AAH")){
		%>
					<h3>Introduzca en los siguientes casilleros la longitud de los dos catetos.</h3>
					<h3>Los datos introducidos han de ser exclusivamente num�ricos.</h3>					
					<form action="AngulosHipotenusaServlet" method="post">
					  Longitud del cateto conocido:<br>
							<input type="text" name="catetoConocido1" value="">
							<br>
					  Longitud del otro cateto conocido:<br>
							<input type="text" name="catetoConocido2" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("SEN")){
		%>
						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>
						<h3>calcular su seno. El dato introducido ha de ser exclusivamente num�rico.</h3>
								<form action="SenoServlet" method="post">
					  �ngulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("COS")){
		%>
						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>
						<h3>calcular su coseno. El dato introducido ha de ser exclusivamente num�rico.</h3>
								<form action="CosenoServlet" method="post">
					  �ngulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("TG")){
		%>
						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>
						<h3>calcular su tangente. El dato introducido ha de ser exclusivamente num�rico.</h3>						
								<form action="TangenteServlet" method="post">
					  �ngulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ASEN")){
		%>
						<h3>Introduzca en el siguiente casillero el valor del seno del cual se quiere calcular el</h3>
						<h3>�ngulo que le corresponde (en grados).</h3>
								<form action="ArcoSenoServlet" method="post">
					  Seno:<br>
							<input type="text" name="seno" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ACOS")){
		%>
						<h3>Introduzca en el siguiente casillero el valor del coseno del cual se quiere calcular el</h3>
						<h3>�ngulo que le corresponde (en grados).</h3>						
								<form action="ArcoCosenoServlet" method="post">
					  Coseno:<br>
							<input type="text" name="coseno" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ATG")){
		%>
						<h3>Introduzca en el siguiente casillero el valor de la tangente del cual se quiere calcular el</h3>
						<h3>�ngulo que le corresponde (en grados).</h3>	
								<form action="ArcoTangenteServlet" method="post">
					  Tangente:<br>
							<input type="text" name="tangente" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("COSTG")){
		%>
						<h3>Introduzca en el siguiente casillero el valor del seno.</h3>
								<form action="CosenoTangenteServlet" method="post">
					  Seno:<br>
							<input type="text" name="seno" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("STG")){
		%>
						<h3>Introduzca en el siguiente casillero el valor del coseno.</h3>
								<form action="SenoTangenteServlet" method="post">
					  Coseno:<br>
							<input type="text" name="coseno" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("SCOS")){
		%>
						<h3>Introduzca en el siguiente casillero el valor de la tangente.</h3>
								<form action="SenoCosenoServlet" method="post">
					  Tangente:<br>
							<input type="text" name="tangente" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("SCT")){
		%>
			        <h3>Introduzca en los siguientes casilleros la longitud de los dos catetos,</h3>
			        <h3>contiguo y opuesto, al �ngulo del que se desea saber su medida, as� como</h3>
			        <h3>la longitud de la hipotenusa. El �ngulo obtenido se expresar� en grados.</h3>
					<form action="SenoCosenoTangenteServlet" method="post">
		  			  Longitud de la hipotenusa:<br>
							<input type="text" name="hipotenusa" value="">
							<br>
					  Longitud del cateto opuesto:<br>
					  		<input type="text" name="catetoOpuesto" value="">
							<br>
					  Longitud del cateto contiguo:<br>
					  		<input type="text" name="catetoContiguo" value="">
					        <br><br>
					        <input type="submit" value="Enviar">
					  </form>
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("APOLREGLN")){
		%>
					<h3>Introduzca en los siguientes casilleros la longitud del lado y el n�mero de</h3>
					<h3>lados del pol�gono regular. Los datos introducidos han de ser exclusivamente num�ricos.</h3>					
					<form action="AreaPolRegConLongLadoYnumLadosServlet" method="post">
					  Longitud del lado:<br>
							<input type="text" name="longitudLado" value="">
							<br>
					  N�mero de lados:<br>
							<input type="text" name="numeroLados" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("LPOLREGAN")){
		%>	
					<h3>Introduzca en los siguientes casilleros el �rea y el n�mero de lados del</h3>
					<h3>pol�gono regular. Los datos introducidos han de ser exclusivamente num�ricos.</h3>					
					<form action="LongLadoPolRegConAreaYnumLadosServlet" method="post">
					  �rea:<br>
							<input type="text" name="area" value="">
							<br>
					  N�mero de lados:<br>
							<input type="text" name="numeroLados" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else{
		%>
					<h3>Clave introducida incorrecta.</h3>
					<h2>OPERACIONES DE TRIGONOMETR�A</h2>
					<h3>Presentamos las operaciones para calcular las razones trigonom�tricas fundamentales de un</h3>
					<h3>�ngulo, conocido lo que mide dicho �ngulo o bien conocidas la longitud de los catetos y la</h3>
					<h3>hipotenusa. Para hacer uso de las primeras operaciones el �ngulo deber� expresarse exclusivamente </h3>
					<h3>en grados del sistema sexagesimal. El dato o datos introducidos deber�n ser exclusivamente</h3>
					<h3>num�ricos.</h3>
					<h3>--Para calcular el seno de un �ngulo introduzca en el siguiente casillero las</h3>
					<h3>letras SEN.</h3>
					<h3>--Para calcular el coseno de un �ngulo introduzca en el siguiente casillero las</h3>
					<h3>letras COS.</h3>
					<h3>--Para calcular la tangente de un �ngulo introduzca en el siguiente casillero las</h3>
					<h3>letras TG.</h3>
					<h3>--Para calcular las razones trigonom�tricas de un �ngulo (seno, coseno y tangente),</h3>
					<h3>conocidas la longitud de la hipotenusa, del cateto opuesto y del cateto contiguo a</h3>
					<h3>dicho �ngulo, introduzca en el siguiente casillero las letras SCT.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operaci�n escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>		
					<h3>Presentamos las operaciones con las que podemos calcular lo que mide un �ngulo, conocido </h3>
					<h3>el valor de una raz�n trigonom�trica dicho �ngulo. El valor resultante vendr� expresado</h3>
					<h3>exclusivamente en grados del sistema sexagesimal. Tambi�n presentamos las operaciones mediante</h3>
					<h3>las cuales podemos calcular las otras dos razones trigonom�tricas de un �ngulo conocida una</h3>
					<h3>de ellas.</h3>
					<h3>--Para calcular el valor de un �ngulo conocido el valor de su seno introduzca en</h3>
					<h3>el siguiente casillero las letras ASEN.</h3>
					<h3>--Para calcular el valor de un �ngulo conocido el valor de su coseno introduzca en</h3>
					<h3>el siguiente casillero las letras ACOS.</h3>
					<h3>--Para calcular el valor de un �ngulo conocido el valor de su tangente introduzca en</h3>
					<h3>el siguiente casillero las letras ATG.</h3>
					<h3>--Para calcular las otras dos razones trigonom�tricas de un �ngulo conocido el seno</h3>
					<h3>de dicho �ngulo introduzca en el siguiente casillero las letras COSTG. El problema debe</h3>
					<h3>resolverse, sin la utilizaci�n de esta calculadora, mediante la aplicaci�n adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonom�ticas.</h3>
					<h3>--Para calcular las otras dos razones trigonom�tricas de un �ngulo conocido el coseno</h3>
					<h3>de dicho �ngulo introduzca en el siguiente casillero las letras STG. El problema debe</h3>
					<h3>resolverse, sin la utilizaci�n de esta calculadora, mediante la aplicaci�n adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonom�ticas.</h3>
					<h3>--Para calcular las otras dos razones trigonom�tricas de un �ngulo conocida la tangente</h3>
					<h3>de dicho �ngulo introduzca en el siguiente casillero las letras SCOS. El problema debe</h3>
					<h3>resolverse, sin la utilizaci�n de esta calculadora, mediante la aplicaci�n adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonom�ticas.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operaci�n escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>			
					<h3>Los tri�ngulos rect�ngulos son aquellos que tienen un �ngulo recto, es decir,</h3>
					<h3>que mide 90 grados. El lado opuesto al �ngulo recto se denomina hipotenusa y</h3>
					<h3>es el lado de mayor longitud de estos tri�ngulos. Los lados de menor longitud</h3>
					<h3>se denominan catetos y son perpendiculares entre s� ya que forman el �ngulo recto.</h3>
					<h3>As�, de un tri�ngulo rect�ngulo podemos enumerar sus elementos que son: los tres</h3>
					<h3>�ngulos, uno de ellos conocidos pues es el recto, y los tres lados; la hipotenusa</h3>
					<h3>y los dos catetos.</h3>
					<h3>Resolver un tri�ngulo rect�ngulo consiste en calcular todos sus elementos, conocido</h3>
					<h3>un n�mero m�nimo de los mismos que sea suficiente para determinarlo.</h3>
					<h3>La medida de los �ngulos deber� expresarse exclusivamente en grados del sistema</h3>
					<h3>sexagesimal, y los �ngulos calculados se expresar�n tambi�n de esta forma.</h3>
					<h3>--Para calcular uno de los �ngulos agudos y los dos catetos conocida la hipotenusa</h3>
					<h3>y el otro �ngulo agudo, introduzca en el siguiente casillero la letras ACC.</h3>
					<h3>--Conocido un �ngulo agudo y su cateto opuesto, para calcular el otro �ngulo agudo,</h3>
					<h3>el otro cateto y la hipotenusa introduzca en el siguiente casillero las letras ACONH.</h3>
					<h3>--Conocido un �ngulo agudo y su cateto contiguo, para calcular el otro �ngulo agudo,</h3>
					<h3>el otro cateto y la hipotenusa introduzca en el siguiente casillero las letras AOPH.</h3>
					<h3>--Conocida la hipotenusa y un cateto, para calcular el otro cateto y los �ngulos</h3>
					<h3>agudos introduzca en el siguiente casillero las letras CAA.</h3>
					<h3>--Conocidos los dos catetos, para calcular los dos �ngulos agudos y la hipotenusa</h3>
					<h3>introduzca en el casillero las letras AAH.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operaci�n escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>
					<h3>Introducimos unas operaciones que corresponden con unos problemas de cierta complejidad,</h3>
					<h3>ya que su resolucion, sin la utilizaci�n de esta calculadora, requiere no s�lo de conocimientos</h3>
					<h3>de trigonometr�a sino tambi�n de c�lculo de �reas.</h3>
					<h3>--Para calcular el �rea de un pol�gono regular, conocidos la longitud de un lado y el</h3>
					<h3>n�mero de lados que tiene dicho pol�gono, introduzca en el casillero las letras APOLREGLN.</h3>
					<h3>--Para calcular la longitud de los lados de un pol�gono regular, conocidos el �rea de</h3>
					<h3>dicho pol�gono y el n�mero de lados que tiene, introduzca en el casillero las letras</h3>
					<h3>LPOLREGAN.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operaci�n escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>
							
		<%
			}
		%>
</body>
</html>