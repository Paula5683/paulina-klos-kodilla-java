package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public class HealthyShopSupplier implements FoodSupplierService{

    @Override
    public boolean process(int orderArea, LocalDateTime orderTime, boolean isPayed) {
        return isPayed;
    }
}
