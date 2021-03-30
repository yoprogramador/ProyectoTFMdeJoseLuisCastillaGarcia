package opcionOperacionGeometriaEuclidianaUsuario;

public class AlturaYcatetos {
	private String altura;
	private String cateto1;
	private String cateto2;
	
	public AlturaYcatetos(String altura, String cateto1, String cateto2) {
		super();
		this.altura = altura;
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getCateto1() {
		return cateto1;
	}

	public void setCateto1(String cateto1) {
		this.cateto1 = cateto1;
	}

	public String getCateto2() {
		return cateto2;
	}

	public void setCateto2(String cateto2) {
		this.cateto2 = cateto2;
	}
	
	

}
