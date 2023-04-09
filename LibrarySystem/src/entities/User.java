package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class User {

    private String name, email, address;
    private List<Item> borrowedItems = new ArrayList<>();

    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }

}
