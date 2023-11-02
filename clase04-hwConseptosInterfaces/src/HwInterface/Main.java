package HwInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Producto1", 10.0, "A001"));
        listaProductos.add(new Producto("Producto2", 5.0, "B002"));
        listaProductos.add(new Producto("Producto3", 0.0, "C003"));
        listaProductos.add(new Producto("Producto4", 20.0, "D004"));

        // Comparar productos por precio
        Collections.sort(listaProductos);

        // Aplicar el filtro "Vendible" y mostrar resultados
        Filtrable filtroVendible = new FiltroVendible();

        System.out.println("Productos Vendibles:");
        for (Producto producto : listaProductos) {
            if (filtroVendible.cumpleFiltro(producto)) {
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }
    }
}

