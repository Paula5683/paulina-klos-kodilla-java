package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify (String text, PoemDecorator poemDecorator){
        System.out.println("Before decorate: " + text);
        String result = poemDecorator.decorate(text);
        System.out.println("After decorate: " + result);
    }
}
