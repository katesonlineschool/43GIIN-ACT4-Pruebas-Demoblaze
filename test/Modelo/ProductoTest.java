package Modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ProductoTest {

    @Test
    public void testAñadirUnidadAlAlmacen() {
        Producto producto = new Producto("Samsung Galaxy", 500, "Telefono movil");

        producto.añadirUnidadAlAlmacen();

        assertEquals("El producto debe tener una unidad en almacen", 1, producto.getUnidadesEnAlmacen());
    }

    @Test
    public void testQuitarUnidadDelAlmacen() {
        Producto producto = new Producto("Laptop Lenovo", 800, "Ordenador portatil");
        producto.añadirUnidadAlAlmacen();
        producto.añadirUnidadAlAlmacen();

        producto.quitarUnidadDelAlmacen();

        assertEquals("El producto debe quedar con una unidad en almacen", 1, producto.getUnidadesEnAlmacen());
    }

    @Test
    public void testCompararProductoMasCaro() {
        Producto producto1 = new Producto("MacBook Pro", 1800, "Portatil Apple");
        Producto producto2 = new Producto("Mouse", 25, "Raton inalambrico");

        assertTrue("El MacBook debe ser mas caro que el mouse", producto1.esMasCaroQue(producto2));
        assertFalse("El mouse no debe ser mas caro que el MacBook", producto2.esMasCaroQue(producto1));
    }
}
