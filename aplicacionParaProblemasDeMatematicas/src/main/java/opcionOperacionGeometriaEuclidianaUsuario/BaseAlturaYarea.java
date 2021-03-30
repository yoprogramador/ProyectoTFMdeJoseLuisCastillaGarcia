package opcionOperacionGeometriaEuclidianaUsuario;

public class BaseAlturaYarea {
	private String baseConocida;
	private String altura;
	private String area;
	
	public BaseAlturaYarea(String baseConocida, String altura, String area) {
		super();
		this.baseConocida = baseConocida;
		this.altura = altura;
		this.area = area;
	}
	
	public String getBaseConocida() {
		return baseConocida;
	}

	public void setBaseConocida(String baseConocida) {
		this.baseConocida = baseConocida;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	
}
