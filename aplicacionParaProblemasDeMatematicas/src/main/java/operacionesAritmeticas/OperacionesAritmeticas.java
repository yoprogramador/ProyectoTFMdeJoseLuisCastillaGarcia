package operacionesAritmeticas;

public class OperacionesAritmeticas {

    /**
     * Dados dos n�meros el m�todo devuelve el resultado de
     * sumarlos
     * @param numA
     * @param numB
     * @return
     */
    public static String sumar(String primerSumando, String segundoSumando) {
    	String devolucion;
        double resultado = 0;
        try {
	        double numA = Double.parseDouble(primerSumando);
	        double numB = Double.parseDouble(segundoSumando);
	        resultado = numA + numB;
	        devolucion = "El resultado de la suma es " + resultado;
        }catch (NumberFormatException exception) {
        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor del primer y segundo sumando</h3>\r\n" + 
        			"					<form action=\"SumaServlet\" method=\"post\">\r\n" + 
        			"			  Primer sumando:<br>\r\n" + 
        			"					<input type=\"text\" name=\"primerSumando\" value=\"\">\r\n" + 
        			"					<br>\r\n" + 
        			"			  Segundo sumando:<br>\r\n" + 
        			"					<input type=\"text\" name=\"segundoSumando\" value=\"\">\r\n" + 
        			"					<br><br>\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"				</form>";
			return "El dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";
        return devolucion + decisionSalirOcontinuar;
    }

    /**
     * Dados dos n�meros el m�todo devuelve el resultado de
     * restarle al primero el segundo
     * @param numA
     * @param numb
     * @return
     */
    public static String restar(String minuendo, String sustraendo) {
    	String devolucion;
        double resultado = 0;
        try {
	        double numA = Double.parseDouble(minuendo);
	        double numB = Double.parseDouble(sustraendo);
	        resultado = numA - numB;
	        devolucion = "El resultado de la resta es " + resultado;
        }catch (NumberFormatException exception) {
        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor del minuendo y del sustraendo</h3>\r\n" + 
        			"						<form action=\"RestaServlet\" method=\"post\">\r\n" + 
        			"			  Minuendo:<br>\r\n" + 
        			"					<input type=\"text\" name=\"minuendo\" value=\"\">\r\n" + 
        			"					<br>\r\n" + 
        			"			  Sustraendo:<br>\r\n" + 
        			"					<input type=\"text\" name=\"sustraendo\" value=\"\">\r\n" + 
        			"					<br><br>\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"				</form>";
			return "El dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

        return devolucion + decisionSalirOcontinuar;
    }

    /**
     * Dados dos n�meros el m�todo devuelve el resultado de
     * multiplicarlos
     * @param numA
     * @param numB
     * @return
     */
    public static String multiplicar(String primerFactor, String segundoFactor) {
    	String devolucion;
        double resultado = 0;
        try {
	        double numA = Double.parseDouble(primerFactor);
	        double numB = Double.parseDouble(segundoFactor);
	        resultado = numA * numB;
	        devolucion = "El resultado de la multiplicacion es " + resultado;
        }catch (NumberFormatException exception) {
        	String casilleros = "				<h3>Introduzca en los siguientes casilleros el valor de los factores</h3>\r\n" + 
        			"						<form action=\"MultiplicacionServlet\" method=\"post\">\r\n" + 
        			"			  Primer Factor:<br>\r\n" + 
        			"					<input type=\"text\" name=\"primerFactor\" value=\"\">\r\n" + 
        			"					<br>\r\n" + 
        			"			  Segundo Factor:<br>\r\n" + 
        			"					<input type=\"text\" name=\"segundoFactor\" value=\"\">\r\n" + 
        			"					<br><br>\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"				</form>";
			return "El dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

        return devolucion + decisionSalirOcontinuar;
    }

    /**
     * Dados dos n�meros el m�todo devuelve el resultado de
     * dividir el primero entre el segundo
     * @param numA
     * @param numB
     * @return
     */
    public static String dividir(String numerador, String denominador) {
        String devolucion;
        double resultado = 0;
        try {
	        double numA = Double.parseDouble(numerador);
	        double numB = Double.parseDouble(denominador);
	        if(numB == 0) {
	        	devolucion = "No es posible realizar la divisi�n al tener el divisor el valor de cero";
	        }else {
		        resultado = numA / numB;
		        devolucion = "El resultado de la division es " + resultado;
	        }
        }catch (NumberFormatException exception) {
        	String casilleros = "						<h3>Introduzca en los siguientes casilleros el valor del numerador y del denominador</h3>\r\n" + 
        			"								<form action=\"DivisionServlet\" method=\"post\">\r\n" + 
        			"					  Numerador:<br>\r\n" + 
        			"							<input type=\"text\" name=\"numerador\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  Denominador:<br>\r\n" + 
        			"							<input type=\"text\" name=\"denominador\" value=\"\">\r\n" + 
        			"							<br><br>\r\n" + 
        			"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"						</form>";
			return "El dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

        return devolucion + decisionSalirOcontinuar;
    }

    /**
     * Dado un n�mero y un exponente entero el m�todo devuelve
     * el resultado de elevar ese n�mero al exponente dado.
     * @param numA
     * @param numB
     * @return
     */
    public static String potencia(String base, String exponente) {
    	String devolucion;
    	double resultado = 0;
    	try {
	    	double numA = Double.parseDouble(base);
	    	double numB = Double.parseDouble(exponente);
	    	resultado = Math.pow(numA, numB);
	    	devolucion = "El resultado de la potenciaci�n es " + resultado;
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros el valor de la base y del exponente</h3>\r\n" + 
    				"								<form action=\"PotenciacionServlet\" method=\"post\">\r\n" + 
    				"					  Base:<br>\r\n" + 
    				"							<input type=\"text\" name=\"base\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Exponente:<br>\r\n" + 
    				"							<input type=\"text\" name=\"exponente\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>";
			return "El dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

    	return devolucion + decisionSalirOcontinuar;
    }
    	
    

    /**
     * Dado un n�mero el m�todo calcula la ra�z cuadrada
     * de dicho n�mero devolviendo la soluci�n positiva
     * @param numA
     * @return
     */
    public static String raizCuadrada(String radicando) {
    	String devolucion;
        double resultado = 0;
        try {
	        double numR = Double.parseDouble(radicando);
	        if(numR < 0) {
	        	devolucion = "No es posible calcular la ra�z cuadrada de un n�mero negativo";
	        }else {
		        resultado = Math.sqrt(numR);
		        devolucion = "El resultado de la radicaci�n es " + resultado;
	        }
        }catch (NumberFormatException exception) {
        	String casillero = "						<h3>Introduzca en el siguiente casillero el n�mero del cual se desea calcular la ra�z cuadrada</h3>\r\n" + 
        			"								<form action=\"RaizCuadradaServlet\" method=\"post\">\r\n" + 
        			"					  Radicando:<br>\r\n" + 
        			"							<input type=\"text\" name=\"radicando\" value=\"\">\r\n" + 
        			"							<br><br>\r\n" + 
        			"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"						</form>";
			return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

        return devolucion + decisionSalirOcontinuar;
    }
    
	public static String numeroFactorial(String numero) {
		String devolucion = "ppqq";
		int factorial = 1;
		try {
			int n = Integer.parseInt(numero);
			if(n < 0) {
				devolucion = "Para calcular el factorial de un n�mero �ste debe ser un entero mayor o igual a 0";
				String casillero = "					<h3>Introduzca en el siguiente casillero el n�mero del cual se desea calcular el factorial.</h3>\r\n" + 
						"						<h3>Este n�mero tiene que ser un n�mero natural, es decir, un entero positivo, por tanto mayor o igual a 0.</h3>\r\n" + 
						"								<form action=\"FactorialServlet\" method=\"post\">\r\n" + 
						"					  N�mero:<br>\r\n" + 
						"							<input type=\"text\" name=\"numero\" value=\"\">\r\n" + 
						"							<br><br>\r\n" + 
						"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"						</form>\r\n" + 
						"";
				return devolucion + casillero;
			}else if(n == 0) {
				devolucion = "Por convenci�n se considera que el factorial de 0 es 1.";
			}else {
				for(int i=1; i<=n; i++) {
					factorial = factorial * i;
				}
				devolucion = "El factorial del n�mero "+n+" es "+factorial;				
			}
		} catch (NumberFormatException exception ) {
			devolucion = "El dato introducido no es un n�mero entero";
			String casillero = "					<h3>Introduzca en el siguiente casillero el n�mero del cual se desea calcular el factorial.</h3>\r\n" + 
					"						<h3>Este n�mero tiene que ser un n�mero natural, es decir, un entero positivo, por tanto mayor o igual a 0.</h3>\r\n" + 
					"								<form action=\"FactorialServlet\" method=\"post\">\r\n" + 
					"					  N�mero:<br>\r\n" + 
					"							<input type=\"text\" name=\"numero\" value=\"\">\r\n" + 
					"							<br><br>\r\n" + 
					"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>\r\n" + 
					"";
			
			return devolucion + casillero;
		}
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

		return devolucion + decisionSalirOcontinuar;
	}
    
	public static String sumatorio(String sumandos) {
		String devolucion = "ppqq";
		double resultado = 0;
		int numeroCeldas = 0;
		double intCelda = 0;
		String[] arrayString = sumandos.split(",");
		numeroCeldas = arrayString.length;
		try {
			for(int i=0; i<numeroCeldas; i++) {
				intCelda = Double.parseDouble(arrayString[i]);
				resultado = resultado + intCelda;
			}
			
		} catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos num�ricos";
			String casillero = "						<h3>Introduzca en el siguiente casillero los sumandos que van a componer el sumatorio.</h3>\r\n" + 
					"						<h3>Estos n�meros se han de introducir uno tras otro y separados por una coma, sin ning�n</h3>\r\n" + 
					"						<h3>espacio en medio.</h3>\r\n" + 
					"								<form action=\"SumatorioServlet\" method=\"post\">\r\n" + 
					"					  Listado de n�meros:<br>\r\n" + 
					"							<input type=\"text\" name=\"sumatorio\" value=\"\">\r\n" + 
					"							<br><br>\r\n" + 
					"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>\r\n" + 
					"";
			
			return devolucion + casillero;

		}
		devolucion = "El resultado del sumatorio es "+resultado;		
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

		return devolucion + decisionSalirOcontinuar;

	}

	public static String productorio(String sumandos) {
		String devolucion = "ppqq";
		double resultado = 1;
		int numeroCeldas = 0;
		double intCelda = 0;
		String[] arrayString = sumandos.split(",");
		numeroCeldas = arrayString.length;
		try {
			for(int i=0; i<numeroCeldas; i++) {
				intCelda = Double.parseDouble(arrayString[i]);
				resultado = resultado * intCelda;
			}
			
		} catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos num�ricos";
			String casillero = "						<h3>Introduzca en el siguiente casillero los factores que van a componer el productorio.</h3>\r\n" + 
					"						<h3>Estos n�meros se han de introducir uno tras otro y separados por una coma, sin ning�n</h3>\r\n" + 
					"						<h3>espacio en medio.</h3>\r\n" + 
					"								<form action=\"ProductorioServlet\" method=\"post\">\r\n" + 
					"					  Listado de n�meros:<br>\r\n" + 
					"							<input type=\"text\" name=\"productorio\" value=\"\">\r\n" + 
					"							<br><br>\r\n" + 
					"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>\r\n" + 
					"";
			
			return devolucion + casillero;

		}
		devolucion = "El resultado del productorio es "+resultado;		
        String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
        		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
        		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
        		"					�Continuar?<br>\r\n" + 
        		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
        		"					<br><br>\r\n" + 
        		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        		"					</form>\r\n" + 
        		"";

		return devolucion + decisionSalirOcontinuar;

	}
	
}
