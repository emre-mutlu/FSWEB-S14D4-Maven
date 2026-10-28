package org.example.model;

public class Bread extends ProductForSale{
    private String size;

    public Bread(String type, int price, String description) {
        super(type, price, description);
    }

    public Bread(String type, int price, String description, String size) {
        this(type, price, description);
        this.size = size;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice() +
                ", Desc: " + getDescription() +
                ", Size: " + size);
    }
}
