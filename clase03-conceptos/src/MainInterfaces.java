import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MainInterfaces {
    public static void main(String[] args) {
        List<Integer> numberList = Arrays.asList(1, 2, 3, 4, 5);
        numberList.stream()
                .map(num -> num * 2) //utiliza interface Function
                .filter(num -> num < 5) //utiliza interface Predicate
                .forEach(num -> System.out.println(num)); //utiliza interface Consumer
        // .forEach(System.out::println); Lambda can be replaced with method reference

        Supplier<Integer> intSupplier = () -> 10; //Definimos interface Supplier
        System.out.println(intSupplier.get());
    }
}
