package opcionOperacionGeometriaAnaliticaUsuario;

public class EcuacionesDosRectas {
	private String coeficienteA1;
	private String terminoIndependienteB1;
	private String coeficienteA2;
	private String terminoIndependienteB2;
	
	public EcuacionesDosRectas(String coeficienteA1, String terminoIndependienteB1, String coeficienteA2,
			String terminoIndependienteB2) {
		super();
		this.coeficienteA1 = coeficienteA1;
		this.terminoIndependienteB1 = terminoIndependienteB1;
		this.coeficienteA2 = coeficienteA2;
		this.terminoIndependienteB2 = terminoIndependienteB2;
	}

	public String getCoeficienteA1() {
		return coeficienteA1;
	}

	public void setCoeficienteA1(String coeficienteA1) {
		this.coeficienteA1 = coeficienteA1;
	}

	public String getTerminoIndependienteB1() {
		return terminoIndependienteB1;
	}

	public void setTerminoIndependienteB1(String terminoIndependienteB1) {
		this.terminoIndependienteB1 = terminoIndependienteB1;
	}

	public String getCoeficienteA2() {
		return coeficienteA2;
	}

	public void setCoeficienteA2(String coeficienteA2) {
		this.coeficienteA2 = coeficienteA2;
	}

	public String getTerminoIndependienteB2() {
		return terminoIndependienteB2;
	}

	public void setTerminoIndependienteB2(String terminoIndependienteB2) {
		this.terminoIndependienteB2 = terminoIndependienteB2;
	}
	

}
