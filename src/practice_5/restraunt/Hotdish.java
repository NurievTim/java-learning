package practice_5.restraunt;

public class Hotdish extends Dish {
    private int temperature;

    public Hotdish(int temperature) {
        this.temperature = temperature;
    }

    @Override
    void describe() {
        System.out.println("Это горячее блюдо. Температура " + temperature);
    }
}
