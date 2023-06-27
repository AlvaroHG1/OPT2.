package com.example.opt2new;

public class Client2 {
    public boolean isLid;
    public boolean schema;
    public boolean boodschappenLijstje;

    public Client2(boolean isLid, boolean schema, boolean boodschappenLijstje) {
        this.isLid = isLid;
        this.schema = schema;
        this.boodschappenLijstje = boodschappenLijstje;
    }

    public boolean kooptSchema() {
        return schema;
    }

    public boolean kooptBoodschappenLijstje() {
        return boodschappenLijstje;
    }

    public boolean isLid() {
        return isLid;
    }
}
