package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public interface OrderService {

    boolean order(Buyer buyer, Product product, LocalDateTime orderDate);
}
