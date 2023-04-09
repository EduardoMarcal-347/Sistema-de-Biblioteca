package entities;

import java.time.LocalDate;

public class Loan {

    private User user;
    private Item item;
    final private LocalDate loanDate = LocalDate.now();
    final private LocalDate returnDate = loanDate.plusDays(45);

    public Loan(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }
}
