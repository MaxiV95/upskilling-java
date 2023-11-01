package HwCirculo;

import java.util.Scanner;

public class MainCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Área y Circunferencia de un Círculo");
        System.out.print("Ingresa el radio del círculo: ");

        double radio = scanner.nextDouble();

        double area = Circulo.calcularArea(radio);
        double circunferencia = Circulo.calcularCircunferencia(radio);

        System.out.println("El área del círculo es: " + area);
        System.out.println("La circunferencia del círculo es: " + circunferencia);

        scanner.close();
    }
}
