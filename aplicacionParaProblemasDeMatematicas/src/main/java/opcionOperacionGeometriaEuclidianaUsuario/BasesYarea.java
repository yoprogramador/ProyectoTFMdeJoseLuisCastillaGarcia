package opcionOperacionGeometriaEuclidianaUsuario;

public class BasesYarea {
	private String baseInferior;
	private String baseSuperior;
	private String area;
	
	public BasesYarea(String baseInferior, String baseSuperior, String area) {
		super();
		this.baseInferior = baseInferior;
		this.baseSuperior = baseSuperior;
		this.area = area;
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

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	

}
