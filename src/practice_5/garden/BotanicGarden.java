package practice_5.garden;

public class BotanicGarden {
    private Plant plant;

    public void addPlant(Plant plant) {
        this.plant = plant;
    }

    public void carePlant() {
        plant.careRequirement();
    }
}
