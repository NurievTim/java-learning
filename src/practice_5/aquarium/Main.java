package practice_5.aquarium;

public class Main {
    public static void main(String[] args) {
        Aquarium aquarium = new Aquarium();

        Creature star = new SeaStar();
        Creature shark = new Shark();

        aquarium.addCreature(star);
        aquarium.showBehavior();
    }
}
