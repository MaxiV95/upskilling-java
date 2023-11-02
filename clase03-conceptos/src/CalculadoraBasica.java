public class CalculadoraBasica implements CalculadoraSumar, CalculadoraRestar {
    @Override
    public int sumar(int a, int b) {
        return a + b;
    }

    @Override
    public int restar(int a, int b) {
        return a - b;
    }
}
