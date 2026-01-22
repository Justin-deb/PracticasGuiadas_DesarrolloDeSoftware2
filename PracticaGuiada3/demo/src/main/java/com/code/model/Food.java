package com.code.model;

public class Food{
    private String id;
    private String type;
    private String name;
    private double price;
    private Ingredients ingredients;
    
    public Food() {
    }

    public Food(String id, String type, String name, double price, Ingredients ingredients) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return "Food [id=" + id + ", type=" + type + ", name=" + name + ", price=" + price + ", ingredients="
                + ingredients + "]";
    }
}