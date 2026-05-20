package practice_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford", 1969);
        car.setYear(1970);
        car.print();

        Rectangle rectangle = new Rectangle(12, 13);
        rectangle.setWidth(14);
        System.out.println(rectangle.calculateArea());

        Book book = new Book("Бесы", "Пушкин");
        book.setAuthor("Достаевский");
        book.printInfo();

        BankAccount account1 = new BankAccount("J.Trump", 100);
        account1.deposit(1003);
        account1.withdraw(11);
        account1.printBalance();

        Point point1 = new Point(2, 3);
        point1.setX(4);
        point1.print();

        StudentGroup group1 = new StudentGroup("Аlpha", 31);
        group1.setStudentCount(32);
        group1.printInfo();

        Circle circle = new Circle(43);
        circle.setRadius(50);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher teacher = new Teacher("Галина С.А.", "математика");
        teacher.setSubject("русский");
        teacher.printInfo();

        Product product = new Product("iphone 13", 10000);
        product.setPrice(42000);
        product.applyDiscount(33);
        product.printInfo();

        Laptop laptop = new Laptop("MacBook Air m1", 30000);
        laptop.setPrice(35000);
        laptop.printInfo();
    }
}
