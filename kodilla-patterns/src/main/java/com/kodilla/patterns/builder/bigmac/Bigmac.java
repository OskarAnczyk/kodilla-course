package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public final class Bigmac {
    private String bun;
    private int burgers;
    private Sauces sauce;
    private List<Ingredients> ingredients;

    private Bigmac(String bun, int burgers, Sauces sauce, List<Ingredients> ingredients) {
        this.bun = bun;
        this.burgers = burgers;
        this.sauce = sauce;
        this.ingredients = ingredients;
    }

    public static class BigmacBuilder{
        private String bun;
        private int burgers;
        private Sauces sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder bun(String bun){
            this.bun = bun;
            return this;
        }

        public BigmacBuilder burgers(int burgers){
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(Sauces sauce){
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(Ingredients ingredient){
            this.ingredients.add(ingredient);
            return this;
        }

        public Bigmac build(){
            return new Bigmac(this.bun,this.burgers,this.sauce,this.ingredients);
        }
    }

    public String getBun() {
        return bun;
    }

    public int getBurgers() {
        return burgers;
    }

    public Sauces getSauce() {
        return sauce;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString(){
        return "BigMac{" +
                "bun ='" + this.bun + '\'' +
                ", burgers ='" + this.burgers + '\'' +
                ", sauce ='" + this.sauce + '\'' +
                ", ingredients ='" + this.ingredients +
                '}';
    }
}
