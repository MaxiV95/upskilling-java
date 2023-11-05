
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Crear un objeto HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Agregar elementos al HashMap
        hashMap.put("Manzana", 10);
        hashMap.put("Plátano", 5);
        hashMap.put("Naranja", 8);

        // Acceder a un elemento por su clave
        int cantidadManzanas = hashMap.get("Manzana");
        System.out.println("Cantidad de manzanas: " + cantidadManzanas);

        // Verificar si una clave existe en el HashMap
        boolean contienePera = hashMap.containsKey("Pera");
        System.out.println("¿Contiene pera? " + contienePera);

        // Iterar sobre los elementos del HashMap
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            String fruta = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println(fruta + ": " + cantidad);
        }

        // Eliminar un elemento del HashMap
        System.out.println("eliminamos platano");
        hashMap.remove("Plátano");

        // Verificar el tamaño del HashMap
        int tamaño = hashMap.size();
        System.out.println("Tamaño del HashMap: " + tamaño);

        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("\ncreamos treeMap y agremamos Ananá");
        treeMap.put("Ananá", 8);
        treeMap.put("Ananá", 7); // sobreescribe por tener misma key
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            String fruta = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println(fruta + ": " + cantidad);
        }
    }
}
