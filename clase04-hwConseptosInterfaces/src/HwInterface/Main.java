package HwInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

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

        System.out.println("Productos ordenados por precio:");
        for (Producto producto : listaProductos) {
            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
        }

        // Filtrar productos según los filtros definidos

        Filtrable vendible = Filtros.vendible();
        System.out.println("\nProductos vendibles:");
        for (Producto producto : listaProductos) {
            if (vendible.cumpleFiltro(producto)) {
                System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio());
            }
        }

        Filtrable descartable = Filtros.descartable();
        System.out.println("\nProductos descartables:");
        for (Producto producto : listaProductos) {
            if (descartable.cumpleFiltro(producto)) {
                System.out.println("Nombre: " + producto.getNombre() + ", Código: " + producto.getCodigo());
            }
        }

        try {
            Filtrable imperecedero = Filtros.imperecedero();
            System.out.println("\nProductos imperecederos:");
            for (Producto producto : listaProductos) {
                if (imperecedero.cumpleFiltro(producto)) {
                    System.out.println("Nombre: " + producto.getNombre());
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

