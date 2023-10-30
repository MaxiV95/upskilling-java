import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] inventory = createInventory();

        while (true) {
            displayInventory(inventory);
            int option = getSelectedOption(scanner);

            if (option == 0) {
                break;
            }

            if (option > 0 && option <= inventory.length) {
                int quantity = getQuantityToBuy(scanner);

                if (quantity >= 0) {
                    Book selectedBook = inventory[option - 1];
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

    private static Book[] createInventory() {
        return new Book[]{
                new Book("Cuento", 20.0, 10),
                new Book("Novela", 15.0, 5),
                new Book("Receta", 30.0, 8)
        };
    }

    private static void displayInventory(Book[] inventory) {
        System.out.println("\nInventario de libros:");
        for (int i = 0; i < inventory.length; i++) {
            System.out.println(i + 1 + "- " + inventory[i].getTitle() + ". Precio: $" + inventory[i].getPrice() + ". Stock: " + inventory[i].getStock());
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
