package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderRepository {

    boolean createOrder(Buyer buyer, Product product, LocalDateTime orderDate);
}
