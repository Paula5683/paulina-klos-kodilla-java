package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public class GlutenFreeShopSupplier implements FoodSupplierService{

    @Override
    public boolean process(int orderArea, LocalDateTime orderTime, boolean isPayed) {
        return orderArea <= 20;
    }
}
