package tablaProblemas;

public class ProblemasDao {
	private int id;
	private String enunciadoDelProblema;
	private String areaDelProblema;
	private String procedimientoResolucion;
	private String solucionProblema;
	private String porcentajeDeResolucion;
	private String tiempoMedioMinutosInvertidoEnProblema;
	
	public ProblemasDao(int id, String enunciadoDelProblema, String areaDelProblema, String procedimientoResolucion,
			String solucionProblema, String porcentajeDeResolucion, String tiempoMedioMinutosInvertidoEnProblema) {
		super();
		this.id = id;
		this.enunciadoDelProblema = enunciadoDelProblema;
		this.areaDelProblema = areaDelProblema;
		this.procedimientoResolucion = procedimientoResolucion;
		this.solucionProblema = solucionProblema;
		this.porcentajeDeResolucion = porcentajeDeResolucion;
		this.tiempoMedioMinutosInvertidoEnProblema = tiempoMedioMinutosInvertidoEnProblema;
	}

	public ProblemasDao(String enunciadoDelProblema, String areaDelProblema, String procedimientoResolucion,
			String solucionProblema, String porcentajeDeResolucion, String tiempoMedioMinutosInvertidoEnProblema) {
		super();
		this.enunciadoDelProblema = enunciadoDelProblema;
		this.areaDelProblema = areaDelProblema;
		this.procedimientoResolucion = procedimientoResolucion;
		this.solucionProblema = solucionProblema;
		this.porcentajeDeResolucion = porcentajeDeResolucion;
		this.tiempoMedioMinutosInvertidoEnProblema = tiempoMedioMinutosInvertidoEnProblema;
	}

	public int getId() {
		return id;
	}

	public String getEnunciadoDelProblema() {
		return enunciadoDelProblema;
	}

	public void setEnunciadoDelProblema(String enunciadoDelProblema) {
		this.enunciadoDelProblema = enunciadoDelProblema;
	}

	public String getAreaDelProblema() {
		return areaDelProblema;
	}

	public void setAreaDelProblema(String areaDelProblema) {
		this.areaDelProblema = areaDelProblema;
	}

	public String getProcedimientoResolucion() {
		return procedimientoResolucion;
	}

	public void setProcedimientoResolucion(String procedimientoResolucion) {
		this.procedimientoResolucion = procedimientoResolucion;
	}

	public String getSolucionProblema() {
		return solucionProblema;
	}

	public void setSolucionProblema(String solucionProblema) {
		this.solucionProblema = solucionProblema;
	}

	public String getPorcentajeDeResolucion() {
		return porcentajeDeResolucion;
	}

	public void setPorcentajeDeResolucion(String porcentajeDeResolucion) {
		this.porcentajeDeResolucion = porcentajeDeResolucion;
	}

	public String getTiempoMedioMinutosInvertidoEnProblema() {
		return tiempoMedioMinutosInvertidoEnProblema;
	}

	public void setTiempoMedioMinutosInvertidoEnProblema(String tiempoMedioMinutosInvertidoEnProblema) {
		this.tiempoMedioMinutosInvertidoEnProblema = tiempoMedioMinutosInvertidoEnProblema;
	}


	
}
