package complex_tasks.task4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MovieService<T extends Number> {
    private Map<Movie, List<Rating<T>>> ratedMovies = new ConcurrentHashMap<>();

    private double average(List<Rating<T>> ratings) {
        return ratings.stream()
                .mapToDouble(r -> r.getRating().doubleValue())
                .average()
                .orElse(0.0);
    }

    public synchronized void addRatingToMovie(Movie movie, Rating<T> rating) {
        double ratingValue = rating.getRating().doubleValue();
        if (ratingValue > 0 && ratingValue <= 10) {
            ratedMovies.computeIfAbsent(movie, m -> new ArrayList<>()).add(rating);
        } else throw new IllegalArgumentException("Оценка должна быть > 0 и <= 10");
    }

    public double getAverageRatingByMovie(Movie movie) {
        double average = ratedMovies.entrySet().stream()
                .filter(m -> m.getKey().getMovieName().equalsIgnoreCase(movie.getMovieName()))
                .map(Map.Entry::getValue)
                .flatMap(List::stream)
                .mapToDouble(rating -> rating.getRating().doubleValue())
                .average()
                .orElse(0.0);
        return BigDecimal.valueOf(average).setScale(1, RoundingMode.CEILING).doubleValue();
    }

    public List<Movie> getSortedMoviesByRating() {
        return ratedMovies.entrySet().stream()
                .filter(m -> !m.getValue().isEmpty())
                .sorted((m1, m2) -> Double.compare(
                        average(m2.getValue()),
                        average(m1.getValue())
                ))
                .map(Map.Entry::getKey)
                .toList();
    }
}
