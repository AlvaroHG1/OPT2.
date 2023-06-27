package com.example.opt2new;

public class Gerecht {
    private int calorie;

    public Gerecht(int caloriën) {
        this.calorie = caloriën;
    }

    public String setSoortGerecht() {
        if (150 <= calorie && calorie < 300) {
            return "Tussendoortje";
        } else if (300 <= calorie && calorie < 600) {
            return "LunchGerecht";
        } else if (calorie >= 600) {
            return "AvondGerecht";
        } else {
            return "Onbekend";
        }
    }
}
