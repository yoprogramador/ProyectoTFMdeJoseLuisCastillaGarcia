package opcionOperacionGeometriaAnaliticaUsuario;

public class FuncionCuadratica {
	private String coeficienteA;
	private String coeficienteB;
	private String terminoIndependienteC;
	public FuncionCuadratica(String coeficienteA, String coeficienteB, String terminoIndependienteC) {
		super();
		this.coeficienteA = coeficienteA;
		this.coeficienteB = coeficienteB;
		this.terminoIndependienteC = terminoIndependienteC;
	}
	public String getCoeficienteA() {
		return coeficienteA;
	}
	public void setCoeficienteA(String coeficienteA) {
		this.coeficienteA = coeficienteA;
	}
	public String getCoeficienteB() {
		return coeficienteB;
	}
	public void setCoeficienteB(String coeficienteB) {
		this.coeficienteB = coeficienteB;
	}
	public String getTerminoIndependienteC() {
		return terminoIndependienteC;
	}
	public void setTerminoIndependienteC(String terminoIndependienteC) {
		this.terminoIndependienteC = terminoIndependienteC;
	}
	
}
