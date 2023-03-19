package entities;

public class Dvd extends Item {

    String movieGenre;
    int movieMinutesDuration;

    public Dvd(String title, String author, String movieGenre, int movieMinutesDuration) {
        super(title, author);
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

}
