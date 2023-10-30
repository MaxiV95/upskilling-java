package Auto;

public class AutoFamiliar extends Automovil {
    private int cantAsientos;

    public AutoFamiliar() {
        super();
    }

    public AutoFamiliar(String marca, String modelo, int anioFabrication, int cantAsientos) {
        super(marca, modelo, anioFabrication); // Hereda definiciones
        this.cantAsientos = cantAsientos;
    }

    @Override // Buena práctica para indicar sobreEscritura
    public void acelerar() {
        System.out.println("Acelerando despacio");
    }

    @Override
    public boolean isConvertible() {
        return false;
    }

    public int isEsConvertible() {
        return cantAsientos;
    }

    public void setEsConvertible(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

}
