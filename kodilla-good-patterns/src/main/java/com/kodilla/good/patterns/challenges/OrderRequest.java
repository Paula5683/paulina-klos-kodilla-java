package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {
    private final Buyer buyer;
    private final Product product;
    private final LocalDateTime orderDate;

    public OrderRequest(final Buyer buyer, final Product product, final LocalDateTime orderDate) {
        this.buyer = buyer;
        this.product = product;
        this.orderDate = orderDate;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }
}
