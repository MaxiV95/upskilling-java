import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/*
CONSIGNA:
Pequeña aplicación de consola de Java que simule un sistema de gestión de libros.
- El libro (la clase que lo represente) debe contener: título, precio y stock en inventario.
- Podemos usar productos estáticos. Una lista de libros estarán disponibles en el inventario inicial.
- Debemos poder realizar el pedido de los libros. Definir una clase Pedido que represente un pedido de un libro en la tienda o biblioteca.
- Podemos hardcodear en el código los arreglos con libros y sus tamaños y luego mostrarlos por consola.
- EXTRA: Definir una interacción con el usuario por consola, utilizando el objeto Scanner
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> inventory = createInventory();
        Collections.sort(inventory);

        while (true) {
            displayInventory(inventory);
            int option = getSelectedOption(scanner);

            if (option == 0) {
                break;
            }

            if (option > 0 && option <= inventory.size()) {
                int quantity = getQuantityToBuy(scanner);

                if (quantity >= 0) {
                    Book selectedBook = inventory.get(option - 1);
                    Order order = new Order(selectedBook, quantity);
                    order.processOrder();
                } else {
                    System.out.println("La cantidad no puede ser negativa. Intente de nuevo.\n");
                }
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        scanner.close();
        System.out.println("Gracias por utilizar el sistema de gestión de libros.");
    }

    private static List<Book> createInventory() {
        return Arrays.asList(
                new Book("Cuento", 20.0, 10),
                new Book("Novela", 15.0, 5),
                new Book("Receta", 30.0, 8)
        );
    }

    private static void displayInventory(List<Book> inventory) {
        System.out.println("\nInventario de libros:");
        for (int i = 0; i < inventory.size(); i++) {
            Book book = inventory.get(i);
            System.out.println(i + 1 + "- " + book.getTitle() + ". Precio: $" + book.getPrice() + ". Stock: " + book.getStock());
        }
    }

    private static int getSelectedOption(Scanner scanner) {
        System.out.print("\nIngrese el número de libro que desea comprar (0 para salir): ");
        return scanner.nextInt();
    }

    private static int getQuantityToBuy(Scanner scanner) {
        int quantity;
        do {
            System.out.print("Ingrese la cantidad que desea comprar: ");
            quantity = scanner.nextInt();
        } while (quantity < 0);

        return quantity;
    }
}
