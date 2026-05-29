package practice_5.pets;

public class Main {
    public static void main(String[] args) {
        Home home = new Home();
        Pet cat = new Cat();
        home.addPet(cat);
        home.interactPet();
    }
}
