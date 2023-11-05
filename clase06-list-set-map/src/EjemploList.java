import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EjemploList {
    public static void ejecutarEjemploArrayList() {
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Manzana");
        arrayList.add("Banana");
        arrayList.add(2, "Naranja");

        String primerElemento = arrayList.get(1);
        String segundoElemento = arrayList.get(2);

        for (String element : arrayList) {
            System.out.println("Elemento: " + element);
        }

        boolean contieneNaranja = arrayList.contains("Naranja");
        System.out.println("¿arrayList contiene Naranja? " + contieneNaranja);

        int cantidadElementos = arrayList.size();
        System.out.println("Tamaño arrayList: " + cantidadElementos);
    }

    public static void ejecutarEjemploLinkedList() {
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);
        linkedList.add(25);
        linkedList.add(30);

        linkedList.remove(0); // elimina por indice
        linkedList.remove(Integer.valueOf(20)); // elimina por valor

        System.out.println("Bucle linked list");
        for (Integer num : linkedList) {
            System.out.println("Elemento: " + num);
        }

        boolean contiene20 = linkedList.contains(25);
        System.out.println("¿arrayList contiene num 20? " + contiene20);

        int cantidadElementos = linkedList.size();
        System.out.println("Tamaño linkedList: " + cantidadElementos);
    }
}
