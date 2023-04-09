package entities;

public class Dvd extends Item {

    private String title, author;
    private boolean available = true;
    private String movieGenre;
    private int movieMinutesDuration;

    public Dvd(String title, String author, String movieGenre, int movieMinutesDuration) {
        this.title = title;
        this.author = author;
        this.movieGenre = movieGenre;
        this.movieMinutesDuration = movieMinutesDuration;
    }

    public Dvd() {
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public void setMovieGenre(String movieGenre) {
        this.movieGenre = movieGenre;
    }

    public int getMovieMinutesDuration() {
        return movieMinutesDuration;
    }

    public void setMovieMinutesDuration(int movieMinutesDuration) {
        this.movieMinutesDuration = movieMinutesDuration;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean isAvailable() {
        return available;
    }

    @Override
    public void setAvailable(boolean available) {
        this.available = available;
    }

}
