<%@page import="opcionSalirOcontinuarEnLaAplicacion.DecisionSalirDeLaAplicacion"%>
<%@page import="opcionOperacionProporcionalidadUsuario.ReglaDeTres"%>
<%@page import="operacionesDeProporcionalidad.OperacionesDeProporcionalidad"%>
<%@page import="opcionOperacionProporcionalidadUsuario.Porcentaje"%>
<%@page import="opcionOperacionProporcionalidadUsuario.OperacionProporcionalidadUsuario"%>
<%@page import="operacionesGeometriaAnalitica.OperacionesGeometriaAnalitica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FocoDirectriz"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.FuncionCuadratica"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasTresPuntos"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos"%>
<%@page import="opcionOperacionGeometriaAnaliticaUsuario.OperacionGeometriaAnaliticaUsuario"%>
<%@page import="opcionOperacionAritmeticaUsuario.RaizCuadrada"%>
<%@page import="opcionOperacionAritmeticaUsuario.Potenciacion"%>
<%@page import="opcionOperacionAritmeticaUsuario.Division"%>
<%@page import="opcionOperacionAritmeticaUsuario.Multiplicacion"%>
<%@page import="opcionOperacionAritmeticaUsuario.Resta"%>
<%@page import="operacionesAritmeticas.OperacionesAritmeticas"%>
<%@page import="opcionOperacionAritmeticaUsuario.Suma"%>
<%@page import="opcionOperacionAritmeticaUsuario.OperacionAritmeticaUsuario"%>
<%@page import="opcionEscogidaCalculadora.OpcionAreaMatematicas"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de la calculadora</title>
</head>
<body>
<%
	HttpSession httpSession = request.getSession();
OpcionAreaMatematicas objetoAreaMatematicas = (OpcionAreaMatematicas) httpSession.getAttribute("OBJETOAREAMATEMATICAS");
%>

<%
	if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("A")){
%>

				<h2>OPERACIONES ARITMETICAS</h2>
		<h3>Para especificar la operación aritmética que desea realizar</h3>
		<h3>rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>Si la operación a realizar es una suma introduzca en el casillero la letra S.</h3>
		<h3>Si la operación a realizar es una resta introduzca en el casillero la letra R.</h3>
		<h3>Si la operación a realizar es un sumatorio (más de dos sumandos) introduzca en el casillero las letras SUM.</h3>
		<h3>Si la operación a realizar es una multiplicación introduzca la letra M.</h3>
		<h3>Si la operación a realizar es un productorio (más de dos factores) introduzca en el casillero las letras PRO.</h3>		
		<h3>Si la operación a realizar es una división introduzca la letra D.</h3>
		<h3>Si la operación a realizar es una potencia introduzca la letra P.</h3>
		<h3>Si la operación a realizar es una raíz cuadrada introduzca las letras RC.</h3>
		<h3>Si la operación a realizar es un factorial introduzca la letra F.</h3>
			<form action="OperacionAritmeticaUsuarioServlet" method="post">
		Operación escogida:<br>
			<input type="text" name="operacionAritmetica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
		</form>



<%
			}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("GA")){
		%>


				<h2>OPERACIONES DE GEOMETRIA ANALITICA</h2>
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
		<h3>vertical. La expresión de la parábola calculada será del tipo y = ax<sup>2</sup>+ bx + c.</h3>
			<form action="OperacionGeometriaAnaliticaUsuarioServlet" method="post">
		Operación escogida:<br>
			<input type="text" name="operacionGeometriaAnalitica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("P")){
	%>

		<h2>OPERACIONES DE PROPORCIONALIDAD</h2>
		<h3>Para especificar la operación de proporcionalidad que desea</h3>
		<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>--Para calcular el porcentaje de una cantidad introduzca en el casillero la letra P.</h3>
		<h3>--Para realizar una regla de tres directa introduzca en el casillero las letras RTD.</h3>
		<h3>--Para realizar una regla de tres inversa introduzca en el casillero las letras RTI.</h3>
			<form action="OperacionProporcionalidadUsuarioServlet" method="post">
		Operación escogida:<br>
				<input type="text" name="operacionProporcionalidad" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("GE")){
%>

		<h2>OPERACIONES DE GEOMETRIA EUCLIDIANA</h2>
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
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("C")){
%>
		<h2>OPERACIONES DE COMBINATORIA</h2>
		<h3>Para especificar la operación de combinatoria que desea realizar rellene</h3>
		<h3>el siguiente casillero siguiendo las instrucciones que se indican.</h3>
		<h3>--Variaciones: dados "n" elementos, llamamos variaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podemos formar con esos "n" elementos,</h3>
		<h3>tomados de "r" en "r", y entendiendo que dos conjuntos son distintos si</h3>
		<h3>difieren en uno, al menos, de sus elementos, o si, teniendo idénticos</h3>
		<h3>elementos difieren en el orden de los mismos. Para calcular variaciones </h3>
		<h3>introduzca en el casillero las letras VAR.</h3>
		<h3>--Combinaciones: dados "n" elementos, llamamos combinaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podemos formar con esos "n" elementos,</h3>
		<h3>tomados de "r" en "r", y entendiendo que dos conjuntos son distintos si</h3>
		<h3>difieren en uno, al menos, de sus elementos. Para calcular combinaciones</h3>
		<h3>introduzca en el casillero las letras COM.</h3>
		<h3>--Variaciones con repetición: a partir de "n" elementos distintos, formamos</h3>
		<h3>variaciones de orden "r" tales que dos de sus elementos, tres.... los "r"</h3>
		<h3>elementos pueden ser uno mismo. Para calcular variaciones con repetición</h3>
		<h3>introduzca en el casillero las letras VREP.</h3>
		<h3>--Combinaciones con repetición: a partir de "n" elementos distintos, formamos</h3>
		<h3>combinaciones de orden "r" tales que dos de sus elementos, tres..., "r" elementos,</h3>
		<h3>pueden ser uno mismo. Para calcular combinaciones con repetición introduzca en</h3>
		<h3>el casillero las letras CREP.</h3>
		<h3>--Permutaciones: dados "r" elementos, llamaremos permutaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podamos formar con esos "r" elementos, tomados</h3>
		<h3>de "r" en "r". Realmente las permutaciones son un caso particular de las</h3>
		<h3>variaciones en el que "r" = "n". Dado que todos los conjuntos constan de los</h3>
		<h3>mismos "r" elementos, sólo podrán diferir en el orden de los mismos. Para calcular</h3>
		<h3>permutaciones introduzca en el casillero las letras PER.</h3>
		<h3>--Permutaciones con repetición: sean "r" elementos de los que "r<sub>1</sub>" son iguales</h3>
		<h3>entre sí, "r<sub>2</sub>" son iguales entre sí,..., "r<sub>k</sub>" son iguales entre sí,</h3>
		<h3>con r<sub>1</sub> + r<sub>2</sub> + ... +r<sub>k</sub> = r. Para calcular el número de tales permutaciones, </h3>
		<h3>en este caso con repetición, introduzca en el casillero las letras PREP.</h3>
			<form action="OperacionCombinatoriaUsuarioServlet" method="post">
		Operación escogida:<br>
				<input type="text" name="operacionCombinatoria" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
		

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("E")){
%>
		<h2>OPERACIONES DE ESTADÍSTICA</h2>
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
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("T")){
%>
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
		}else{
%>
		<h3>Clave introducida incorrecta.</h3>
		<h3>Para especificar a que área pertenece la operación</h3>
	   	<h3>matemática que desea realizar rellene el siguiente </h3>
	   	<h3>casillero siguiendo las instrucciones que se indican.</h3>
	   	<h3>--Si la operación que desea realizar es de tipo aritmético</h3>
	   	<h3>introduzca en el casillero letra A.</h3>
	   	<h3>--Si la operación que desea realizar pertenece al área</h3>
	   	<h3>de geometría analítica introduzca en el casillero las letras GA.</h3>
	   	<h3>--Si la operación que desea realizar pertenece al área</h3>
   		<h3>de proporcionalidad introduzca en el casillero la letra P.</h3>
   		<h3>--Si la operación que desea realizar pertenece al área</h3>
   		<h3>de geometría euclidiana introduzca en el casillero las letras GE.</h3>
   		<h3>--Si la operación que desea realizar pertenece al área</h3>
   		<h3>de la combinatoria introduzca en el casillero la letra C.</h3>
   		<h3>--Si la operación que desea realizar pertenece al área</h3>
   		<h3>de la estadística introduzca en el casillero la letra E.</h3>
    	<h3>--Si la operación que desea realizar pertence al área</h3>
   		<h3>de la trigonometría introduzca en el casillero la letra T.</h3>
	   	<form action="OpcionEscogidaParaCalculadora2Servlet" method="post">
	   	Area escogida:<br>
		  <input type="text" name="opcionAreaMatematicas" value="">
		  <br><br>
		  	  <input type="submit" value="Enviar">
		</form>

<%}%>
</body>
</html>