package Modelo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarroDeLaCompraTest {

    @Test
    public void testAñadirProductoAlCarritoAumentaTotal() {
        CarroDeLaCompra carro = new CarroDeLaCompra();
        Producto producto = new Producto("Samsung Galaxy", 500, "Telefono movil");

        carro.añadirProducto(producto);

        assertEquals("El total del carrito debe ser 500", 500, carro.getTotal());
        assertEquals("El carrito debe tener un producto", 1, carro.getNumeroDeProductos());
        assertEquals("El carrito debe quedar en estado PREPARADO", CarroDeLaCompra.Estado.PREPARADO, carro.getEstado());
    }

    @Test
    public void testComprarCarritoCambiaEstadoAComprado() {
        CarroDeLaCompra carro = new CarroDeLaCompra();
        Producto producto = new Producto("Laptop Dell", 900, "Ordenador portatil");

        carro.añadirProducto(producto);
        carro.comprarCarrito();

        assertEquals("El carrito debe quedar en estado COMPRADO", CarroDeLaCompra.Estado.COMPRADO, carro.getEstado());
    }
}