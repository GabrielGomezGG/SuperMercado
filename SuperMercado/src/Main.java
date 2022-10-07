import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        SuperMercado supermercado = new SuperMercado();

        supermercado.addProductos(new Bebida("Cola-Cola Zero", 20.0, 1.5, UnidadDeVenta.Litros));
        supermercado.addProductos(new Bebida("Cola-Cola", 18.0, 1.5, UnidadDeVenta.Litros));
        supermercado.addProductos(new Limpieza("Shampoo Sedal", 19.0, 500.0, UnidadDeVenta.ml));
        supermercado.addProductos(new Fruta("Frutillas", 64.0, 5.0, UnidadDeVenta.kilo));

        supermercado.mostrarProductos();
        System.out.println("Producto más caro: "+supermercado.productoMasCaro());
        System.out.println("Producto más barato: "+supermercado.productoMasBarato());

    }
}
