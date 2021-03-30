package opcionOperacionGeometriaAnaliticaUsuario;

public class CoordenadasUnPuntoEcuacionRecta {
	private String valorXpunto;
	private String valorYpunto;
	private String coeficienteA;
	private String terminoIndependienteB;
	public CoordenadasUnPuntoEcuacionRecta(String valorXpunto, String valorYpunto, String coeficienteA,
			String terminoIndependienteB) {
		super();
		this.valorXpunto = valorXpunto;
		this.valorYpunto = valorYpunto;
		this.coeficienteA = coeficienteA;
		this.terminoIndependienteB = terminoIndependienteB;
	}
	public String getValorXpunto() {
		return valorXpunto;
	}
	public void setValorXpunto(String valorXpunto) {
		this.valorXpunto = valorXpunto;
	}
	public String getValorYpunto() {
		return valorYpunto;
	}
	public void setValorYpunto(String valorYpunto) {
		this.valorYpunto = valorYpunto;
	}
	public String getCoeficienteA() {
		return coeficienteA;
	}
	public void setCoeficienteA(String coeficienteA) {
		this.coeficienteA = coeficienteA;
	}
	public String getTerminoIndependienteB() {
		return terminoIndependienteB;
	}
	public void setTerminoIndependienteB(String terminoIndependienteB) {
		this.terminoIndependienteB = terminoIndependienteB;
	}
	
}
