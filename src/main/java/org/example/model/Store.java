package org.example.model;

public class Store {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Kinder", 50, "Oyuncak", "L");
        Coke coke1 = new Coke("Coca Cola", 5, "Cola Zero", true);
        Bread bread1 = new Bread("Ata", 2, "Beyaz Ekmek", "XL");

        ProductForSale[] products = {chocolate1, coke1, bread1};
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product: products){
            product.showDetails();
        }
    }
}