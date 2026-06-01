package practice_5.zoo;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Animal bird = new Bird();
        Animal elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.showBehavior();
    }
}
