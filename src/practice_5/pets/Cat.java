package practice_5.pets;

public class Cat extends Pet {
    @Override
    void interact() {
        System.out.println("Кошка играет");
    }

    @Override
    void feed() {
        System.out.println("Кошка ест влажный корм");
    }
}
