import java.util.ArrayList;
import java.util.Collections;

public class SuperMercado {

    ArrayList<Producto> productos;

    SuperMercado() {
        productos = new ArrayList<>();
    }

    public void addProductos(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    protected void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
        System.out.println("=============================");
    }

    public String productoMasBarato() {
        ArrayList<Producto> productosSustituto = productos;
        Collections.sort(productosSustituto);
        return productos.get(0).getNombre();
    }

    public String productoMasCaro() {
        ArrayList<Producto> productosSustituto = productos;
        Collections.sort(productosSustituto);
        return productos.get(productosSustituto.size() - 1).getNombre();
    }
}
