package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class PrawnsDecorator extends AbstractPizzaOrderDecorator{


    protected PrawnsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(40));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + " + prawns";
    }
}
