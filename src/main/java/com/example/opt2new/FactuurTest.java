package com.example.opt2new;

import org.junit.Test;

import static org.testng.AssertJUnit.*;


public class FactuurTest {

    @Test
    public void checkKorting() {
        Client2 client1 = new Client2(true, false, true);
        boolean resultaat = new Factuur(client1).checkKorting();
        assertTrue(resultaat);

    }
    @Test
    public void checkKorting1() {
        Client2 client2 = new Client2(false, true, false);
        boolean resultaat = new Factuur(client2).checkKorting();
        assertFalse(resultaat);
    }
    @Test
    public void checkKorting3() {
        Client2 client3 = new Client2(true, true, false);
        boolean resultaat = new Factuur(client3).checkKorting();
        assertTrue(resultaat);
    }
    @Test
    public void checkKorting4() {
        Client2 client4 = new Client2(true, false, false);
        boolean resultaat = new Factuur(client4).checkKorting();
        assertFalse(resultaat);
    }
}