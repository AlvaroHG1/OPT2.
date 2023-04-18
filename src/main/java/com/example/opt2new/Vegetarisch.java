package com.example.opt2new;

import java.util.ArrayList;

public class Vegetarisch extends Dieet {
    public ArrayList<Gerecht> gerechten = new ArrayList<>();
    public Vegetarisch(String naam) {
        super(naam);
    }
    public void addGerecht(Gerecht gerecht){
        gerechten.add(gerecht);
    }
    public ArrayList<Gerecht> getGerechten() {
        return gerechten;
    }
}
