package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public class OrderRequest {

    private int OrderArea;
    private LocalDateTime orderTime;
    private boolean isPayed;

    public OrderRequest(final int orderArea,final LocalDateTime orderTime,final boolean isPayed) {
        OrderArea = orderArea;
        this.orderTime = orderTime;
        this.isPayed = isPayed;
    }

    public int getOrderArea() {
        return OrderArea;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }

    public boolean isPayed() {
        return isPayed;
    }
}
