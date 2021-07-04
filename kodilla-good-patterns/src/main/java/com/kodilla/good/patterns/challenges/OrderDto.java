package com.kodilla.good.patterns.challenges;

public class OrderDto {
    public Buyer buyer;
    public boolean isOrdered;

    public OrderDto(final Buyer buyer, final boolean isOrdered) {
        this.buyer = buyer;
        this.isOrdered = isOrdered;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}
