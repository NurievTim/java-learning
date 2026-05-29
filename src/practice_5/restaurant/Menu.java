package practice_5.restaurant;

public class Menu {
    private Dish dish;

    void addDish(Dish dish) {
        this.dish = dish;
    }

    public void describeDish() {
        dish.describe();
    }
}
