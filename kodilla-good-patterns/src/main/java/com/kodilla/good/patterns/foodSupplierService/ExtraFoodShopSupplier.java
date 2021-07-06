package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public class ExtraFoodShopSupplier implements FoodSupplierService{

    @Override
    public boolean process(int orderArea, LocalDateTime orderTime, boolean isPayed) {
        return orderTime.getHour()<15 && isPayed;
    }
}
