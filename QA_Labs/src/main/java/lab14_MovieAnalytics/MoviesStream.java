package lab14_MovieAnalytics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class MoviesStream {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Inception", "Sci-Fi", 8.8, 2010),
                new Movie("Interstellar", "Sci-Fi", 8.6, 2014),
                new Movie("The Dark Knight", "Action", 9.0, 2008),
                new Movie("Tenet", "Sci-Fi", 7.5, 2020),
                new Movie("The Prestige", "Drama", 8.5, 2006),
                new Movie("Memento", "Thriller", 8.4, 2000),
                new Movie("Dunkirk", "War", 7.9, 2017)
        );

        // 1. List all Sci-Fi movies sorted by rating (highest first)
        System.out.println("Sci-Fi movies sorted by rating:");
        movies.stream()
                .filter(m -> m.getGenre().equalsIgnoreCase("Sci-Fi"))
                .sorted(Comparator.comparingDouble(Movie::getRating).reversed())
                .forEach(System.out::println);

        // 2. Get the average rating of all movies released after 2010
        double avgAfter2010 = movies.stream()
                .filter(m -> m.getYear() > 2010)
                .mapToDouble(Movie::getRating)
                .average()
                .orElse(0.0);
        System.out.println("\nAverage rating (after 2010): " + avgAfter2010);

        // 3. Group movies by genre and list the titles in each group
        System.out.println("\nMovies grouped by genre:");
        Map<String, List<String>> titlesByGenre = movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.mapping(Movie::getTitle, Collectors.toList())
                ));
        titlesByGenre.forEach((genre, titles) ->
                System.out.println(genre + " - " + titles));

        // 4. Find the highest-rated movie for each genre
        System.out.println("\nHighest-rated movie per genre:");
        movies.stream()
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.maxBy(Comparator.comparingDouble(Movie::getRating))
                ))
                .forEach((genre, optMovie) ->
                        System.out.println(genre + " - " + optMovie.orElse(null)));

        // 5. Count how many movies have a rating above 8.0
        long countAbove8 = movies.stream()
                .filter(m -> m.getRating() > 8.0)
                .count();
        System.out.println("\nNumber of movies rated above 8.0: " + countAbove8);

        // 6. Create a comma-separated string of all movie titles in alphabetical order
        String titlesCSV = movies.stream()
                .map(Movie::getTitle)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("\nAll movie titles (A–Z):");
        System.out.println(titlesCSV);

        // 7. Produce an IntSummaryStatistics for movie release years
        IntSummaryStatistics yearStats = movies.stream()
                .mapToInt(Movie::getYear)
                .summaryStatistics();
        System.out.println("\nYear statistics: " + yearStats);
    }
}
