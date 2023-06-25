package modelo;

import datos.GestorVentas;

import java.util.Random;
public class Cliente {


	private String nombre;
	private int dinero;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre= Nombre;
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int Dinero) {
		this.dinero = Dinero;
	}
	public Cliente(String nombre){
		this.nombre=nombre;
		Random rnum = new Random();
		this.dinero=rnum.nextInt(2000,6000);
	}

	public boolean dineroSuficienteCafe(Cafe cafe){
		if(getDinero()>=cafe.getPrecio()){
			System.out.println("El cliente tiene dinero suficiente");
			return true;
		}else {
			System.out.println("El cliente no tiene dinero suficiente");
			return false;
		}
	}
	public boolean dineroSuficienteTe(Te te){
		if(getDinero()>=te.getPrecio()){
			System.out.println("El cliente tiene dinero suficiente");
			return true;
		}else {
			System.out.println("El cliente no tiene dinero suficiente");
			return false;
		}
	}
	public boolean dineroSuficienteQueque(Queque queque){
		if(getDinero()>=queque.getPrecio()){
			System.out.println("El cliente tiene dinero suficiente");
			return true;
		}else {
			System.out.println("El cliente no tiene dinero suficiente");
			return false;
		}
	}
	public void comprarCafe(Cafe cafe){
		int dinero=getDinero();
		if(dineroSuficienteCafe(cafe)==true){
			dinero=dinero-cafe.getPrecio();
			setDinero(dinero);
			GestorVentas.registrarDato(cafe,"src/main/java/datos/ventas.txt");
			System.out.println("El cliente compró: "+cafe.toString());
		}
	}
	public void comprarTe(Te te){
		int dinero=getDinero();
		if(dineroSuficienteTe(te)==true){
			dinero=dinero-te.getPrecio();
			setDinero(dinero);
			GestorVentas.registrarDato(te,"src/main/java/datos/ventas.txt");
			System.out.println("El cliente compró: "+te.toString());
		}
	}
	public void comprarQueque(Queque queque){
		int dinero=getDinero();
		if(dineroSuficienteQueque(queque)==true){
			dinero=dinero-queque.getPrecio();
			setDinero(dinero);
			GestorVentas.registrarDato(queque,"src/main/java/datos/ventas.txt");
			System.out.println("El cliente compró: "+queque.toString());
		}
	}


	public String toString() {
		return "Cliente "+getNombre()+" tiene un saldo de : "+getDinero();
	}
}