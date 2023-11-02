import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrincipalOrdenNumeros {
    public static void main(String[] args) {
        // Generación de N números aleatorios
        // int[] números_ = new int[20];
        Integer[] numeros = new Integer[20];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100) + 1;
        }

        //Conversión de Vector Wrapper Números a Colección
        List<Integer> lista = Arrays.asList(numeros);
        lista.forEach(v -> System.out.print(v + " "));

        // Ordenamiento de Listas
        System.out.println();
        System.out.println("Ordenamiento");
        Collections.sort(lista);
        lista.forEach(v -> System.out.print(v + " "));

    }
}
