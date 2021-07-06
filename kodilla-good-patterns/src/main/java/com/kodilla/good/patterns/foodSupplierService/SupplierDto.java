package com.kodilla.good.patterns.foodSupplierService;

public class SupplierDto {

    private FoodSupplier foodSupplier;
    private boolean orderSuccess;

    public SupplierDto(final FoodSupplier foodSupplier,final boolean orderSuccess) {
        this.foodSupplier = foodSupplier;
        this.orderSuccess = orderSuccess;
    }

    public FoodSupplier getFoodSupplier() {
        return foodSupplier;
    }

    public boolean isOrderSuccess() {
        return orderSuccess;
    }
}
