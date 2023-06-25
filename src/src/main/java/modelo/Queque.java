package modelo;

public class Queque {

	private String tipo;
	public enum Tamaño{Pequeño, Mediano, Grande}
	private Queque.Tamaño tamaño;

	private int precio;
	private String sabor;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String Tipo) {
		this.tipo= Tipo;
	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño=tamaño;
	}

	public int getPrecio() {
		return precio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public Queque(String tipo, Tamaño tamaño, String sabor, int precio ){
		this.tipo=tipo;
		this.tamaño=tamaño;
		this.sabor=sabor;
		this.precio=precio;
	}

	public String toString() {
		return "Queque "+getTipo()+" de tamaño"+getTamaño()+" y con sabor a "+getSabor()+" de precio: "+getPrecio();
	}
}