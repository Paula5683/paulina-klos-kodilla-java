package com.kodilla.good.patterns.foodSupplierService;

public class FoodSupplier {

    private String name;
    private String productType;
    private String quantity;

    public FoodSupplier(String name, String productType, String quantity) {
        this.name = name;
        this.productType = productType;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public String getProductType() {
        return productType;
    }

    public String getQuantity() {
        return quantity;
    }
}
