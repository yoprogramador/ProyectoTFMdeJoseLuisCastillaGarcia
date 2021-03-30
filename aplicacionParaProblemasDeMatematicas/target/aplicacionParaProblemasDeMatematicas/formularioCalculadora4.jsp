<%@page import="opcionOperacionProporcionalidadUsuario.ReglaDeTres"%>
<%@page import="operacionesDeProporcionalidad.OperacionesDeProporcionalidad"%>
<%@page import="opcionOperacionProporcionalidadUsuario.Porcentaje"%>
<%@page import="opcionOperacionProporcionalidadUsuario.OperacionProporcionalidadUsuario"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario operaciones proporcionalidad</title>
</head>
<body>
	<%
		HttpSession httpSession3 = request.getSession();
			OperacionProporcionalidadUsuario objetoOperacionProporcionalidad = (OperacionProporcionalidadUsuario) httpSession3.getAttribute("OBJETOOPERACIONPROPORCIONALIDAD");
	%>
		<%
			if(objetoOperacionProporcionalidad.getOperacionProporcionalidad().equalsIgnoreCase("P")){
		%>
				<h3>Introduzca en los siguientes casilleros la cantidad de la que se quiere calcular</h3>
				<h3>el porcentaje y el porcentaje en sí sin signo "%"</h3>
					<form action="PorcentajeServlet" method="post">
			  Cantidad:<br>
					<input type="text" name="cantidad" value="">
					<br>
			  Porcentaje:<br>
					<input type="text" name="porcentaje" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>
				

	<%
		}else if(objetoOperacionProporcionalidad.getOperacionProporcionalidad().equalsIgnoreCase("RTD")){
	%>

				<h3>&nbsp;La regla de tres directa es un procedimiento de cálculo que consiste en, dadas dos</h3>
				<h3>cantidades correspondientes a dos variables directamente proporcionales, calcular</h3>
				<h3>la cantidad de una de estas variables que corresponde a una determinada cantidad</h3>
				<h3>de la otra variable, por tanto en toda regla de tres directa distinguimos dos variables,</h3>
				<h3>que podemos llamar A y B, y que son directamente proporcionales.</h3>
				<h3>Por ejemplo, vamos a denominar a la variable "kilos de naranjas" como variable A,</h3>
				<h3>y precio en euros de la compra como variable B.</h3>
				<h3>&nbsp;Serían dos variables directamente propopcionales, ya que cuantos más kilos de naranjas</h3>
				<h3>compre mayor precio tendré que pagar. Así, si sabemos que 5 kg de naranjas cuestan</h3>
				<h3>11 euros y queremos saber cuanto cuestan 12 kilos de naranjas podemos acudir a una regla de</h3>
				<h3>tres directa. Así tenemos que 5 kg de naranjas sería el primer valor de la variable A, y que</h3>
				<h3>11 euros sería el primer valor de la variable B, 12 kilos de naranjas sería el segundo</h3>
				<h3>valor de la variable A, y mediante la regla de tres directa se calcularía el valor de</h3>
				<h3>la variable B que corresponde con ese nuevo valor de la variable A (12 kg).</h3>
				<h3>Introduzca en los siguientes casilleros los valores correspondientes como se indica</h3>
					<form action="ReglaDeTresDirectServlet" method="post">
			  Primer valor de la variable A:<br>
					<input type="text" name="primeraCantidadVariableA" value="">
					<br>
			  Primer valor de la variable B:<br>
					<input type="text" name="primeraCantidadVariableB" value="">
					<br>					
			  Segundo valor de la variable A:<br>
					<input type="text" name="segundaCantidadVariableA" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>			

								
	<%
  	}else if(objetoOperacionProporcionalidad.getOperacionProporcionalidad().equalsIgnoreCase("RTI")){
	%>
				<h3>&nbsp;La regla de tres inversa es un procedimiento de cálculo que consiste en, dadas dos</h3>
				<h3>cantidades correspondientes a dos variables inversamente proporcionales, calcular</h3>
				<h3>la cantidad de una de estas variables que corresponde a una determinada cantidad</h3>
				<h3>de la otra variable, por tanto en toda regla de tres inversa distinguimos dos variables,</h3>
				<h3>que podemos llamar A y B, y que son inversamente proporcionales.</h3>
				<h3>Por ejemplo, vamos a denominar a la variable "precio del kilo de naranjas" como</h3>
				<h3>variable A, y a la cantidad de naranjas en kilogramos que podemos comprar con una</h3>
				<h3>determinada cantidad de dinero como variable B.</h3>
				<h3>&nbsp;Se trataría de dos variables inversamente proporcionales, ya que, como es evidente, </h3>
				<h3>por el mismo importe a un mayor precio por kilo de naranjas (variable A) le corresponde</h3>
				<h3>una menor cantidad de kilos de naranjas compradas (variable B). Así, si sabemos que por</h3>
				<h3>2.20 euros el kilo de naranjas podemos comprar 5 kilos de naranjas pagando un determinado</h3>
				<h3>importe, y deseamos saber cuantos kilos de naranjas podremos comprar por el mismo importe</h3>
				<h3>si el kilo de naranjas es ahora de 3 euros, podremos acudir a la regla de tres inversa.</h3>
				<h3>&nbsp;Así tenemos que 2.20 euros sería el primer valor de la variable A, y que 5 kilos</h3>
				<h3>de naranjas sería el primer valor de la variable B, 3 euros (el nuevo precio del kilo de</h3>
				<h3>naranjas) sería el segundo valor de la variable A, y mediante la regla de tres directa</h3>
				<h3>se calcularía el valor de la variable B que corresponde con ese nuevo valor de la</h3>
				<h3>variable A (3 euros).</h3>
				<h3>Introduzca en los siguientes casilleros los valores correspondientes como se indica</h3>
					<form action="ReglaDeTresInversaServlet" method="post">
			  Primer valor de la variable A:<br>
					<input type="text" name="primeraCantidadVariableA" value="">
					<br>
			  Primer valor de la variable B:<br>
					<input type="text" name="primeraCantidadVariableB" value="">
					<br>					
			  Segundo valor de la variable A:<br>
					<input type="text" name="segundaCantidadVariableA" value="">
					<br><br>
					<input type="submit" value="Enviar">
				</form>

													
	<%}else{ %>
				<h3>Clave introducida incorrecta</h3>
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
	<%} %>
</body>
</html>