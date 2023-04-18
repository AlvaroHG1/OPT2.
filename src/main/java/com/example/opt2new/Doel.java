package com.example.opt2new;

//    class Caloriebehoefte {
//        public double berekenCaloriebehoefte(Client client) {
//            double caloriebehoefte = 0;
//            if (client.getGeslacht() == "m"){
//                caloriebehoefte = (10* client.getGewicht()) + (6.25* client.getLengte()) -(5* client.getLeeftijd() + 5);
//            } else if (client.getGeslacht() == "v") {
//                caloriebehoefte = (10* client.getGewicht()) + (6.25* client.getLengte()) -(5* client.getLeeftijd() - 161);
//            }
//            return caloriebehoefte;
//        }
//    }
public class Doel {
    String naam;
    double doel;

    public Doel(String naam, double doel) {
        this.naam = naam;
        this.doel = doel;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getDoel() {
        return doel;
    }

    public void setDoel(double doel) {
        this.doel = doel;
    }
}
