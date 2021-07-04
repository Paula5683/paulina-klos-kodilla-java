package com.kodilla.good.patterns.challenges;

public class Product {
    String name;
    int quantity;
    int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return quantity * price;
    }
}
