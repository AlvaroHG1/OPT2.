package com.example.opt2new;

import java.util.ArrayList;

public class Gerecht {
    private String naam;
    Dieet dieet;
    private int calorie;

    ArrayList<Ingredient> ingredientenGerecht = new ArrayList<>();

    public Gerecht(String naam, Dieet dieet, int calorie) {
        this.naam = naam;
        this.dieet = dieet;
        this.calorie = calorie;
    }
    public void addIngredient(Ingredient ingredient) {
        ingredientenGerecht.add(ingredient);
    }
    public String getNaam() {
        return naam;
    }

    public ArrayList<Ingredient> getIngredienten() {
        return ingredientenGerecht;
    }
}
