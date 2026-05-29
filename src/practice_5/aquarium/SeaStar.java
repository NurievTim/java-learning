package practice_5.aquarium;

public class SeaStar extends Creature {
    @Override
    void move() {
        System.out.println("Морская звезда ползает медленно по дну");
    }

    @Override
    void behavior() {
        System.out.println("Морская звезда ведет себя спокойно");
    }
}
