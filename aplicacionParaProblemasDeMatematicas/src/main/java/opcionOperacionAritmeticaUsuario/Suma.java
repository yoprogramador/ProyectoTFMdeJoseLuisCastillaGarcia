package opcionOperacionAritmeticaUsuario;

public class Suma {
	private String primerSumando;
	private String segundoSumando;
	public Suma(String primerSumando, String segundoSumando) {
		super();
		this.primerSumando = primerSumando;
		this.segundoSumando = segundoSumando;
	}
	public String getPrimerSumando() {
		return primerSumando;
	}
	public void setPrimerSumando(String primerSumando) {
		this.primerSumando = primerSumando;
	}
	public String getSegundoSumando() {
		return segundoSumando;
	}
	public void setSegundoSumando(String segundoSumando) {
		this.segundoSumando = segundoSumando;
	}
	
}
