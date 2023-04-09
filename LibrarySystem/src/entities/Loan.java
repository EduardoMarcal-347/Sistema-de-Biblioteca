package entities;

import java.time.LocalDate;
import java.util.Iterator;

public class Loan {

    private User user;
    private Item item;
    final private LocalDate loanDate = LocalDate.now();
    final private LocalDate maxReturnDate = loanDate.plusDays(45);
    private LocalDate returnDate;

    public Loan(User user, Item item) {
        this.user = user;
        this.item = item;
    }

    public Loan() {
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

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public LocalDate getMaxReturnDate() {
        return maxReturnDate;
    }

    public void borrowItem (){
        if(item.isAvailable()) {
            user.getBorrowedItems().add(item);
            item.setAvailable(false);
            showBorrowedItems();
        } else System.out.println("O item " +item.getTitle()+ " nao esta disponivel");
    }

    public void returnItem (Item item) {
        user.getBorrowedItems().removeIf(object -> {
            try {
                return object.equals(item);
            } catch (Exception e) {
                System.out.println("Removing item error");
                e.printStackTrace();
                return false;
            }
        });
        showBorrowedItems();
    }

    public void showBorrowedItems(){
        Iterator<Item> iterator = user.getBorrowedItems().listIterator();
        System.out.println("Lista de Itens Emprestados para " +user.getName()+ ":");
        while (iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }

}
