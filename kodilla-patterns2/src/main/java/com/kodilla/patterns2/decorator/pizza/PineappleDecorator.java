package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PineappleDecorator extends AbstractPizzaOrderDecorator{


    protected PineappleDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(20));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + pineapple";
    }
}

