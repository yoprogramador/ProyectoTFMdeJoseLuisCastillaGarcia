package tablaRendimientoAlumnos;

public class RendimientoAlumnosDAO {
	private int id;
	private String nombreApellidos;
	private String clase;
	private String idProblema;
	private String exitoResolucion;
	private String tiempoResolucion;
	
	public RendimientoAlumnosDAO(int id, String nombreApellidos, String clase, String idProblema,
			String exitoResolucion, String tiempoResolucion) {
		super();
		this.id = id;
		this.nombreApellidos = nombreApellidos;
		this.clase = clase;
		this.idProblema = idProblema;
		this.exitoResolucion = exitoResolucion;
		this.tiempoResolucion = tiempoResolucion;
	}

	public RendimientoAlumnosDAO(String nombreApellidos, String clase, String idProblema, String exitoResolucion,
			String tiempoResolucion) {
		super();
		this.nombreApellidos = nombreApellidos;
		this.clase = clase;
		this.idProblema = idProblema;
		this.exitoResolucion = exitoResolucion;
		this.tiempoResolucion = tiempoResolucion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getClase() {
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getIdProblema() {
		return idProblema;
	}

	public void setIdProblema(String idProblema) {
		this.idProblema = idProblema;
	}

	public String getExitoResolucion() {
		return exitoResolucion;
	}

	public void setExitoResolucion(String exitoResolucion) {
		this.exitoResolucion = exitoResolucion;
	}

	public String getTiempoResolucion() {
		return tiempoResolucion;
	}

	public void setTiempoResolucion(String tiempoResolucion) {
		this.tiempoResolucion = tiempoResolucion;
	}
	
	
	

}
