package opcionOperacionGeometriaEuclidianaUsuario;

public class HipotenusaYcatetos {
	private String hipotenusa;
	private String cateto1;
	private String cateto2;
	
	public HipotenusaYcatetos(String hipotenusa, String cateto1, String cateto2) {
		super();
		this.hipotenusa = hipotenusa;
		this.cateto1 = cateto1;
		this.cateto2 = cateto2;
	}

	public String getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(String hipotenusa) {
		this.hipotenusa = hipotenusa;
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
