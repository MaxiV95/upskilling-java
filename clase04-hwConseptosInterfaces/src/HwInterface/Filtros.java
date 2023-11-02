package HwInterface;

public class Filtros {
    public static Filtrable vendible() {
        return producto -> producto.getPrecio() > 0;
    }

    public static Filtrable descartable() {
        return producto -> {
            String codigo = producto.getCodigo();
            if (codigo != null && !codigo.isEmpty()) { // verificación nulo o vació
                char primeraLetra = codigo.charAt(0);
                return primeraLetra == 'A' || primeraLetra == 'B';
            }
            return false;
        };
    }

    public static Filtrable imperecedero() throws Exception {
        try {
            return producto -> producto.getCodigo().equals("10");
        } catch (Exception e) {
            return (Filtrable) new Exception("No es imperecedero");
        }
    }
}
