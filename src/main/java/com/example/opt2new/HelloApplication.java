package com.example.opt2new;

import java.util.ArrayList;
import java.util.Scanner;

public class HelloApplication{
    ArrayList<Doel> doelen = new ArrayList<>();
    ArrayList<Client> client = new ArrayList<>();

    public static void main(String[] args) {
        HelloApplication start = new HelloApplication();
        start.start();

    }

    public void start(){

        doelen.add(new Doel("Bulk", 1.20));
        doelen.add(new Doel("Cut", 0.90));
        doelen.add(new Doel("Lean bulk", 1.10));

//        ArrayList<SoortEter> soortEters = new ArrayList<>();
//        soortEters.add(new Vegan());
//        soortEters.add(new Vegetarisch());
//        soortEters.add(new Vlees());

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
        System.out.println("Kies een doel:");
        int nummer = 1;
        for(Doel info: doelen){
            System.out.println(nummer + ") " + info.getNaam());
            nummer ++;
        }
        int keuze = scanner.nextInt();
        keuze --;
        System.out.println(doelen.get(keuze).getNaam());
        client.add(new Client(naam, geslacht, gewicht, lengte, leeftijd));
        client.get(0).berekenCaloriebehoefte();
        System.out.println("Client: " + client.get(0).getNaam() + " Calorie behoefte: " + client.get(0).berekenCaloriebehoefte());


    }
    public class Client {
        private String naam;
        private String geslacht;
        private int gewicht;

        private int lengte;

        private int leeftijd;

        static double caloriebehoefte = 0;

        public Client(String naam, String geslacht, int gewicht, int lengte, int leeftijd) {
            this.naam = naam;
            this.geslacht = geslacht;
            this.gewicht = gewicht;
            this.lengte = lengte;
            this.leeftijd = leeftijd;
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

        public double getCaloriebehoefte() {
            return caloriebehoefte;
        }

        public double berekenCaloriebehoefte() {
            double caloriebehoefte = 0;
            if (geslacht == "m"){
                caloriebehoefte = (10* gewicht) + (6.25* lengte) -(5* leeftijd + 5);
            } else if (geslacht == "v") {
                caloriebehoefte = (10* gewicht) + (6.25* lengte) -(5* leeftijd - 161);
            }
            return caloriebehoefte;
        }

        }
    }

