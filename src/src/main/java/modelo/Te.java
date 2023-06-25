package modelo;

public class Te {

	public enum Tamaño{Pequeño, Mediano, Grande}
	private String tipoTe;
	private int mililitroAgua;
	private String concentracion;
	private Tamaño tamaño;
	private  int precio;

	public String getTipoTe() {
		return this.tipoTe;
	}

	public void setTipoTe(String tipoTe) {
		this.tipoTe = tipoTe;
	}

	public int getMililitroAgua() {
		return this.mililitroAgua;
	}

	public void setMililitroAgua(int mililitroAgua) {
		this.mililitroAgua = mililitroAgua;
	}

	public String getConcentracion() {
		return concentracion;
	}

	public void setConcentracion(String Concentracion) {
		this.concentracion= Concentracion;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getPrecio() {
		return precio;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}
	public Tamaño getTamaño() {
		return tamaño;
	}

	public Te(String tipoTe, int militroAgua, String concentracion, Tamaño tamaño, int precio) {
		this.tipoTe=tipoTe;
		this.mililitroAgua=militroAgua;
		this.concentracion=concentracion;
		this.tamaño= tamaño;
		this.precio=precio;
	}


	public String toString() {
		return "Te "+getTipoTe()+", con concentracion "+getConcentracion()+", "+getMililitroAgua()+"ml de agua y tamaño "+getTamaño()+" de precio: "+getPrecio();
	}

}