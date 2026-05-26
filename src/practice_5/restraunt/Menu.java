package practice_5.restraunt;

public class Menu {
    private Dish dish;

    void addDish(Dish dish) {
        this.dish = dish;
    }

    public void descrideDish() {
        dish.describe();
    }
}
