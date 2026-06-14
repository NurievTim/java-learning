package complex_tasks.task5;

public class Product {
    public Product(String title, String category, int price) {
        this.title = title;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public int getPrice() {
        return price;
    }

    private final String title;
    private final String category;
    private final int price;
}
