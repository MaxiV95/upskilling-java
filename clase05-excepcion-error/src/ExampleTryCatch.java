public class ExampleTryCatch {
    public static int numerador = 10;
    public static Integer denominador = null;
    public static float division;

    public static void main(String[] args) {
        System.out.println("ANTES DE LA DIVISION");
        try {
            division = numerador / denominador;
        } catch (ArithmeticException ex) {
            division = 0; // Si hay una excepción doy valor '0' al atributo 'division'
            System.err.println("Error: " + ex.getMessage());
        } catch (NullPointerException ex) {
            division = 1; // Si hay una excepción es de un null doy valor '0' al atributo 'division'
            System.err.println("Error: " + ex.getMessage());
        } finally {
            System.out.println("División: " + division);
            System.out.println("DESPUES DE LA DIVISION");
        }

        System.out.println();

        try {
            int[] arr = new int[3];
            arr[5] = 10;  // Esto lanzará ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.err.println("Excepción atrapada: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }

    }
}
