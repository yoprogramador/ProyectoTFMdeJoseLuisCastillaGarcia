package tablaProblemas;

public class FormularioToUpdate {
	String identificador;
	String campo;
	String datos;
	
	public FormularioToUpdate(String identificador, String campo, String datos) {
		super();
		this.identificador = identificador;
		this.campo = campo;
		this.datos = datos;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getDatos() {
		return datos;
	}

	public void setDatos(String datos) {
		this.datos = datos;
	}
	

}
