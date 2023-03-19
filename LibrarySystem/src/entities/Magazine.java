package entities;

public class Magazine extends Item {

    private String publisher;
    private int editionNumber;

    public Magazine(String title, String author, String publisher, int editionNumber) {
        super(title, author);
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

}
