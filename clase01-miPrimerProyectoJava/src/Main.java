import Auto.AutoDeportivo;
import Auto.AutoFamiliar;
import Auto.Automovil;

public class Main {
    public static void main(String[] args) {
        Automovil autoDeportivo = new AutoDeportivo("Ferrari", "Enzo", 2020);
        Automovil autoDeportivo1 = new AutoDeportivo("Porsche", "911", 2023, true);
        Automovil autoFamiliar = new AutoFamiliar("Toyota", "Camry", 2013, 5);

        System.out.println("Auto 1, marca: " + autoDeportivo.getMarca() + ", modelo: " + autoDeportivo.getModelo() + ", " + esConvertible(autoDeportivo));
        autoDeportivo.acelerar();
        System.out.println();

        System.out.println("Auto 2, marca: " + autoDeportivo1.getMarca() + ", modelo: " + autoDeportivo1.getModelo() + ", " + esConvertible(autoDeportivo1));
        autoDeportivo1.acelerar();
        System.out.println();

        System.out.println("Auto 3, marca: " + autoFamiliar.getMarca() + ", modelo: " + autoFamiliar.getModelo());
        autoFamiliar.acelerar();
        System.out.println();

        Persona maxi = new Persona("Maxi", "Van", 123);
        System.out.println("Nombre: " + maxi.getNombre() + " " + maxi.getApellido() + ". Está: " + maxi.saltar());
    }

    private static String esConvertible(Automovil auto) {
        return auto.isConvertible() ? "Es convertible" : "No es convertible";
    }
}
