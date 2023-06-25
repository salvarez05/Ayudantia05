package modelo;

import datos.GestorVentas;

import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
	private ArrayList<Cafe> cafesALaVenta= new ArrayList<>();
	private ArrayList<Te> tesALaVenta= new ArrayList<>();
	private ArrayList<Queque> QuequesALaVenta= new ArrayList<>();
	private ArrayList<Trabajador> trabajadores= new ArrayList<>();
	private ArrayList<Cliente> clientes= new ArrayList<>();
	private String nombre;
	private String direccion;
	private String redesSociales;

	public Cafeteria(String nombre,String direccion,String redesSociales){
		this.direccion= direccion;
		this.nombre=nombre;
		this.redesSociales= redesSociales;
	}

	public void setRedesSociales(String redesSociales) {
		this.redesSociales = redesSociales;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setCafesALaVenta(ArrayList<Cafe> cafesALaVenta) {
		this.cafesALaVenta = cafesALaVenta;
	}

	public String getDireccion() {
		return direccion;
	}

	public String getRedesSociales() {
		return redesSociales;
	}

	public List<Cafe> getCafesALaVenta() {
		return cafesALaVenta;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}
	public List<Trabajador> getTrabajadores(){return trabajadores;}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}


	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Te> getTesALaVenta() {
		return tesALaVenta;
	}

	public void setTesALaVenta(ArrayList<Te> tesALaVenta) {
		this.tesALaVenta = tesALaVenta;
	}

	public ArrayList<Queque> getQuequesALaVenta() {
		return QuequesALaVenta;
	}

	public void setQuequesALaVenta(ArrayList<Queque> quequesALaVenta) {
		QuequesALaVenta = quequesALaVenta;
	}

	public void agregarCafe(String nombre, float gramosCafe, int mililitrosAgua, Cafe.Tamaño tamano, int precio){
		Cafe cafe = new Cafe(nombre, gramosCafe, mililitrosAgua, tamano, precio);
		this.cafesALaVenta.add(cafe);
	}
	public void agregarTrabajador(String nombre, Trabajador.Tipo tipo, int sueldo){
		Trabajador trabajador = new Trabajador(nombre,tipo,sueldo);
		this.trabajadores.add(trabajador);
	}
	public void agregarTe(String tipoTe, int militroAgua, String concentracion, Te.Tamaño tamaño, int precio){
		Te te = new Te(tipoTe, militroAgua, concentracion, tamaño, precio);
		this.tesALaVenta.add(te);
	}
	public void agregarQueque(String tipo, Queque.Tamaño tamaño, String sabor, int precio ){
		Queque queque= new Queque(tipo, tamaño, sabor, precio);
		this.QuequesALaVenta.add(queque);
	}
	public void agregarCliente(String nombre){
		Cliente cliente = new Cliente(nombre);
		this.clientes.add(cliente);
	}



	public void removerCafe(int numero){
		getCafesALaVenta().remove(numero);
	}
	public void removerTe(int numero){
		getTesALaVenta().remove(numero);
	}
	public void removerQueque(int numero){
		getQuequesALaVenta().remove(numero);
	}
	public void despedirTrabajador(int numero){getTrabajadores().remove(numero);}
	public void borrarCliente(int numero){getClientes().remove(numero);}
	public void buscarCafe (Cafe.Tamaño tamaño){
		int numero=0;
		boolean existencia= false;
		for (int i = 0; i < getCafesALaVenta().size(); i++) {
			numero++;
			if(getCafesALaVenta().get(i).getTamaño().equals(tamaño)){
				System.out.println("Hay un cafe "+tamaño+" en la posicion numero "+numero+" del menu");
				existencia=true;
			}
		}
		if (existencia==false){
			System.out.println("No hay cafes "+tamaño+"s");
		}
	}
	public void mostrarCafes() {
		System.out.println("La cafeteria "+getNombre()+" tiene a la venta los siguientes cafes:");
		for (int i = 0; i < getCafesALaVenta().size(); i++) {
			System.out.println(getCafesALaVenta().get(i).toString());
		}
	}
	public void mostrarTrabajadores() {
		System.out.println("La cafeteria "+getNombre()+" tiene los siguientes empleados:");
		for (int i = 0; i < getTrabajadores().size(); i++) {
			System.out.println(getTrabajadores().get(i).toString());
		}
	}
	public void mostrarTes() {
		System.out.println("La cafeteria "+getNombre()+" tiene a la venta los siguientes Tes:");
		for (int i = 0; i < getTesALaVenta().size(); i++) {
			System.out.println(getTesALaVenta().get(i).toString());
		}
	}
	public void mostrarQueques() {
		System.out.println("La cafeteria "+getNombre()+" tiene a la venta los siguientes queques:");
		for (int i = 0; i < getQuequesALaVenta().size(); i++) {
			System.out.println(getQuequesALaVenta().get(i).toString());
		}
	}
	public void mostrarVentas(Cafeteria cafeteria){
		GestorVentas.leerArchivoVentas("src/main/java/datos/ventas.txt",cafeteria);
	}


	public String toString(){
		return "modelo " +getNombre()+" con direccion "+ getDireccion()+ " y redes sociales en "+getRedesSociales();
	}
}