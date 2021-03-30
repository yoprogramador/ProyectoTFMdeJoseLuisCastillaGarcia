package opcionOperacionGeometriaEuclidianaUsuario;

public class ArcoYangulo {
	private String longitudArco;
	private String gradosAngulo;
	
	public ArcoYangulo(String longitudArco, String gradosAngulo) {
		super();
		this.longitudArco = longitudArco;
		this.gradosAngulo = gradosAngulo;
	}
	
	public String getLongitudArco() {
		return longitudArco;
	}

	public void setLongitudArco(String longitudArco) {
		this.longitudArco = longitudArco;
	}

	public String getGradosAngulo() {
		return gradosAngulo;
	}

	public void setGradosAngulo(String gradosAngulo) {
		this.gradosAngulo = gradosAngulo;
	}

	

}
