package org.example.model;

public class Coke extends ProductForSale{
    private boolean isZero;

    public Coke(String type, int price, String description) {
        super(type, price, description);
    }

    public Coke(String type, int price, String description, boolean isZero) {
        this(type, price, description);
        this.isZero = isZero;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() +
                ", Price: " + getPrice() +
                ", Desc: " + getDescription() +
                ", Zero: " + isZero);
    }
}
