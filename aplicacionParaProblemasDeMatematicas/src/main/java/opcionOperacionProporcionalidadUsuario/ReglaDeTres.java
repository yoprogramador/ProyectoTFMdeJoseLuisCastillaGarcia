package opcionOperacionProporcionalidadUsuario;

public class ReglaDeTres {
	private String primeraCantidadVariableA;
	private String primeraCantidadVariableB;
	private String segundaCantidadVariableA;
	
	public ReglaDeTres(String primeraCantidadVariableA, String primeraCantidadVariableB,
			String segundaCantidadVariableA) {
		super();
		this.primeraCantidadVariableA = primeraCantidadVariableA;
		this.primeraCantidadVariableB = primeraCantidadVariableB;
		this.segundaCantidadVariableA = segundaCantidadVariableA;
	}

	public String getPrimeraCantidadVariableA() {
		return primeraCantidadVariableA;
	}

	public void setPrimeraCantidadVariableA(String primeraCantidadVariableA) {
		this.primeraCantidadVariableA = primeraCantidadVariableA;
	}

	public String getPrimeraCantidadVariableB() {
		return primeraCantidadVariableB;
	}

	public void setPrimeraCantidadVariableB(String primeraCantidadVariableB) {
		this.primeraCantidadVariableB = primeraCantidadVariableB;
	}

	public String getSegundaCantidadVariableA() {
		return segundaCantidadVariableA;
	}

	public void setSegundaCantidadVariableA(String segundaCantidadVariableA) {
		this.segundaCantidadVariableA = segundaCantidadVariableA;
	}
	
	

}
