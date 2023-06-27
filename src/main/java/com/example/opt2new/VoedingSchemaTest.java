package com.example.opt2new;

import org.junit.Test;
import static org.junit.Assert.*;

public class VoedingSchemaTest {

    @Test
    public void berekenMaaltijdenTest() {
        VoedingSchema voedingSchema = new VoedingSchema();
        Client Alvaro = new Client("Alvaro", "m", 90, 188, 23);
        Client Sanne = new Client("Sanne", "v", 50, 165, 30);
        Doel bulk = new Doel("Bulk", 1.40);
        Doel cut = new Doel("Cut", 0.80);
        Doel maintain = new Doel("Maintain", 1.00);

        voedingSchema.clients.add(Alvaro);
        voedingSchema.clients.add(Sanne);
        voedingSchema.doelen.add(bulk);
        voedingSchema.doelen.add(cut);
        voedingSchema.doelen.add(maintain);

        assertEquals(4, voedingSchema.berekenMaaltijden(0, 0, 1, true));
        assertEquals(3, voedingSchema.berekenMaaltijden(1, 0, 4, false));
        assertEquals(2, voedingSchema.berekenMaaltijden(0, 1, 5, true));
        assertEquals(1, voedingSchema.berekenMaaltijden(1, 1, 2, false));
        assertEquals(3, voedingSchema.berekenMaaltijden(0, 2, 3, false));
        assertEquals(2, voedingSchema.berekenMaaltijden(1, 2, 6, true));
    }
}
