package practice_5.attraction_park;

public class Park {
    private Attraction attraction;

    public void addAttraction(Attraction attraction) {
        this.attraction = attraction;
    }

    public void manageAttraction() {
        attraction.showAttractionInfo();
    }
}
