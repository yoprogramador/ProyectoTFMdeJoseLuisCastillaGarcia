package tablaRendimientoAlumnos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tablaProblemas.FormularioToUpdate;

public class TablaRendAlumnosDatasource {

	private static PreparedStatement stm = null;
	private  static Connection conn = null;
	
	
	public static void makeJDBCConnection() {

		try {
			Class.forName("com.mysql.jdbc.Driver");			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
			return;
		}

		try {
			// DriverManager: The basic service for managing a set of JDBC drivers.
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/basededatosmat", "root","");
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}

	}
	
	public static void addDataToDB(RendimientoAlumnosDAO rendimientoAlumnosDAO) throws SQLException {
		
		String insertQueryStatement = "INSERT INTO `tablarendalumnos`(`nombreApellidos`, `clase`, `idProblema`, `exitoResolucion`, `tiempoResolucion`) VALUES (?,?,?,?,?)";
		
		stm = conn.prepareStatement(insertQueryStatement);
		stm.setString(1, rendimientoAlumnosDAO.getNombreApellidos());
		stm.setString(2, rendimientoAlumnosDAO.getClase());
		stm.setString(3, rendimientoAlumnosDAO.getIdProblema());
		stm.setString(4, rendimientoAlumnosDAO.getExitoResolucion());
		stm.setString(5, rendimientoAlumnosDAO.getTiempoResolucion());
		stm.executeUpdate();		
	}
	
	public static List<RendimientoAlumnosDAO> getDataFromDB(){
		List<RendimientoAlumnosDAO> listaRend = new ArrayList<RendimientoAlumnosDAO>();
	try {	
		String getQueryStatement = "SELECT * FROM tablarendalumnos";
		
		stm = conn.prepareStatement(getQueryStatement);

		ResultSet rs = stm.executeQuery();
		
		while(rs.next()) {
			int id = rs.getInt("id");
			String nombreApellidos = rs.getString("nombreApellidos");
			String clase = rs.getString("clase");
			String idProblema = rs.getString("idProblema");
			String exitoResolucion = rs.getString("exitoResolucion");
			String tiempoResolucion = rs.getString("tiempoResolucion");
			RendimientoAlumnosDAO rendAlumno = new RendimientoAlumnosDAO(id, nombreApellidos, clase, idProblema, exitoResolucion, tiempoResolucion);
			listaRend.add(rendAlumno);			
		}
	}catch (SQLException e) {
		listaRend = null;
		e.printStackTrace();		
	}
		
		return listaRend;
	}
	
	public static RendimientoAlumnosDAO getRendimientoAlumnoById(String ident) {
		RendimientoAlumnosDAO rendimientoAlumnosDAO = null;
		int idInt = 0;
		try {
			idInt = Integer.parseInt(ident);
		} catch (NumberFormatException exception) {
			rendimientoAlumnosDAO = null;
			exception.printStackTrace();
		}
		try {
			// MySQL Select Query Tutorial
			String getQueryStatement = "SELECT * FROM tablarendalumnos";
	
			stm = conn.prepareStatement(getQueryStatement);
	
			ResultSet rs = stm.executeQuery();
	
			while (rs.next()) {
				int id = rs.getInt("id");
				String nombreApellidos = rs.getString("nombreApellidos");
				String clase = rs.getString("clase");
				String idProblema = rs.getString("idProblema");
				String exitoResolucion = rs.getString("exitoResolucion");
				String tiempoResolucion = rs.getString("tiempoResolucion");
				RendimientoAlumnosDAO rendAlumno = new RendimientoAlumnosDAO(id, nombreApellidos, clase, idProblema, exitoResolucion, tiempoResolucion);
				if(rendAlumno.getId() == idInt) { rendimientoAlumnosDAO = rendAlumno; }
			}
	
		} catch (SQLException e) {
			rendimientoAlumnosDAO = null;
			e.printStackTrace();
		}		
		return rendimientoAlumnosDAO;			
		
	}
	
	public static List<RendimientoAlumnosDAO> getCasosByClase(String claseAlumno){
		List<RendimientoAlumnosDAO> listaRendAlumnos = new ArrayList<RendimientoAlumnosDAO>();
		try {
			// MySQL Select Query Tutorial
			String getQueryStatement = "SELECT * FROM tablarendalumnos";

			stm = conn.prepareStatement(getQueryStatement);

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombreApellidos = rs.getString("nombreApellidos");
				String clase = rs.getString("clase");
				String idProblema = rs.getString("idProblema");
				String exitoResolucion = rs.getString("exitoResolucion");
				String tiempoResolucion = rs.getString("tiempoResolucion");
				RendimientoAlumnosDAO rendAlumno = new RendimientoAlumnosDAO(id, nombreApellidos, clase, idProblema, exitoResolucion, tiempoResolucion);
				if(rendAlumno.getClase().equalsIgnoreCase(claseAlumno)) {
					listaRendAlumnos.add(rendAlumno);
				}				
			}
		} catch (SQLException e) {
			listaRendAlumnos = null;
			e.printStackTrace();
		}
		
		return listaRendAlumnos;
	}

	
	public static String updateCasoAlumnoProblema(FormularioToUpdate formToUpdate) {
		String devolucion;
	if(comprobadorExistenciaId(formToUpdate.getIdentificador())) {
		if(formToUpdate.getCampo().equalsIgnoreCase("1")) {
			try {
				String updateQueryStatement = "UPDATE `tablarendalumnos` SET `nombreApellidos` = ? WHERE `id` = ?";

				stm = conn.prepareStatement(updateQueryStatement);
				stm.setString(1, formToUpdate.getDatos());
				stm.setString(2, formToUpdate.getIdentificador());
				stm.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
				devolucion = "Se ha excedido el límite en el número de caracteres introducido para el campo del nombre y apellidos del alumno (300 caracteres incluidos espacios en blanco).";
				String sqlException1 = "<h3>Introduzca de nuevo la información en el casillero de información actualizada teniendo en cuenta esta limitación.</h3>\r\n" + 
						"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
						"			Identificador del caso alumno-problema:<br>\r\n" + 
						"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Campo:<br>\r\n" + 
						"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Información actualizada:<br>\r\n" + 
						"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
						"			<br><br>\r\n" + 
						"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"			</form>\r\n" + 
						"";
				return devolucion + sqlException1;
			}
			devolucion = "Información del caso alumno-problema ha sido actualizada.";
			RendimientoAlumnosDAO caso = getRendimientoAlumnoById(formToUpdate.getIdentificador());
			String informacionCaso = "	<h3>El identificador del caso alumno-problema es :&nbsp"+caso.getId()+"</h3>\r\n" + 
					"					<h3>El nombre y apellidos del alumno son :&nbsp"+caso.getNombreApellidos()+" </h3>\r\n" + 
					"					<h3>La clase a la que pertenece al alumno es :&nbsp"+caso.getClase()+"</h3>\r\n" + 
					"					<h3>El identificador del problema presentado al alumno es :&nbsp"+caso.getIdProblema()+"</h3>\r\n" + 
					"					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp"+caso.getExitoResolucion()+"</h3>\r\n" + 
					"					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp"+caso.getTiempoResolucion()+"</h3>\r\n" + 
					"";
			
			String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
					"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
					"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
					"					¿Continuar?\r\n" + 
					"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";
			return devolucion + informacionCaso + salirOnoDeAplicacion;
			
		}else if(formToUpdate.getCampo().equalsIgnoreCase("2")) {
			if(formToUpdate.getDatos().equalsIgnoreCase("1A")||formToUpdate.getDatos().equalsIgnoreCase("1B")||formToUpdate.getDatos().equalsIgnoreCase("1C")||
					formToUpdate.getDatos().equalsIgnoreCase("2A")||formToUpdate.getDatos().equalsIgnoreCase("2B")||formToUpdate.getDatos().equalsIgnoreCase("2C")||
					formToUpdate.getDatos().equalsIgnoreCase("3A")||formToUpdate.getDatos().equalsIgnoreCase("3B")||formToUpdate.getDatos().equalsIgnoreCase("3C")||
					formToUpdate.getDatos().equalsIgnoreCase("4A")||formToUpdate.getDatos().equalsIgnoreCase("4B")||formToUpdate.getDatos().equalsIgnoreCase("4C")){
				try {
					String updateQueryStatement = "UPDATE `tablarendalumnos` SET `clase` = ? WHERE `id` = ?";

					stm = conn.prepareStatement(updateQueryStatement);
					stm.setString(1, formToUpdate.getDatos());
					stm.setString(2, formToUpdate.getIdentificador());
					stm.executeUpdate();


				} catch (SQLException e) {
					e.printStackTrace();
				}
				devolucion = "Información del caso alumno-problema ha sido actualizada.";
				RendimientoAlumnosDAO caso = getRendimientoAlumnoById(formToUpdate.getIdentificador());
				String informacionCaso = "	<h3>El identificador del caso alumno-problema es :&nbsp"+caso.getId()+"</h3>\r\n" + 
						"					<h3>El nombre y apellidos del alumno son :&nbsp"+caso.getNombreApellidos()+" </h3>\r\n" + 
						"					<h3>La clase a la que pertenece al alumno es :&nbsp"+caso.getClase()+"</h3>\r\n" + 
						"					<h3>El identificador del problema presentado al alumno es :&nbsp"+caso.getIdProblema()+"</h3>\r\n" + 
						"					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp"+caso.getExitoResolucion()+"</h3>\r\n" + 
						"					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp"+caso.getTiempoResolucion()+"</h3>\r\n" + 
						"";

				String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
						"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
						"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
						"					¿Continuar?\r\n" + 
						"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
						"						<br><br>\r\n" + 
						"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"					</form>\r\n" + 
						"";

				return devolucion + informacionCaso + salirOnoDeAplicacion;
			}else {
				devolucion = "La clave introducida para determinar la clase a la que pertenece el alumno es incorecta.";
				String formulario = "<h3>Introduzca en el casillero de información actualizada la clase a la que pertenece</h3>\r\n" + 
						"			<h3>al alumno. Utilice las claves 1A, 1B, 1C, 2A, 2B, 2C, 3A, 3B, 3C, 4A, 4B, 4C.</h3>\r\n" + 
						"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
						"			Identificador del caso alumno-problema:<br>\r\n" + 
						"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Campo:<br>\r\n" + 
						"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Información actualizada:<br>\r\n" + 
						"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
						"			<br><br>\r\n" + 
						"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"			</form>\r\n" + 
						"";
				return devolucion + formulario;
			}

		}else if(formToUpdate.getCampo().equalsIgnoreCase("3")) {
			
			if(comprobadorEsNumero(formToUpdate.getDatos())) {
					try {
						String updateQueryStatement = "UPDATE `tablarendalumnos` SET `idProblema` = ? WHERE `id` = ?";
		
						stm = conn.prepareStatement(updateQueryStatement);
						stm.setString(1, formToUpdate.getDatos());
						stm.setString(2, formToUpdate.getIdentificador());
						stm.executeUpdate();
		
		
					} catch (SQLException e) {
						e.printStackTrace();
						devolucion = "Se ha excedido el límite en el número de dígitos introducido para el campo del identificador del problema que se le prensentó al alumno (9 caracteres incluidos espacios en blanco).";
						String sqlException3 = "<h3>Introduzca de nuevo la información en el casillero de información actualizada teniendo en cuenta esta limitación.</h3>\r\n" + 
								"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
								"			Identificador del caso alumno-problema:<br>\r\n" + 
								"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
								"			<br>\r\n" + 
								"			Campo:<br>\r\n" + 
								"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
								"			<br>\r\n" + 
								"			Información actualizada:<br>\r\n" + 
								"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
								"			<br><br>\r\n" + 
								"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
								"			</form>\r\n" + 
								"";
						return devolucion + sqlException3;
		
					}
					devolucion = "Información del caso alumno-problema ha sido actualizada.";
					RendimientoAlumnosDAO caso = getRendimientoAlumnoById(formToUpdate.getIdentificador());
					String informacionCaso = "	<h3>El identificador del caso alumno-problema es :&nbsp"+caso.getId()+"</h3>\r\n" + 
							"					<h3>El nombre y apellidos del alumno son :&nbsp"+caso.getNombreApellidos()+" </h3>\r\n" + 
							"					<h3>La clase a la que pertenece al alumno es :&nbsp"+caso.getClase()+"</h3>\r\n" + 
							"					<h3>El identificador del problema presentado al alumno es :&nbsp"+caso.getIdProblema()+"</h3>\r\n" + 
							"					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp"+caso.getExitoResolucion()+"</h3>\r\n" + 
							"					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp"+caso.getTiempoResolucion()+"</h3>\r\n" + 
							"";

					String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
							"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
							"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
							"					¿Continuar?\r\n" + 
							"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
							"						<br><br>\r\n" + 
							"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
							"					</form>\r\n" + 
							"";
		
					return devolucion + informacionCaso + salirOnoDeAplicacion;
			}else {
				devolucion = "El dato introducido no es un número. Introduzca un número en el casillero de información actualizada."
						+ " Si no conociera el identificador del problema introduzca en el casillero un cero o un número negativo.";
				String formulario = "<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
						"			Identificador del caso alumno-problema:<br>\r\n" + 
						"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Campo:<br>\r\n" + 
						"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Información actualizada:<br>\r\n" + 
						"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
						"			<br><br>\r\n" + 
						"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"			</form>\r\n" + 
						"";
				return devolucion + formulario;
			}

		}else if(formToUpdate.getCampo().equalsIgnoreCase("4")) {
			try {
				String updateQueryStatement = "UPDATE `tablarendalumnos` SET `exitoResolucion` = ? WHERE `id` = ?";

				stm = conn.prepareStatement(updateQueryStatement);
				stm.setString(1, formToUpdate.getDatos());
				stm.setString(2, formToUpdate.getIdentificador());
				stm.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
				devolucion = "Se ha excedido el límite en el número de caracteres introducido para el campo del éxito o no en la resolución del problema (1022 caracteres incluidos espacios en blanco).";
				String sqlException4 = "<h3>Introduzca de nuevo la información en el casillero de información actualizada teniendo en cuenta esta limitación.</h3>\r\n" + 
						"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
						"			Identificador del caso alumno-problema:<br>\r\n" + 
						"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Campo:<br>\r\n" + 
						"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Información actualizada:<br>\r\n" + 
						"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
						"			<br><br>\r\n" + 
						"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"			</form>\r\n" + 
						"";
				return devolucion + sqlException4;

			}
			devolucion = "Información del caso alumno-problema ha sido actualizada.";
			RendimientoAlumnosDAO caso = getRendimientoAlumnoById(formToUpdate.getIdentificador());
			String informacionCaso = "	<h3>El identificador del caso alumno-problema es :&nbsp"+caso.getId()+"</h3>\r\n" + 
					"					<h3>El nombre y apellidos del alumno son :&nbsp"+caso.getNombreApellidos()+" </h3>\r\n" + 
					"					<h3>La clase a la que pertenece al alumno es :&nbsp"+caso.getClase()+"</h3>\r\n" + 
					"					<h3>El identificador del problema presentado al alumno es :&nbsp"+caso.getIdProblema()+"</h3>\r\n" + 
					"					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp"+caso.getExitoResolucion()+"</h3>\r\n" + 
					"					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp"+caso.getTiempoResolucion()+"</h3>\r\n" + 
					"";

			String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
					"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
					"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
					"					¿Continuar?\r\n" + 
					"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";

			return devolucion + informacionCaso + salirOnoDeAplicacion;

		}else if(formToUpdate.getCampo().equalsIgnoreCase("5")) {
			try {
				String updateQueryStatement = "UPDATE `tablarendalumnos` SET `tiempoResolucion` = ? WHERE `id` = ?";

				stm = conn.prepareStatement(updateQueryStatement);
				stm.setString(1, formToUpdate.getDatos());
				stm.setString(2, formToUpdate.getIdentificador());
				stm.executeUpdate();


			} catch (SQLException e) {
				e.printStackTrace();
				devolucion = "Se ha excedido el límite en el número de caracteres introducido para el campo del tiempo invertido en resolver el problema (1022 caracteres incluidos espacios en blanco).";
				String sqlException5 = "<h3>Introduzca de nuevo la información en el casillero de información actualizada teniendo en cuenta esta limitación.</h3>\r\n" + 
						"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
						"			Identificador del caso alunno-problema:<br>\r\n" + 
						"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Campo:<br>\r\n" + 
						"			<input type=\"text\" name=\"campo\" value=\""+formToUpdate.getCampo()+"\">\r\n" + 
						"			<br>\r\n" + 
						"			Información actualizada:<br>\r\n" + 
						"			<input type=\"text\" name=\"datos\" value=\"\">\r\n" + 
						"			<br><br>\r\n" + 
						"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
						"			</form>\r\n" + 
						"";
				return devolucion + sqlException5;

			}
			devolucion = "Información del caso alumno-problema ha sido actualizada.";
			RendimientoAlumnosDAO caso = getRendimientoAlumnoById(formToUpdate.getIdentificador());
			String informacionCaso = "	<h3>El identificador del caso alumno-problema es :&nbsp"+caso.getId()+"</h3>\r\n" + 
					"					<h3>El nombre y apellidos del alumno son :&nbsp"+caso.getNombreApellidos()+" </h3>\r\n" + 
					"					<h3>La clase a la que pertenece al alumno es :&nbsp"+caso.getClase()+"</h3>\r\n" + 
					"					<h3>El identificador del problema presentado al alumno es :&nbsp"+caso.getIdProblema()+"</h3>\r\n" + 
					"					<h3>La resolución del problema, con éxito o no, por parte del alumno fue :&nbsp"+caso.getExitoResolucion()+"</h3>\r\n" + 
					"					<h3>El tiempo invertido en resolver el problema con éxito fue :&nbsp"+caso.getTiempoResolucion()+"</h3>\r\n" + 
					"";

			String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
					"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
					"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
					"					¿Continuar?\r\n" + 
					"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";

			return devolucion + informacionCaso + salirOnoDeAplicacion;

		}else {
			devolucion = "Se ha introducido una clave incorrecta para designar el campo cuyos datos se quieren modificar.";
			String formulario = "<h3>Introduzca en el casillero del campo el campo del caso alumno-problema</h3>\r\n" + 
					"			<h3>donde se quiere realizar la modificación.</h3>\r\n" + 
					"			<h3>y la información actualizada que se quiere introducir en ese campo.</h3>\r\n" + 
					"			<h3>Si el campo en el que se quiere realizar la modificación es el nombre y apellidos</h3>\r\n" + 
					"			<h3>del alumno introduzca en el casillero del campo el dígito 1.</h3>\r\n" + 
					"			<h3>Si el campo en el que se quiere realizar la modificación es la clase a</h3>\r\n" + 
					"			<h3>la que pertenece el alumno (1A,1B,1C,2A,2B,2C,3A,3B,3C,4A,4B,4C) introduzca</h3>\r\n" + 
					"			<h3>en el casillero del campo el dígito 2.</h3>\r\n" + 
					"			<h3>Si el campo en el que se quiere realizar la modificación es el identificador</h3>\r\n" + 
					"			<h3>del problema presentado al alumno introduzca en el casillero del campo el dígito 3.</h3>\r\n" + 
					"			<h3>Si el campo en el que se quiere realizar la modificación es el éxito en la </h3>\r\n" + 
					"			<h3>resolución del problema introduzca en el casillero del campo el dígito 4.</h3>\r\n" + 
					"			<h3>Si el campo en el que se quiere realizar la modificación es el tiempo</h3>\r\n" + 
					"			<h3>invertido en resolver el problema con éxito introduzca en el casillero</h3>\r\n" + 
					"			<h3>del campo el dígito 5.</h3>\r\n" + 
					"			<form action=\"FormularioModificacionCasoServlet\" method=\"post\">\r\n" + 
					"			Identificador del caso alumno-problema:<br>\r\n" + 
					"			<input type=\"text\" name=\"identificador\" value=\""+formToUpdate.getIdentificador()+"\">\r\n" + 
					"			<br>\r\n" + 
					"			Campo:<br>\r\n" + 
					"			<input type=\"text\" name=\"campo\" value=\"\">\r\n" + 
					"			<br>\r\n" + 
					"			Información actualizada:<br>\r\n" + 
					"			<input type=\"text\" name=\"datos\" value=\""+formToUpdate.getDatos()+"\">\r\n" + 
					"			<br><br>\r\n" + 
					"		  	<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"			</form>\r\n" + 
					""; 
			return devolucion + formulario;
		}
	  }else {
			devolucion = "No existe un caso alumno-problema con el identificador introducido.";
			String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
					"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
					"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
					"					¿Continuar?\r\n" + 
					"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";

			return devolucion + salirOnoDeAplicacion;
		  
	  }
	}
	
	public static String eliminarCasoAlumnoProblema(String ident) {
	 String devolucion = "El caso alumno-problema seleccionado ha sido eliminado.";
	 if(comprobadorExistenciaId(ident)) {		
		try {
			String deleteQueryStatement = "DELETE FROM `tablarendalumnos` WHERE `id` = ?";
			stm = conn.prepareStatement(deleteQueryStatement);
			stm.setString(1, ident);
			stm.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
				"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
				"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
				"					¿Continuar?\r\n" + 
				"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
				"						<br><br>\r\n" + 
				"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
				"					</form>\r\n" + 
				"";
		
		return devolucion + salirOnoDeAplicacion;
	  }else {
			devolucion = "No existe un caso alumno-problema con el identificador introducido.";
			String salirOnoDeAplicacion = "	<h3>¿Desea seguir utilizando la aplicación? si es así introduzca en el siguiente casillero</h3>\r\n" + 
					"					<h3>el número 1 y si desea salir de la aplicación introduzca cualquier otro número o carácter.</h3>\r\n" + 
					"					<form action=\"DecisionSalirDeLaAplicacionServlet\" method=\"post\">\r\n" + 
					"					¿Continuar?\r\n" + 
					"					<input type=\"text\" name=\"decisionSalirOno\" value=\"\">\r\n" + 
					"						<br><br>\r\n" + 
					"		  	  		<input type=\"submit\" value=\"Enviar\">\r\n" + 
					"					</form>\r\n" + 
					"";

			return devolucion + salirOnoDeAplicacion;			
			
		}
	} 
	
	public static RendimientoAlumnosDAO getCasoByLastId() {
		RendimientoAlumnosDAO rendAlumnoDao = null;
		List<Integer> listaIdentificadores = new ArrayList<Integer>();
		int lastId = 0;
		String lastIdString;
		try {
			// MySQL Select Query Tutorial
			String getQueryStatement = "SELECT * FROM tablarendalumnos";

			stm = conn.prepareStatement(getQueryStatement);

			ResultSet rs = stm.executeQuery();

			while (rs.next()) {
				int id = rs.getInt("id");
				String nombreApellidos = rs.getString("nombreApellidos");
				String clase = rs.getString("clase");
				String idProblema = rs.getString("idProblema");
				String exitoResolucion = rs.getString("exitoResolucion");
				String tiempoResolucion = rs.getString("tiempoResolucion");
				RendimientoAlumnosDAO rendimAlumno = new RendimientoAlumnosDAO(id, nombreApellidos, clase, idProblema, exitoResolucion, tiempoResolucion);
				listaIdentificadores.add(rendimAlumno.getId());
			}
		lastId = devuelveNumeroMasAlto(listaIdentificadores);

		} catch (SQLException e) {
			rendAlumnoDao = null;
			e.printStackTrace();
		}
		
		lastIdString = ""+lastId;
		
		rendAlumnoDao = getRendimientoAlumnoById(lastIdString);
		
		return rendAlumnoDao;		
	}
	
	private static int devuelveNumeroMasAlto(List<Integer> listaNumero) {
		int devolucion = 0;
		devolucion = Collections.max(listaNumero);
		return devolucion;
	}
	
	public static boolean comprobadorExistenciaId(String ident) {
		boolean devolucion = false;
		int idInt = 0;	
		try {
			idInt = Integer.parseInt(ident);
		} catch (NumberFormatException exception) {
			devolucion = false;
			return devolucion;
		}
		
		try {
			String getQueryStatement = "SELECT * FROM tablarendalumnos";
			stm = conn.prepareStatement(getQueryStatement);
			ResultSet rs = stm.executeQuery();
			
			while (rs.next()) {
				int id = rs.getInt("id");
				if(idInt == id) {
					devolucion = true;
					return devolucion;
				}
			}			
		} catch (SQLException e) {
			devolucion = false;
			e.printStackTrace();			
		}
		devolucion = false;
		return devolucion;
	}
	
	public static boolean comprobadorEsNumero(String entradaString) {
		boolean devolucion = false;
		int varAux = 0;
		try {
			varAux = Integer.parseInt(entradaString);		
		} catch (NumberFormatException exception) {
			return devolucion;
		}
		devolucion = true;
		return devolucion;
	}
	
	
}
