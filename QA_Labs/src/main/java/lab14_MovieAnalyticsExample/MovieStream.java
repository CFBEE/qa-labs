package lab14_MovieAnalyticsExample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Optional;

public class MovieStream {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(new Movie("Inception", "Sci-Fi", 8.8, 2010),
                new Movie("Interstellar", "Sci-Fi", 8.6, 2014),
                new Movie("The Dark Knight", "Action", 9.0, 2008),
                new Movie("Tenet", "Sci-Fi", 7.5, 2020),
                new Movie("The Prestige", "Drama", 8.5, 2006),
                new Movie("Memento", "Thriller", 8.4, 2000), new Movie("Dunkirk", "War", 7.9, 2017));

        // 1. List all Sci-Fi movies sorted by rating (highest first)
        System.out.println("1. Sci-Fi movies sorted by rating:");

        movies.stream().filter(m -> m.getGenre().equalsIgnoreCase("Sci-Fi"))
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed()).forEach(System.out::println);

        // 2. Average rating of all movies released after 2010
        System.out.println("\n2. Average rating (after 2010):");

        double avgRating = movies.stream().filter(m -> m.getYear() > 2010)
                .collect(Collectors.averagingDouble(Movie::getRating));

        System.out.println(avgRating);

        // 3. Group movies by genre and list titles
        System.out.println("\n3. Grouped by genre:");

        Map<String, List<String>> moviesByGenre = movies.stream().collect(
                Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.toList())));

        moviesByGenre.forEach((genre, titles) -> System.out.println(genre + " -> " + titles));

        // 4. Highest-rated movie for each genre
        System.out.println("\n4. Highest-rated movie per genre:");

        Map<String, Optional<Movie>> topMoviesByGenre = movies.stream().collect(
                Collectors.groupingBy(Movie::getGenre, Collectors.maxBy(Comparator.comparingDouble(Movie::getRating))));

        topMoviesByGenre.forEach((genre, movieOpt) -> System.out.println(genre + " -> " + movieOpt.orElse(null)));

        // 5. Count movies with rating above 8.0
        System.out.println("\n5. Movies above rating 8.0:");

        long countAbove8 = movies.stream().filter(m -> m.getRating() > 8.0).count();

        System.out.println(countAbove8);

        // 6. Comma-separated titles in alphabetical order
        System.out.println("\n6. Titles (alphabetical):");
        String titlesString = movies.stream().map(Movie::getTitle).sorted().collect(Collectors.joining(", "));
        System.out.println(titlesString);

        // 7. IntSummaryStatistics for release years
        System.out.println("\n7. Year statistics:");
        IntSummaryStatistics stats = movies.stream().mapToInt(Movie::getYear).summaryStatistics();
        System.out.println(stats);
    }
}

class Movie {
    String title;
    String genre;
    double rating;
    int year;

    public Movie(String title, String genre, double rating, int year) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") - " + rating;
    }
}
