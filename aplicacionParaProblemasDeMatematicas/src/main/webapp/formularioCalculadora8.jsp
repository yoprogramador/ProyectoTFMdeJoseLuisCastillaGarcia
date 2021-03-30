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
	
					<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y lo que mide el ángulo agudo</h3>
					<h3>conocido, este último valor expresado únicamente en grados. Los datos introducidos han de ser </h3>
					<h3>exclusivamente numéricos.</h3>				
					<form action="AnguloCatetosServlet" method="post">
					  Longitud de la hipotenusa:<br>
							<input type="text" name="hipotenusa" value="">
							<br>
					  Ángulo agudo conocido (en grados):<br>
							<input type="text" name="anguloConocido" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ACONH")){
		%>
					<h3>Introduzca en los siguientes casilleros lo que mide el ángulo agudo conocido (este valor expresado</h3>
					<h3>únicamente en grados) y la longitud del cateto opuesto a dicho ángulo. Los datos introducidos han de ser</h3>
					<h3>exclusivamente numéricos.</h3>				
					<form action="AnguloCatetoContHiptenServlet" method="post">
					  Ángulo agudo conocido (en grados):<br>
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
					<h3>Introduzca en los siguientes casilleros lo que mide el ángulo agudo conocido (este valor expresado</h3>
					<h3>únicamente en grados) y la longitud del cateto contiguo a dicho ángulo. Los datos introducidos han de ser</h3>
					<h3>exclusivamente numéricos.</h3>
					<form action="AnguloCatetoOpuestoHipotenServlet" method="post">
					  Ángulo agudo conocido (en grados):<br>
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
					<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>
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
					<h3>Los datos introducidos han de ser exclusivamente numéricos.</h3>					
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
						<h3>Introduzca en el siguiente casillero lo que mide al ángulo (en grados) del cual se quiere</h3>
						<h3>calcular su seno. El dato introducido ha de ser exclusivamente numérico.</h3>
								<form action="SenoServlet" method="post">
					  Ángulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("COS")){
		%>
						<h3>Introduzca en el siguiente casillero lo que mide al ángulo (en grados) del cual se quiere</h3>
						<h3>calcular su coseno. El dato introducido ha de ser exclusivamente numérico.</h3>
								<form action="CosenoServlet" method="post">
					  Ángulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>

		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("TG")){
		%>
						<h3>Introduzca en el siguiente casillero lo que mide al ángulo (en grados) del cual se quiere</h3>
						<h3>calcular su tangente. El dato introducido ha de ser exclusivamente numérico.</h3>						
								<form action="TangenteServlet" method="post">
					  Ángulo:<br>
							<input type="text" name="angulo" value="">
							<br><br>
							<input type="submit" value="Enviar">
						</form>
		
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("ASEN")){
		%>
						<h3>Introduzca en el siguiente casillero el valor del seno del cual se quiere calcular el</h3>
						<h3>ángulo que le corresponde (en grados).</h3>
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
						<h3>ángulo que le corresponde (en grados).</h3>						
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
						<h3>ángulo que le corresponde (en grados).</h3>	
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
			        <h3>contiguo y opuesto, al ángulo del que se desea saber su medida, así como</h3>
			        <h3>la longitud de la hipotenusa. El ángulo obtenido se expresará en grados.</h3>
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
					<h3>Introduzca en los siguientes casilleros la longitud del lado y el número de</h3>
					<h3>lados del polígono regular. Los datos introducidos han de ser exclusivamente numéricos.</h3>					
					<form action="AreaPolRegConLongLadoYnumLadosServlet" method="post">
					  Longitud del lado:<br>
							<input type="text" name="longitudLado" value="">
							<br>
					  Número de lados:<br>
							<input type="text" name="numeroLados" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		<%
			}else if(objetoOperacionTrignomet.getOperacionTrigonometria().equalsIgnoreCase("LPOLREGAN")){
		%>	
					<h3>Introduzca en los siguientes casilleros el área y el número de lados del</h3>
					<h3>polígono regular. Los datos introducidos han de ser exclusivamente numéricos.</h3>					
					<form action="LongLadoPolRegConAreaYnumLadosServlet" method="post">
					  Área:<br>
							<input type="text" name="area" value="">
							<br>
					  Número de lados:<br>
							<input type="text" name="numeroLados" value="">
							<br><br>					
					<input type="submit" value="Enviar">
					</form>
		
		<%
			}else{
		%>
					<h3>Clave introducida incorrecta.</h3>
					<h2>OPERACIONES DE TRIGONOMETRÍA</h2>
					<h3>Presentamos las operaciones para calcular las razones trigonométricas fundamentales de un</h3>
					<h3>ángulo, conocido lo que mide dicho ángulo o bien conocidas la longitud de los catetos y la</h3>
					<h3>hipotenusa. Para hacer uso de las primeras operaciones el ángulo deberá expresarse exclusivamente </h3>
					<h3>en grados del sistema sexagesimal. El dato o datos introducidos deberán ser exclusivamente</h3>
					<h3>numéricos.</h3>
					<h3>--Para calcular el seno de un ángulo introduzca en el siguiente casillero las</h3>
					<h3>letras SEN.</h3>
					<h3>--Para calcular el coseno de un ángulo introduzca en el siguiente casillero las</h3>
					<h3>letras COS.</h3>
					<h3>--Para calcular la tangente de un ángulo introduzca en el siguiente casillero las</h3>
					<h3>letras TG.</h3>
					<h3>--Para calcular las razones trigonométricas de un ángulo (seno, coseno y tangente),</h3>
					<h3>conocidas la longitud de la hipotenusa, del cateto opuesto y del cateto contiguo a</h3>
					<h3>dicho ángulo, introduzca en el siguiente casillero las letras SCT.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operación escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>		
					<h3>Presentamos las operaciones con las que podemos calcular lo que mide un ángulo, conocido </h3>
					<h3>el valor de una razón trigonométrica dicho ángulo. El valor resultante vendrá expresado</h3>
					<h3>exclusivamente en grados del sistema sexagesimal. También presentamos las operaciones mediante</h3>
					<h3>las cuales podemos calcular las otras dos razones trigonométricas de un ángulo conocida una</h3>
					<h3>de ellas.</h3>
					<h3>--Para calcular el valor de un ángulo conocido el valor de su seno introduzca en</h3>
					<h3>el siguiente casillero las letras ASEN.</h3>
					<h3>--Para calcular el valor de un ángulo conocido el valor de su coseno introduzca en</h3>
					<h3>el siguiente casillero las letras ACOS.</h3>
					<h3>--Para calcular el valor de un ángulo conocido el valor de su tangente introduzca en</h3>
					<h3>el siguiente casillero las letras ATG.</h3>
					<h3>--Para calcular las otras dos razones trigonométricas de un ángulo conocido el seno</h3>
					<h3>de dicho ángulo introduzca en el siguiente casillero las letras COSTG. El problema debe</h3>
					<h3>resolverse, sin la utilización de esta calculadora, mediante la aplicación adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonométicas.</h3>
					<h3>--Para calcular las otras dos razones trigonométricas de un ángulo conocido el coseno</h3>
					<h3>de dicho ángulo introduzca en el siguiente casillero las letras STG. El problema debe</h3>
					<h3>resolverse, sin la utilización de esta calculadora, mediante la aplicación adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonométicas.</h3>
					<h3>--Para calcular las otras dos razones trigonométricas de un ángulo conocida la tangente</h3>
					<h3>de dicho ángulo introduzca en el siguiente casillero las letras SCOS. El problema debe</h3>
					<h3>resolverse, sin la utilización de esta calculadora, mediante la aplicación adecuada de</h3>
					<h3>las relaciones fundamentales entre las razones trigonométicas.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operación escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>			
					<h3>Los triángulos rectángulos son aquellos que tienen un ángulo recto, es decir,</h3>
					<h3>que mide 90 grados. El lado opuesto al ángulo recto se denomina hipotenusa y</h3>
					<h3>es el lado de mayor longitud de estos triángulos. Los lados de menor longitud</h3>
					<h3>se denominan catetos y son perpendiculares entre sí ya que forman el ángulo recto.</h3>
					<h3>Así, de un triángulo rectángulo podemos enumerar sus elementos que son: los tres</h3>
					<h3>ángulos, uno de ellos conocidos pues es el recto, y los tres lados; la hipotenusa</h3>
					<h3>y los dos catetos.</h3>
					<h3>Resolver un triángulo rectángulo consiste en calcular todos sus elementos, conocido</h3>
					<h3>un número mínimo de los mismos que sea suficiente para determinarlo.</h3>
					<h3>La medida de los ángulos deberá expresarse exclusivamente en grados del sistema</h3>
					<h3>sexagesimal, y los ángulos calculados se expresarán también de esta forma.</h3>
					<h3>--Para calcular uno de los ángulos agudos y los dos catetos conocida la hipotenusa</h3>
					<h3>y el otro ángulo agudo, introduzca en el siguiente casillero la letras ACC.</h3>
					<h3>--Conocido un ángulo agudo y su cateto opuesto, para calcular el otro ángulo agudo,</h3>
					<h3>el otro cateto y la hipotenusa introduzca en el siguiente casillero las letras ACONH.</h3>
					<h3>--Conocido un ángulo agudo y su cateto contiguo, para calcular el otro ángulo agudo,</h3>
					<h3>el otro cateto y la hipotenusa introduzca en el siguiente casillero las letras AOPH.</h3>
					<h3>--Conocida la hipotenusa y un cateto, para calcular el otro cateto y los ángulos</h3>
					<h3>agudos introduzca en el siguiente casillero las letras CAA.</h3>
					<h3>--Conocidos los dos catetos, para calcular los dos ángulos agudos y la hipotenusa</h3>
					<h3>introduzca en el casillero las letras AAH.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operación escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>
					<h3>Introducimos unas operaciones que corresponden con unos problemas de cierta complejidad,</h3>
					<h3>ya que su resolucion, sin la utilización de esta calculadora, requiere no sólo de conocimientos</h3>
					<h3>de trigonometría sino también de cálculo de áreas.</h3>
					<h3>--Para calcular el área de un polígono regular, conocidos la longitud de un lado y el</h3>
					<h3>número de lados que tiene dicho polígono, introduzca en el casillero las letras APOLREGLN.</h3>
					<h3>--Para calcular la longitud de los lados de un polígono regular, conocidos el área de</h3>
					<h3>dicho polígono y el número de lados que tiene, introduzca en el casillero las letras</h3>
					<h3>LPOLREGAN.</h3>
						<form action="OperacionTrigonometriaUsuarioServlet" method="post">
					Operación escogida:<br>
							<input type="text" name="operacionTrigonometria" value="">
							<br><br>
						  	  <input type="submit" value="Enviar">
						</form>
							
		<%
			}
		%>
</body>
</html>