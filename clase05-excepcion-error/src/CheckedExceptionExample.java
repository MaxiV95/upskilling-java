import java.io.IOException;
public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            // Intenta ejecutar código que puede lanzar una excepción
            throw new IOException("Error de E/S");
        } catch (IOException e) {
            // Maneja la excepción
            System.err.println("Excepción atrapada: " + e.getMessage());
        }
    }
}