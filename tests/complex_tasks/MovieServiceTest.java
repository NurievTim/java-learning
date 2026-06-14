package complex_tasks;

import complex_tasks.task4.Movie;
import complex_tasks.task4.MovieService;
import complex_tasks.task4.Rating;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MovieServiceTest {
    @Test
    public void testGetAverageMovieRatingDouble() {
        MovieService<Double> service = new MovieService<>();
        Movie movie = new Movie("Fury");
        service.addRatingToMovie(movie, new Rating<>(0.1));
        service.addRatingToMovie(movie, new Rating<>(5.4));
        service.addRatingToMovie(movie, new Rating<>(9.9));

        assertEquals(5.2, service.getAverageRatingByMovie(movie));
    }

    @Test
    public void testGetAverageMovieRatingInt() {
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Fury");
        service.addRatingToMovie(movie, new Rating<>(6));
        service.addRatingToMovie(movie, new Rating<>(3));
        service.addRatingToMovie(movie, new Rating<>(9));

        assertEquals(6, service.getAverageRatingByMovie(movie));
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.2, 0.0, 10.1})
    public void testAddRatingToMovieIncorrectDoubleThrowException(double rating) {
        MovieService<Double> service = new MovieService<>();
        Movie movie = new Movie("Fury");

        assertThrows(IllegalArgumentException.class, () -> service.addRatingToMovie(movie, new Rating<>(rating)));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 0, 11})
    public void testAddRatingToMovieIncorrectIntThrowException(int rating) {
        MovieService<Integer> service = new MovieService<>();
        Movie movie = new Movie("Fury");

        assertThrows(IllegalArgumentException.class, () -> service.addRatingToMovie(movie, new Rating<>(rating)));
    }

    @Test
    public void testGetSortedMoviesByRating() {
        MovieService<Double> service = new MovieService<>();
        Movie movie1 = new Movie("Fury");
        Movie movie2 = new Movie("Pulp Fiction");
        service.addRatingToMovie(movie1, new Rating<>(8.5));
        service.addRatingToMovie(movie2, new Rating<>(7.6));
        service.addRatingToMovie(movie1, new Rating<>(8.1));
        service.addRatingToMovie(movie2, new Rating<>(4.3));

        assertEquals(List.of(movie1, movie2), service.getSortedMoviesByRating());
    }
}
