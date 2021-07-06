package com.kodilla.good.patterns.foodSupplierService;

import java.time.LocalDateTime;

public interface FoodSupplierService {

    boolean process(int orderArea, LocalDateTime orderTime, boolean isPayed);
}
