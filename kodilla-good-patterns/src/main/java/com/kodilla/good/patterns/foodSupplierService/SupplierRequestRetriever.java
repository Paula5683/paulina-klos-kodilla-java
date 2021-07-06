package com.kodilla.good.patterns.foodSupplierService;

public class SupplierRequestRetriever {

    public SupplierRequest retrieve(){
        FoodSupplier foodSupplier = new FoodSupplier("ExtraFoodShop", "Dairy", "Retail");

        return new SupplierRequest(foodSupplier);
    }
}
