package practice_5.restraunt;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();

        Dish drink = new Drink(300);
        Dish frenchFries = new Hotdish(30);

        menu.addDish(frenchFries);
        menu.descrideDish();
    }
}
