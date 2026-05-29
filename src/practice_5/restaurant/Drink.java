package practice_5.restaurant;

public class Drink extends Dish {
    private int volume;

    public Drink(int volume) {
        this.volume = volume;
    }

    @Override
    void describe() {
        System.out.println("Это напиток. Объем " + volume);
    }
}
