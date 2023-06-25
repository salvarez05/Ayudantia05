package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void dineroSuficienteCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano, 1300);
        cafeteriaTest.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño,1000);
        cafeteriaTest.agregarCafe("latte",20,200, Cafe.Tamaño.Grande,1600);
        Cliente clienteTest = new Cliente("a");
        clienteTest.setDinero(1200);
        assertTrue(clienteTest.dineroSuficienteCafe(cafeteriaTest.getCafesALaVenta().get(1)));
        assertFalse(clienteTest.dineroSuficienteCafe(cafeteriaTest.getCafesALaVenta().get(0)));
    }

    @Test
    void dineroSuficienteTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        Cliente clienteTest = new Cliente("a");
        clienteTest.setDinero(1600);
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        assertTrue(clienteTest.dineroSuficienteTe(cafeteriaTest.getTesALaVenta().get(0)));
        assertFalse(clienteTest.dineroSuficienteTe(cafeteriaTest.getTesALaVenta().get(1)));
    }

    @Test
    void dineroSuficienteQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Mediano,"vainilla",2500);
        Cliente clienteTest = new Cliente("a");
        clienteTest.setDinero(2400);
        assertTrue(clienteTest.dineroSuficienteQueque(cafeteriaTest.getQuequesALaVenta().get(0)));
        assertFalse(clienteTest.dineroSuficienteQueque(cafeteriaTest.getQuequesALaVenta().get(1)));

    }

    @Test
    void comprarCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("moccha",20,150, Cafe.Tamaño.Mediano, 1300);
        cafeteriaTest.agregarCafe("latte",15,100, Cafe.Tamaño.Pequeño,1000);
        cafeteriaTest.agregarCafe("latte",20,200, Cafe.Tamaño.Grande,1600);
        Cliente clienteTest = new Cliente("a");
        int dineroInicial=clienteTest.getDinero();
        clienteTest.comprarCafe(cafeteriaTest.getCafesALaVenta().get(1));
        int dineroFinal=clienteTest.getDinero();
        assertTrue(dineroInicial>dineroFinal);
    }

    @Test
    void comprarTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        Cliente clienteTest = new Cliente("a");
        int dineroInicial=clienteTest.getDinero();
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        clienteTest.comprarTe(cafeteriaTest.getTesALaVenta().get(0));
        int dineroFinal=clienteTest.getDinero();
        assertTrue(dineroInicial>dineroFinal);

    }

    @Test
    void comprarQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Mediano,"vainilla",2500);
        Cliente clienteTest = new Cliente("a");
        int dineroInicial=clienteTest.getDinero();
        clienteTest.comprarQueque(cafeteriaTest.getQuequesALaVenta().get(0));
        int dineroFinal=clienteTest.getDinero();
        assertTrue(dineroInicial>dineroFinal);
    }
}