package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderRepository implements OrderRepository{

    @Override
    public boolean createOrder(Buyer buyer, Product product, LocalDateTime orderDate) {
        return true;
    }
}
