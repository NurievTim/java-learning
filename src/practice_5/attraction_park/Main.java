package practice_5.attraction_park;

public class Main {
    public static void main(String[] args) {
        Park park = new Park();
        Attraction roller = new AmericanRoller();
        Attraction carousel = new Carousel();

        park.addAttraction(carousel);
        park.manageAttraction();
    }
}
