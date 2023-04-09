package entities;

public abstract class Item {

    private String title, author;
    private boolean available = true;

    public abstract String getTitle();

    public abstract void setTitle(String title);

    public abstract String getAuthor();

    public abstract void setAuthor(String author);

    public abstract boolean isAvailable();

    public abstract void setAvailable(boolean available);

}
