package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        Buyer buyer = new Buyer("John", "Smith");
        Product product = new Product("Toothbrush", 3, 20);
        LocalDateTime orderDate = LocalDateTime.of(2021,4,21,14,32);

        return new OrderRequest(buyer,product,orderDate);
    }

}
