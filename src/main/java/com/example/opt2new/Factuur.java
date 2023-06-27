package com.example.opt2new;

public class Factuur {
    Client2 client2;

    Factuur(Client2 client2){
        this.client2 = client2;
    }
    public boolean checkKorting(){
        if (client2.kooptSchema() && (client2.isLid()) || client2.kooptBoodschappenLijstje()){
            return true;
        }
        else {
            return false;
        }
    }
}
