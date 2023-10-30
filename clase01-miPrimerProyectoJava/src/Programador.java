public class Programador extends Persona {
    private int edad;

    public Programador() {
    }

    public Programador(String nombre, String apellido, int dni, int edad) {
        super(nombre, apellido, dni); // Hereda definiciones
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
