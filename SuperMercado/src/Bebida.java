public class Bebida extends Producto{

    Bebida(String nombre, Double precio, Double peso, UnidadDeVenta unidad) {
        super(nombre, precio, peso, unidad);
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+ " /// "+ this.unidad +": "+ this.peso+ " /// Precio: $"+ this.precio;
    }
}
