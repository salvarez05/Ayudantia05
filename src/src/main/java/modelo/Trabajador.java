package modelo;

public class Trabajador {


	public enum Tipo{Barista, Mesero, Cocinero, Delivery}

	private Tipo tipo;
	private String nombre;
	private int sueldo;

	public Tipo getTipo() {
		return tipo;
	}

	public Trabajador(String nombre, Tipo tipo, int sueldo){
		this.nombre=nombre;
		this.tipo=tipo;
		this.sueldo=sueldo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo= tipo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre= Nombre;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int Sueldo) {
		this.sueldo= Sueldo;
	}

	public String toString(){
		return getNombre()+" contratado como "+ getTipo()+ " con sueldo de "+getSueldo()+" pesos";
	}
}

