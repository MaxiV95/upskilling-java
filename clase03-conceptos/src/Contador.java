public class Contador {
    private static int count = 0;  // Propiedad estática

    public Contador() {
        count++;  // Incrementa el contador cada vez que se crea una instancia
    }

    public static int getCount() {
        return count;  // Método estático para obtener el contador
    }
}
