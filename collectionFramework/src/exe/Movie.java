package exe;

import java.util.Comparator;

public class Movie implements Comparator<Movie> {

    private int rating;
    private String name;
    private int year;

    public Movie(int rating, String name, int year) {
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        return (o1.year - o2.year);
    }
}
