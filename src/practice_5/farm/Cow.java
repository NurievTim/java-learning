package practice_5.farm;

public class Cow extends Animal {
    @Override
    void care() {
        System.out.println("Корова нуждается в выпасе");
    }

    @Override
    void act() {
        System.out.println("Корова дает молоко");
    }
}
