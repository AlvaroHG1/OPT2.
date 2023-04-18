package com.example.opt2new;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication {
    ArrayList<Doel> doelen = new ArrayList<>();
    ArrayList<Client> clients = new ArrayList<>();
    ArrayList<Dieet> dieet = new ArrayList<>();
    ArrayList<Gerecht> gerechten = new ArrayList<>();
    ArrayList<Ingredient> ingredienten = new ArrayList<>();

    public static void main(String[] args) {
        HelloApplication start = new HelloApplication();
        start.start();
    }

    public void start() {
        doelen.add(new Doel("Bulk", 1.20));
        doelen.add(new Doel("Cut", 0.90));
        doelen.add(new Doel("Lean bulk", 1.10));

        clients.add(new Client("Alvaro", "m", 78, 188, 23));
        clients.add(new Client("Quimey", "m", 88, 190, 22));

        Dieet vegan = new Vegan("Vegan");
        Dieet vegetarisch = new Vegetarisch("Vergetarisch");
        Dieet vlees = new Vlees("Vlees");
        dieet.add(vegan);
        dieet.add(vegetarisch);
        dieet.add(vlees);


        ingredienten.add(new Ingredient("Zout", 0));
        ingredienten.add(new Ingredient("Kaas", 0));
        ingredienten.add(new Ingredient("Tomaat", 0));
        gerechten.add(new Gerecht("QuinoaSalade", vegan, 500));

        Main();
    }

    enum Opties {
        VOEG_NIEUWE_CLIENT_TOE(1),
        WEIZIG_CLIENT(2),
        GENEREER_SCHEMA(3),
        GENEREER_BOOSCHAPPENLIJST(4);
        private int value;

        Opties(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public void Main() {
        Scanner scanner = new Scanner(System.in);
        for (Client info : clients) {
            System.out.println("- " + info.getNaam() + " Gewicht: "+ info.getGewicht()+"kg" +" Caloriebehoefte: " + info.getCalorieBehoefte());
        }
        Opties gekozenOptie = null;
        while (gekozenOptie == null) {
            System.out.println("\nKies een optie:");
            for (Opties optie : Opties.values()) {
                System.out.println(optie.getValue() + ": " + optie.name().toLowerCase().replace("_", " "));
            }
            int choice = scanner.nextInt();
            for (Opties option : Opties.values()) {
                if (option.getValue() == choice) {
                    gekozenOptie = option;
                    break;
                }
            }
            if (gekozenOptie == null) {
                System.out.println("Error, selecteer een optie.");
            }
        }
        switch (gekozenOptie) {
            case VOEG_NIEUWE_CLIENT_TOE:
                System.out.println("Voeg client toe\n");
                voegClientToe();
                break;
            case WEIZIG_CLIENT:
                System.out.println("Weizig client");
                weizigClient();
                break;
            case GENEREER_SCHEMA:
                System.out.println("\nGenereer schema\n");
                schema();
                break;
            case GENEREER_BOOSCHAPPENLIJST:
                System.out.println("\nGenereer boodschappen");
            default:
                System.out.println("maak een keuze");
                break;
        }
    }

    public void voegClientToe() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voer naam client in:");
        String naam = scanner.nextLine();
        System.out.println("Kies geslacht m/v:");
        String geslacht = scanner.nextLine();
        System.out.println("Voer gewicht client in:");
        int gewicht = scanner.nextInt();
        System.out.println("Voer lengte client in:");
        int lengte = scanner.nextInt();
        System.out.println("Voer leeftijd client in:");
        int leeftijd = scanner.nextInt();
        clients.add(new Client(naam, geslacht, gewicht, lengte, leeftijd));
        Main();
    }

    public void weizigClient() {
        Scanner scanner = new Scanner(System.in);
        int clientKeuze = kiesEenClient();
        System.out.println(clients.get(clientKeuze).getNaam());
        System.out.println("Nieuw gewicht:");
        clients.get(clientKeuze).setGewicht(scanner.nextInt());
        Main();
    }

    public int kiesEenClient(){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + 1 + ") " + clients.get(i).getNaam()+ ", gewicht: " + clients.get(i).getGewicht() + "kg");
        }
        int clientKeuze = scanner.nextInt() - 1;
        return clientKeuze;
    }

    public void schema() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nKies een client:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + 1 + ") " + clients.get(i).getNaam());
        }
        int clientKeuze = scanner.nextInt() - 1;
        System.out.println("Client: " + clients.get(clientKeuze).getNaam());
        System.out.println("\nKies een doel:");
        for (int i = 0; i < doelen.size(); i++) {
            System.out.println(i + 1 + ") " + doelen.get(i).getNaam());
        }
        int doelKeuze = scanner.nextInt() - 1;
        System.out.println("Client: " + clients.get(clientKeuze).getNaam());
        System.out.println("Doel keuze:" + doelen.get(doelKeuze).getNaam());
        System.out.println("Kies een dieet: ");
        for (int i = 0; i < dieet.size(); i++) {
            System.out.println(i + 1 + ") " + dieet.get(i).getNaam());
        }
        int dieetKeuze = scanner.nextInt() - 1;
        System.out.println("Client: " + clients.get(clientKeuze).getNaam());
        System.out.println("Doel keuze: " + doelen.get(doelKeuze).getNaam());
        System.out.println("Dieet keuze: " + dieet.get(dieetKeuze).getNaam());

        //genereerSchema();
    }

    public class Schema {
        public void genereerSchema() {

        }
//        void genereerSchema;
//        void genereerBoodschappenlijst;
    }
}
    abstract class Dieet {
        private String naam;

        public Dieet(String naam) {
            this.naam = naam;
        }

        public String getNaam() {
            return naam;
        }
    }


//    public class CalorieBehoefte{
//        Doel doel;
//        Client client;
//
//        public void berekenCaloriebehoefte(Client client) {
//            double caloriebehoefte = 0;
//            if (client.getGeslacht() == "m"){
//                caloriebehoefte = (10* client.getGewicht()) + (6.25* client.getLengte()) -(5* client.getLeeftijd() + 5);
//            } else if (client.getGeslacht() == "v") {
//                caloriebehoefte = (10* client.getGewicht()) + (6.25* client.getLengte()) -(5* client.getLeeftijd() - 161);
//            }
//        }
//
//
//        public double berekenCalorieBehoefteDoel() {
//            double doelCalorieBehoefte = 0;
//                doelCalorieBehoefte = client.getCalorieBehoefte() * client.getDoel();
//            return doelCalorieBehoefte;
//        }
//    }



