public class Main {
    public static void main(String[] args) {
        /* Contador c1 = new Contador();
        Contador c2 = new Contador();

        System.out.println("Contador: " + Contador.getCount());
        System.out.println("Contador1: " + c1.getCount());
        System.out.println("Contador2: " + c2.getCount());

        System.out.println("El valor de PI es: " + Constantes.VALOR_PI);

        Circulo circulo1 = new Circulo(5);
        System.out.println("Perimetro de círculo de radio 5: " + circulo1.retornarPerimetro());

        System.out.println();
        Persona persona1 = new Persona("Juan", 23);
        persona1.imprimir();
        if (persona1.esMayor())
            System.out.println("Es mayor de edad " + persona1.retornarNombre());
        else
            System.out.println("No es mayor de edad " + persona1.retornarNombre());

        System.out.println();
        System.out.println("¡Hola, मन्नु होस्, こんにちは"); */

        String str = "Hola, mundo!";

        // Longitud de la cadena
        int longitud = str.length();
        System.out.println("Longitud: " + longitud);

        // Obtener el carácter en una posición específica
        char primerCaracter = str.charAt(0);
        System.out.println("Primer carácter: " + primerCaracter);

        // Concatenación
        String concatenada = str.concat(" Es un buen día.");
        System.out.println("Concatenada: " + concatenada);

        // Subcadena
        String subcadena = str.substring(6, 11);
        System.out.println("Subcadena: " + subcadena);

        // Reemplazo
        String reemplazada = str.replace("mundo", "universo");
        System.out.println("Reemplazada: " + reemplazada);

        System.out.println();

        FuncionalOperacionMatematica suma = (a, b) -> a + b;
        FuncionalOperacionMatematica resta = (a, b) -> a - b;

        System.out.println("Suma: " + suma.operar(10, 5));   // Output: 15
        System.out.println("Resta: " + resta.operar(10, 5)); // Output: 5

        System.out.println();


    }
}