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
		<h3>Para especificar la operaci�n aritm�tica que desea realizar</h3>
		<h3>rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>Si la operaci�n a realizar es una suma introduzca en el casillero la letra S.</h3>
		<h3>Si la operaci�n a realizar es una resta introduzca en el casillero la letra R.</h3>
		<h3>Si la operaci�n a realizar es un sumatorio (m�s de dos sumandos) introduzca en el casillero las letras SUM.</h3>
		<h3>Si la operaci�n a realizar es una multiplicaci�n introduzca la letra M.</h3>
		<h3>Si la operaci�n a realizar es un productorio (m�s de dos factores) introduzca en el casillero las letras PRO.</h3>		
		<h3>Si la operaci�n a realizar es una divisi�n introduzca la letra D.</h3>
		<h3>Si la operaci�n a realizar es una potencia introduzca la letra P.</h3>
		<h3>Si la operaci�n a realizar es una ra�z cuadrada introduzca las letras RC.</h3>
		<h3>Si la operaci�n a realizar es un factorial introduzca la letra F.</h3>
			<form action="OperacionAritmeticaUsuarioServlet" method="post">
		Operaci�n escogida:<br>
			<input type="text" name="operacionAritmetica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
		</form>



<%
			}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("GA")){
		%>


				<h2>OPERACIONES DE GEOMETRIA ANALITICA</h2>
		<h3>  Para especificar la operaci�n de geometr�a anal�tica que desea</h3>
		<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>--Para calcular la distancia entre dos puntos introduzca en el casillero la letra D.</h3>
		<h3>--Para calcular el punto medio entre dos puntos dados introduzca en el casillero la letra M.</h3>
		<h3>--Para averiguar si tres puntos est�n alineados introduzca en el casillero las letras PA.</h3>
		<h3>--Para calcular la ecuaci�n gen�rica de una recta (y = ax + b) dados dos puntos por los que</h3>
		<h3>pasa dicha recta introduzca en el casillero la letra R.</h3>
		<h3>--Para calcular el punto de corte (intersecci�n) entre dos rectas introduzca en el casillero</h3>
		<h3>las letras PI.</h3>
		<h3>--Para calcular la ecuaci�n de la recta (y = ax + b) que pasa por un punto dado y que es</h3>
		<h3>paralela a otra recta dada introduzca en el casillero las letras RP.</h3>
		<h3>--Para calcular la ecuaci�n de la recta (y = ax + b) que pasa por un punto dado y que es</h3>
		<h3>perpendicular a otra recta dada introduzca en el casillero las letras RPE.</h3>
		<h3>--Para calcular la distancia entre un punto y una recta expresada por su ecuaci�n</h3>
		<h3>gen�rica (y = ax + b) introduzca las letras DPR.</h3>
		<h3>--Para calcular la distancia entre dos rectas paralelas dadas en su forma gen�rica (y = ax + b)</h3>
		<h3>introduzca las letras DR. Si las rectas introducidas fueran secantes o coincidentes la</h3>
		<h3>calculadora devolver�a el valor de cero.</h3>
		<h3>--Para calcular las bisectrices determinadas por dos rectas que se cruzan introduzca la letra B.</h3>
		<h3>Las bisectrices son rectas que equidistan de otras dos que se cruzan. Los datos a introducir</h3>
		<h3>deben corresponder con la ecuaci�n gen�rica (y = ax + b) de las rectas dadas, y las rectas</h3>
		<h3>bisectrices tambi�n se expresar�n de esa forma. Si las rectas introducidas fueran paralelas</h3>
		<h3>la calculadora devolver� el mensaje de que no existen bisectrices para tales rectas.</h3>
		<h3>--Para calcular el v�rtice y los puntos de corte con el eje x de una funci�n cuadr�tica</h3>
		<h3>(par�bola) dada en su expresi�n gen�rica (y = ax<sup>2</sup>+ bx + c) introduzca las letras VPC.</h3>
		<h3>--Para calcular una funci�n cuadr�tica (par�bola) dados el foco y la directriz introduzca</h3>
		<h3>las letras FC. La par�bola es aquella figura geom�trica cuyos puntos equidistan de un punto</h3>
		<h3>llamado foco, y de una recta llamada directriz. Para el c�lculo consideramos que la directriz</h3>
		<h3>es una recta paralela al eje horizontal (eje x) y que por tanto la par�bola tiene una disposici�n</h3>
		<h3>vertical. La expresi�n de la par�bola calculada ser� del tipo y = ax<sup>2</sup>+ bx + c.</h3>
			<form action="OperacionGeometriaAnaliticaUsuarioServlet" method="post">
		Operaci�n escogida:<br>
			<input type="text" name="operacionGeometriaAnalitica" value="">
			<br><br>
		  	  <input type="submit" value="Enviar">
			</form>

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("P")){
	%>

		<h2>OPERACIONES DE PROPORCIONALIDAD</h2>
		<h3>Para especificar la operaci�n de proporcionalidad que desea</h3>
		<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>--Para calcular el porcentaje de una cantidad introduzca en el casillero la letra P.</h3>
		<h3>--Para realizar una regla de tres directa introduzca en el casillero las letras RTD.</h3>
		<h3>--Para realizar una regla de tres inversa introduzca en el casillero las letras RTI.</h3>
			<form action="OperacionProporcionalidadUsuarioServlet" method="post">
		Operaci�n escogida:<br>
				<input type="text" name="operacionProporcionalidad" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("GE")){
%>

		<h2>OPERACIONES DE GEOMETRIA EUCLIDIANA</h2>
		<h3>Para especificar la operaci�n de geometr�a euclidiana que desea</h3>
		<h3>realizar rellene el siguiente casillero siguiendo las instrucciones</h3>
		<h3>que se indican.</h3>
		<h3>--Para calcular el n�mero de diagonales de un pol�gono convexo, dado su n�mero de lados,</h3>
		<h3>introduzca en el casillero las letra ND.</h3>
		<h3>--Para calcular los grados (sistema sexagesimal) que posee un �ngulo de un tri�ngulo conocidos los otros dos,</h3>
		<h3>expresados tambi�n en grados, introduzca en el casillero la letras AT.</h3>
		<h3>--Para calcular los grados (sistema sexagesimal) que posee un �ngulo de un cuadril�tero convexo conocidos los</h3>
		<h3>otros tres, expresados tambi�n en grados, introduzca en el casillero la letras AC.</h3>
		<h3>--Para calcular los grados (sistema sexagesimal) que posee un �ngulo de un pol�gono convexo de "n" lados, conocidos</h3>
		<h3>los otros �ngulos, expresados tambi�n en grados, introduzca en el casillero la letras APC.</h3>
		<h3>--Para calcular la longitud de una circunferencia conocido su radio introduzca en el casillero</h3>
		<h3>las letras LC. Si conocemos la longitud de la circunferencia, para calcular la longitud</h3>
		<h3>del radio introduzca en el casillero las letras LRAD.</h3>
		<h3>--Consideramos un �ngulo cuyo v�rtice est� en el centro de una circunferenicia, es decir,</h3>
		<h3>que ser�a un �ngulo central de esa circunferencia. Este �ngulo determina un arco en dicha circunferencia.</h3>
		<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
		<h3>arco definido por un �ngulo central, conocidos los grados (sistema sexagesimal) que mide dicho �ngulo y la longitud</h3>
		<h3>del radio de la circunferencia, introduzca en el casillero las letras LA. Para calcular, lo que mide en grados, un </h3>
		<h3>�ngulo central conocidas la longitud del arco que determina dicho �ngulo en una circunferencia en la que</h3>
		<h3>es central y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GA. Para</h3>
		<h3>calcular la longitud del radio de la circunferencia conocidos los grados que mide el �ngulo y la longitud</h3>
		<h3>del arco, introduzca en el casillero las letras LR.</h3>
		<h3>--Consideramos un �ngulo cuyo v�rtice est� en una circunferencia y que tiene sus lados secantes a la</h3>
		<h3>misma. El v�rtice por tanto es un punto cuya distancia al centro de la circunferencia es igual al radio.</h3>
		<h3>A este tipo de �ngulos se los llama inscritos. Este �ngulo determina un arco en dicha circunferencia.</h3>
		<h3>Este arco, que es un trozo de circunferencia, tiene una longitud. Para calcular la longitud del</h3>
		<h3>arco definido por un �ngulo inscrito, conocidos los grados (sistema sexagesimal) que mide dicho �ngulo y la longitud</h3>
		<h3>del radio de la circunferencia, introduzca en el casillero las letras LAI. Para calcular, lo que mide en grados, un</h3>
		<h3>�ngulo inscrito conocidas la longitud del arco que determina dicho �ngulo en una circunferencia en la que</h3>
		<h3>est� inscrito y la longitud del radio de dicha circunferencia, introduzca en el casillero las letras GAI.</h3>
		<h3>Para calcular la longitud del radio de la circunferencia conocidos los grados que mide el �ngulo y la longitud</h3>
		<h3>del arco, introduzca en el casillero las letras LRI.</h3>
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
		<h3>--Consideramos un pol�gono regular que es aquel que tiene todos sus lados y sus �ngulos iguales. Para calcular</h3>
		<h3>lo que miden sus �ngulos en grados (sistema sexagesimal), conocido el n�mero de lados que tiene el pol�gono, introduzca</h3>
		<h3>en el casillero las letras APR. Para calcular el n�mero de lados que tiene el pol�gono conocido los grados que miden</h3>
		<h3>los �ngulos introduzca en el casillero las letras NLPR.</h3>
		<h3>--Consideremos un paralelogramo, cuadril�tero cuyos lados opuesto son paralelos. Para hallar el �rea de</h3>
		<h3>un paralelogramo conocidos su base y su altura introduzca en el casillero los letras APL. Para calcular la</h3>
		<h3>base conocidos el �rea y la altura introduzca en el casillero las letras BPL. Para calcular la altura conocidos</h3>
		<h3>el �rea y la base introduzca en el casillero las letras ALPL.</h3>
		<h3>--Consideremos un tri�ngulo. Para calcular el �rea de un tri�ngulo, conocidos su base y su altura, introduzca</h3>
		<h3>en el casillero las letras ARTR. Para calcular su base conocidos su altura y su �rea introduzca en el casillero</h3>
		<h3>las letras BTR. Para calcular su altura conocidos su base y su �rea introduzca las letras ALTR.</h3>
		<h3>--Consideremos un trapecio, cuadril�tero que tiene dos lados paralelos. Para calcular el �rea de un trapecio,</h3>
		<h3>conocidas sus dos bases : inferior y superior (consideramos que sus bases son sus lados paralelos), y su altura, introduzca</h3>
		<h3>en el casillero las letras ARTRA. Para calcular su altura, conocidas las dos bases y el �rea, introduzca en el casillero</h3>
		<h3>las letras ALTRA. Para calcular una de sus bases, conocidas la otra, el �rea y la altura, introduzca en el casillero las</h3>
		<h3>letras BATRA.</h3>
		<h3>--Consideremos un rombo, que es el paralelogramo cuyos lados son iguales. En todo rombo distinguimos dos diagonales que</h3>
		<h3>van desde cada v�rtice al v�rtice opuesto. Conocidas la longitud de las diagonales para calcular el �rea del rombo</h3>
		<h3>introduzca en el casillero las letras AROM. Para calcular la longitud de una diagonal, conocida la otra y el �rea del</h3>
		<h3>rombo introduzca en el casillero las letras DROM.</h3>
		<h3>--Consideremos un pol�gono regular. Para calcular el �rea de dicho pol�gono, sabiendo el n�mero de lados que</h3>
		<h3>tiene, la longitud de un lado y el apotema, introduzca en el casillero las letras APOLREG. Para hallar el n�mero</h3>
		<h3>de lados que tiene, conocidos la longitud de un lado, el apotema y el �rea, introduzca en el casillero las letras</h3>
		<h3>NPOLREG. Para hallar la longitud de los lados, conocidos al �rea, el n�mero de lados y el apotema, introduzca en</h3>
		<h3>casillero las letras LPOLREG. Para hallar el apotema, conocidos el �rea, el n�mero de lados, la longitud de los</h3>
		<h3>lados, introduzca en el casillero las letras APPOLREG.</h3>
		<h3>--C�rculo es la porci�n de plano comprendida dentro de la circunferencia. Para hallar el �rea de un c�rculo</h3>
		<h3>conocido su radio introduzca en el casillero las letras ACIR. Para hallar el radio del c�rculo conocido su �rea</h3>
		<h3>introduzca en el casillero las letras RCIR.</h3>
		<h3>--El sector circular es la porci�n de c�rculo limitada por un arco de circunferencia y los radios correspondientes</h3>
		<h3>que llegan a los extremos de este arco. Para calcular el �rea del sector circular, concidos el radio y el �ngulo en</h3>
		<h3>grados (sistema sexagesimal) que corresponde al arco, introduzca en el casillero las letras ASECIR. Para calcular el radio</h3>
		<h3>del c�rculo, conocidos el �rea del sector circular y el �ngulo en grados que corresponde con el arco, introduzca en el</h3>
		<h3>casillero las letras RSECIR. Para calcular los grados del �ngulo asociado al sector circular, conocidos el radio y el</h3>
		<h3>�rea del sector circular, introduzca en el casillero las letras ANSECIR.</h3>
		<h3>--Para calcular (aproximadamente) los grados (sistema sexagesimal) que mide un �ngulo conociendo los radianes que mide,</h3>
		<h3>introduzca en el casillero las letras RADGRAD. Para calcular (aproximadamente) los radianes que mide un �ngulo conociendo</h3>
		<h3>los grados (sistema sexagesimal) que mide, introduzca en el casillero las letras GRADRAD.</h3>		
			<form action="OperacionGeometriaEuclidianaUsuarioServlet" method="post">
		Operaci�n escogida:<br>
				<input type="text" name="operacionGeometriaEuclidiana" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
		
<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("C")){
%>
		<h2>OPERACIONES DE COMBINATORIA</h2>
		<h3>Para especificar la operaci�n de combinatoria que desea realizar rellene</h3>
		<h3>el siguiente casillero siguiendo las instrucciones que se indican.</h3>
		<h3>--Variaciones: dados "n" elementos, llamamos variaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podemos formar con esos "n" elementos,</h3>
		<h3>tomados de "r" en "r", y entendiendo que dos conjuntos son distintos si</h3>
		<h3>difieren en uno, al menos, de sus elementos, o si, teniendo id�nticos</h3>
		<h3>elementos difieren en el orden de los mismos. Para calcular variaciones </h3>
		<h3>introduzca en el casillero las letras VAR.</h3>
		<h3>--Combinaciones: dados "n" elementos, llamamos combinaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podemos formar con esos "n" elementos,</h3>
		<h3>tomados de "r" en "r", y entendiendo que dos conjuntos son distintos si</h3>
		<h3>difieren en uno, al menos, de sus elementos. Para calcular combinaciones</h3>
		<h3>introduzca en el casillero las letras COM.</h3>
		<h3>--Variaciones con repetici�n: a partir de "n" elementos distintos, formamos</h3>
		<h3>variaciones de orden "r" tales que dos de sus elementos, tres.... los "r"</h3>
		<h3>elementos pueden ser uno mismo. Para calcular variaciones con repetici�n</h3>
		<h3>introduzca en el casillero las letras VREP.</h3>
		<h3>--Combinaciones con repetici�n: a partir de "n" elementos distintos, formamos</h3>
		<h3>combinaciones de orden "r" tales que dos de sus elementos, tres..., "r" elementos,</h3>
		<h3>pueden ser uno mismo. Para calcular combinaciones con repetici�n introduzca en</h3>
		<h3>el casillero las letras CREP.</h3>
		<h3>--Permutaciones: dados "r" elementos, llamaremos permutaciones de orden "r" a</h3>
		<h3>todos los conjuntos distintos que podamos formar con esos "r" elementos, tomados</h3>
		<h3>de "r" en "r". Realmente las permutaciones son un caso particular de las</h3>
		<h3>variaciones en el que "r" = "n". Dado que todos los conjuntos constan de los</h3>
		<h3>mismos "r" elementos, s�lo podr�n diferir en el orden de los mismos. Para calcular</h3>
		<h3>permutaciones introduzca en el casillero las letras PER.</h3>
		<h3>--Permutaciones con repetici�n: sean "r" elementos de los que "r<sub>1</sub>" son iguales</h3>
		<h3>entre s�, "r<sub>2</sub>" son iguales entre s�,..., "r<sub>k</sub>" son iguales entre s�,</h3>
		<h3>con r<sub>1</sub> + r<sub>2</sub> + ... +r<sub>k</sub> = r. Para calcular el n�mero de tales permutaciones, </h3>
		<h3>en este caso con repetici�n, introduzca en el casillero las letras PREP.</h3>
			<form action="OperacionCombinatoriaUsuarioServlet" method="post">
		Operaci�n escogida:<br>
				<input type="text" name="operacionCombinatoria" value="">
				<br><br>
			  	  <input type="submit" value="Enviar">
			</form>	
		

<%
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("E")){
%>
		<h2>OPERACIONES DE ESTAD�STICA</h2>
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
		}else if(objetoAreaMatematicas.getOpcionAreaMatematicas().equalsIgnoreCase("T")){
%>
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
		}else{
%>
		<h3>Clave introducida incorrecta.</h3>
		<h3>Para especificar a que �rea pertenece la operaci�n</h3>
	   	<h3>matem�tica que desea realizar rellene el siguiente </h3>
	   	<h3>casillero siguiendo las instrucciones que se indican.</h3>
	   	<h3>--Si la operaci�n que desea realizar es de tipo aritm�tico</h3>
	   	<h3>introduzca en el casillero letra A.</h3>
	   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
	   	<h3>de geometr�a anal�tica introduzca en el casillero las letras GA.</h3>
	   	<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   		<h3>de proporcionalidad introduzca en el casillero la letra P.</h3>
   		<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   		<h3>de geometr�a euclidiana introduzca en el casillero las letras GE.</h3>
   		<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   		<h3>de la combinatoria introduzca en el casillero la letra C.</h3>
   		<h3>--Si la operaci�n que desea realizar pertenece al �rea</h3>
   		<h3>de la estad�stica introduzca en el casillero la letra E.</h3>
    	<h3>--Si la operaci�n que desea realizar pertence al �rea</h3>
   		<h3>de la trigonometr�a introduzca en el casillero la letra T.</h3>
	   	<form action="OpcionEscogidaParaCalculadora2Servlet" method="post">
	   	Area escogida:<br>
		  <input type="text" name="opcionAreaMatematicas" value="">
		  <br><br>
		  	  <input type="submit" value="Enviar">
		</form>

<%}%>
</body>
</html>