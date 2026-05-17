package Modelo;

public class Producto {

    private String nombre;
    private int precio;
    private String descripcion;
    private int unidadesEnAlmacen;

    public Producto(String nombre, int precio, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.unidadesEnAlmacen = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(int precio) {
        if (precio < 0) {
            throw new IllegalArgumentException("El precio no puede ser negativo");
        }
        this.precio = precio;
    }

    public int getUnidadesEnAlmacen() {
        return unidadesEnAlmacen;
    }

    public void añadirUnidadAlAlmacen() {
        unidadesEnAlmacen++;
    }

    public void quitarUnidadDelAlmacen() {
        if (unidadesEnAlmacen <= 0) {
            throw new IllegalStateException("No hay unidades disponibles en almacén");
        }
        unidadesEnAlmacen--;
    }

    public boolean esMasCaroQue(Producto otroProducto) {
        return this.precio > otroProducto.getPrecio();
    }
}