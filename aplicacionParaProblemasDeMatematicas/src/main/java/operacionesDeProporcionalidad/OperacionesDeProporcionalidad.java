package operacionesDeProporcionalidad;

public class OperacionesDeProporcionalidad {
	
	/*Este método tiene dos parámetros de entrada tipo String que corresponden con una cantidad y un porcentaje
	 *y devuelve otro String con la información de cual es la cantidad resultante de calcular el porcentaje introducido
	 *sobre la cantidad introducida.
	 */
	public static String porcentaje(String cantidad, String porcentaje) {
		String devolucion;
		double resultado = 0;
	try {
		double cant = Double.parseDouble(cantidad);
		double porcent = Double.parseDouble(porcentaje);
		resultado = (cant/100)*porcent;
		devolucion = "El "+porcent+"% de "+cant+" es "+resultado;
	} catch (NumberFormatException exception) {
		String casilleros = "				<h3>Introduzca en los siguientes casilleros la cantidad de la que se quiere calcular</h3>\r\n" + 
				"				<h3>el porcentaje y el porcentaje en sí sin signo \"%\"</h3>\r\n" + 
				"					<form action=\"PorcentajeServlet\" method=\"post\">\r\n" + 
				"			  Cantidad:<br>\r\n" + 
				"					<input type=\"text\" name=\"cantidad\" value=\"\">\r\n" + 
				"					<br>\r\n" + 
				"			  Porcentaje:<br>\r\n" + 
				"					<input type=\"text\" name=\"porcentaje\" value=\"\">\r\n" + 
				"					<br><br>\r\n" + 
				"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
				"				</form>";
		return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." +casilleros ;
	}
    String decisionSalirOcontinuar = "				<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
    		"				<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
    		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
    		"					¿Continuar?<br>\r\n" + 
    		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
    		"					<br><br>\r\n" + 
    		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
    		"					</form>\r\n" + 
    		"";

		
		return devolucion + decisionSalirOcontinuar;
	}
	
	/* Este método tiene tres parámetros de entrada tipo String que corresponden con los valores iniciales para calcular una regla de tres
	 * directa y devuelve otro String con el valor resultante de aplicar la regla de tres directa.	 
	 */
	public static String reglaDe3Directa(String primeraCantidadVariableA, String primeraCantidadVariableB, String segundaCantidadVaraibleA) {
		String devolucion;
		double resultado = 0;
		try {
			double primeraCantidadA = Double.parseDouble(primeraCantidadVariableA);
			double primeraCantidadB = Double.parseDouble(primeraCantidadVariableB);
			double segundaCantidadA = Double.parseDouble(segundaCantidadVaraibleA);
			if(primeraCantidadA == 0 && (primeraCantidadB == 0 || segundaCantidadA == 0)) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido dar el valor de cero al primer valor de la variable A y simultáneamente dar el valor también de cero a cualquiera o a ambos de los otros valores de entrada";}
			else {resultado = (primeraCantidadB/primeraCantidadA)*segundaCantidadA;
				  devolucion = "La cantidad resultante de la segunda variable es "+resultado;}
		}catch(NumberFormatException e) {
			String casilleros = "				<h3>&nbsp;La regla de tres directa es un procedimiento de cálculo que consiste en, dadas dos</h3>\r\n" + 
					"				<h3>cantidades correspondientes a dos variables directamente proporcionales, calcular</h3>\r\n" + 
					"				<h3>la cantidad de una de estas variables que corresponde a una determinada cantidad</h3>\r\n" + 
					"				<h3>de la otra variable, por tanto en toda regla de tres directa distinguimos dos variables,</h3>\r\n" + 
					"				<h3>que podemos llamar A y B, y que son directamente proporcionales.</h3>\r\n" + 
					"				<h3>Por ejemplo, vamos a denominar a la variable \"kilos de naranjas\" como variable A,</h3>\r\n" + 
					"				<h3>y precio en euros de la compra como variable B.</h3>\r\n" + 
					"				<h3>&nbsp;Serían dos variables directamente propopcionales, ya que cuantos más kilos de naranjas</h3>\r\n" + 
					"				<h3>compre mayor precio tendré que pagar. Así, si sabemos que 5 kg de naranjas cuestan</h3>\r\n" + 
					"				<h3>11 euros y queremos saber cuanto cuestan 12 kilos de naranjas podemos acudir a una regla de</h3>\r\n" + 
					"				<h3>tres directa. Así tenemos que 5 kg de naranjas sería el primer valor de la variable A, y que</h3>\r\n" + 
					"				<h3>11 euros sería el primer valor de la variable B, 12 kilos de naranjas sería el segundo</h3>\r\n" + 
					"				<h3>valor de la variable A, y mediante la regla de tres directa se calcularía el valor de</h3>\r\n" + 
					"				<h3>la variable B que corresponde con ese nuevo valor de la variable A (12 kg).</h3>\r\n" + 
					"				<h3>Introduzca en los siguientes casilleros los valores correspondientes como se indica</h3>\r\n" + 
					"					<form action=\"ReglaDeTresDirectServlet\" method=\"post\">\r\n" + 
					"			  Primer valor de la variable A:<br>\r\n" + 
					"					<input type=\"text\" name=\"primeraCantidadVariableA\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Primer valor de la variable B:<br>\r\n" + 
					"					<input type=\"text\" name=\"primeraCantidadVariableB\" value=\"\">\r\n" + 
					"					<br>					\r\n" + 
					"			  Segundo valor de la variable A:<br>\r\n" + 
					"					<input type=\"text\" name=\"segundaCantidadVariableA\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>			\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato númerico en cada casillero. "+casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					¿Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

		return devolucion + decisionSalirOcontinuar;
	}
	/* Este método tiene tres parámetros de entrada tipo String que corresponden con los valores iniciales para calcular una regla de tres
	 * inversa y devuelve otro String con el valor resultante de aplicar la regla de tres inversa.	 
	 */
	public static String reglaDeTresInversa(String primeraCantidadVariableA, String primeraCantidadVariableB, String segundaCantidadVariableA) {
		String devolucion;
		double resultado = 0;
		try {
			double primeraCantidadA = Double.parseDouble(primeraCantidadVariableA);
			double primeraCantidadB = Double.parseDouble(primeraCantidadVariableB);
			double segundaCantidadA = Double.parseDouble(segundaCantidadVariableA);
			if(segundaCantidadA == 0 && (primeraCantidadA == 0 || primeraCantidadB == 0)) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido dar el valor de cero al segundo valor de la variable A y simultáneamente dar el valor también de cero a cualquiera o a ambos de los otros valores de entrada";}
			else {resultado = (primeraCantidadA*primeraCantidadB)/segundaCantidadA;
				   devolucion = "La cantidad resultante de la segunda variable es "+resultado;}
		} catch (NumberFormatException e) {
			String casilleros = "				<h3>&nbsp;La regla de tres inversa es un procedimiento de cálculo que consiste en, dadas dos</h3>\r\n" + 
					"				<h3>cantidades correspondientes a dos variables inversamente proporcionales, calcular</h3>\r\n" + 
					"				<h3>la cantidad de una de estas variables que corresponde a una determinada cantidad</h3>\r\n" + 
					"				<h3>de la otra variable, por tanto en toda regla de tres inversa distinguimos dos variables,</h3>\r\n" + 
					"				<h3>que podemos llamar A y B, y que son inversamente proporcionales.</h3>\r\n" + 
					"				<h3>Por ejemplo, vamos a denominar a la variable \"precio del kilo de naranjas\" como</h3>\r\n" + 
					"				<h3>variable A, y a la cantidad de naranjas en kilogramos que podemos comprar con una</h3>\r\n" + 
					"				<h3>determinada cantidad de dinero como variable B.</h3>\r\n" + 
					"				<h3>&nbsp;Se trataría de dos variables inversamente proporcionales, ya que, como es evidente, </h3>\r\n" + 
					"				<h3>por el mismo importe a un mayor precio por kilo de naranjas (variable A) le corresponde</h3>\r\n" + 
					"				<h3>una menor cantidad de kilos de naranjas compradas (variable B). Así, si sabemos que por</h3>\r\n" + 
					"				<h3>2.20 euros el kilo de naranjas podemos comprar 5 kilos de naranjas pagando un determinado</h3>\r\n" + 
					"				<h3>importe, y deseamos saber cuantos kilos de naranjas podremos comprar por el mismo importe</h3>\r\n" + 
					"				<h3>si el kilo de naranjas es ahora de 3 euros, podremos acudir a la regla de tres inversa.</h3>\r\n" + 
					"				<h3>&nbsp;Así tenemos que 2.20 euros sería el primer valor de la variable A, y que 5 kilos</h3>\r\n" + 
					"				<h3>de naranjas sería el primer valor de la variable B, 3 euros (el nuevo precio del kilo de</h3>\r\n" + 
					"				<h3>naranjas) sería el segundo valor de la variable A, y mediante la regla de tres directa</h3>\r\n" + 
					"				<h3>se calcularía el valor de la variable B que corresponde con ese nuevo valor de la</h3>\r\n" + 
					"				<h3>variable A (3 euros).</h3>\r\n" + 
					"				<h3>Introduzca en los siguientes casilleros los valores correspondientes como se indica</h3>\r\n" + 
					"					<form action=\"ReglaDeTresInversaServlet\" method=\"post\">\r\n" + 
					"			  Primer valor de la variable A:<br>\r\n" + 
					"					<input type=\"text\" name=\"primeraCantidadVariableA\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Primer valor de la variable B:<br>\r\n" + 
					"					<input type=\"text\" name=\"primeraCantidadVariableB\" value=\"\">\r\n" + 
					"					<br>					\r\n" + 
					"			  Segundo valor de la variable A:<br>\r\n" + 
					"					<input type=\"text\" name=\"segundaCantidadVariableA\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero."+casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					¿Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

		return devolucion + decisionSalirOcontinuar;
	}
}


