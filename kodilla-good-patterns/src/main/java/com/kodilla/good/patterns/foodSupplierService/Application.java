package com.kodilla.good.patterns.foodSupplierService;

public class Application {

    public static void main(String[] args) {
        SupplierRequestRetriever supplierRequestRetriever = new SupplierRequestRetriever();
        SupplierRequest supplierRequest = supplierRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ExtraFoodShopSupplier());

        orderProcessor.order(supplierRequest);
    }
}
