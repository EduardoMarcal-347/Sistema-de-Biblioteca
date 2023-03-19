package entities;

public class Book extends Item {

    private int publicationYear, numberPages;
    private String publisher;


    public Book(String title, String author, int publicationYear, int numberPages, String publisher) {
        super(title, author);
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

}
