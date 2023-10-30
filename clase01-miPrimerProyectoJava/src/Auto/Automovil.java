package Auto;

public abstract class Automovil {
    private String marca;
    private String modelo;
    private int anioFabrication;

    public Automovil() {
    }

    public Automovil(String marca, String modelo, int anioFabrication) {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabrication = anioFabrication;
    }

    public abstract void acelerar();

    public abstract boolean isConvertible();

    public String frenar() {
        return "Frenando";
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnioFabrication() {
        return anioFabrication;
    }

    public void setAnioFabrication(int anioFabrication) {
        this.anioFabrication = anioFabrication;
    }
}
