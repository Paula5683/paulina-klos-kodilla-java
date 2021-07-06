package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(){
        int orderArea = 10;
        LocalDateTime orderTime = LocalDateTime.of(2021,12,21,12,43);
        boolean isPayed = true;

        return new OrderRequest(orderArea,orderTime, isPayed);
    }
}
