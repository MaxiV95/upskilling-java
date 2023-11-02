package HwCirculo;

public class Circulo {
    public static final double PI = 3.14159265359;

    public static double calcularArea(double radio) {
        return PI * Math.pow(radio, 2);
    }

    public static double calcularCircunferencia(double radio) {
        return 2 * PI * radio;
    }
}
