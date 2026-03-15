package practice_2;

public class Main {
    public static void main(String[] args) {
        Car mustang = new Car("Ford", 1969);
        mustang.setYear(1970);
        mustang.print();

        Rectangle rectangle = new Rectangle(12, 24);
        rectangle.setWidth(25);
        rectangle.calculateArea();

        Book book1 = new Book("Бесы", "Пушкин");
        book1.setAuthor("Dostaevsy");
        book1.printInfo();
    }
}
