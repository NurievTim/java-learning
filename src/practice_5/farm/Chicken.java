package practice_5.farm;

public class Chicken extends Animal {
    @Override
    void care() {
        System.out.println("Курица требует корм с зерном");
    }

    @Override
    void act() {
        System.out.println("Курица несет яйцо");
    }
}
