package entities;

public class Book extends Item {

    private String title, author;
    private boolean available = true;
    private int publicationYear, numberPages;
    private String publisher;

    public Book(String title, String author, int publicationYear, int numberPages, String publisher) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.numberPages = numberPages;
        this.publisher = publisher;
    }

    public Book() {
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
