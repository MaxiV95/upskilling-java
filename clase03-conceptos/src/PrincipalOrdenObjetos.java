import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalOrdenObjetos {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Kevin", "Perez", 15));
        personas.add(new Persona("Marcelo", "Rive", 20));
        personas.add(new Persona("Marcelo", "Blanco", 10));
        personas.add(new Persona("Edwin", "Choque", 25));
        personas.add(new Persona("Alexa", "Muñoz", 14));
        personas.add(new Persona("Leonel", "Peña", 12));
        personas.add(new Persona("John", "martin", 30));
        personas.add(new Persona("Arron", "Valdez", 40));
        personas.add(new Persona("William", "Palmer", 35));
        personas.add(new Persona("Maicol", "Master", 5));

        personas.forEach(System.out::println);

        personas.sort(Persona::compareTo);
        System.out.println("-----");
        personas.forEach(System.out::println);

        personas.sort(new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getName().compareTo(o2.getName()) * -1;
            }
        });
        System.out.println("-----");
        personas.forEach(System.out::println);

    }
}
