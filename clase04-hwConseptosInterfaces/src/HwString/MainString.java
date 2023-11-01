package HwString;

import java.util.Scanner;

public class MainString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Contar la cantidad de caracteres en la frase
        int cantidadCaracteres = frase.length();
        System.out.println("Cantidad de caracteres en la frase: " + cantidadCaracteres);

        // Verificar si la frase contiene una palabra específica
        System.out.print("Ingresa una palabra a buscar: ");
        String palabraBuscar = scanner.next();

        if (frase.toLowerCase().contains(palabraBuscar.toLowerCase())) {
            System.out.println("La frase contiene la palabra " + palabraBuscar);
        } else {
            System.out.println("La frase no contiene la palabra " + palabraBuscar);
        }

        // Convertir la frase a minúsculas y mayúsculas
        System.out.println("Frase en minúsculas: " + frase.toLowerCase());
        System.out.println("Frase en mayúsculas: " + frase.toUpperCase());

        // Imprimir solo la primera palabra de la frase
        int indiceEspacio = frase.indexOf(" ");
        if (indiceEspacio != -1) {
            String primeraPalabra = frase.substring(0, indiceEspacio);
            System.out.println("Primera palabra de la frase: " + primeraPalabra);
        } else {
            System.out.println("La frase solo tiene una palabra: " + frase);
        }

        // Agregar palabras en cualquier punto de la frase
        System.out.print("Ingresa una palabra para agregar a la frase: ");
        String palabraAgregar = scanner.next();
        System.out.print("Ingresa la posición donde deseas agregar la palabra (número): ");
        int posicionAgregar = scanner.nextInt();
        if(posicionAgregar > cantidadCaracteres) {
            posicionAgregar = cantidadCaracteres;
        }
        if(posicionAgregar < 0) {
            posicionAgregar = 0;
        }
        frase = frase.substring(0, posicionAgregar) + " " + palabraAgregar + " " + frase.substring(posicionAgregar);
        System.out.println("Frase con la palabra agregada: " + frase);

        scanner.close();
    }
}
