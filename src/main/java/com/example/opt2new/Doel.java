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
    double percentage;

    public Doel(String naam, double percentage) {
        this.naam = naam;
        this.percentage = percentage;
    }
    public String getNaam() {
        return naam;
    }
    public double getDoel() {
        return percentage;
    }

}
