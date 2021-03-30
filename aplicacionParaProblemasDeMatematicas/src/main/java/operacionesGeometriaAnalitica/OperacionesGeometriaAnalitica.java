package operacionesGeometriaAnalitica;

import opcionOperacionGeometriaAnaliticaUsuario.CoordenadasDosPuntos;
import opcionOperacionGeometriaAnaliticaUsuario.CoordenadasTresPuntos;
import opcionOperacionGeometriaAnaliticaUsuario.CoordenadasUnPuntoEcuacionRecta;
import opcionOperacionGeometriaAnaliticaUsuario.EcuacionesDosRectas;
import opcionOperacionGeometriaAnaliticaUsuario.FocoDirectriz;
import opcionOperacionGeometriaAnaliticaUsuario.FuncionCuadratica;

public class OperacionesGeometriaAnalitica {
    /**
     * Este método, dados dos puntos definidos por sus coordenadas cartesianas (x,y), calcula la distancia entre ellos,
     * y devuelve un String con esa información.
     */
    public static String calculaDistanciaEntreDosPuntos (CoordenadasDosPuntos distancia) {
    	String devolucion;
        double resultado = 0;
        double variableAux = 0;
        try {
        	double valorXpunto1 = Double.parseDouble(distancia.getValorXpunto1());
            double valorYpunto1 = Double.parseDouble(distancia.getValorYpunto1());
            double valorXpunto2 = Double.parseDouble(distancia.getValorXpunto2());
            double valorYpunto2 = Double.parseDouble(distancia.getValorYpunto2());
            variableAux = Math.pow(valorXpunto1 - valorXpunto2, 2) + Math.pow( valorYpunto1 - valorYpunto2, 2);
            resultado = Math.sqrt(variableAux);
            devolucion = "La distancia entre los dos puntos es de " + resultado + " unidades";
		} catch (NumberFormatException exception) {
			String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" de los dos puntos </h3>\r\n" + 
					"						<h3>de los cuales se desea calcular la distancia entre ellos</h3>\r\n" + 
					"								<form action=\"CoordenadasDosPuntosServlet\" method=\"post\">\r\n" + 
					"					  Valor de \"x\" del punto 1:<br>\r\n" + 
					"							<input type=\"text\" name=\"valorXpunto1\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"y\" del punto 1:<br>\r\n" + 
					"					  		<input type=\"text\" name=\"valorYpunto1\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"x\" del punto 2:<br>\r\n" + 
					"							<input type=\"text\" name=\"valorXpunto2\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"y\" del punto 2:<br>\r\n" + 
					"					  		<input type=\"text\" name=\"valorYpunto2\" value=\"\">\r\n" + 
					"							<br><br>\r\n" + 
					"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>";
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
     * Este método, dados dos puntos definidos por sus coordenadas cartesianas (x,y), calcula el punto medio entre ellos,
     * y devuelve un String con esa información.
     */    
    public static String calculaPuntoMedioEntreDosPuntos (CoordenadasDosPuntos dosPuntos) {
    	String devolucion;
    	double resultadoX = 0;
    	double resultadoY = 0;
    	try {
	    	double valorXpunto1 = Double.parseDouble(dosPuntos.getValorXpunto1());
	        double valorYpunto1 = Double.parseDouble(dosPuntos.getValorYpunto1());
	        double valorXpunto2 = Double.parseDouble(dosPuntos.getValorXpunto2());
	        double valorYpunto2 = Double.parseDouble(dosPuntos.getValorYpunto2());
	        resultadoX = (valorXpunto1 + valorXpunto2)/2;
	        resultadoY = (valorYpunto1 + valorYpunto2)/2;
	        devolucion = "El punto medio entre los dos puntos dados tiene de coordenadas ("+resultadoX+", "+resultadoY+")";
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" de los dos puntos </h3>\r\n" + 
    				"						<h3>de los cuales se desea calcular el punto medio entre ellos</h3>\r\n" + 
    				"								<form action=\"CoordenadasDosPuntosBisServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"x\" del punto 1:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto 1:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"x\" del punto 2:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto2\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto 2:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto2\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
     * Este método, dados tres puntos definidos por sus coordenadas cartesianas (x,y), averigua si están alineados,
     * y devuelve un String con esa informacion.
     */    
    public static String alineacionDeTresPuntos(CoordenadasTresPuntos tresPuntos){
    	String devolucion;
    	try {
	    	double valorXpunto1 = Double.parseDouble(tresPuntos.getValorXpunto1());
	        double valorYpunto1 = Double.parseDouble(tresPuntos.getValorYpunto1());
	        double valorXpunto2 = Double.parseDouble(tresPuntos.getValorXpunto2());
	        double valorYpunto2 = Double.parseDouble(tresPuntos.getValorYpunto2());
	        double valorXpunto3 = Double.parseDouble(tresPuntos.getValorXpunto3());
	        double valorYpunto3 = Double.parseDouble(tresPuntos.getValorYpunto3());
	        if(valorXpunto1 == valorXpunto2 && valorYpunto1 == valorYpunto2) {devolucion = "Datos introducidos incorrectos; al menos los puntos 1 y 2 son coincidentes.";}
	        else if(valorXpunto2 == valorXpunto3 && valorYpunto2 == valorYpunto3) {devolucion = "Datos introducidos incorrectos; al menos los puntos 2 y 3 son coincidentes.";}
	        else if(valorXpunto1 == valorXpunto3 && valorYpunto1 == valorYpunto3) {devolucion = "Datos introducidos incorrectos; los puntos 1 y 3 son coincidentes.";}
	        else if(valorXpunto3 != valorXpunto1 && valorXpunto2 != valorXpunto1){
	        		if ((valorYpunto3-valorYpunto1)/(valorXpunto3-valorXpunto1) == (valorYpunto2-valorYpunto1)/(valorXpunto2-valorXpunto1)){
	                devolucion = "Los tres puntos están alineados";
	        		}else{
	        			devolucion = "Los tres puntos no están alineados";
	        		}
	        }else{
	            if (valorXpunto3 == valorXpunto2 && valorXpunto2 == valorXpunto1){
	            	
	                devolucion = "Los tres puntos está alineados";
	            }else {
	                devolucion = "Los tres puntos no están alineados";
	            }            
	        }
    	}catch (NumberFormatException exception) {
    		String casilleros = "										<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" de los tres puntos </h3>\r\n" + 
    				"										<h3>de los cuales se desea saber si están alineados</h3>\r\n" + 
    				"												<form action=\"CoordenadasTresPuntosServlet\" method=\"post\">\r\n" + 
    				"									  Valor de \"x\" del punto 1:<br>\r\n" + 
    				"											<input type=\"text\" name=\"valorXpunto1\" value=\"\">\r\n" + 
    				"											<br>\r\n" + 
    				"									  Valor de \"y\" del punto 1:<br>\r\n" + 
    				"									  		<input type=\"text\" name=\"valorYpunto1\" value=\"\">\r\n" + 
    				"											<br>\r\n" + 
    				"									  Valor de \"x\" del punto 2:<br>\r\n" + 
    				"											<input type=\"text\" name=\"valorXpunto2\" value=\"\">\r\n" + 
    				"											<br>\r\n" + 
    				"									  Valor de \"y\" del punto 2:<br>\r\n" + 
    				"									  		<input type=\"text\" name=\"valorYpunto2\" value=\"\">\r\n" + 
    				"											<br>\r\n" + 
    				"									  Valor de \"x\" del punto 3:<br>\r\n" + 
    				"											<input type=\"text\" name=\"valorXpunto3\" value=\"\">\r\n" + 
    				"											<br>\r\n" + 
    				"									  Valor de \"y\" del punto 3:<br>\r\n" + 
    				"									  		<input type=\"text\" name=\"valorYpunto3\" value=\"\">\r\n" + 
    				"											<br><br>\r\n" + 
    				"											<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"										</form>";
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
     * Este método, dados dos puntos definidos por sus coordenadas cartesianas (x,y), calcula la ecuación de la recta
     * que pasa por ambos puntos según su expresión genérica (y = ax + b), y devuelve un String con esa información.
     */    
    public static String calculaEcuacionRecta(CoordenadasDosPuntos dosPuntos) {
    	String devolucion;
    	double coeficienteA = 0;
    	double terminoIndependienteB = 0;
    	try {
	    	double valorXpunto1 = Double.parseDouble(dosPuntos.getValorXpunto1());
	        double valorYpunto1 = Double.parseDouble(dosPuntos.getValorYpunto1());
	        double valorXpunto2 = Double.parseDouble(dosPuntos.getValorXpunto2());
	        double valorYpunto2 = Double.parseDouble(dosPuntos.getValorYpunto2());
	        if(valorXpunto1 == valorXpunto2 && valorYpunto1 == valorYpunto2) {
	        	devolucion = "Los dos puntos introducidos coinciden y por tanto la cantidad de rectas que pueden pasar por él es infinita";
	        }else if(valorXpunto1 == valorXpunto2 && valorYpunto1 != valorYpunto2) {
	        	devolucion = "La recta es paralela al eje vertical cumpliéndose en todos sus puntos que x = "+valorXpunto1;
	        }else {
		        coeficienteA = (valorYpunto2-valorYpunto1)/(valorXpunto2-valorXpunto1);
		        terminoIndependienteB = -valorXpunto1*coeficienteA + valorYpunto1;
		        if(terminoIndependienteB > 0) {
		        	devolucion = "La ecuación de la recta que pasa por los puntos dados en su expresión genérica es: y = " +coeficienteA+"x + "+terminoIndependienteB;
		        }else if(terminoIndependienteB == 0) {
		        	devolucion = "La ecuación de la recta que pasa por los puntos dados en su expresión genérica es: y = " +coeficienteA+"x";
		        }else {
		        	devolucion = "La ecuación de la recta que pasa por los puntos dados en su expresión genérica es: y = " +coeficienteA+"x "+terminoIndependienteB;
		        }
	        }
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" de los dos puntos </h3>\r\n" + 
    				"						<h3>por donde pasa la recta que desea calcular</h3>\r\n" + 
    				"								<form action=\"CoordenadasDosPuntosRecServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"x\" del punto 1:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto 1:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"x\" del punto 2:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto2\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto 2:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto2\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
     * Este método, dadas las ecuaciones de dos rectas en su forma genérica (y = ax + b), calcula el punto de corte (intersección) de esas dos rectas
     * expresándolo por sus coordenadas cartesianas (x, y) y devuelve un String con esa información.
     */
    public static String puntoInterseccionDosRectas(EcuacionesDosRectas recta) {
    	String devolucion;
    	double valorXpuntoCorte = 0;
    	double valorYpuntoCorte = 0;
    	try {
	    	double coeficienteA1 = Double.parseDouble(recta.getCoeficienteA1());
	    	double terminoIndependienteB1 = Double.parseDouble(recta.getTerminoIndependienteB1());
	    	double coeficienteA2 = Double.parseDouble(recta.getCoeficienteA2());
	    	double terminoIndependienteB2 = Double.parseDouble(recta.getTerminoIndependienteB2());
	    	if(coeficienteA1 != coeficienteA2) {
		    	valorXpuntoCorte = (terminoIndependienteB2 - terminoIndependienteB1)/(coeficienteA1 - coeficienteA2);
		    	valorYpuntoCorte = coeficienteA1 * valorXpuntoCorte + terminoIndependienteB1;
		    	devolucion = "El punto de corte tiene las coordenadas ("+valorXpuntoCorte+", "+valorYpuntoCorte+")";
	    	}else if(terminoIndependienteB1 != terminoIndependienteB2){
	    		devolucion = "Las rectas introducidas son paralelas y por tanto no tienen punto de corte";
	    	}else {
	    		devolucion = "Las rectas introducidas son coincidentes y por tanto tienen infinitos puntos de intersección";
	    	}
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores \"a\" y \"b\" de las ecuaciones genéricas de las dos rectas </h3>\r\n" + 
    				"						<h3>que se cruzan en un punto que se desea calcular. La ecuación genérica de una recta tiene la expresión \"y = ax + b\"</h3>\r\n" + 
    				"						<h3>y el punto de corte (intersección) se expresará por sus coordenadas cartesianas (x, y). Si las dos rectas</h3>\r\n" + 
    				"						<h3>introducidas no tuvieran punto de corte por ser paralelas se devolvería esta información</h3>\r\n" + 
    				"								<form action=\"EcuacionesDosRectasPIServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"a\" de la recta 1:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 1:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"a\" de la recta 2:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta2\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 2:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta2\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
    
    /**Este método dada una ecuación de una recta en su forma genérica (y = ax + b), y dado un punto definido por sus coordenadas cartesianas (x,y),
     * calcula la ecuación de una recta paralela a la anterior y que pasa por el punto dado y devuelve un String con esa información.
     */
    public static String rectaParalela(CoordenadasUnPuntoEcuacionRecta rectaParalela) {
    	String devolucion = "ppqq";
    	double coeficienteAparalela = 0;
    	double terminoIndependienteBparalela = 0;
    	try {
	    	Double valorXpunto = Double.parseDouble(rectaParalela.getValorXpunto());
	        Double valorYpunto = Double.parseDouble(rectaParalela.getValorYpunto());        
	        Double coeficienteA = Double.parseDouble(rectaParalela.getCoeficienteA());
	    	Double terminoIndependienteB = Double.parseDouble(rectaParalela.getTerminoIndependienteB());
	    	coeficienteAparalela = coeficienteA;
	    	terminoIndependienteBparalela = valorYpunto - coeficienteA * valorXpunto;
	    	if(terminoIndependienteBparalela > 0 && terminoIndependienteB > 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x + "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	    			+ " la recta 'y = "+coeficienteAparalela+"x +"+terminoIndependienteBparalela+"'";
	    	}else if(terminoIndependienteBparalela > 0 && terminoIndependienteB == 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x +"+terminoIndependienteBparalela+"'";
	    	}else if(terminoIndependienteBparalela > 0 && terminoIndependienteB < 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x +"+terminoIndependienteBparalela+"'";
	    	}else if(terminoIndependienteBparalela == 0 && terminoIndependienteB > 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x +"+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x'";
	    	}else if(terminoIndependienteBparalela == 0 && terminoIndependienteB == 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x'";
	    	}else if(terminoIndependienteBparalela == 0 && terminoIndependienteB < 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x'";
	    	}else if(terminoIndependienteBparalela < 0 && terminoIndependienteB > 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x +"+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x "+terminoIndependienteBparalela+"'";
	    	}else if(terminoIndependienteBparalela < 0 && terminoIndependienteB == 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x "+terminoIndependienteBparalela+"'";
	    	}else if(terminoIndependienteBparalela < 0 && terminoIndependienteB < 0) {
	    		devolucion = "La recta paralela a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
	        			+ " la recta 'y = "+coeficienteAparalela+"x "+terminoIndependienteBparalela+"'";
	    	}
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" del punto </h3>\r\n" + 
    				"						<h3>que pasa por la recta a calcular, y los valores \"a\" y \"b\" de la ecuación de la recta, en su forma</h3>\r\n" + 
    				"						<h3>genérica (y = ax + b), que es paralela a la recta que se desea calcular</h3>\r\n" + 
    				"								<form action=\"CoordenadasUnPuntoEcuacionRectaPARServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"x\" del punto:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"a\" de la recta:<br>\r\n" + 
    				"							<input type=\"text\" name=\"coeficienteA\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"terminoIndependienteB\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
    
    /**Este método dada una ecuación de una recta en su forma genérica (y = ax + b), y dado un punto definido por sus coordenadas cartesianas (x,y),
     * calcula la ecuación de una recta perpendicular a la anterior y que pasa por el punto dado y devuelve un String con esa información.
     */
    public static String rectaPerpendicular(CoordenadasUnPuntoEcuacionRecta rectaPerpendicular) {
    	String devolucion = "ppqq";
    	double coeficienteAperpendicular = 0;
    	double terminoIndependienteBperdendicular = 0;
    	try {
	    	Double valorXpunto = Double.parseDouble(rectaPerpendicular.getValorXpunto());
	        Double valorYpunto = Double.parseDouble(rectaPerpendicular.getValorYpunto());        
	        Double coeficienteA = Double.parseDouble(rectaPerpendicular.getCoeficienteA());
	    	Double terminoIndependienteB = Double.parseDouble(rectaPerpendicular.getTerminoIndependienteB());
	    	
	    	if(coeficienteA == 0) {
	    		devolucion = "La recta es paralela al eje vertical cumpliéndose en todos sus puntos que x = "+valorXpunto;
	    	}else {
		    	coeficienteAperpendicular = -1/coeficienteA;
		    	terminoIndependienteBperdendicular = valorXpunto/coeficienteA + valorYpunto;
		    	if(terminoIndependienteBperdendicular > 0 && terminoIndependienteB > 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x + "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		    			+ " la recta 'y = "+coeficienteAperpendicular+"x +"+terminoIndependienteBperdendicular+"'";
		    	}else if(terminoIndependienteBperdendicular > 0 && terminoIndependienteB == 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x +"+terminoIndependienteBperdendicular+"'";
		    	}else if(terminoIndependienteBperdendicular > 0 && terminoIndependienteB < 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x +"+terminoIndependienteBperdendicular+"'";
		    	}else if(terminoIndependienteBperdendicular == 0 && terminoIndependienteB > 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x +"+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x'";
		    	}else if(terminoIndependienteBperdendicular == 0 && terminoIndependienteB == 0) {
		    		devolucion = "La recta perpendicular 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x'";
		    	}else if(terminoIndependienteBperdendicular == 0 && terminoIndependienteB < 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x'";
		    	}else if(terminoIndependienteBperdendicular < 0 && terminoIndependienteB > 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x +"+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x "+terminoIndependienteBperdendicular+"'";
		    	}else if(terminoIndependienteBperdendicular < 0 && terminoIndependienteB == 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x "+terminoIndependienteBperdendicular+"'";
		    	}else if(terminoIndependienteBperdendicular < 0 && terminoIndependienteB < 0) {
		    		devolucion = "La recta perpendicular a 'y = "+coeficienteA+"x "+terminoIndependienteB+"' y que pasa por el punto ("+valorXpunto+", "+valorYpunto+") es"
		        			+ " la recta 'y = "+coeficienteAperpendicular+"x "+terminoIndependienteBperdendicular+"'";
		    	}
	    	}
    	}catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" del punto </h3>\r\n" + 
    				"						<h3>que pasa por la recta a calcular, y los valores \"a\" y \"b\" de la ecuación de la recta, en su forma</h3>\r\n" + 
    				"						<h3>genérica (y = ax + b), que es perpendicular a la recta que se desea calcular</h3>\r\n" + 
    				"								<form action=\"CoordenadasUnPuntoEcuacionRectaBisServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"x\" del punto:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorXpunto\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"y\" del punto:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorYpunto\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"a\" de la recta:<br>\r\n" + 
    				"							<input type=\"text\" name=\"coeficienteA\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"terminoIndependienteB\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
    
    /**Este método dada una ecuación de una recta en su forma genérica (y = ax + b), y dado un punto definido por sus coordenadas cartesianas (x,y),
     * calcula la distancia entre ambos y devuelve un String con esa información.
     */    
    public static String distanciaPuntoRecta(CoordenadasUnPuntoEcuacionRecta distancia) {
    	String devolucion = "ppqq";
    	double resultado = 0;
    	double variableAux1 = 0;
    	double variableAux2 = 0;
    	try {
        	double valorXpunto = Double.parseDouble(distancia.getValorXpunto());
            double valorYpunto = Double.parseDouble(distancia.getValorYpunto());
            double coeficienteA = Double.parseDouble(distancia.getCoeficienteA());
            double terminoIndependienteB = Double.parseDouble(distancia.getTerminoIndependienteB());
            variableAux1 = Math.abs(valorYpunto - coeficienteA*valorXpunto - terminoIndependienteB);
            variableAux2 = Math.sqrt(Math.pow(coeficienteA, 2) + 1);
            resultado = variableAux1/variableAux2;
            devolucion = "La distancia entre el punto y la recta dados es de " + resultado + " unidades";
		} catch (NumberFormatException exception) {
			String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores de las coordenadas \"x\" e \"y\" del punto, </h3>\r\n" + 
					"						<h3>y los valores \"a\" y \"b\" de la ecuación de la recta, en su forma</h3>\r\n" + 
					"						<h3>genérica (y = ax + b), de los cuales se desea calcular la distancia</h3>\r\n" + 
					"								<form action=\"CoordenadasUnPuntoEcuacionRectaServlet\" method=\"post\">\r\n" + 
					"					  Valor de \"x\" del punto:<br>\r\n" + 
					"							<input type=\"text\" name=\"valorXpunto\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"y\" del punto:<br>\r\n" + 
					"					  		<input type=\"text\" name=\"valorYpunto\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"a\" de la recta:<br>\r\n" + 
					"							<input type=\"text\" name=\"coeficienteA\" value=\"\">\r\n" + 
					"							<br>\r\n" + 
					"					  Valor de \"b\" de la recta:<br>\r\n" + 
					"					  		<input type=\"text\" name=\"terminoIndependienteB\" value=\"\">\r\n" + 
					"							<br><br>\r\n" + 
					"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"						</form>";
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
    
    /**Este método dadas dos ecuaciones de dos rectas paralelas en su forma genérica (y = ax + b) calcula la distancia entre ellas
     * calcula la distancia entre ambos y devuelve un String con esa información.
     */    
    public static String distanciaRectasParalelas(EcuacionesDosRectas distancia) {
    	String devolucion = "ppqq";
    	double resultado = 0;
    	double auxX = 1;
    	double auxY = 0;
    	double variableAux1 = 0;
    	double variableAux2 = 0;
    	try {
	    	double coeficienteArecta1 = Double.parseDouble(distancia.getCoeficienteA1());
	    	double termIndepBrecta1 = Double.parseDouble(distancia.getTerminoIndependienteB1());
	    	double coeficienteArecta2 = Double.parseDouble(distancia.getCoeficienteA2());
	    	double termIndepBrecta2 = Double.parseDouble(distancia.getTerminoIndependienteB2());
	    	if(coeficienteArecta1 == coeficienteArecta2 && termIndepBrecta1 != termIndepBrecta2) {
		    	auxY = coeficienteArecta1 + termIndepBrecta1;
		    	variableAux1 = Math.abs(auxY - coeficienteArecta2*auxX - termIndepBrecta2);
		        variableAux2 = Math.sqrt(Math.pow(coeficienteArecta2, 2) + 1);
		        resultado = variableAux1/variableAux2;
		    	devolucion = "La distancia entre las dos rectas dadas es de " + resultado + " unidades";
	    	}else {
	    		devolucion = "Las rectas dadas son secantes, o bien coincidentes, y por tanto se considera que la distancia entre ellas es 0";
	    	}
    	} catch (NumberFormatException exception) {
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores \"a\" y \"b\" de las ecuaciones genéricas de las dos</h3>\r\n" + 
    				"						<h3>rectas de las cuales se desea calcular la distancia. La ecuación genérica de una recta tiene la</h3>\r\n" + 
    				"						<h3>expresión \"y = ax + b\"</h3>\r\n" + 
    				"								<form action=\"EcuacionesDosRectasServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"a\" de la recta 1:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 1:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"a\" de la recta 2:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta2\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 2:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta2\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>";
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
    
    /**Este método dadas dos ecuaciones de dos rectas en su forma genérica (y = ax + b) calcula las bisectrices,
     * también en su forma genérica, determinadas por estas rectas y devuelve un String con esa información. Si
     * las rectas dadas fueran paralelas el método devolvería un String dando la información de que no existen
     * bisectrices para tales rectas.
     */
    public static String bisectrices(EcuacionesDosRectas ecuaciones2Rectas) {
    	String devolucion = "ppqq";
    	String devolucion1 = "ppqq";
    	String devolucion2 = "ppqq";
    	double aux1 = 0;
    	double aux2 = 0;
    	double aux3 = 0;
    	double aux4 = 0;
    	double aux5 = 0;  	
    	double coeficienteAbisectriz1 = 0;
    	double termIndepBbisectriz1 = 0;
    	double coeficienteAbisectriz2 = 0;
    	double termIndepBbisectriz2 = 0;
    	try {
	    	double coeficienteArecta1 = Double.parseDouble(ecuaciones2Rectas.getCoeficienteA1());
	    	double termIndepBrecta1 = Double.parseDouble(ecuaciones2Rectas.getTerminoIndependienteB1());
	    	double coeficienteArecta2 = Double.parseDouble(ecuaciones2Rectas.getCoeficienteA2());
	    	double termIndepBrecta2 = Double.parseDouble(ecuaciones2Rectas.getTerminoIndependienteB2());
	    	aux1 = coeficienteArecta2*Math.sqrt(Math.pow(coeficienteArecta1, 2)+1);
	    	aux2 = coeficienteArecta1*Math.sqrt(Math.pow(coeficienteArecta2, 2)+1);
	    	aux3 = Math.sqrt(Math.pow(coeficienteArecta1, 2)+1);
	    	aux4 = Math.sqrt(Math.pow(coeficienteArecta2, 2)+1);
	    	coeficienteAbisectriz1 = (aux1 - aux2)/(aux3 - aux4);
	    	termIndepBbisectriz1 = (termIndepBrecta2*aux3 - termIndepBrecta1*aux4)/(aux3 - aux4);
	    	coeficienteAbisectriz2 = (aux1 + aux2)/(aux3 + aux4);
	    	termIndepBbisectriz2 = (termIndepBrecta2*aux3 + termIndepBrecta1*aux4)/(aux3 + aux4);    	
	    	if(coeficienteArecta1 == coeficienteArecta2) {
	    		devolucion = "Las rectas introducidas son paralelas y por tanto no tienen bisectrices";
	    	}else {
	    		if(aux3 - aux4 != 0) {
			    	if(termIndepBbisectriz1 > 0) {
			    		devolucion1 = "La bisectriz 1 es 'y = "+coeficienteAbisectriz1+"x + "+ termIndepBbisectriz1+ "'  ";
			    	}else if(termIndepBbisectriz1 == 0) {
			    		devolucion1 = "La bisectriz 1 es 'y = "+coeficienteAbisectriz1+"x' ";
			    	}else {
			    		devolucion1 = "La bisectriz 1 es 'y = "+coeficienteAbisectriz1+"x  "+ termIndepBbisectriz1+ "'  ";
			    	}
	    		}else {
	    			aux5 = (termIndepBrecta2*aux3 - termIndepBrecta1*aux4)/(aux2 - aux1);
	    			devolucion1 = "La bisectriz 1 es paralela el eje vertical y en todos sus puntos se cumple que x = "+aux5 ;
	    		}
	    		
			    	if(termIndepBbisectriz2 > 0) {
			    		devolucion2 = "la bisectriz 2 es 'y = "+coeficienteAbisectriz2+"x + "+ termIndepBbisectriz2+ "'  ";
			    	}else if(termIndepBbisectriz2 == 0) {
			    		devolucion2 = "la bisectriz 2 es 'y = "+coeficienteAbisectriz2+"x' ";
			    	}else {
			    		devolucion2 = "la bisectriz 2 es 'y = "+coeficienteAbisectriz2+"x  "+ termIndepBbisectriz2+ "' ";
			    	}	    	
		    	
		    	devolucion = devolucion1 +" y "+ devolucion2;
	    	}
    	}catch(NumberFormatException exception){
    		String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores \"a\" y \"b\" de las ecuaciones genéricas de las dos</h3>\r\n" + 
    				"						<h3>rectas de las cuales se desea calcular las bisectrices. La ecuación genérica de una recta tiene la</h3>\r\n" + 
    				"						<h3>expresión \"y = ax + b\"</h3>\r\n" + 
    				"								<form action=\"EcuacionesDosRectasBisServlet\" method=\"post\">\r\n" + 
    				"					  Valor de \"a\" de la recta 1:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 1:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta1\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"a\" de la recta 2:<br>\r\n" + 
    				"							<input type=\"text\" name=\"valorArecta2\" value=\"\">\r\n" + 
    				"							<br>\r\n" + 
    				"					  Valor de \"b\" de la recta 2:<br>\r\n" + 
    				"					  		<input type=\"text\" name=\"valorBrecta2\" value=\"\">\r\n" + 
    				"							<br><br>\r\n" + 
    				"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
    				"						</form>\r\n" + 
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
     * Este método devuelve mediante un String el vértice y el(los) punto(s) de corte de la función cuadrática introducida
     * con el eje horizontal (eje x). Si la función introducida no tuviera punto de corte alguno con el eje x, el String
     * de devolución devolvería esta información.
     * @param parabola
     * @return
     */
    
    public static String calculaVerticePuntosDeCorteConEjeXdeFuncionCuadratica(FuncionCuadratica parabola) {
        double discriminante = 0;
        double xv = 0;
        double yv = 0;
        double xcorte1 = 0;
        double xcorte2 = 0;
        String devolucion ="ppqq";
        try {
	        double coeficienteA = Double.parseDouble(parabola.getCoeficienteA());
	    	double coeficienteB = Double.parseDouble(parabola.getCoeficienteB());
	    	double terminoIndependienteC = Double.parseDouble(parabola.getTerminoIndependienteC());
	        if(coeficienteA == 0) {
	        	if(coeficienteB != 0) {
	        		xcorte1 = -terminoIndependienteC/coeficienteB;
	        		devolucion = "Si el valor de 'a' de la función cuadrátiaca es cero, entonces la parábola es completamente plana, convirtiéndose en una recta, por tanto no tendría vértice y un solo punto de corte con el eje x que sería ("+xcorte1+",0)";
	        	}else {
	        		if(terminoIndependienteC != 0) {
	        			devolucion = "Si los valores de 'a' y de 'b' de la función cuadrátiaca son cero, no así el valor de 'c', entonces la parábola es completamente plana, convirtiéndose en una recta que además es paralela al eje x, y no tendría puntos de corte con el eje x";
	        		}else {
	        			devolucion = "Si los valores de 'a', de 'b' y de 'c' de la función cuadrátiaca son cero, entonces la parábola es completamente plana, convirtiéndose en una recta que además es coincidente con el eje x, por tanto sus puntos de intersección con el eje x serían infinitos";
	        		}
	        	}
	        } else {
		    	discriminante = Math.pow(coeficienteB,2)-4*coeficienteA*terminoIndependienteC;
		        xv = -(coeficienteB/(2*coeficienteA));
		        yv = coeficienteA*Math.pow(xv,2) + coeficienteB*xv + terminoIndependienteC;
		        if (discriminante < 0){
		            devolucion = "La función tiene de vértice al punto ("+xv+","+yv+") y no tiene puntos de corte con el eje x.";
		        }
		        if (discriminante == 0){
		            devolucion = "La función tiene de vértice al punto ("+xv+","+yv+") que es el único punto de corte de la función con el eje x.";	            
		        }
		        if (discriminante > 0){
		            xcorte1 = (-coeficienteB - Math.sqrt(discriminante))/(2*coeficienteA);
		            xcorte2 = (-coeficienteB + Math.sqrt(discriminante))/(2*coeficienteA);
		            devolucion = "La función tiene de vértice al punto ("+xv+","+yv+") y tiene como puntos de corte con el eje x a los puntos ("+xcorte1+",0) y ("+xcorte2+",0)";	            
		        }
	        }
        }catch(NumberFormatException exception) {
        	String casilleros = "						<h3>Introduzca en los siguientes casilleros los valores \"a\", \"b\" y \"c\" de la función cuadrática dada su</h3>\r\n" + 
        			"						<h3>expresión genérica (y = ax<sup>2</sup>+ bx + c)</h3>\r\n" + 
        			"								<form action=\"FuncionCuadraticaServlet\" method=\"post\">\r\n" + 
        			"					  Valor de \"a\" de la función cuadrática:<br>\r\n" + 
        			"							<input type=\"text\" name=\"coeficienteA\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  Valor de \"b\" de la función cuadrática:<br>\r\n" + 
        			"					  		<input type=\"text\" name=\"coeficienteB\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  Valor de \"c\" de la función cuadrática:<br>\r\n" + 
        			"							<input type=\"text\" name=\"terminoIndependienteC\" value=\"\">\r\n" + 
        			"							<br><br>\r\n" + 
        			"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"						</form>";
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
    
   public static String calculaFuncionCuadraticaFocoDirectriz(FocoDirectriz focoDirectriz) {
	   String devolucion = "ppqq";
	   double coeficienteAparabola = 0;
	   double coeficienteBparabola = 0;
	   double terminoIndependienteParabola = 0;
	   double aux1 = 0;
	   double aux2 = 0;
	   try {
		   double valorXfoco = Double.parseDouble(focoDirectriz.getValorXfoco());
	       double valorYfoco = Double.parseDouble(focoDirectriz.getValorYfoco());
	       double terminoIndependienteDirectriz = Double.parseDouble(focoDirectriz.getTerminoIndependienteDirectriz());
	       if(valorYfoco != terminoIndependienteDirectriz) {
		       coeficienteAparabola = 1/(2*valorYfoco-2*terminoIndependienteDirectriz);
		       coeficienteBparabola = -valorXfoco/(valorYfoco-terminoIndependienteDirectriz);
		       aux1 = Math.pow(valorXfoco, 2)+Math.pow(valorYfoco, 2)-Math.pow(terminoIndependienteDirectriz, 2);
		       aux2 = 2*valorYfoco - 2*terminoIndependienteDirectriz;
		       terminoIndependienteParabola = aux1/aux2;
		       devolucion = "La función cuadrática pedida es "+coeficienteAparabola+"x<sup>2</sup> + "+coeficienteBparabola+"x + "+terminoIndependienteParabola;
		       if(coeficienteBparabola < 0 && terminoIndependienteParabola > 0) {
		    	   devolucion = "La función cuadrática pedida es "+coeficienteAparabola+"x<sup>2</sup> "+coeficienteBparabola+"x + "+terminoIndependienteParabola;   
		       }
		       if(coeficienteBparabola > 0 && terminoIndependienteParabola < 0) {
		    	   devolucion = "La función cuadrática pedida es "+coeficienteAparabola+"x<sup>2</sup> + "+coeficienteBparabola+"x "+terminoIndependienteParabola;
		       }
		       if(coeficienteBparabola < 0 && terminoIndependienteParabola < 0) {
		    	   devolucion = "La función cuadrática pedida es "+coeficienteAparabola+"x<sup>2</sup> "+coeficienteBparabola+"x "+terminoIndependienteParabola;
		       }
	       }else {
	    	   devolucion = "No es posible hallar la ecuación de una parábola de disposición vertical si el valor 'y' del foco es igual al término independiente de la directriz";
	       }
	   }catch(NumberFormatException exception) {
		   String casilleros = "			        <h3>Introduzca en los siguientes casilleros los valores \"x\" e \"y\" del foco y el valor \"b\" la directriz </h3>\r\n" + 
		   		"			        <h3>que ha de ser de tipo \"y = b\"</h3>\r\n" + 
		   		"					<form action=\"FocoDirectrizServlet\" method=\"post\">\r\n" + 
		   		"		  			  Valor de \"x\" del foco:<br>\r\n" + 
		   		"							<input type=\"text\" name=\"valorXfoco\" value=\"\">\r\n" + 
		   		"							<br>\r\n" + 
		   		"					  Valor de \"y\" del foco:<br>\r\n" + 
		   		"					  		<input type=\"text\" name=\"valorYfoco\" value=\"\">\r\n" + 
		   		"							<br>\r\n" + 
		   		"					  Valor de \"b\" de la directriz:<br>\r\n" + 
		   		"					  		<input type=\"text\" name=\"terminoIndependienteDirectriz\" value=\"\">\r\n" + 
		   		"					        <br><br>\r\n" + 
		   		"					        <input type=\"submit\" value=\"Enviar\">\r\n" + 
		   		"					  </form>";
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

}
