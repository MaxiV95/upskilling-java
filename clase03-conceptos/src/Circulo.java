public class Circulo {
    private final double PI = 3.14159265358979323846;
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double retornarPerimetro() {
        return 2 * PI * radio;
    }
}