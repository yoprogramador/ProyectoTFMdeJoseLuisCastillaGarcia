package opcionOperacionGeometriaEuclidianaUsuario;

public class AnguloYradio {
	private String gradosAngulo;
	private String longitudRadio;
	
	public AnguloYradio(String gradosAngulo, String longitudRadio) {
		super();
		this.gradosAngulo = gradosAngulo;
		this.longitudRadio = longitudRadio;
	}

	public String getGradosAngulo() {
		return gradosAngulo;
	}

	public void setGradosAngulo(String gradosAngulo) {
		this.gradosAngulo = gradosAngulo;
	}

	public String getLongitudRadio() {
		return longitudRadio;
	}

	public void setLongitudRadio(String longitudRadio) {
		this.longitudRadio = longitudRadio;
	}
	

}
