package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService{

    public boolean order(final Buyer buyer, final Product product, final LocalDateTime orderDate){
        System.out.println("Order: " + product.getName() + " ,quantity: " + product.getQuantity() +
                " for: " + buyer.getName() + " " + buyer.getLastName() + ". Price: " + product.getPrice() +
                ". Date of order: " + orderDate.toString());
        return true;
    }
}
