package lab14_MovieAnalytics;

public class Movie {
    private final String title;
    private final String genre;
    private final double rating;
    private final int year;

    public Movie(String title, String genre, double rating, int year) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return title + " (" + year + ") - " + rating;
    }
}
