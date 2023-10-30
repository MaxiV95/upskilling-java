package Auto;

public class AutoDeportivo extends Automovil {
    private boolean esConvertible = false;

    public AutoDeportivo() {
        super();
    }

    public AutoDeportivo(String marca, String modelo, int anioFabrication, boolean esConvertible) {
        super(marca, modelo, anioFabrication); // Hereda definiciones
        this.esConvertible = esConvertible;
    }

    public AutoDeportivo(String marca, String modelo, int anioFabrication) {
        super(marca, modelo, anioFabrication); // Hereda definiciones
    }

    @Override // Buena práctica para indicar sobreEscritura
    public void acelerar() {
        System.out.println("Acelerando muy rápido");
    }

    @Override
    public boolean isConvertible() {
        return esConvertible;
    }

    public void setEsConvertible(boolean esConvertible) {
        this.esConvertible = esConvertible;
    }
}
