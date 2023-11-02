package HwInterface;

public class FiltroVendible implements Filtrable {
    @Override
    public boolean cumpleFiltro(Producto producto) {
        // Es vendible si su precio es mayor a $0.
        return producto.getPrecio() > 0;
    }
}
