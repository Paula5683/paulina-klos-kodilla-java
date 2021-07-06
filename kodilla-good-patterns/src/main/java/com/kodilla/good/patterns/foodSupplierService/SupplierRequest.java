package com.kodilla.good.patterns.foodSupplierService;

public class SupplierRequest {

    private FoodSupplier foodSupplier;

    public SupplierRequest(final FoodSupplier foodSupplier) {
        this.foodSupplier = foodSupplier;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }
}
