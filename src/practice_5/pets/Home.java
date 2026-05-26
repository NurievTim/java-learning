package practice_5.pets;

public class Home {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
    }

    public void interactPet() {
        pet.interact();
        pet.feed();
    }
}
