class CustomException extends Exception {
    // Campos, métodos y constructores personalizados
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            throw new CustomException("Este es un mensaje personalizado.");
        } catch (CustomException e) {
            System.err.println("Excepción capturada: " + e.getMessage());
        }
    }
}