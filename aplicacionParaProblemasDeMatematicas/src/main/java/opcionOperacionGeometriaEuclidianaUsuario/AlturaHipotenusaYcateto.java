package opcionOperacionGeometriaEuclidianaUsuario;

public class AlturaHipotenusaYcateto {
	private String altura;
	private String hipotenusa;
	private String cateto;
	
	public AlturaHipotenusaYcateto(String altura, String hipotenusa, String cateto) {
		super();
		this.altura = altura;
		this.hipotenusa = hipotenusa;
		this.cateto = cateto;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getHipotenusa() {
		return hipotenusa;
	}
	public void setHipotenusa(String hipotenusa) {
		this.hipotenusa = hipotenusa;
	}
	public String getCateto() {
		return cateto;
	}
	public void setCateto(String cateto) {
		this.cateto = cateto;
	}
	
	
}
