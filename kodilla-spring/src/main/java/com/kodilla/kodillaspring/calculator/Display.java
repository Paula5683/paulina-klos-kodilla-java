package com.kodilla.kodillaspring.calculator;

import org.springframework.stereotype.Component;

@Component
public final class Display {

    public void displayValue (double val){
        System.out.println(val);
    }
}
