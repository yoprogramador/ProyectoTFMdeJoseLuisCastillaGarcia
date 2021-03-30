package operacionesGeometriaEuclidiana;

public class OperacionesGeometriaEuclidian {
	
	/**
	 * Este método, dado el número de lados que posee un polígono convexo, nos devuelve un String con el número de diagonales que tiene. 
	 */	
	public static String numeroDeDiagonales(String numeroLados) {
		String variableSalida;
		int variableAux = 0;
		int variableAux2 = 0;
		try {
			variableAux = Integer.parseInt(numeroLados);
			if(variableAux < 3) {variableSalida = "Dato introducido incorrecto. No existe polígono con un número de lados menor que tres o bien no tiene sentido la introducción de un número negativo.";}
			else {	variableAux2 = variableAux*(variableAux-3)/2;	
					variableSalida = "El número de diagonales del polígono es "+variableAux2; }
		}catch (NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero el número de lados que posee el</h3>\r\n" + 
					"			<h3>el polígono convexo</h3>\r\n" + 
					"					<form action=\"NumLadosServlet\" method=\"post\">\r\n" + 
					"			  Número de lados:<br>\r\n" + 
					"					<input type=\"text\" name=\"numeroLados\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;
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

		return variableSalida + decisionSalirOcontinuar;
	}
	
	/**
	 * Este método, dados dos ángulos de un triángulo (expresados en grados), devuelve el valor del tercer ángulo (también expresado en grados). 
	 * @param angulo1
	 * @param angulo2
	 * @return
	 */
	public static String calculoAnguloTriangulo(String angulo1, String angulo2) {
		String devolucion = "ppqq";
		double numC = 0;
	try {
        double numA = Double.parseDouble(angulo1);
        double numB = Double.parseDouble(angulo2);
        numC = 180 - numA - numB;
        if(numA <= 0 || numB <= 0) {
        	devolucion = "Dato o datos introducidos incorrectos: no tiene sentido en este problema un valor negativo o cero para un ángulo.";
        	}
        else if(numC<= 0) {
        	devolucion = "Datos introducidos incorrectos: la suma de los grados de dos ángulos de un triángulo no puede ser mayor o igual a 180 grados.";
        	}
        else {devolucion ="El tercer ángulo tiene "+numC+" grados";}
	}catch (NumberFormatException exception) {
		String casilleros = "			<h3>Introduzca en los siguientes casilleros los grados (sistema sexagesimal) que miden los</h3>\r\n" + 
				"			<h3>dos ángulos conocidos del triángulo. Los datos introducidos han de ser exclusivamente</h3>\r\n" + 
				"			<h3>numéricos.</h3>\r\n" + 
				"					<form action=\"DosAngulosTrianguloServlet\" method=\"post\">\r\n" + 
				"			  Primer ángulo (en grados):<br>\r\n" + 
				"					<input type=\"text\" name=\"angulo1\" value=\"\">\r\n" + 
				"					<br>\r\n" + 
				"			  Segundo ángulo (en grados):<br>\r\n" + 
				"					<input type=\"text\" name=\"angulo2\" value=\"\">\r\n" + 
				"					<br><br>\r\n" + 
				"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
				"				</form>\r\n" + 
				"";
		return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
	/**
	 * Este método, dados tres ángulos de un cuadrilátero convexo (expresados en grados), devuelve el valor del cuarto ángulo (también expresado en grados).
	 */
	public static String calculoAnguloCuadrilatero(String angulo1, String angulo2, String angulo3) {
		String devolucion = "ppqq";
		double numD = 0;
	try {	
		double numA = Double.parseDouble(angulo1);
		double numB = Double.parseDouble(angulo2);
		double numC = Double.parseDouble(angulo3);
		numD = 360 - numA - numB - numC;
		if(numA <= 0 || numB <= 0 || numC <= 0 ) {devolucion = "Dato o datos introducidos incorrectos: no tiene sentido en este problema un valor negativo o cero para un ángulo.";}
		else if(numD<=0) {devolucion = "Datos introducidos incorrectos: la suma de los grados de tres ángulos de un cuadrilátero no puede ser mayor o igual a 360 grados.";}
		else {devolucion = "El cuarto ángulo tiene "+numD+" grados";}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros los grados (sistema sexagesimal) que miden los</h3>\r\n" + 
					"			<h3>tres ángulos conocidos del cuadrilátero convexo. Los datos introducidos han de ser</h3>\r\n" + 
					"			<h3>exclusivamente numéricos.</h3>\r\n" + 
					"					<form action=\"TresAngulosCuadrilateroServlet\" method=\"post\">\r\n" + 
					"			  Primer ángulo (en grados):<br>\r\n" + 
					"					<input type=\"text\" name=\"angulo1\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Segundo ángulo (en grados):<br>\r\n" + 
					"					<input type=\"text\" name=\"angulo2\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Tercer ángulo (en grados):<br>\r\n" + 
					"					<input type=\"text\" name=\"angulo3\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
/**
 * Este método dada la longitud del radio de una circunferencia calcula la longitud de dicha circunferencia.	
 * @param longitudRadio
 * @return
 */
	
	public static String calculoLongitudCircunferencia(String longitudRadio) {
		String devolucion = "ppqq";
		double longitudCircunferencia = 0;
	try {	
		double numA = Double.parseDouble(longitudRadio);
		if(numA < 0) {devolucion = "El dato introducido es incorrecto. No tiene sentido un valor negativo en una longitud.";}
		else {longitudCircunferencia =2 * Math.PI * numA;}
				devolucion = "La longitud de la circunferencia es "+longitudCircunferencia;
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero la longitud del radio de la circunferencia</h3>\r\n" + 
					"					<form action=\"LongitudCircunferenciaServlet\" method=\"post\">\r\n" + 
					"				  Longitud del radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;			
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
	
	public static String calculoLongitudRad(String longitudCircunf) {
		String devolucion = "ppqq";
		double longitudRadio = 0;
		try {
			double numC = Double.parseDouble(longitudCircunf);
			if(numC < 0) {devolucion = "El dato introducido es incorrecto. No tiene sentido un valor negativo en una longitud.";}
			else {longitudRadio = numC / (2*Math.PI);
					devolucion = "La longitud del radio es "+longitudRadio;}
			}catch(NumberFormatException exception) {
				String casillero = "			<h3>Introduzca en el siguiente casillero la longitud de la circunferencia</h3>\r\n" + 
						"					<form action=\"LongitudCircunfServlet\" method=\"post\">\r\n" + 
						"				  Longitud de la circunferencia:<br>\r\n" + 
						"						<input type=\"text\" name=\"circunferencia\" value=\"\">\r\n" + 
						"						<br><br>\r\n" + 
						"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"					</form>\r\n" + 
						"";
				return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;
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
	
	public static String calculoLongitudArco(String gradosAngulo, String longitudRadio) {
		String devolucion = "ppqq";
		double longitudArco = 0;
		try {
		double numA = Double.parseDouble(gradosAngulo);
		double numB = Double.parseDouble(longitudRadio);
		if(numA < 0 || numB < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). Valores como grados de un ángulo o una longitud no tiene sentido que sean negativos.";}
		else {longitudArco = 2*Math.PI*numB*numA/360;
				devolucion = "La longitud del arco definido por el ángulo es de "+longitudArco;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros lo que mide el ángulo en grados (sistema sexagesimal)</h3>\r\n" + 
					"			<h3>y la longitud del radio de la circunferencia. Los datos introducidos han de ser exclusivamente</h3>\r\n" + 
					"			<h3>numéricos.</h3>\r\n" + 
					"					<form action=\"LongitudArcoServlet\" method=\"post\">\r\n" + 
					"				  	Grados del ángulo:<br>\r\n" + 
					"						<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
	public static String calculoGradosAngulo(String longitudArco, String longitudRadio) {
		String devolucion = "ppqq";
		double gradosAngulo = 0;
		try {
			double numA = Double.parseDouble(longitudArco);
			double numR = Double.parseDouble(longitudRadio);
			if(numA < 0 || numR < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). No tiene sentido tomar una longitud con valor negativo.";}
			else if(numA == 0 && numR == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido tomar como cero la longitud del arco y del radio del círculo simultáneamente.";}
			else {gradosAngulo = numA*360/(2*Math.PI*numR);
				devolucion = "Los grados del ángulo central son "+gradosAngulo;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del arco y del</h3>\r\n" + 
					"			<h3>radio de la circunferencia a la cual pertenece ese arco</h3>\r\n" + 
					"					<form action=\"ArcoYradioServlet\" method=\"post\">\r\n" + 
					"				  	Longitud del arco:<br>\r\n" + 
					"						<input type=\"text\" name=\"arco\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return  "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
		
		return devolucion+decisionSalirOcontinuar;
	}
	
	public static String calculoLongitudRadio(String longitudArco, String gradosAngulo) {
		String devolucion = "ppqq";
		double longitudRadio = 0;
		try {
			double numArco = Double.parseDouble(longitudArco);
			double numAng = Double.parseDouble(gradosAngulo);
			if(numArco < 0 || numAng < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). En este problema, valores como grados de un ángulo o una longitud no tiene sentido que sean negativos.";}
			else if(numArco == 0 && numAng == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido tomar como cero la longitud del arco y los grados del ángulo asociado simultáneamente.";}
			else {longitudRadio = 360*numArco/(2*Math.PI*numAng);
					devolucion = "La longitud del radio es "+longitudRadio;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados (sistema sexagesimal)</h3>\r\n" + 
					"			<h3>que mide el ángulo. Los datos introducidos han de ser exclusivamente numéricos.</h3>\r\n" + 
					"					<form action=\"ArcoYanguloServlet\" method=\"post\">\r\n" + 
					"				  	Longitud del arco:<br>\r\n" + 
					"						<input type=\"text\" name=\"arco\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Grados del ángulo:<br>\r\n" + 
					"						<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
		
		return devolucion+decisionSalirOcontinuar;
		
	}
	
	public static String calculoLongitudArcoBis(String gradosAngulo, String longitudRadio) {
		String devolucion = "ppqq";
		double longitudArco = 0;
		try {
		double numA = Double.parseDouble(gradosAngulo);
		double numB = Double.parseDouble(longitudRadio);
		if(numA < 0 || numB < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). Valores como grados de un ángulo o una longitud no tiene sentido que sean negativos.";}
		else{longitudArco = 4*Math.PI*numB*numA/360;
				devolucion = "La longitud del arco definido por el ángulo es de "+longitudArco;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros lo que mide el ángulo en grados (sistema sexagesimal)</h3>\r\n" + 
					"			<h3>y la longitud del radio de la circunferencia. Los datos introducidos han de ser exclusivamente</h3>\r\n" + 
					"			<h3>numéricos.</h3>\r\n" + 
					"					<form action=\"LongitudArcoBisServlet\" method=\"post\">\r\n" + 
					"				  	Grados del ángulo:<br>\r\n" + 
					"						<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
	
	public static String calculoGradosAnguloBis(String longitudArco, String lontitudRadio) {
		String devolucion = "ppqq";
		double gradosAngulo = 0;
		try {
			double numA = Double.parseDouble(longitudArco);
			double numR = Double.parseDouble(lontitudRadio);
			if(numA < 0 || numR < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). No tiene sentido tomar una longitud con valor negativo.";}			
			else if(numA == 0 && numR == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido tomar como cero la longitud del arco y del radio del círculo simultáneamente.";}
			else{gradosAngulo = numA*360/(4*Math.PI*numR);
					devolucion = "Los grados del ángulo inscrito son "+gradosAngulo;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del arco y del</h3>\r\n" + 
					"			<h3>radio de la circunferencia a la cual pertenece ese arco</h3>\r\n" + 
					"					<form action=\"ArcoYradioBisServlet\" method=\"post\">\r\n" + 
					"				  	Longitud del arco:<br>\r\n" + 
					"						<input type=\"text\" name=\"arco\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return  "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
		
		return devolucion+decisionSalirOcontinuar;
	}
	
	public static String calculoLongitudRadioBis(String longitudArco, String gradosAngulo) {
		String devolucion = "ppqq";
		double longitudRadio = 0;
		try {
			double numArco = Double.parseDouble(longitudArco);
			double numAng = Double.parseDouble(gradosAngulo);
			if(numArco < 0 || numAng < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). Valores como grados de un ángulo o una longitud no tiene sentido que sean negativos en este problema.";}			
			else if(numArco == 0 && numAng == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido tomar como cero la longitud del arco y los grados del ángulo asociado simultáneamente.";}
			else {longitudRadio = 360*numArco/(4*Math.PI*numAng);
					devolucion = "La longitud del radio es "+longitudRadio;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del arco y los grados (sistema sexagesimal)</h3>\r\n" + 
					"			<h3>que mide el ángulo. Los datos introducidos han de ser exclusivamente numéricos.</h3>\r\n" + 
					"					<form action=\"ArcoYanguloBisServlet\" method=\"post\">\r\n" + 
					"				  	Longitud del arco:<br>\r\n" + 
					"						<input type=\"text\" name=\"arco\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Grados del ángulo:<br>\r\n" + 
					"						<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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
	
		
		return devolucion+decisionSalirOcontinuar;
		
	}
	
	public static String calculoLongitudHipotenusa(String cateto1, String cateto2) {
		String devolucion = "ppqq";
		double longitudHipotenusa = 0;
		try {
			double num1 = Double.parseDouble(cateto1);
			double num2 = Double.parseDouble(cateto2);
			if(num1 < 0 || num2 < 0) {devolucion = "Dato(s) introducido(s) incorrecto(s). No tiene sentido tomar una longitud con valor negativo.";}			
			else {longitudHipotenusa = Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2));
					devolucion = "La longitud de la hipostenusa es "+longitudHipotenusa;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del primer y del segundo cateto</h3>\r\n" + 
					"					<form action=\"Cateto1yCateto2Servlet\" method=\"post\">\r\n" + 
					"				  	Longitud del primer cateto:<br>\r\n" + 
					"						<input type=\"text\" name=\"cateto1\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del segundo cateto:<br>\r\n" + 
					"						<input type=\"text\" name=\"cateto2\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros; 		
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
	
		
		return devolucion+decisionSalirOcontinuar;
	}

	public static String calculoLongitudCateto(String hipotenusa, String cateto) {
		String devolucion = "ppqq";
		double longitudCateto = 0;
		try {
			double num1 = Double.parseDouble(hipotenusa);
			double num2 = Double.parseDouble(cateto);
			if((num1 < 0 || num2 < 0) || num2 > num1) {devolucion = "Dato(s) introducido(s) incorrecto(s). No tiene sentido tomar una longitud con valor negativo y/o la hipotenusa no puede ser de menor longitud que un cateto.";}
			else {longitudCateto = Math.sqrt(Math.pow(num1, 2)-Math.pow(num2, 2));
					devolucion = "La longitud del cateto es "+longitudCateto;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud la hipotenusa y del otro cateto</h3>\r\n" + 
					"					<form action=\"HipotenusayCatetoServlet\" method=\"post\">\r\n" + 
					"				  	Longitud de la hipotenusa:<br>\r\n" + 
					"						<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Longitud del otro cateto:<br>\r\n" + 
					"						<input type=\"text\" name=\"cateto\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros; 		
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
	
		
		return devolucion+decisionSalirOcontinuar;
	}

	public static String calculoAlturaTrianguloRect(String hipotenusa, String cateto1, String cateto2) {
		String devolucion = "ppqq";
		double altura = 0;
		try {
			double num1 = Double.parseDouble(hipotenusa);
			double num2 = Double.parseDouble(cateto1);
			double num3 = Double.parseDouble(cateto2);
			if(((num1 < 0 || num2 < 0) || num3 < 0) || (num2 > num1 || num3 > num1)) {devolucion = "Dato(s) introducido(s) incorrecto(s). No tiene sentido tomar una longitud con valor negativo y/o la hipotenusa no puede ser de menor longitud que un cateto.";}			
			else if(num1 == 0 && num2 == 0 && num3 == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido tomar un valor cero para la longitud de la hipotenusa.";}
			else {altura = num2*num3/num1;
					devolucion = "La altura del triángulo es "+altura;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y de los dos catetos</h3>\r\n" + 
					"			<h3>que tiene el triángulo rectángulo</h3>\r\n" + 
					"					<form action=\"HipotenusaYcatetosServlet\" method=\"post\">\r\n" + 
					"			  Hipotenusa:<br>\r\n" + 
					"					<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Primer cateto:<br>\r\n" + 
					"					<input type=\"text\" name=\"cateto1\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Segundo cateto:<br>\r\n" + 
					"					<input type=\"text\" name=\"cateto2\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;		
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
	
		
		return devolucion+decisionSalirOcontinuar;
		
	}
	
	public static String calculoHipotenusaTrianguloRect(String altura, String cateto1, String cateto2) {
		String devolucion = "ppqq";
		double hipotenusa = 0;
		try {
			double num1 = Double.parseDouble(altura);
			double num2 = Double.parseDouble(cateto1);
			double num3 = Double.parseDouble(cateto2);
			if(((num1 <= 0 || num2 <= 0) || num3 <= 0) || (num2 < num1 || num3 < num1)) {devolucion = "Dato(s) introducido(s) incorrecto(s). En este problema no tiene sentido tomar una longitud con valor negativo o cero y/o un cateto no puede ser de menor longitud que la altura.";}
			else {hipotenusa = num2*num3/num1;
					devolucion = "La hipotenusa del triángulo es "+hipotenusa;}
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la altura y longitud de los dos catetos</h3>\r\n" + 
					"			<h3>que tiene el triángulo rectángulo</h3>\r\n" + 
					"					<form action=\"AlturaYcatetosServlet\" method=\"post\">\r\n" + 
					"			  Altura:<br>\r\n" + 
					"					<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Primer cateto:<br>\r\n" + 
					"					<input type=\"text\" name=\"cateto1\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Segundo cateto:<br>\r\n" + 
					"					<input type=\"text\" name=\"cateto2\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;			
			
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
	
		
		return devolucion+decisionSalirOcontinuar;

	}
	
	public static String calculoCatetoTrianguloRect(String altura, String hipotenusa, String cateto) {
		String devolucion = "ppqq";
		double catetoCalculado = 0;
		try {
			double num1 = Double.parseDouble(altura);
			double num2 = Double.parseDouble(hipotenusa);
			double num3 = Double.parseDouble(cateto);
			if(((num1 <= 0 || num2 <= 0) || num3 <= 0) || ((num2 < num1 || num3 < num1) || num2 < num3)) {devolucion = "Dato(s) introducido(s) incorrecto(s). En este problema no tiene sentido tomar una longitud con valor negativo o cero y/o un cateto o la hipotenusa no pueden ser de menor longitud que la altura o bien la hipotenusa no puede ser de menor longitud que un cateto.";}
			else {catetoCalculado = num2*num1/num3;
				devolucion = "La longitud del cateto es "+catetoCalculado;}			
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud del cateto conocido, de la hipotenusa</h3>\r\n" + 
					"			<h3>y la altura del triángulo rectángulo</h3>\r\n" + 
					"					<form action=\"AlturaHipotenusaYcatetoServlet\" method=\"post\">\r\n" + 
					"			  Altura:<br>\r\n" + 
					"					<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Hipotenusa:<br>\r\n" + 
					"					<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Cateto:<br>\r\n" + 
					"					<input type=\"text\" name=\"cateto\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato o datos introducidos no son numéricos. Introduzca un dato numérico en cada casillero." + casilleros;
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

		return devolucion+decisionSalirOcontinuar;
	}
	
	public static String calculoAnguloPoligonoReg(String numeroDeLados) {
		String devolucion = "ppqq";
		double anguloCalculado = 0;
		try {
			int num = Integer.parseInt(numeroDeLados);
			if(num < 3) {devolucion = "Dato introducido incorrecto. Un polígono regular no puede tener menos de tres lados o bien se ha introducido un valor negativo lo cual no tiene sentido.";}
			else {anguloCalculado = (num-2)*180/num;
					devolucion = "Los ángulos del polígono regular miden "+anguloCalculado+ " grados.";}
		}catch(NumberFormatException exception){
			String casillero = "			<h3>Introduzca en el siguiente casillero el número de lados del polígono regular</h3>\r\n" + 
					"					<form action=\"NumeroDeLadosServlet\" method=\"post\">\r\n" + 
					"				  Número de lados:<br>\r\n" + 
					"						<input type=\"text\" name=\"numeroDeLados\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato introducido no es un número entero. Introduzca un número entero en el casillero." + casillero;
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

		return devolucion+decisionSalirOcontinuar;
	}
	
	public static String calculoNumeroLadosPolReg(String gradosAngPolReg) {
		String devolucion = "ppqq";
		double numLadosCalculado = 0;
		try {
			double gradosAng = Double.parseDouble(gradosAngPolReg);
			if(gradosAng < 0) {devolucion = "Dato introducido incorrecto. En este problema no tiene sentido un valor negativo para la medida de un ángulo";}
			else {numLadosCalculado = 2/(1-(gradosAng/180));
					devolucion = "El número de lados del polígono regular es "+ numLadosCalculado;}
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero los grados (sistema sexagesimal) que miden los ángulos</h3>\r\n" + 
					"			<h3>del polígono regular. El dato introducido ha de ser exclusivamente numérico.</h3>\r\n" + 
					"					<form action=\"GradosDeLosAngulosServlet\" method=\"post\">\r\n" + 
					"				  Grados de los ángulos:<br>\r\n" + 
					"						<input type=\"text\" name=\"gradosDeLosAngulos\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato introducido no es un dato numérico. Introduzca un dato numérico en el casillero." + casillero;
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

		return devolucion+decisionSalirOcontinuar;
	}
	
	public static String calculoAreaParalelog(String base, String altura) {
		String devolucion = "ppqq";
		double areaParalelog = 0;
		try {
			double baseParalelog = Double.parseDouble(base);
			double alturaParalelog = Double.parseDouble(altura);
			if(baseParalelog < 0 || alturaParalelog < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud";}
			else{
				areaParalelog = baseParalelog*alturaParalelog;
				devolucion = "El área del paralelogramo es "+areaParalelog;
			}
		} catch (NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en los siguientes casilleros la base y la altura del paralelogramo</h3>		\r\n" + 
					"					<form action=\"BaseYalturaServlet\" method=\"post\">\r\n" + 
					"				  	Base:<br>\r\n" + 
					"						<input type=\"text\" name=\"base\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Altura:<br>\r\n" + 
					"						<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}
	
	public static String calculoBaseParalelog(String area, String altura) {
		String devolucion = "ppqq";
		double baseParalelog = 0;
		try {
			double areaParalelog = Double.parseDouble(area);
			double alturaParalelog = Double.parseDouble(altura);
			if(areaParalelog < 0 || alturaParalelog < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área";}
			else{
				baseParalelog = areaParalelog/alturaParalelog;
				devolucion = "La base del paralelogramo es "+baseParalelog;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros la altura y el área del paralelogramo</h3>		\r\n" + 
					"					<form action=\"AlturaYareaServlet\" method=\"post\">\r\n" + 
					"				  	Altura:<br>\r\n" + 
					"						<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}

	public static String calculoAlturaParalelog(String area, String base) {
		String devolucion = "ppqq";
		double alturaParalelog = 0;
		try {
			double areaParalelog = Double.parseDouble(area);
			double baseParalelog = Double.parseDouble(base);
			if(areaParalelog < 0 || baseParalelog < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área";}
			else{
				alturaParalelog = areaParalelog/baseParalelog;
				devolucion = "La altura del paralelogramo es "+alturaParalelog;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros la base y el área del paralelogramo</h3>		\r\n" + 
					"					<form action=\"BaseYareaServlet\" method=\"post\">\r\n" + 
					"				  	Base:<br>\r\n" + 
					"						<input type=\"text\" name=\"base\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}
	
	public static String calculoAreaTriang(String base, String altura) {
		String devolucion = "ppqq";
		double areaTriang = 0;
		try {
			double baseTriang = Double.parseDouble(base);
			double alturaTriang = Double.parseDouble(altura);
			if(baseTriang < 0 || alturaTriang < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud";}
			else{
				areaTriang = baseTriang*alturaTriang/2;
				devolucion = "El área del triángulo es "+areaTriang;
			}
		} catch (NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en los siguientes casilleros la base y la altura del triángulo</h3>			\r\n" + 
					"					<form action=\"BaseYalturaBisServlet\" method=\"post\">\r\n" + 
					"				  	Base:<br>\r\n" + 
					"						<input type=\"text\" name=\"base\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Altura:<br>\r\n" + 
					"						<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}

	public static String calculoBaseTriang(String area, String altura) {
		String devolucion = "ppqq";
		double baseTriang = 0;
		try {
			double areaTriang = Double.parseDouble(area);
			double alturaTriang = Double.parseDouble(altura);
			if(areaTriang < 0 || alturaTriang < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área";}
			else{
				baseTriang = areaTriang*2/alturaTriang;
				devolucion = "La base del triángulo es "+baseTriang;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros la altura y el área del triángulo</h3>		\r\n" + 
					"					<form action=\"AlturaYareaBisServlet\" method=\"post\">\r\n" + 
					"				  	Altura:<br>\r\n" + 
					"						<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}
	
	public static String calculoAlturaTriang(String area, String base) {
		String devolucion = "ppqq";
		double alturaTriang = 0;
		try {
			double areaTriang = Double.parseDouble(area);
			double baseTriang = Double.parseDouble(base);
			if(areaTriang < 0 || baseTriang < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área";}
			else{
				alturaTriang = areaTriang*2/baseTriang;
				devolucion = "La altura del triángulo es "+alturaTriang;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros la base y el área del triángulo</h3>		\r\n" + 
					"					<form action=\"BaseYareaBisServlet\" method=\"post\">\r\n" + 
					"				  	Base:<br>\r\n" + 
					"						<input type=\"text\" name=\"base\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}
	
	public static String calculoAreaTrapecio(String baseInferior, String baseSuperior, String altura) {
		String devolucion = "ppqq";
		double areaTrapecio = 0;
		try {
			double baseInf = Double.parseDouble(baseInferior);
			double baseSup = Double.parseDouble(baseSuperior);
			double alturaTrap = Double.parseDouble(altura);
			if((baseInf < 0 || baseSup < 0) || alturaTrap < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud.";}
			else {
				areaTrapecio = ((baseInf+baseSup)/2)*alturaTrap;
				devolucion = "El área del trapecio es "+areaTrapecio;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud de las dos bases y la altura del</h3>\r\n" + 
					"			<h3>trapecio</h3>\r\n" + 
					"					<form action=\"BasesYalturaServlet\" method=\"post\">\r\n" + 
					"			  Base inferior:<br>\r\n" + 
					"					<input type=\"text\" name=\"baseInferior\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Base superior:<br>\r\n" + 
					"					<input type=\"text\" name=\"baseSuperior\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Altura:<br>\r\n" + 
					"					<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}

	public static String calculoAlturaTrapecio(String baseInferior, String baseSuperior, String area) {
		String devolucion = "ppqq";
		double alturaTrapecio = 0;
		try {
			double baseInf = Double.parseDouble(baseInferior);
			double baseSup = Double.parseDouble(baseSuperior);
			double areaTrap = Double.parseDouble(area);
			if((baseInf < 0 || baseSup < 0) || areaTrap < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área.";}
			else {
				alturaTrapecio = 2*areaTrap/(baseInf+baseSup);
				devolucion = "La altura del trapecio es "+alturaTrapecio;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud de las dos bases y el área del</h3>\r\n" + 
					"			<h3>trapecio</h3>\r\n" + 
					"					<form action=\"BasesYareaServlet\" method=\"post\">\r\n" + 
					"			  Base inferior:<br>\r\n" + 
					"					<input type=\"text\" name=\"baseInferior\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Base superior:<br>\r\n" + 
					"					<input type=\"text\" name=\"baseSuperior\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Area:<br>\r\n" + 
					"					<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}

	public static String calculoBaseTrapecio(String base1, String area, String altura) {
		String devolucion = "ppqq";
		double baseTrap2 = 0;
		try {
			double baseTrap1 = Double.parseDouble(base1);
			double areaTrap = Double.parseDouble(area);
			double alturaTrap = Double.parseDouble(altura);
			if((baseTrap1 < 0 || areaTrap < 0) || alturaTrap < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área.";}
			else {
				baseTrap2 = (2*areaTrap/alturaTrap)-baseTrap1;
				devolucion = "La otra base del trapecio mide "+baseTrap2;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros la longitud de la base conocida, la altura y el</h3>\r\n" + 
					"			<h3>área del trapecio</h3>\r\n" + 
					"					<form action=\"BaseAlturaYareaServlet\" method=\"post\">\r\n" + 
					"			  Base conocida:<br>\r\n" + 
					"					<input type=\"text\" name=\"baseConocida\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Altura:<br>\r\n" + 
					"					<input type=\"text\" name=\"altura\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Area:<br>\r\n" + 
					"					<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}
	
	public static String calculoAreaRombo(String diagonalMayor, String diagonalMenor) {
		String devolucion = "ppqq";
		double areaRombo = 0;
		try {
			double diagMayor = Double.parseDouble(diagonalMayor);
			double diagMenor = Double.parseDouble(diagonalMenor);
			if(diagMayor < 0 || diagMenor < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud";}
			else{
				areaRombo = diagMayor*diagMenor/2;
				devolucion = "El área del rombo es "+areaRombo;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros las dos diagonales del rombo</h3>		\r\n" + 
					"					<form action=\"DosDiagonalesServlet\" method=\"post\">\r\n" + 
					"				  	Diagonal mayor:<br>\r\n" + 
					"						<input type=\"text\" name=\"diagonalMayor\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Diagonal menor:<br>\r\n" + 
					"						<input type=\"text\" name=\"diagonalMenor\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}

	public static String calculoDiagonalRombo(String area, String diagonalConocida) {
		String devolucion = "ppqq";
		double diagonalRombo = 0;
		try {
			double areaRombo = Double.parseDouble(area);
			double diagonalSabida = Double.parseDouble(diagonalConocida);
			if(areaRombo < 0 || diagonalSabida < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud o área";}
			else if(areaRombo == 0 && diagonalSabida == 0) {devolucion = "Datos introducidos incorrectos. En este problema no tiene sentido dar el valor de cero al área y a la longitud de la diagonal conocida simultáneamente";}
			else{
				diagonalRombo = areaRombo*2/diagonalSabida;
				devolucion = "La longitud de la diagonal es "+diagonalRombo;
			}
		} catch (NumberFormatException exception) {
			String casillero ="			<h3>Introduzca en los siguientes casilleros la diagonal conocida y el área del rombo</h3>		\r\n" + 
					"					<form action=\"DiagonalYareaServlet\" method=\"post\">\r\n" + 
					"				  	Diagonal conocida:<br>\r\n" + 
					"						<input type=\"text\" name=\"diagonalConocida\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casillero;

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

		return devolucion+decisionSalirOcontinuar;
		}
	
	public static String calculoAreaPoligonoReg(String numLados, String longLado, String apotema) {
		String devolucion = "ppqq";
		double areaPoligonoReg = 0;
		try {
			double numeroLados = Double.parseDouble(numLados);
			double longitudLado = Double.parseDouble(longLado);
			double segmentoApotema = Double.parseDouble(apotema);
			if(longitudLado < 0 || segmentoApotema < 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo para una longitud.";}
			else if(numeroLados < 3) {devolucion = "Dato introducido incorrecto. Un polígono regular no puede tener menos de 3 lados o bien el valor introducido para el número de lados es negativo lo cual no tiene sentido.";}
			else {
				areaPoligonoReg = numeroLados*longitudLado*segmentoApotema/2;
				devolucion = "El área del polígono regular es "+areaPoligonoReg;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el número de lados del polígono regular, la longitud</h3>\r\n" + 
					"			<h3>de un lado y el apotema.</h3>\r\n" + 
					"					<form action=\"NumLadosLongLadoApotemaServlet\" method=\"post\">\r\n" + 
					"			  Número de lados:<br>\r\n" + 
					"					<input type=\"text\" name=\"numLados\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Longitud del lado:<br>\r\n" + 
					"					<input type=\"text\" name=\"longLado\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Apotema:<br>\r\n" + 
					"					<input type=\"text\" name=\"apotema\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}
	
	public static String calculoApotemaPoligonoReg(String area, String longLado, String numLados) {
		String devolucion = "ppqq";
		double apotemaPoligonoReg = 0;
		try {
			double numeroLados = Double.parseDouble(numLados);
			double longitudLado = Double.parseDouble(longLado);
			double areaPoligono = Double.parseDouble(area);
			if(longitudLado <= 0 || areaPoligono <= 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo o cero para una longitud en este problema.";}
			else if(numeroLados < 3) {devolucion = "Dato introducido incorrecto. Un polígono regular no puede tener menos de 3 lados o bien el valor introducido para el número de lados es negativo lo cual no tiene sentido.";}
			else {
				apotemaPoligonoReg = 2*areaPoligono/(numeroLados*longitudLado);
				devolucion = "El apotema del polígono regular es "+apotemaPoligonoReg;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el área del polígono regular, el número de lados</h3>\r\n" + 
					"			<h3>y la longitud de un lado.</h3>\r\n" + 
					"					<form action=\"AreaNumLadosLongLadoServlet\" method=\"post\">\r\n" + 
					"			  Area:<br>\r\n" + 
					"					<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Longitud del lado:<br>\r\n" + 
					"					<input type=\"text\" name=\"longLado\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Número de lados:<br>\r\n" + 
					"					<input type=\"text\" name=\"numLados\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}
	
	public static String calculoLongitudLadoPoligonoReg(String area, String apotema, String numLados) {
		String devolucion = "ppqq";
		double ladoPoligonoReg = 0;
		try {
			double numeroLados = Double.parseDouble(numLados);
			double segmentoApotema = Double.parseDouble(apotema);
			double areaPoligono = Double.parseDouble(area);
			if(segmentoApotema <= 0 || areaPoligono <= 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). No tiene sentido un valor negativo o cero para una longitud en este problema.";}
			else if(numeroLados < 3) {devolucion = "Dato introducido incorrecto. Un polígono regular no puede tener menos de 3 lados o bien el valor introducido para el número de lados es negativo lo cual no tiene sentido.";}
			else {
				ladoPoligonoReg = 2*areaPoligono/(numeroLados*segmentoApotema);
				devolucion = "La longitud de lado del polígono regular es "+ladoPoligonoReg;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el área del polígono regular, el número de lados</h3>\r\n" + 
					"			<h3>y el apotema.</h3>\r\n" + 
					"					<form action=\"AreaNumLadosApotemaServlet\" method=\"post\">\r\n" + 
					"			  Area:<br>\r\n" + 
					"					<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Número de lados:<br>\r\n" + 
					"					<input type=\"text\" name=\"numLados\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Apotema:<br>\r\n" + 
					"					<input type=\"text\" name=\"apotema\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}

	public static String calculoNumLadosPoligonoReg(String area, String apotema, String longLado) {
		String devolucion = "ppqq";
		double numLadosPoligonoReg = 0;
		try {
			double longitudLado = Double.parseDouble(longLado);
			double segmentoApotema = Double.parseDouble(apotema);
			double areaPoligono = Double.parseDouble(area);
			if(segmentoApotema <= 0 || areaPoligono <= 0) {devolucion = "Dato o datos introducido(s) incorrecto(s). En este problema no tiene sentido un valor negativo o cero para el apotema o el área.";}
			else if(longitudLado < 0) {devolucion = "Dato introducido incorrecto. En este problema no tiene sentido un valor negativo para la longitud del lado";}
			else {
				numLadosPoligonoReg = 2*areaPoligono/(longitudLado*segmentoApotema);
				devolucion = "El número de lados del polígono regular es "+numLadosPoligonoReg;
			}
		} catch (NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el área del polígono regular, la longitud</h3>\r\n" + 
					"			<h3>de un lado y el apotema.</h3>\r\n" + 
					"					<form action=\"AreaLongLadoApotemaServlet\" method=\"post\">\r\n" + 
					"			  Area:<br>\r\n" + 
					"					<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Longitud del lado:<br>\r\n" + 
					"					<input type=\"text\" name=\"longLado\" value=\"\">\r\n" + 
					"					<br>\r\n" + 
					"			  Apotema:<br>\r\n" + 
					"					<input type=\"text\" name=\"apotema\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"				</form>\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero."+casilleros;
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

		return devolucion+decisionSalirOcontinuar;

	}
	
	public static String calculoAreaCirculo(String radioCirculo) {
		String devolucion = "ppqq";
		double areaCirculo = 0;
	try {	
		double numA = Double.parseDouble(radioCirculo);
		if(numA < 0) {devolucion = "El dato introducido es incorrecto. No tiene sentido un valor negativo en una longitud.";}
		else {areaCirculo =Math.PI*Math.pow(numA, 2);
				devolucion = "El área del círculo es "+areaCirculo;
			 }
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero el radio del círculo</h3>		\r\n" + 
					"					<form action=\"RadioCirculoServlet\" method=\"post\">\r\n" + 
					"			  		Radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"		\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;			
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

	public static String calculoRadioCirculo(String areaCirculo) {
		String devolucion = "ppqq";
		double radioCirculo = 0;
	try {	
		double numA = Double.parseDouble(areaCirculo);
		if(numA < 0) {devolucion = "El dato introducido es incorrecto. No tiene sentido un valor negativo en un área.";}
		else {radioCirculo = Math.sqrt(numA/Math.PI);
				devolucion = "El radio del círculo mide "+radioCirculo;
			 }
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero el área del círculo</h3>		\r\n" + 
					"					<form action=\"AreaCirculoServlet\" method=\"post\">\r\n" + 
					"			  		Area:<br>\r\n" + 
					"						<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;			
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
	
	public static String calculoAreaSectorCir(String radio, String anguloSec) {
		String devolucion = "ppqq";
		double areaSector = 0;
	try {	
		double numRadio = Double.parseDouble(radio);
		double numAng = Double.parseDouble(anguloSec);
		if(numRadio < 0 || numAng < 0) {devolucion = "El dato o datos introducido(s) es(son) incorrecto(s). No tiene sentido en este problema un valor negativo en una longitud o en los grados que mide un ángulo.";}
		else {areaSector = Math.PI*Math.pow(numRadio, 2)*numAng/360;
				devolucion = "El área del sector circular es de "+areaSector;
			 }
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el radio y los grados (sistema sexagesimal) del ángulo</h3>\r\n" + 
					"			<h3>que corresponde al arco. Los datos introducidos han de ser exclusivamente numéricos.</h3>\r\n" + 
					"					<form action=\"RadioYanguloSecServlet\" method=\"post\">\r\n" + 
					"				  	radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Angulo del sector (en grados):<br>\r\n" + 
					"						<input type=\"text\" name=\"anguloSec\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero." + casilleros;			
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
	
	public static String calculoRadioSC(String areaSec, String anguloSec) {
		String devolucion = "ppqq";
		double radio = 0;
	try {	
		double numAreaSec = Double.parseDouble(areaSec);
		double numAng = Double.parseDouble(anguloSec);
		if(numAreaSec < 0 || numAng < 0) {devolucion = "El dato o datos introducido(s) es(son) incorrecto(s). En este problema no tiene sentido un valor negativo en un área o en los grados que mide un ángulo.";}
		else {radio = Math.sqrt(numAreaSec*360/(Math.PI*numAng));
				devolucion = "El valor del radio es "+radio;
			 }
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el área del sector circular y los grados (sistema sexagesimal)</h3>\r\n" + 
					"			<h3>del ángulo que corresponde al arco. Los datos introducidos han de ser exclusivamente numéricos.</h3>	\r\n" + 
					"					<form action=\"AreaYanguloSecServlet\" method=\"post\">\r\n" + 
					"				  	Area del sector:<br>\r\n" + 
					"						<input type=\"text\" name=\"areaSec\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Angulo del sector (en grados):<br>\r\n" + 
					"						<input type=\"text\" name=\"anguloSec\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero." + casilleros;			
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
	
	public static String calculoGradosSec(String areaSec, String radio) {
		String devolucion = "ppqq";
		double gradosSector = 0;
	try {	
		double numAreaSec = Double.parseDouble(areaSec);
		double numRadio = Double.parseDouble(radio);
		if(numAreaSec < 0 || numRadio < 0) {devolucion = "El dato o datos introducido(s) es(son) incorrecto(s). No tiene sentido un valor negativo en un área o longitud.";}
		else {gradosSector = numAreaSec*360/(Math.PI*Math.pow(numRadio, 2));
				devolucion = "Los grados del arco asociado al sector son "+gradosSector;
			 }
		}catch(NumberFormatException exception) {
			String casilleros = "			<h3>Introduzca en los siguientes casilleros el área del sector circular y el radio</h3>	\r\n" + 
					"					<form action=\"AreaSecYradioServlet\" method=\"post\">\r\n" + 
					"				  	Area del sector:<br>\r\n" + 
					"						<input type=\"text\" name=\"areaSec\" value=\"\">\r\n" + 
					"						<br>\r\n" + 
					"			  		Radio:<br>\r\n" + 
					"						<input type=\"text\" name=\"radio\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato(s) introducido(s) no es(son) numérico(s). Introduzca un dato numérico en cada casillero." + casilleros;			
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
	
	public static String calculoRadianesAgrados(String radianes) {
		String devolucion = "ppqq";
		double resultadoGrados = 0;
	try {	
		double numRadianes = Double.parseDouble(radianes);
		if(numRadianes < 0) {devolucion = "El dato introducido es incorrecto. En esta operación no tiene sentido un valor negativo en la medición de un ángulo.";}
		else {resultadoGrados = Math.toDegrees(numRadianes);
				devolucion = "Los grados que mide el ángulo son "+resultadoGrados;
			}
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero los radianes que mide el ángulo</h3>\r\n" + 
					"					<form action=\"RadianesServlet\" method=\"post\">\r\n" + 
					"				  Radianes:<br>\r\n" + 
					"						<input type=\"text\" name=\"radianes\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;			
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
	
	public static String calculoGradosAradianes(String grados) {
		String devolucion = "ppqq";
		double resultadoRadianes = 0;
	try {	
		double numGrados = Double.parseDouble(grados);
		if(numGrados < 0) {devolucion = "El dato introducido es incorrecto. En esta operación no tiene sentido un valor negativo en la medición de un ángulo.";}
		else {resultadoRadianes = Math.toRadians(numGrados);
				devolucion = "Los radianes que mide el ángulo son "+resultadoRadianes;
			}
		}catch(NumberFormatException exception) {
			String casillero = "			<h3>Introduzca en el siguiente casillero los grados que mide el ángulo</h3>\r\n" + 
					"					<form action=\"GradosServlet\" method=\"post\">\r\n" + 
					"				  Grados:<br>\r\n" + 
					"						<input type=\"text\" name=\"grados\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			return "El dato introducido no es numérico. Introduzca un dato numérico en el casillero." + casillero;			
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
	
	public static String calculaAnguloPoligConvexo(String angulos) {
		String devolucion = "ppqq";
		double sumaAngulosDados = 0;
		int numeroAngDados = 0;
		int numeroAngPolig = 0;
		double anguloBucle = 0;
		double anguloCalculado = 0;
		String[] arrayStrAngulos = angulos.split(",");
		numeroAngDados = arrayStrAngulos.length;
		try {
			for(String anguloDado : arrayStrAngulos) {
				anguloBucle = Double.parseDouble(anguloDado);
				if(anguloBucle <= 0) {
					devolucion = "Dato o datos introducidos incorrectos. No tiene sentido un valor negativo o cero para un ángulo en este tipo de problemas.";
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
				sumaAngulosDados = sumaAngulosDados + anguloBucle;
			}
			numeroAngPolig = numeroAngDados + 1;
			if(sumaAngulosDados >= 180*(numeroAngPolig-2)) {
				devolucion = "Datos introducidos incorrectos; la suma de los valores de los ángulos dados no puede ser mayor o igual a 180 x (n-2), siendo 'n' el número de lados del polígono.";
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
			anguloCalculado = 180*(numeroAngPolig-2)-sumaAngulosDados;			
		} catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos numéricos";
			String casillero = "			 <h3>Introduzca en el siguiente casillero los valores de los ángulos conocidos, que han de ser</h3>\r\n" + 
					"			 <h3>todos los del polígono menos el valor del ángulo queremos calcular.</h3>\r\n" + 
					"			 <h3>Estos valores, que han de ser exclusivamente numéricos (en grados del sistema sexagesimal),</h3>\r\n" + 
					"			 <h3>se han de introducir uno tras otro y separados por una coma, sin ningún espacio en medio.</h3>\r\n" + 
					"						<form action=\"AngulosPoligonoServlet\" method=\"post\">\r\n" + 
					"				  Listado de valores:<br>\r\n" + 
					"						<input type=\"text\" name=\"angulosPoligono\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"						<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>\r\n" + 
					"";
			
			return devolucion + casillero;

		}
		devolucion = "El valor del ángulo calculado es "+anguloCalculado;		
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
