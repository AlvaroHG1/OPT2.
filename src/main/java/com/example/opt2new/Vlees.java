package com.example.opt2new;

import java.util.ArrayList;

public class Vlees extends Dieet {
    public ArrayList<Gerecht> gerechten = new ArrayList<>();
    public Vlees(String naam) {
        super(naam);
    }
    public void addGerecht(Gerecht gerecht){
        gerechten.add(gerecht);
    }
}
