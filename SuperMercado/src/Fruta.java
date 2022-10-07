public class Fruta extends Producto{

    Fruta(String nombre, Double precio, Double peso, UnidadDeVenta unidad) {
        super(nombre, precio, peso, unidad);
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+ " /// Precio: $"+ this.precio+ " /// Unidad de venta: " + this.unidad;
    }
}
