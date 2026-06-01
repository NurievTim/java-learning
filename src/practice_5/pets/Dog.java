package practice_5.pets;

public class Dog extends Pet {
    @Override
    void interact() {
        System.out.println("Собака гуляет");
    }

    @Override
    void feed() {
        System.out.println("Собака ест сухой корм");
    }
}
