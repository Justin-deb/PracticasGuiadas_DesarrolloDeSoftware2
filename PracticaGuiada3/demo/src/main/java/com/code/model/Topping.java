package com.code.model;

import java.util.List;

public class Topping {
    private String name;
    private String quantity;
    private List<String> ingredients;
    
    public Topping() {
    }

    public Topping(String name, String quantity, List<String> ingredients) {
        this.name = name;
        this.quantity = quantity;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Topping [name=" + name + ", quantity=" + quantity + ", ingredients=" + ingredients + "]";
    }
}
