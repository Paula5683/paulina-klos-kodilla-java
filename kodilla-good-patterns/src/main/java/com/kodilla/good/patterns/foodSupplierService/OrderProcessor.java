package com.kodilla.good.patterns.foodSupplierService;

public class OrderProcessor {

    private FoodSupplierService foodSupplierService;
    private OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    private OrderRequest orderRequest = orderRequestRetriever.retrieve();

    public OrderProcessor(final FoodSupplierService foodSupplierService) {
        this.foodSupplierService = foodSupplierService;
    }
    public SupplierDto order(final SupplierRequest supplierRequest){
        boolean orderSuccess = foodSupplierService.process(orderRequest.getOrderArea(),orderRequest.getOrderTime(),
                orderRequest.isPayed());
        if (orderSuccess){
            System.out.println("Order has been completed");
            return new SupplierDto(supplierRequest.getFoodSupplier(), true);
        }else{
            System.out.println("Order has been rejected");
            return new SupplierDto(supplierRequest.getFoodSupplier(), false);
        }
    }
}
