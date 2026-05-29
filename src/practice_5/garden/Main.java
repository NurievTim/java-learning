package practice_5.garden;

public class Main {
    public static void main(String[] args) {
        BotanicGarden garden = new BotanicGarden();
        Plant orchid = new Orchid();
        Plant cactus = new Cactus();

        garden.addPlant(cactus);
        garden.carePlant();
    }
}
