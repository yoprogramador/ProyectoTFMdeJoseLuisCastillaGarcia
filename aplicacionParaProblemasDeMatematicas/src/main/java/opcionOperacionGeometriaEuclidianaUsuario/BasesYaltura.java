package opcionOperacionGeometriaEuclidianaUsuario;

public class BasesYaltura {
	private String baseInferior;
	private String baseSuperior;
	private String altura;

	public BasesYaltura(String baseInferior, String baseSuperior, String altura) {
		super();
		this.baseInferior = baseInferior;
		this.baseSuperior = baseSuperior;
		this.altura = altura;
	}

	public String getBaseInferior() {
		return baseInferior;
	}

	public void setBaseInferior(String baseInferior) {
		this.baseInferior = baseInferior;
	}

	public String getBaseSuperior() {
		return baseSuperior;
	}

	public void setBaseSuperior(String baseSuperior) {
		this.baseSuperior = baseSuperior;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	

}
