package Modelo;

import java.util.ArrayList;
import java.util.List;

public class CarroDeLaCompra {

    public enum Estado {
        VACIO,
        PREPARADO,
        COMPRADO,
        ANULADO
    }

    private List<Producto> productos;
    private int total;
    private Estado estado;

    public CarroDeLaCompra() {
        this.productos = new ArrayList<>();
        this.total = 0;
        this.estado = Estado.VACIO;
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
        total += producto.getPrecio();
        estado = Estado.PREPARADO;
    }

    public void quitarProducto(int posicion) {
        Producto producto = productos.remove(posicion);
        total -= producto.getPrecio();

        if (productos.isEmpty()) {
            estado = Estado.VACIO;
        }
    }

    public void comprarCarrito() {
        if (productos.isEmpty()) {
            throw new IllegalStateException("No se puede comprar un carrito vacío");
        }
        estado = Estado.COMPRADO;
    }

    public int getTotal() {
        return total;
    }

    public Estado getEstado() {
        return estado;
    }

    public int getNumeroDeProductos() {
        return productos.size();
    }
}
