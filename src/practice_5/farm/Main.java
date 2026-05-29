package practice_5.farm;

public class Main {
    public static void main(String[] args) {
        Farm farm = new Farm();
        Animal chicken = new Chicken();
        Animal cow = new Cow();

        farm.addAnimal(chicken);
        farm.manageAnimal();

    }
}
