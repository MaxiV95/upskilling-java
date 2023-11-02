public class Book implements Comparable<Book>{
    private final String title;
    private final double price;
    private int stock;

    public Book(String title, double price, int stock) {
        this.title = title;
        this.price = price;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    /* public void setTitle(String title) {
        this.title = title;
    } */

    public double getPrice() {
        return price;
    }

    /* public void setPrice(double price) {
        this.price = price;
    } */

    public int getStock() {
        return stock;
    }

    /* public void setStock(int stock) {
        this.stock = stock;
    } */

    public void sell(int amount) {
        if (stock > 0 && amount <= stock) {
            stock -= amount;
            System.out.println("Venta realizada. Stock restante: " + stock);
        } else {
            System.out.println("Stock insuficiente para esta venta.");
        }
    }

    // Implementación del método compareTo para comparar por precio
    @Override
    public int compareTo(Book otroLibro) {
        return this.title.compareTo(otroLibro.title);
    }
}

