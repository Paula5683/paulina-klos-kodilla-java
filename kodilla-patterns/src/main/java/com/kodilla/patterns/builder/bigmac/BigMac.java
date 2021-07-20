package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BigMac {

    private final String bun;
    private final int burgers;
    private final String sauce;
    private List<String> ingredients;

    private static final List<String> INGREDIENTS = Arrays.asList("SALAD", "ONION", "BEACON", "CUCUMBER",
            "CHILLI", "MUSHROOMS", "CHEESE", "SHRIMPS");

    public static class BigMacBuilder{

        private String bun;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BigMacBuilder bun (String bun){
            this.bun = bun;
            return this;
        }
        public BigMacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }
        public BigMacBuilder sauce (String sauce){
            this.sauce = sauce;
            return this;
        }
        public BigMacBuilder ingredient(String ingredient){
            if(INGREDIENTS.contains(ingredient)){
                ingredients.add(ingredient);
            }else {
                throw new IllegalStateException("Ingredient not available");
            }
            return this;
        }
        public BigMac build(){
            return new BigMac(bun, burgers, sauce, ingredients);
        }
    }

    private BigMac(final String bun,final int burgers,final String sauce, final List<String> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = new ArrayList<>(ingredients);
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public String getSauce() {
        return sauce;
    }

    public List<String> getIngredients() {
        return ingredients;

    }

    @Override
    public String toString() {
        return "BigMac{" +
                "bun='" + bun + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }
}
