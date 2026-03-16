package practice_2;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    String getName() {
        return this.name;
    }

    double getPrice() {
        return this.price;
    }

    void setPrice(double newPrice) {
        this.price = newPrice;
    }

    void applyDiscount(int discount) {
        this.price *= (double)discount/100;
    }

    void printInfo() {
        System.out.println("Товар - " + this.name + ". Цена - " + this.price + " руб.");
    }
}
