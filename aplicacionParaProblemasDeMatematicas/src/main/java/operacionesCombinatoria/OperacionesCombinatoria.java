package operacionesCombinatoria;

public class OperacionesCombinatoria {
	
	public static String calculoVariaciones(String n, String r) {
		String devolucion = "ppqq";
		int resultado = 0;
			try {
				int numeroN = Integer.parseInt(n);
				int numeroR = Integer.parseInt(r);
				if(numeroN < 0 || numeroR < 0 || numeroN < numeroR) {
					devolucion = "Datos incorrectos : el valor de 'n' o de 'r' no pueden ser negativos o el valor de 'r' no puede ser mayor que el de 'n'.";
				}else {
					int varX = numeroN - numeroR;
						resultado = numeroFactorial(numeroN)/(numeroFactorial(varX));
						devolucion = "Las variaciones de "+n+" elementos tomados de "+r+" en "+r+" es "+resultado;
				}
			} catch (NumberFormatException exception) {
		        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor de \"n\" y de \"r\"</h3>\r\n" + 
		        			"				<h3>que deben ser ambos números enteros positivos</h3>\r\n" + 
		        			"					<form action=\"VariacionesServlet\" method=\"post\">\r\n" + 
		        			"			  Valor de \"n\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorN\" value=\"\">\r\n" + 
		        			"					<br>\r\n" + 
		        			"			  Valor de \"r\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorR\" value=\"\">\r\n" + 
		        			"					<br><br>\r\n" + 
		        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
		        			"				</form>\r\n" + 
		        			"";
					return "El dato o datos introducidos no son números enteros. Introduzca un dato numérico entero en cada casillero." + casilleros;
		
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
	
	public static String calculoCombinaciones(String n, String r) {
		String devolucion = "ppqq";
		int resultado = 0;
			try {
				int numeroN = Integer.parseInt(n);
				int numeroR = Integer.parseInt(r);
				if(numeroN < 0 || numeroR < 0 || numeroN < numeroR) {
					devolucion = "Datos incorrectos : el valor de 'n' o de 'r' no pueden ser negativos o el valor de 'r' no puede ser mayor que el de 'n'.";
				}else {
					int varX = numeroN - numeroR;
						resultado = numeroFactorial(numeroN)/(numeroFactorial(numeroR)*numeroFactorial(varX));
						devolucion = "Las combinaciones de "+n+" elementos tomados de "+r+" en "+r+" es "+resultado;
				}
			} catch (NumberFormatException exception) {
		        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor de \"n\" y de \"r\"</h3>\r\n" + 
		        			"				<h3>que deben ser ambos números enteros positivos</h3>\r\n" + 
		        			"					<form action=\"CombinacionesServlet\" method=\"post\">\r\n" + 
		        			"			  Valor de \"n\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorN\" value=\"\">\r\n" + 
		        			"					<br>\r\n" + 
		        			"			  Valor de \"r\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorR\" value=\"\">\r\n" + 
		        			"					<br><br>\r\n" + 
		        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
		        			"				</form>\r\n" + 
		        			"";
					return "El dato o datos introducidos no son números enteros. Introduzca un dato numérico entero en cada casillero." + casilleros;
		
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
	
	public static String calculoVariacionesRep(String n, String r) {
		String devolucion = "ppqq";
		double resultado = 0;
			try {
				int numeroN = Integer.parseInt(n);
				int numeroR = Integer.parseInt(r);
				if(numeroN < 0 || numeroR < 0) {
					devolucion = "Datos incorrectos : el valor de 'n' o de 'r' no pueden ser negativos.";
				}else {
						resultado = Math.pow(numeroN, numeroR);
						devolucion = "Las variaciones con repetición de "+n+" elementos tomados de "+r+" en "+r+" es "+resultado;
				}
			} catch (NumberFormatException exception) {
		        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor de \"n\" y de \"r\"</h3>\r\n" + 
		        			"				<h3>que deben ser ambos números enteros positivos</h3>\r\n" + 
		        			"					<form action=\"VariacionesRepServlet\" method=\"post\">\r\n" + 
		        			"			  Valor de \"n\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorN\" value=\"\">\r\n" + 
		        			"					<br>\r\n" + 
		        			"			  Valor de \"r\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorR\" value=\"\">\r\n" + 
		        			"					<br><br>\r\n" + 
		        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
		        			"				</form>\r\n" + 
		        			"";
					return "El dato o datos introducidos no son números enteros. Introduzca un dato numérico entero en cada casillero." + casilleros;
		
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
	
	public static String calculoCombinacionesRep(String n, String r) {
		String devolucion = "ppqq";
		int resultado = 0;
			try {
				int numeroN = Integer.parseInt(n);
				int numeroR = Integer.parseInt(r);
				if(numeroN < 0 || numeroR < 0) {
					devolucion = "Datos incorrectos : el valor de 'n' o de 'r' no pueden ser negativos.";
				}else {
					int varX = numeroN + numeroR - 1;
					int varY = numeroN - 1;
						resultado = numeroFactorial(varX)/(numeroFactorial(numeroR)*numeroFactorial(varY));
						devolucion = "Las combinaciones con repetición de "+n+" elementos tomados de "+r+" en "+r+" es "+resultado;
				}
			} catch (NumberFormatException exception) {
		        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor de \"n\" y de \"r\"</h3>\r\n" + 
		        			"				<h3>que deben ser ambos números enteros positivos</h3>\r\n" + 
		        			"					<form action=\"CombinacionesRepServlet\" method=\"post\">\r\n" + 
		        			"			  Valor de \"n\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorN\" value=\"\">\r\n" + 
		        			"					<br>\r\n" + 
		        			"			  Valor de \"r\":<br>\r\n" + 
		        			"					<input type=\"text\" name=\"valorR\" value=\"\">\r\n" + 
		        			"					<br><br>\r\n" + 
		        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
		        			"				</form>\r\n" + 
		        			"";
					return "El dato o datos introducidos no son números enteros. Introduzca un dato numérico entero en cada casillero." + casilleros;
		
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
	
	public static String calculoPermutaciones(String r) {
		String devolucion = "ppqq";
		int resultado = 0;
		try {
			int numeroR = Integer.parseInt(r);
			if(numeroR < 0) {
				devolucion = "Dato incorrecto : el valor de 'r' no puede ser negativo.";
			}else {
				resultado = numeroFactorial(numeroR);
				devolucion = "Las permutacione de "+r+" es "+resultado;
			}
		} catch (NumberFormatException exception) {
	        	String casillero = "				<h3>Introduzca en el siguiente casillero el valor de \"r\". Éste valor debe ser</h3>\r\n" + 
	        			"				<h3>un número entero positivo.</h3>\r\n" + 
	        			"					<form action=\"PermutacionesServlet\" method=\"post\">\r\n" + 
	        			"			  Valor de \"r\":<br>\r\n" + 
	        			"					<input type=\"text\" name=\"valorR\" value=\"\">\r\n" + 
	        			"					<br><br>\r\n" + 
	        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
	        			"				</form>	\r\n" + 
	        			"";
				return "El dato introducido no es un número entero. Introduzca un dato numérico entero en el casillero." + casillero;
	
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
	
	public static String calculoPermutacionesRep(String variableX) {
		String devolucion = "ppqq";
		int resultado = 0;
		try {
			if(metodoAuxPermutacRep3(variableX)) {
				devolucion = "Datos incorrectos : alguno o algunos de los valores introducidos es (son) negativo(s).";
			}else {
				resultado = metodoAuxPermutacRep2(variableX)/metodoAuxPermutacRep(variableX);
				devolucion = "Las permutaciones con repetición obtenidas con los elementos "+variableX+" son "+resultado;
			}
		}catch (NumberFormatException exception) {
			String casilleros = "				<h3>Introduzca en el siguiente casillero el valor de \"r<sub>1</sub>\", de \"r<sub>2</sub>\",..., de \"r<sub>k</sub>\". Todos</h3>\r\n" + 
					"				<h3>estos valores deben ser números enteros positivos. Deben de quedar separados</h3>\r\n" + 
					"				<h3>por una coma sin ningún espacio en blanco, y su suma debe ser \"r\" que es</h3>\r\n" + 
					"				<h3>el número total de elementos.</h3>\r\n" + 
					"					<form action=\"PermutacionesRepServlet\" method=\"post\">\r\n" + 
					"			  Valores de \"r<sub>i</sub>\":<br>\r\n" + 
					"					<input type=\"text\" name=\"valoresR\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>	\r\n" + 
					"";
			return "Los datos introducidos no son correctos." + casilleros;
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
/*
 * Este método divide a un String mediante el método split en una serie de subString,
 * luego transforma mediante un parseo a estos subString en números enteros, luego
 * calcula el factorial de cada uno de estos números enteros llamando al método numeroFactorial,
 * y por último calcula el producto de todos estos factorialaes.
 */
	private static int metodoAuxPermutacRep(String variableX) throws NumberFormatException{
		int numeroCeldas = 0;
		int intCelda = 0;
		int resultado = 1;
		int varFactorial = 0;
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;

		for(int i=0; i<numeroCeldas; i++) {
			intCelda = Integer.parseInt(arrayString[i]);
			varFactorial = numeroFactorial(intCelda);
			resultado = resultado * varFactorial;
		}
		return resultado;
	}

	/*
	 * Este método divide a un String mediante el método split en una serie de subString,
	 * luego transforma mediante un parseo a estos subString en números enteros, luego
	 * calcula la suma de todos estos números enteros, y por último calcula el factorial
	 * de esta suma llamando al método numeroFactorial.
	 */
	
	private static int metodoAuxPermutacRep2(String variableX) throws NumberFormatException{
		int numeroCeldas = 0;
		int intCelda = 0;
		int resultado = 0;
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;

		for(int i=0; i<numeroCeldas; i++) {
			intCelda = Integer.parseInt(arrayString[i]);
			resultado = resultado + intCelda;
		}
		resultado = numeroFactorial(resultado);
		return resultado;
	}

	/*
	 * Este método devuelve un valor boolean "true" si alguno de los valores del array,
	 * que son enteros, es menor que cero.
	 */
	private static boolean metodoAuxPermutacRep3(String variableX) throws NumberFormatException{
		int numeroCeldas = 0;
		int intCelda = 0;
		boolean resultado = false;
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;

		for(int i=0; i<numeroCeldas; i++) {
			intCelda = Integer.parseInt(arrayString[i]);
			if(intCelda < 0) {resultado = true;
			return resultado;
			}
		}
		return resultado;
	}

	
	
	
	private static int numeroFactorial(int n) {
		int factorial = 1;
		if(n == 0) {factorial = 1;
		}else if(n>=1) {
			for(int i=1; i<=n; i++) {
				factorial = factorial * i;
			}
		}
		return factorial;
	}

	
}
