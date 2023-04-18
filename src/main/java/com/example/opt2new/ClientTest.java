package com.example.opt2new;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClientTest {

    @Test
    public void testCalorieBehoefteMan() {
        Client man = new Client("Alvaro", "m", 80.0, 180, 35);
        assertEquals(1755, man.getCalorieBehoefte());
    }

    @Test
    public void testCalorieBehoefteForVrouw() {
        Client vrouw = new Client("Linda", "v", 65.0, 170, 30);
        assertEquals(1402, vrouw.getCalorieBehoefte());
    }

    @Test
    public void testCalorieBehoefteNaVerandering() {
        Client client = new Client("Tim", "m", 80.0, 180, 35);
        client.setGewicht(100.0);
        assertEquals(1955, client.getCalorieBehoefte());
    }
}
