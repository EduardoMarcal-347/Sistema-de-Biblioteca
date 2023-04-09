package entities;

public class Magazine extends Item {

    private String title, author;
    private boolean available = true;
    private String publisher;
    private int editionNumber;

    public Magazine(String title, String author, String publisher, int editionNumber) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.editionNumber = editionNumber;
    }

    public Magazine() {
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getEditionNumber() {
        return editionNumber;
    }

    public void setEditionNumber(int editionNumber) {
        this.editionNumber = editionNumber;
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
