public class Producto implements Comparable<Producto>{

    protected String nombre;
    protected Double peso;
    protected Double precio;
    protected UnidadDeVenta unidad;

    Producto(String nombre, Double precio, Double peso, UnidadDeVenta unidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.unidad = unidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public UnidadDeVenta getUnidad() {
        return unidad;
    }

    public void setUnidad(UnidadDeVenta unidad) {
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }
    public Double getPrecio() {
        return precio;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.precio.compareTo(producto.getPrecio());
    }
}
