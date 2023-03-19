package entities;

public class Item {

    String title, author;
    boolean available = true;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Item() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "Item {" +
                "Titulo = " + title + '\'' +
                ", Autor = " + author + '\'' +
                ", Disponível = " + available +
                '}';
    }
}
