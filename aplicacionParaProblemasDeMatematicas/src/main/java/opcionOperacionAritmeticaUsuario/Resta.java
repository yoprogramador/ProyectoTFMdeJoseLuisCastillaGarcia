package opcionOperacionAritmeticaUsuario;

public class Resta {
	private String minuendo;
	private String sustraendo;
	
	public Resta(String minuendo, String sustraendo) {
		super();
		this.minuendo = minuendo;
		this.sustraendo = sustraendo;
	}

	public String getMinuendo() {
		return minuendo;
	}

	public void setMinuendo(String minuendo) {
		this.minuendo = minuendo;
	}

	public String getSustraendo() {
		return sustraendo;
	}

	public void setSustraendo(String sustraendo) {
		this.sustraendo = sustraendo;
	}
	
}
