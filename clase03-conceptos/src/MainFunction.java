/*
La interfaz funcional `Function<T, R>` representa una función que toma un argumento
de tipo `T` y devuelve un resultado de tipo `R`. Tiene un método llamado `apply`.
*/
import java.util.function.Function;
public class MainFunction {
    public static void main(String[] args) {
        Function<Integer, String> intToString = num -> "El número es: " + num;

        String result = intToString.apply(42);
        System.out.println(result);  // Output: El número es: 42
    }
}
