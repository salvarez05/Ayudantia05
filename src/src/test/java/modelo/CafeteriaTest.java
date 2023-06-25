package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeteriaTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void agregarCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Pequeño,4);
        assertEquals(2,cafeteriaTest.getCafesALaVenta().size());
    }

    @Test
    void agregarTrabajador() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaTest.agregarTrabajador("Tomas", Trabajador.Tipo.Cocinero,450000);
        assertEquals(2,cafeteriaTest.getTrabajadores().size());
    }

    @Test
    void agregarTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        assertEquals(2,cafeteriaTest.getTesALaVenta().size());

    }

    @Test
    void agregarQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        assertEquals(2,cafeteriaTest.getQuequesALaVenta().size());

    }

    @Test
    void agregarCliente() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCliente("a");
        cafeteriaTest.agregarCliente("b");
        assertEquals(2,cafeteriaTest.getClientes().size());

    }

    @Test
    void removerCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Pequeño,4);
        assertEquals(2,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.removerCafe(0);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());

    }

    @Test
    void removerTe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        assertEquals(2,cafeteriaTest.getTesALaVenta().size());
        cafeteriaTest.removerTe(0);
        assertEquals(1,cafeteriaTest.getTesALaVenta().size());
    }

    @Test
    void removerQueque() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        assertEquals(2,cafeteriaTest.getQuequesALaVenta().size());
        cafeteriaTest.removerQueque(0);
        assertEquals(1,cafeteriaTest.getQuequesALaVenta().size());
    }

    @Test
    void despedirTrabajador() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTrabajador("Juan", Trabajador.Tipo.Barista,420000);
        cafeteriaTest.agregarTrabajador("Tomas", Trabajador.Tipo.Cocinero,450000);
        assertEquals(2,cafeteriaTest.getTrabajadores().size());
        cafeteriaTest.despedirTrabajador(0);
        assertEquals(1,cafeteriaTest.getTrabajadores().size());
    }
    @Test
    void borrarCliente(){
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCliente("a");
        cafeteriaTest.agregarCliente("b");
        assertEquals(2,cafeteriaTest.getClientes().size());
        cafeteriaTest.borrarCliente(0);
        assertEquals(1,cafeteriaTest.getClientes().size());
    }

    @Test
    void buscarCafe() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Grande,4);
        cafeteriaTest.buscarCafe(Cafe.Tamaño.Pequeño);
        assertEquals(2,cafeteriaTest.getCafesALaVenta().size());
        cafeteriaTest.removerCafe(0);
        cafeteriaTest.buscarCafe(Cafe.Tamaño.Pequeño);
        assertEquals(1,cafeteriaTest.getCafesALaVenta().size());
    }

    @Test
    void mostrarCafes() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarCafe("a",1,2, Cafe.Tamaño.Pequeño,3);
        cafeteriaTest.agregarCafe("b",2,3, Cafe.Tamaño.Pequeño,4);
        cafeteriaTest.mostrarCafes();
    }

    @Test
    void mostrarTrabajadores() {
    }
    @Test
    void mostrarTes() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarTe("Manzanilla",200,"Leve",Te.Tamaño.Mediano,1500);
        cafeteriaTest.agregarTe("Manzanilla",300,"Leve",Te.Tamaño.Grande,2000);
        cafeteriaTest.mostrarTes();
    }

    @Test
    void mostrarQueques() {
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.agregarQueque("kuchen", Queque.Tamaño.Pequeño,"vainilla",2000);
        cafeteriaTest.mostrarQueques();
    }
    @Test
    void mostrarVentas(){
        Cafeteria cafeteriaTest = new Cafeteria("test","1","r");
        cafeteriaTest.mostrarVentas(cafeteriaTest);
    }
}