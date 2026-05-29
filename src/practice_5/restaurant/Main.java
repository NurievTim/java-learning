package practice_5.restaurant;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish drink = new Drink(300);
        Dish frenchFries = new Hotdish(30);

        menu.addDish(drink);
        menu.addDish(frenchFries);
        menu.describeDish();
    }
}
