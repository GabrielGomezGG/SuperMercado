public class Limpieza extends Producto {

    public Limpieza(String nombre, Double precio, Double peso, UnidadDeVenta unidad) {
        super(nombre, precio, peso, unidad);
    }

    @Override
    public String toString() {
        return "Nombre: "+ this.nombre+ " /// Contenido: "+ this.peso+ this.unidad+ " /// Precio: "+this.precio;
    }
}
