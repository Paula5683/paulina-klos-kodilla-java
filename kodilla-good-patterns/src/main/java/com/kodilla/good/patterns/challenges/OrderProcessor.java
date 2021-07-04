package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private final InformationService informationService;
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService,final OrderService orderService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest.getBuyer(), orderRequest.getProduct(),
                orderRequest.getOrderDate());
        if(isOrdered){
            informationService.inform(orderRequest.getBuyer());
            orderRepository.createOrder(orderRequest.getBuyer(), orderRequest.getProduct(),
                    orderRequest.getOrderDate());
            return new OrderDto (orderRequest.getBuyer(), true);
        }else{
            return new OrderDto(orderRequest.getBuyer(), false);
        }
    }
}
