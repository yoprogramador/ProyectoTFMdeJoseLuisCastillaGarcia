package operacionesTrigonometria;

public class OperacionesTrigonometria {

	public static String devuelveAnguloYdosCatetos(String anguloAgudoStr, String hipotenusaStr) {
		String devolucion = "ppqq";
		double anguloCalculado = 0;
		double catetoContiguo = 0;
		double catetoOpuesto = 0;
		try {
			double anguloAgudo = Double.parseDouble(anguloAgudoStr);
			double hipotenusa = Double.parseDouble(hipotenusaStr);
			if(anguloAgudo >= 90 || anguloAgudo < 0 || hipotenusa < 0) {
				devolucion = "Dato(s) introducido(s) incorrecto(s); un �ngulo agudo no puede ser mayor o igual a 90 grados o la longitud de la hipotenusa o la medida de un �ngulo no tiene sentido que sea negativa.";
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

			anguloCalculado = calculaAngulo(anguloAgudo);
			catetoContiguo = calculaCatetoContiguo(anguloAgudo, hipotenusa);
			catetoOpuesto = calculaCatetoOpuesto(anguloAgudo, hipotenusa);
			devolucion = "Para los datos introducidos el otro �ngulo agudo tiene el valor de "+anguloCalculado+" grados, el cateto contiguo el valor de "+catetoContiguo+" y el cateto opuesto el valor de "+catetoOpuesto;
		}catch (NumberFormatException exception) {
        	String casilleros = "					<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y lo que mide el �ngulo agudo</h3>\r\n" + 
        			"					<h3>conocido, este �ltimo valor expresado �nicamente en grados. Los datos introducidos han de ser </h3>\r\n" + 
        			"					<h3>exclusivamente num�ricos.</h3>				\r\n" + 
        			"					<form action=\"AnguloCatetosServlet\" method=\"post\">\r\n" + 
        			"					  Longitud de la hipotenusa:<br>\r\n" + 
        			"							<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  �ngulo agudo conocido (en grados):<br>\r\n" + 
        			"							<input type=\"text\" name=\"anguloConocido\" value=\"\">\r\n" + 
        			"							<br><br>					\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"					</form>\r\n" + 
        			"";
			return "Los datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;

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
	
	private static double calculaAngulo(double anguloAgudo) {
			double anguloCalculado = 0;
			anguloCalculado = 90 - anguloAgudo;
			return anguloCalculado;
	}
	
	private static double calculaCatetoContiguo(double anguloAgudo, double hipotenusa) {
			double catetoContiguo = 0;
			double anguloRadianes = 0;
			anguloRadianes = Math.toRadians(anguloAgudo);
			catetoContiguo = hipotenusa * Math.cos(anguloRadianes);
			return catetoContiguo;
	}
	
	private static double calculaCatetoOpuesto(double anguloAgudo, double hipotenusa) {
		double catetoOpuesto = 0;
		double anguloRadianes = 0;
		anguloRadianes = Math.toRadians(anguloAgudo);
		catetoOpuesto = hipotenusa * Math.sin(anguloRadianes);
		return catetoOpuesto;
	}
	
	public static String devuelveAnguloCatetoConHipotenusa(String anguloAgudoStr, String catetoOpuestoStr) {
		String devolucion = "ppqq";
		double anguloCalculado = 0;
		double catetoContiguo = 0;
		double hipotenusa = 0;
		try {
			double anguloAgudo = Double.parseDouble(anguloAgudoStr);
			double catetoOpuesto = Double.parseDouble(catetoOpuestoStr);
			if(anguloAgudo >= 90 || anguloAgudo <= 0) {
				devolucion = "Dato introducido incorrecto; un �ngulo agudo no puede ser mayor o igual a 90 grados o no tiene sentido que su valor sea negativo o cero en este problema.";
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
			if(catetoOpuesto < 0) {
				devolucion = "Dato introducido incorrecto; no tiene sentido que la longitud de un cateto sea un valor negativo.";
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

			anguloCalculado = calculaAngulo(anguloAgudo);
			catetoContiguo = calculaCatetoContig(anguloAgudo, catetoOpuesto);
			hipotenusa = calculaHipotenusa(anguloAgudo, catetoOpuesto);
			devolucion = "Para los datos introducidos el otro �ngulo tiene el valor de "+anguloCalculado+" grados, el cateto contiguo el valor de "+catetoContiguo+" y la hipotenusa el valor de "+hipotenusa;
		}catch (NumberFormatException exception) {
        	String casilleros = "					<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo agudo conocido (este valor expresado</h3>\r\n" + 
        			"					<h3>�nicamente en grados) y la longitud del cateto opuesto a dicho �ngulo. Los datos introducidos han de ser</h3>\r\n" + 
        			"					<h3>exclusivamente num�ricos.</h3>				\r\n" + 
        			"					<form action=\"AnguloCatetoContHiptenServlet\" method=\"post\">\r\n" + 
        			"					  �ngulo agudo conocido (en grados):<br>\r\n" + 
        			"							<input type=\"text\" name=\"anguloConocido\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  Longitud del cateto opuesto:<br>\r\n" + 
        			"							<input type=\"text\" name=\"catetoOpuesto\" value=\"\">\r\n" + 
        			"							<br><br>					\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"					</form>\r\n" + 
        			"";
			return "Los datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
			
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

	private static double calculaHipotenusa(double anguloAgudo, double catetoOpuesto) {
		double hipotenusa = 0;
		double anguloRadianes = 0;
		anguloRadianes = Math.toRadians(anguloAgudo);
		hipotenusa = catetoOpuesto/Math.sin(anguloRadianes);
		return hipotenusa;
	}
	
	private static double calculaCatetoContig(double anguloAgudo, double catetoOpuesto) {
		double catetoContiguo = 0;
		double anguloRadianes = 0;
		anguloRadianes = Math.toRadians(anguloAgudo);
		catetoContiguo = catetoOpuesto/Math.tan(anguloRadianes);
		return catetoContiguo;
	}
	
	public static String devuelveAnguloCatetoOpHipotenusa(String anguloAgudoStr, String catetoContiguoStr) {
		String devolucion = "ppqq";
		double anguloCalculado = 0;
		double catetoOpuesto = 0;
		double hipotenusa = 0;
		try {	
			double anguloAgudo = Double.parseDouble(anguloAgudoStr);
			double catetoContiguo = Double.parseDouble(catetoContiguoStr);		
			if(anguloAgudo >= 90 || anguloAgudo < 0 || catetoContiguo < 0) {
				devolucion = "Dato(s) introducido(s) incorrecto(s); un �ngulo agudo no puede ser mayor o igual a 90 grados o la longitud del cateto o la medida de un �ngulo no tiene sentido que sea negativa.";
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
			
			anguloCalculado = calculaAngulo(anguloAgudo);
			catetoOpuesto = calculaCatetoOp(anguloAgudo, catetoContiguo);
			hipotenusa = calculaHipoten(anguloAgudo, catetoContiguo);
			devolucion= "Para los datos introducidos el otro �ngulo tiene el valor de "+anguloCalculado+" grados, el cateto opuesto el valor de "+catetoOpuesto+" y la hipotenusa el valor de "+hipotenusa;
		}catch (NumberFormatException exception) {
        	String casilleros = "					<h3>Introduzca en los siguientes casilleros lo que mide el �ngulo agudo conocido (este valor expresado</h3>\r\n" + 
        			"					<h3>�nicamente en grados) y la longitud del cateto contiguo a dicho �ngulo. Los datos introducidos han de ser</h3>\r\n" + 
        			"					<h3>exclusivamente num�ricos.</h3>\r\n" + 
        			"					<form action=\"AnguloCatetoOpuestoHipotenServlet\" method=\"post\">\r\n" + 
        			"					  �ngulo agudo conocido (en grados):<br>\r\n" + 
        			"							<input type=\"text\" name=\"anguloConocido\" value=\"\">\r\n" + 
        			"							<br>\r\n" + 
        			"					  Longitud del cateto contiguo:<br>\r\n" + 
        			"							<input type=\"text\" name=\"catetoContiguo\" value=\"\">\r\n" + 
        			"							<br><br>					\r\n" + 
        			"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
        			"					</form>\r\n" + 
        			"";
			return "Los datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;

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
	
	private static double calculaHipoten(double anguloAgudo, double catetoContiguo) {
		double hipotenusa = 0;
		double anguloRadianes = 0;
		anguloRadianes = Math.toRadians(anguloAgudo);
		hipotenusa = catetoContiguo/Math.cos(anguloRadianes);
		return hipotenusa;
	}
	
	private static double calculaCatetoOp(double anguloAgudo, double catetoContiguo) {
		double catetoOpuesto = 0;
		double anguloRadianes = 0;
		anguloRadianes = Math.toRadians(anguloAgudo);
		catetoOpuesto = catetoContiguo*Math.tan(anguloRadianes);
		return catetoOpuesto;
	}
	
	 public static String devuelveAngulosCateto(String hipotenusaStr, String catetoStr) {
		 String devolucion = "ppqq";
		 double catetoCalculado = 0;
		 double anguloAgudoUno = 0;
		 double anguloAgudoDos = 0;
		 try {
			 double hipotenusa = Double.parseDouble(hipotenusaStr);
			 double cateto = Double.parseDouble(catetoStr);
			 if(hipotenusa < 0 || cateto < 0 || cateto >= hipotenusa) {
				 devolucion = "Dato(s) introducido(s) incorrecto(s); la longitud de la hipotenusa o de un cateto no tiene sentido que sea negativa o la longitud del cateto no puede ser mayor o igual que la de la hipotenusa.";
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
			 
			 catetoCalculado = calculaCateto(hipotenusa, cateto);
			 anguloAgudoUno = calculaAnguloConHipotYcat(hipotenusa, cateto);
			 anguloAgudoDos = calculaAnguloConHipotYcat(hipotenusa, catetoCalculado);
			 devolucion ="Para los datos introducidos el otro cateto tiene el valor de "+catetoCalculado+" un �ngulo agudo el valor de "+anguloAgudoUno+" grados y el otro �ngulo agudo el valor de "+anguloAgudoDos+" grados";
		 }catch (NumberFormatException exception) {
	         String casilleros = "					<h3>Introduzca en los siguientes casilleros la longitud de la hipotenusa y del cateto conocido.</h3>\r\n" + 
	         		"					<h3>Los datos introducidos han de ser exclusivamente num�ricos.</h3>\r\n" + 
	         		"					<form action=\"CatetoAngulosServlet\" method=\"post\">\r\n" + 
	         		"					  Longitud de la hipotenusa:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
	         		"							<br>\r\n" + 
	         		"					  Longitud del cateto conocido:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"catetoConocido\" value=\"\">\r\n" + 
	         		"							<br><br>					\r\n" + 
	         		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"					</form>\r\n" + 
	         		"";
			 return "Los datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
			 
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
	 
	 private static double calculaCateto(double hipotenusa, double cateto) {
		 double catetoCalculado = 0;
		 catetoCalculado = Math.sqrt(Math.pow(hipotenusa, 2)-Math.pow(cateto, 2));
		 return catetoCalculado;
	 }
	 
	 private static double calculaAnguloConHipotYcat(double hipotenusa, double cateto) {
		 double anguloCalculado = 0;
		 double cosenoAnguloCalculado = cateto/hipotenusa;
		 anguloCalculado = Math.acos(cosenoAnguloCalculado);
		 anguloCalculado = Math.toDegrees(anguloCalculado);
		 return anguloCalculado;
	 }
	
	 public static String devuelveDosAngulosHipotenusa(String catetoUnoStr, String catetoDosStr) {
		 String devolucion = "ppqq";
		 double hipotenusa = 0;
		 double anguloAgudoUno = 0;
		 double anguloAgudoDos = 0;
		 try {
			 double catetoUno = Double.parseDouble(catetoUnoStr);
		     double catetoDos = Double.parseDouble(catetoDosStr);
			 if(catetoUno < 0 || catetoDos < 0) {
				 devolucion = "Dato(s) introducido(s) incorrecto(s); la longitud de un cateto no tiene sentido que sea negativa.";
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
			 if(catetoUno == 0 && catetoDos == 0) {
				 devolucion = "Datos introducidos incorrectos; en este problema no tiene sentido que la longitud de los dos catetos sea cero.";
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

			 hipotenusa = calculaHipotenus(catetoUno, catetoDos);
			 anguloAgudoUno = calculaAnguloAgudo(catetoUno, catetoDos);
			 anguloAgudoDos = calculaAnguloAgudo(catetoDos, catetoUno);
			 devolucion = "Para los datos introducidos la hipotenusa tiene el valor de "+hipotenusa+", un �ngulo agudo el valor de "+anguloAgudoUno+" grados y el otro el valor de "+anguloAgudoDos+" grados";
		 }catch (NumberFormatException exception) {
	         String casilleros = "					<h3>Introduzca en los siguientes casilleros la longitud de los dos catetos.</h3>\r\n" + 
	         		"					<form action=\"AngulosHipotenusaServlet\" method=\"post\">\r\n" + 
	         		"					  Longitud del cateto conocido:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"catetoConocido1\" value=\"\">\r\n" + 
	         		"							<br>\r\n" + 
	         		"					  Longitud del otro cateto conocido:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"catetoConocido2\" value=\"\">\r\n" + 
	         		"							<br><br>					\r\n" + 
	         		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"					</form>		\r\n" + 
	         		"";
				 return "Los datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;
			
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
	 
	 private static double calculaHipotenus(double catetoUno, double catetoDos) {
		 double hipotenusa = 0;
		 hipotenusa = Math.sqrt(Math.pow(catetoUno, 2)+Math.pow(catetoDos, 2));
		 return hipotenusa;
	 }
	 private static double calculaAnguloAgudo(double catetoUno, double catetoDos) {
		 double anguloAgudo = 0;
		 anguloAgudo = Math.atan(catetoUno/catetoDos);
		 anguloAgudo = Math.toDegrees(anguloAgudo);
		 return anguloAgudo;
	 }
	
	 public static String calculaSeno(String angulo) {
		 String devolucion = "ppqq";
		 double resultado = 0;
		 try {
			 double anguloNum = Double.parseDouble(angulo);
			 double anguloRad = Math.toRadians(anguloNum);		 
			 resultado = Math.sin(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>\r\n" + 
	         		"						<h3>calcular su seno.</h3>\r\n" + 
	         		"								<form action=\"SenoServlet\" method=\"post\">\r\n" + 
	         		"					  �ngulo:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;
		
		}
		 devolucion = "El seno del �ngulo introducido es "+resultado;
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
	 
	 public static String calculaCoseno(String angulo) {
		 String devolucion = "ppqq";
		 double resultado = 0;
		 try {
			 double anguloNum = Double.parseDouble(angulo);
			 double anguloRad = Math.toRadians(anguloNum);
			 resultado = Math.cos(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>\r\n" + 
	         		"						<h3>calcular su coseno.</h3>\r\n" + 
	         		"								<form action=\"CosenoServlet\" method=\"post\">\r\n" + 
	         		"					  �ngulo:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
				 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;
			
		}
		 devolucion = "El coseno del �ngulo introducido es "+resultado;
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
	 public static String calculaTangente(String angulo) {
		 String devolucion = "ppqq";
		 double resultado = 0;
		 try {
			 double anguloNum = Double.parseDouble(angulo);
			 double anguloRad = Math.toRadians(anguloNum);
			 resultado = Math.tan(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero lo que mide al �ngulo (en grados) del cual se quiere</h3>\r\n" + 
	         		"						<h3>calcular su tangente.</h3>						\r\n" + 
	         		"								<form action=\"TangenteServlet\" method=\"post\">\r\n" + 
	         		"					  �ngulo:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"angulo\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;
			
		}
		 devolucion = "La tangente del �ngulo introducido es "+resultado;
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
	 public static String calculaArcoSeno(String seno) {
		 String devolucion = "ppqq";
		 double anguloResultanteGrados = 0;
		 try {
			 double senoNum = Double.parseDouble(seno);
			 if(senoNum < -1 || senoNum > 1) {
				 devolucion = "El dato introducido es incorrecto. El valor del seno no puede ser un n�mero menor de -1 o mayor de 1.";
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
			 double anguloRad = Math.asin(senoNum);
			 anguloResultanteGrados = Math.toDegrees(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor del seno del cual se quiere calcular el</h3>\r\n" + 
	         		"						<h3>�ngulo que le corresponde (en grados).</h3>\r\n" + 
	         		"								<form action=\"ArcoSenoServlet\" method=\"post\">\r\n" + 
	         		"					  Seno:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"seno\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;

		}
		 devolucion = "Los grados resultantes seg�n el valor del seno introducido son "+anguloResultanteGrados;
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
	 
	 public static String calculaArcoCoseno(String coseno) {
		 String devolucion = "ppqq";
		 double anguloResultanteGrados = 0;
		 try {
			 double cosenoNum = Double.parseDouble(coseno);
			 if(cosenoNum < -1 || cosenoNum > 1) {
				 devolucion = "El dato introducido es incorrecto. El valor del coseno no puede ser un n�mero menor de -1 o mayor de 1.";
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
			 double anguloRad = Math.acos(cosenoNum);
			 anguloResultanteGrados = Math.toDegrees(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor del coseno del cual se quiere calcular el</h3>\r\n" + 
	         		"						<h3>�ngulo que le corresponde (en grados).</h3>						\r\n" + 
	         		"								<form action=\"ArcoCosenoServlet\" method=\"post\">\r\n" + 
	         		"					  Coseno:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"coseno\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;

		}
		 devolucion = "Los grados resultantes seg�n el valor del coseno introducido son "+anguloResultanteGrados;
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
	 
	 public static String calculaArcoTangente(String tangente) {
		 String devolucion = "ppqq";
		 double anguloResultanteGrados = 0;
		 try {
			 double tangNum = Double.parseDouble(tangente);
			 double anguloRad = Math.atan(tangNum);
			 anguloResultanteGrados = Math.toDegrees(anguloRad);			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor de la tangente del cual se quiere calcular el</h3>\r\n" + 
	         		"						<h3>�ngulo que le corresponde (en grados).</h3>	\r\n" + 
	         		"								<form action=\"ArcoTangenteServlet\" method=\"post\">\r\n" + 
	         		"					  Tangente:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"tangente\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
				 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;
			
		}
		 devolucion = "Los grados resultantes seg�n el valor de la tangente introducida son "+anguloResultanteGrados;
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

	 public static String calculaCosenoTangente(String seno) {
		 String devolucion = "ppqq";
		 double coseno = 0;
		 double tangente = 0;
		 try {
			 double senoNum = Double.parseDouble(seno);
			 if(senoNum < -1 || senoNum > 1) {
				 devolucion = "El dato introducido es incorrecto. El valor del seno no puede ser un n�mero menor de -1 o mayor de 1.";
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
			 coseno = Math.sqrt(1-Math.pow(senoNum, 2));
			 tangente = senoNum/coseno;
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor del seno.</h3>\r\n" + 
	         		"								<form action=\"CosenoTangenteServlet\" method=\"post\">\r\n" + 
	         		"					  Seno:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"seno\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
					 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;

		}
		 devolucion = "Seg�n el valor del seno introducido el coseno vale "+coseno+" y la tangente "+tangente;
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

	 public static String calculaSenoTangente(String coseno) {
		 String devolucion = "ppqq";
		 double seno = 0;
		 double tangente = 0;
		 try {
			 double cosenoNum = Double.parseDouble(coseno);
			 if(cosenoNum < -1 || cosenoNum > 1) {
				 devolucion = "El dato introducido es incorrecto. El valor del coseno no puede ser un n�mero menor de -1 o mayor de 1.";
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
			 seno = Math.sqrt(1-Math.pow(cosenoNum, 2));
			 tangente = seno/cosenoNum;			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor del coseno.</h3>\r\n" + 
	         		"								<form action=\"SenoTangenteServlet\" method=\"post\">\r\n" + 
	         		"					  Coseno:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"coseno\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;

		}
		 devolucion = "Seg�n el valor del coseno introducido el seno vale "+seno+" y la tangente "+tangente;
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
	
	 public static String calculaSenoCoseno(String tangente) {
		 String devolucion = "ppqq";
		 double seno = 0;
		 double coseno = 0;
		 try {
			 double tangenteNum = Double.parseDouble(tangente);
			 coseno = Math.sqrt(1/(Math.pow(tangenteNum, 2)+1));
			 seno = Math.sqrt(1-Math.pow(coseno, 2));			
		} catch (NumberFormatException exception) {
	         String casillero = "						<h3>Introduzca en el siguiente casillero el valor de la tangente.</h3>\r\n" + 
	         		"								<form action=\"SenoCosenoServlet\" method=\"post\">\r\n" + 
	         		"					  Tangente:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"tangente\" value=\"\">\r\n" + 
	         		"							<br><br>\r\n" + 
	         		"							<input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"						</form>\r\n" + 
	         		"";
			 return "El dato introducido no es num�rico. Introduzca un dato num�rico en el casillero." + casillero;

		}
		 devolucion = "Seg�n el valor de la tangente introducido el coseno vale "+coseno+" y el seno "+seno;
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
	 
	 public static String calculaSenoCosenoTangente(String hipotenusa, String catetoOpuesto, String catetoContiguo) {
		 String devolucion = "ppqq";
		 double seno = 0;
		 double coseno = 0;
		 double tangente = 0;
		 try {
			 double hipotenusaNum = Double.parseDouble(hipotenusa);
			 double catetoOpuestoNum = Double.parseDouble(catetoOpuesto);
			 double catetoContiguoNum = Double.parseDouble(catetoContiguo);
			 if(hipotenusaNum < 0 || catetoOpuestoNum < 0 || catetoContiguoNum < 0) {
				 devolucion = "Dato o datos introducidos incorrectos; no tiene sentido introducir un valor negativo para una longitud";
				 String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
				       		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
				       		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
				       		"					�Continuar?<br>\r\n" + 
				       		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
				       		"					<br><br>\r\n" + 
				       		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
				       		"					</form>\r\n" + 
				       		"";

				 return devolucion+decisionSalirOcontinuar;
			 }
			 if(hipotenusaNum < catetoOpuestoNum || hipotenusaNum < catetoContiguoNum) {
				 devolucion = "Dato o datos introducidos incorrectos; un cateto no puede ser mayor que la hipotenusa";
				 String decisionSalirOcontinuar = "				<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
				       		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
				       		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
				       		"					�Continuar?<br>\r\n" + 
				       		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
				       		"					<br><br>\r\n" + 
				       		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
				       		"					</form>\r\n" + 
				       		"";

				 return devolucion+decisionSalirOcontinuar;
			 }
			 seno = catetoOpuestoNum/hipotenusaNum;
			 coseno = catetoContiguoNum/hipotenusaNum;
			 tangente = catetoOpuestoNum/catetoContiguoNum;
		} catch (NumberFormatException exception) {
	         String casilleros = "			        <h3>Introduzca en los siguientes casilleros la longitud de los dos catetos,</h3>\r\n" + 
	         		"			        <h3>contiguo y opuesto, al �ngulo del que se desea saber su medida, as� como</h3>\r\n" + 
	         		"			        <h3>la longitud de la hipotenusa.</h3>\r\n" + 
	         		"					<form action=\"SenoCosenoTangenteServlet\" method=\"post\">\r\n" + 
	         		"		  			  Longitud de la hipotenusa:<br>\r\n" + 
	         		"							<input type=\"text\" name=\"hipotenusa\" value=\"\">\r\n" + 
	         		"							<br>\r\n" + 
	         		"					  Longitud del cateto opuesto:<br>\r\n" + 
	         		"					  		<input type=\"text\" name=\"catetoOpuesto\" value=\"\">\r\n" + 
	         		"							<br>\r\n" + 
	         		"					  Longitud del cateto contiguo:<br>\r\n" + 
	         		"					  		<input type=\"text\" name=\"catetoContiguo\" value=\"\">\r\n" + 
	         		"					        <br><br>\r\n" + 
	         		"					        <input type=\"submit\" value=\"Enviar\">\r\n" + 
	         		"					  </form>\r\n" + 
	         		"";
			 return "Alg�n dato o datos introducidos no son num�ricos. Introduzca un dato num�rico en cada casillero." + casilleros;

		}
		 devolucion = "Seg�n los datos introducidos el seno del �ngulo es "+seno+", el coseno es "+coseno+" y la tangente es "+tangente;
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
	 
		public static String calculaAreaConLongLadoYnumLados(String longLado, String numLados) {
			String devolucion = "ppqq";
			double resultadoArea = 0;
			try {
				double longLadoDouble = Double.parseDouble(longLado);
				int numLadosInt = Integer.parseInt(numLados);
				if(longLadoDouble < 0) {
					devolucion = "En este problema no tiene sentido dar un valor negativo a una longitud.";
					String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
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
				if(numLadosInt < 3) {
					devolucion = "No existe un pol�gono con un n�mero de lados inferior a tres o bien no tiene sentido dar un valor negativo al n�mero de lados";
					String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
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
				resultadoArea = numLadosInt * Math.pow(longLadoDouble, 2)/(4 * Math.tan(Math.PI/numLadosInt));
			} catch (NumberFormatException exception) {
				devolucion = "Al menos alg�n dato de los introducidos no es num�rico o bien el valor dado para el n�mero de lados no es un n�mero entero.";
				String formulario = "					<h3>Introduzca en los siguientes casilleros la longitud del lado y el n�mero de</h3>\r\n" + 
						"					<h3>lados del pol�gono regular. Los datos introducidos han de ser exclusivamente num�ricos.</h3>					\r\n" + 
						"					<form action=\"AreaPolRegConLongLadoYnumLadosServlet\" method=\"post\">\r\n" + 
						"					  Longitud del lado:<br>\r\n" + 
						"							<input type=\"text\" name=\"longitudLado\" value=\"\">\r\n" + 
						"							<br>\r\n" + 
						"					  N�mero de lados:<br>\r\n" + 
						"							<input type=\"text\" name=\"numeroLados\" value=\"\">\r\n" + 
						"							<br><br>					\r\n" + 
						"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"					</form>\r\n" + 
						"";
				return devolucion + formulario;
			}
			devolucion = "El �rea del pol�gono es "+resultadoArea;
			String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
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
		
		public static String calculaLongLadoConAreaYnumLados(String area, String numLados) {
			String devolucion = "ppqq";
			double resultadoLongLado = 0;
			try {
				double areaDouble = Double.parseDouble(area);
				int numLadosInt = Integer.parseInt(numLados);
				if(areaDouble < 0) {
					devolucion = "En este problema no tiene sentido dar un valor negativo a un �rea.";
					String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
				       		"				<h3>el n�mero 1 y si desea salir de la aplicaci�n introduzca cualquier otro n�mero o car�cter.</h3>\r\n" + 
				       		"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
				       		"					�Continuar?<br>\r\n" + 
				       		"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
				       		"					<br><br>\r\n" + 
				       		"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
				       		"					</form>\r\n" + 
				       		"";			
					
					return devolucion+ decisionSalirOcontinuar;
				}
				if(numLadosInt < 3) {
					devolucion = "No existe un pol�gono con un n�mero de lados inferior a tres o bien no tiene sentido dar un valor negativo al n�mero de lados";
					String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
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
				double varAux1 = areaDouble*4*Math.tan(Math.PI/numLadosInt);
				double varAux2 = varAux1/numLadosInt;
				resultadoLongLado = Math.sqrt(varAux2);
			} catch (NumberFormatException exception) {
				devolucion = "Al menos alg�n dato de los introducidos no es num�rico o bien el valor dado para el n�mero de lados no es un n�mero entero.";
				String formulario = "					<h3>Introduzca en los siguientes casilleros el �rea y el n�mero de lados del</h3>\r\n" + 
						"					<h3>pol�gono regular. Los datos introducidos han de ser exclusivamente num�ricos.</h3>					\r\n" + 
						"					<form action=\"LongLadoPolRegConAreaYnumLadosServlet\" method=\"post\">\r\n" + 
						"					  �rea:<br>\r\n" + 
						"							<input type=\"text\" name=\"area\" value=\"\">\r\n" + 
						"							<br>\r\n" + 
						"					  N�mero de lados:<br>\r\n" + 
						"							<input type=\"text\" name=\"numeroLados\" value=\"\">\r\n" + 
						"							<br><br>					\r\n" + 
						"					<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"					</form>\r\n" + 
						"";
				return devolucion + formulario;			
			}
			devolucion = "La longitud de los lados del pol�gono regular es "+resultadoLongLado;
			String decisionSalirOcontinuar = "<h3>�Desea seguir utilizando la aplicaci�n? si es as� introduzca en el siguiente casillero</h3>\r\n" + 
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
