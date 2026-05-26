package practice_5.farm;

public class Farm {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
    }

    public void manageAnimal() {
        animal.act();
        animal.care();
    }
}
