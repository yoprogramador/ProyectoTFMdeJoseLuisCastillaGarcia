package opcionOperacionGeometriaAnaliticaUsuario;

public class FocoDirectriz {
	private String valorXfoco;
	private String valorYfoco;
	private String terminoIndependienteDirectriz;
	public FocoDirectriz(String valorXfoco, String valorYfoco, String terminoIndependienteDirectriz) {
		super();
		this.valorXfoco = valorXfoco;
		this.valorYfoco = valorYfoco;
		this.terminoIndependienteDirectriz = terminoIndependienteDirectriz;
	}
	public String getValorXfoco() {
		return valorXfoco;
	}
	public void setValorXfoco(String valorXfoco) {
		this.valorXfoco = valorXfoco;
	}
	public String getValorYfoco() {
		return valorYfoco;
	}
	public void setValorYfoco(String valorYfoco) {
		this.valorYfoco = valorYfoco;
	}
	public String getTerminoIndependienteDirectriz() {
		return terminoIndependienteDirectriz;
	}
	public void setTerminoIndependienteDirectriz(String terminoIndependienteDirectriz) {
		this.terminoIndependienteDirectriz = terminoIndependienteDirectriz;
	}

}
