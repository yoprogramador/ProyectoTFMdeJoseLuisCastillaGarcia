package operacionesDeEstadistica;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class OperacionesDeEstadistica {

	public static String calculoPromedio(String variableX) {
		String devolucion = "ppqq";
		double resultado = 0;
		double sumatorio = 0;
		double doubleCelda = 0;
		int numeroCeldas = 0;
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;
		try {
			for(String stringCelda : arrayString) {
				doubleCelda = Double.parseDouble(stringCelda);
				sumatorio = sumatorio + doubleCelda;
			}
		}catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos numéricos";
			String casillero = "					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la media</h3>\r\n" + 
					"					<h3>aritmética. Estos números se han de introducir uno tras otro y separados por una coma, sin</h3>\r\n" + 
					"					<h3>ningún espacio en medio.</h3>				\r\n" + 
					"					<form action=\"MediaServlet\" method=\"post\">\r\n" + 
					"			  		Datos numéricos:<br>\r\n" + 
					"					<input type=\"text\" name=\"datosParaMedia\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			
			return devolucion + casillero;	
		}
		resultado = sumatorio / numeroCeldas;
		devolucion = "La media aritmética de los datos introducidos es "+resultado;
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
	
	public static String calculaVarianza(String variableX) {
		String devolucion = "ppqq";
		double resultado = 0;
		double varAux1 = 0;
		double varAux2 = 0;
		double promedio = 0;
		double doubleCelda = 0;
		int numeroCeldas = 0;	
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;
		try {
			promedio = calculoPromedioMetodo2(variableX);
			for(String stringCelda : arrayString) {
				doubleCelda = Double.parseDouble(stringCelda);
				varAux1 = Math.pow(doubleCelda - promedio, 2);
				varAux2 = varAux2 + varAux1;
			}
		}catch(NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos numéricos.";
			String casillero = "					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>\r\n" + 
					"					<h3>varianza. Estos números se han de introducir uno tras otro y separados por una coma, sin</h3>\r\n" + 
					"					<h3>ningún espacio en medio.</h3>				\r\n" + 
					"					<form action=\"VarianzaServlet\" method=\"post\">\r\n" + 
					"			  		Datos numéricos:<br>\r\n" + 
					"					<input type=\"text\" name=\"datosParaVarianza\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			
			return devolucion + casillero;	

		}
		resultado = varAux2/numeroCeldas;
		devolucion = "La varianza de los datos introducidos es "+resultado;
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
	
	public static String calculaDesvTipica(String variableX) {
		String devolucion = "ppqq";
		double resultado = 0;
		try {
			resultado = Math.sqrt(calculaVarianza2(variableX));
		}catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos numéricos.";
			String casillero = "					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>\r\n" + 
					"					<h3>desviación típica. Estos números se han de introducir uno tras otro y separados por una</h3>\r\n" + 
					"					<h3>coma, sin ningún espacio en medio.</h3>				\r\n" + 
					"					<form action=\"DesvTipicaServlet\" method=\"post\">\r\n" + 
					"			  		Datos numéricos:<br>\r\n" + 
					"					<input type=\"text\" name=\"datosParaDesvTipica\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return devolucion + casillero;			
		}
		devolucion = "La desviación típica de los datos introducidos es "+resultado;
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
	
	private static double calculaVarianza2(String variableX) throws NumberFormatException {
		double resultado = 0;
		double varAux1 = 0;
		double varAux2 = 0;
		double promedio = 0;
		double doubleCelda = 0;
		int numeroCeldas = 0;	
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;			
		promedio = calculoPromedioMetodo2(variableX);
		for(String stringCelda : arrayString) {
			doubleCelda = Double.parseDouble(stringCelda);
			varAux1 = Math.pow(doubleCelda - promedio, 2);
			varAux2 = varAux2 + varAux1;
		}
		resultado = varAux2/numeroCeldas;
		return resultado;
	}
	

	private static double calculoPromedioMetodo2(String variableX) throws NumberFormatException {
		double resultado = 0;
		double doubleCelda = 0;
		int numeroCeldas = 0;
		String[] arrayString = variableX.split(",");
		numeroCeldas = arrayString.length;
		for(String stringCelda : arrayString) {
			doubleCelda = Double.parseDouble(stringCelda);
			resultado = resultado + doubleCelda;
		}
		resultado = resultado / numeroCeldas;
		
		return resultado;
	}
	
	public static String calculaModa(String serieNumeros) {
		String devolucion = "ppqq";
		double valordouble = 0;
		String[] elementos = serieNumeros.split(",");
		try {
			for (String string : elementos) {
				valordouble = Double.parseDouble(string);
			}			
		} catch (NumberFormatException exception) {
			devolucion = "Alguno o algunos de los datos introducidos no son datos numéricos";
			String casillero = "					<h3>Introduzca en el siguiente casillero los datos numéricos de los que se va a calcular la</h3>\r\n" + 
					"					<h3>moda. Estos números se han de introducir uno tras otro y separados por una coma,</h3>\r\n" + 
					"					<h3>sin ningún espacio en medio.</h3>				\r\n" + 
					"					<form action=\"ModaServlet\" method=\"post\">\r\n" + 
					"			  		Datos numéricos:<br>\r\n" + 
					"					<input type=\"text\" name=\"datosParaModa\" value=\"\">\r\n" + 
					"					<br><br>\r\n" + 
					"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>		\r\n" + 
					"";
			
			return devolucion + casillero;
		}
		Map<String, Integer> m = new HashMap<String, Integer>();
		for (String elemento : elementos) {
			if(m.containsKey(elemento)) {
				m.put(elemento, m.get(elemento)+1);
			}else {
				m.put(elemento, 1);
			}			
		}
		int repeticiones = 0;
		List<String> moda = new ArrayList<String>();
		Iterator<Map.Entry<String, Integer>> iter = m.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<java.lang.String, java.lang.Integer> e = (Map.Entry<java.lang.String, java.lang.Integer>) iter
					.next();
			if(e.getValue() > repeticiones) {
				moda.clear();
				moda.add(e.getKey());
				repeticiones = e.getValue();
			}else if(e.getValue() == repeticiones) {
				moda.add(e.getKey());
			}			
		}
		if(moda.size() == repeticiones) {
			devolucion = "No hay moda en los datos introducidos";
		}else {
			devolucion = "La moda de la distribución es "+moda;
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
