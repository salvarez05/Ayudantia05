package modelo;

public class Cafe {
	private float gramosCafe;

	private int mililitrosAgua;
	public enum Tamaño{Pequeño, Mediano, Grande}

	private Tamaño tamaño;

	private String nombre;
	private int precio;

	public Cafe( String nombre,float gramosCafe, int mililitrosAgua, Tamaño tamaño, int precio) {
		this.gramosCafe= gramosCafe;
		this.mililitrosAgua= mililitrosAgua;
		this.tamaño=tamaño;
		this.nombre= nombre;
		this.precio=precio;

	}

	public Tamaño getTamaño() {
		return tamaño;
	}

	public float getGramosCafe() {
		return gramosCafe;
	}

	public int getMililitrosAgua() {
		return mililitrosAgua;
	}

	public String getNombre() {
		return nombre;
	}

	public void setGramosCafe(float gramosCafe) {
		this.gramosCafe = gramosCafe;
	}

	public void setTamaño(Tamaño tamaño) {
		this.tamaño = tamaño;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public void setMililitrosAgua(int mililitrosAgua) {
		this.mililitrosAgua = mililitrosAgua;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString(){
		return "Cafe "+getNombre()+" de tamaño "+ getTamaño()+ ", con "+getGramosCafe()+" gramos de cafe y "+getMililitrosAgua()+" mm de agua de precio:" +getPrecio();
	}

}