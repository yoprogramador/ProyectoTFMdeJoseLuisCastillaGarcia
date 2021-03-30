package opcionOperacionProporcionalidadUsuario;

public class Porcentaje {
	private String cantidad;
	private String porcentaje;
	
	public Porcentaje(String cantidad, String porcentaje) {
		super();
		this.cantidad = cantidad;
		this.porcentaje = porcentaje;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public String getPorcentaje() {
		return porcentaje;
	}

	public void setPorcentaje(String porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	

}
