package com.example.opt2new;

import org.junit.Test;

import static org.testng.AssertJUnit.assertEquals;

public class soortGerecht {

    @Test
    public void setSoortGerecht() {
        int caloriënGerecht = 149;
        int caloriënGerecht1 = 150;
        int caloriënGerecht2 = 299;
        int caloriënGerecht3 = 300;
        int caloriënGerecht4 = 599;
        int caloriënGerecht5 = 600;
        int caloriënGerecht6 = 601;
        int caloriënGerecht7 = 800;

        assertEquals("Onbekend", new Gerecht(caloriënGerecht).setSoortGerecht());
        assertEquals("Tussendoortje", new Gerecht(caloriënGerecht1).setSoortGerecht());
        assertEquals("Tussendoortje", new Gerecht(caloriënGerecht2).setSoortGerecht());
        assertEquals("LunchGerecht", new Gerecht(caloriënGerecht3).setSoortGerecht());
        assertEquals("LunchGerecht", new Gerecht(caloriënGerecht4).setSoortGerecht());
        assertEquals("AvondGerecht", new Gerecht(caloriënGerecht5).setSoortGerecht());
        assertEquals("AvondGerecht", new Gerecht(caloriënGerecht6).setSoortGerecht());
        assertEquals("AvondGerecht", new Gerecht(caloriënGerecht7).setSoortGerecht());
    }
}