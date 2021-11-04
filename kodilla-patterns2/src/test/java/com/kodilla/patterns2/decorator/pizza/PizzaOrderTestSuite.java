package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.*;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaOrderGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(15), pizzaCost);
    }

    @Test
    public void testBasicPizzaOrderGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce", desc);
    }

    @Test
    public void testPizzaWithExtraCheeseGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(20), pizzaCost);
    }

    @Test
    public void testPizzaWithExtraCheeseGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + extra cheese", desc);
    }

    @Test
    public void testPizzaWithPineappleGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(35), pizzaCost);
    }
    @Test
    public void testPizzaWithPineappleGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + pineapple", desc);
    }

    @Test
    public void testPizzaWithMushroomsGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(30), pizzaCost);
    }

    @Test
    public void testPizzaWithMushroomsGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + mushrooms", desc);
    }

    @Test
    public void testPizzaWithPrawnsGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(55), pizzaCost);
    }
    @Test
    public void testPizzaWithPrawnsGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + prawns", desc);
    }

    @Test
    public void testPizzaWithMushroomsAndPineappleGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(50), pizzaCost);
    }

    @Test
    public void testPizzaWithMushroomsAndPineappleGetDescription(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + mushrooms + pineapple", desc);
    }
    @Test
    public void testPizzaWithExtraCheeseAndPrawnsGetPrice() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(60), pizzaCost);
    }
    @Test
    public void testPizzaWithExtraCheeseAndPrawnsGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + extra cheese + prawns", desc);
    }
    @Test
    public void testComboPizzaGetPrice(){
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        BigDecimal pizzaCost = pizzaOrder.getPrice();
        //Then
        assertEquals(new BigDecimal(95), pizzaCost);
    }
    @Test
    public void testComboPizzaGetDescription() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizzaOrder();
        pizzaOrder = new PizzaWithExtraCheeseDecorator(pizzaOrder);
        pizzaOrder = new MushroomsDecorator(pizzaOrder);
        pizzaOrder = new PineappleDecorator(pizzaOrder);
        pizzaOrder = new PrawnsDecorator(pizzaOrder);
        //When
        String desc = pizzaOrder.getDescription();
        //Then
        assertEquals("Pizza with cheese and tomato sauce + extra cheese + mushrooms + pineapple + prawns", desc);
    }
}
