package complex_tasks.task4;

public class Rating<T extends Number> {
    public Rating(T rating) {
        this.rating = rating;
    }

    public T getRating() {
        return rating;
    }

    private final T rating;
}
