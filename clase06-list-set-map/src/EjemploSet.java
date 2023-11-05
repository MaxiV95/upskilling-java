import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void ejecutarEjemploSet(Set<String> setPaises) {
        setPaises.add("Argentina");
        setPaises.add("Chile");
        setPaises.add("Brasil");
        boolean seAgrego = setPaises.add("Colombia");
        System.out.println("¿Se agrego elemento?: " + seAgrego);
        System.out.println("\n Mostrando listado set");
        for (String country : setPaises) {
            System.out.println(country);
        }
    }

    public static void mostrarPaises(Set<String> setPaises) {
        Set<String> setPisesOrdenados = new TreeSet<>(setPaises);
        System.out.println("\n Mostrando listado TreeSet");
        System.out.println("conjunto de paises: ");
        for (String country : setPisesOrdenados) {
            System.out.println(country);
        }
    }
}






