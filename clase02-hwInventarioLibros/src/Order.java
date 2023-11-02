public class Order {
    private final Book book;
    private final int amount;

    public Order(Book book, int amount) {
        this.book = book;
        this.amount = amount;
    }

    public void processOrder() {
        book.sell(amount);
    }
}

