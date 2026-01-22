package com.code.model;

import java.util.List;

public class Ingredients {
    private Protein protein;
    private Salsa salsa;
    private List<Topping> toppings;
    
    public Ingredients() {
    }

    public Ingredients(Protein protein, Salsa salsa, List<Topping> toppings) {
        this.protein = protein;
        this.salsa = salsa;
        this.toppings = toppings;
    }

    public Protein getProtein() {
        return protein;
    }

    public void setProtein(Protein protein) {
        this.protein = protein;
    }

    public Salsa getSalsa() {
        return salsa;
    }

    public void setSalsa(Salsa salsa) {
        this.salsa = salsa;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Ingredients [protein=" + protein + ", salsa=" + salsa + ", toppings=" + toppings + "]";
    }
}
