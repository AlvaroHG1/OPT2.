package com.example.opt2new;

public class Client {
    private String naam;
    private String geslacht;
    private int gewicht;
    private int lengte;
    private int leeftijd;
    private int calorieBehoefte;


    public Client(String naam, String geslacht, int gewicht, int lengte, int leeftijd) {
        this.naam = naam;
        this.geslacht = geslacht;
        this.gewicht = gewicht;
        this.lengte = lengte;
        this.leeftijd = leeftijd;
        this.calorieBehoefte = berekenCaloriebehoefte();
    }

    public String getGeslacht() {
        return geslacht;
    }

    public int getGewicht() {
        return gewicht;
    }

    public int getLengte() {
        return lengte;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public String getNaam() {
        return naam;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public int getCalorieBehoefte() {
        return calorieBehoefte;
    }

    private int berekenCaloriebehoefte() {
        int caloriebehoefte;
        if (geslacht.equalsIgnoreCase("m")) {
            caloriebehoefte = (int) Math.round((10 * gewicht) + (6.25 * lengte) - (5 * leeftijd) + 5);
        } else {
            caloriebehoefte = (int) Math.round((10 * gewicht) + (6.25 * lengte) - (5 * leeftijd) - 161);
        }
        return caloriebehoefte;
    }
}
