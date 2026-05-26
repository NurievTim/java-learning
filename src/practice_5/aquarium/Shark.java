package practice_5.aquarium;

public class Shark extends Creature {
    @Override
    void move() {
        System.out.println("Акула плавает быстро");
    }

    @Override
    void behavior() {
        System.out.println("Акула ведет агрессивно");
    }
}
