package practice_5.aquarium;

public class Aquarium {
    private Creature creature;

    public void addCreature(Creature creature) {
        this.creature = creature;
    }

    public void showBehavior() {
        creature.behavior();
        creature.move();
    }
}
