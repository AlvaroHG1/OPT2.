package com.example.opt2new;

import java.util.ArrayList;
import java.util.Scanner;

public class VoedingSchema {
    public ArrayList<Doel> doelen = new ArrayList<>();
    public ArrayList<Client> clients = new ArrayList<>();
    public ArrayList<Dieet> dieet = new ArrayList<>();
    ArrayList<Ingredient> ingredientenGerecht = new ArrayList<>();

    ArrayList<Ingredient> gerechten = new ArrayList<>();

    public static void main(String[] args) {
        VoedingSchema start = new VoedingSchema();
        start.start();
    }

    public void start() {
        doelen.add(new Doel("Bulk", 1.20));
        doelen.add(new Doel("Cut", 0.90));
        doelen.add(new Doel("Lean bulk", 1.10));

        clients.add(new Client("Alvaro", "m", 78, 188, 23));
        clients.add(new Client("Sanne", "v", 50, 165, 30));

        Dieet vegan = new Vegan("Vegan");
        Dieet vegetarisch = new Vegetarisch("Vergetarisch");
        Dieet vlees = new Vlees("Vlees");
        dieet.add(vegan);
        dieet.add(vegetarisch);
        dieet.add(vlees);

        GerechtT QuinoaSalade = new GerechtT("QuinoaSalade", vegan, 500);
        Ingredient avocado = new Ingredient("Avocado");
        Ingredient quinoa = new Ingredient("Quinoa");
        Ingredient tomaat = new Ingredient("Tomaat");
        QuinoaSalade.addIngredient(avocado);
        QuinoaSalade.addIngredient(quinoa);
        QuinoaSalade.addIngredient(tomaat);
        vegan.addGerecht(QuinoaSalade);

        GerechtT VeganCurry = new GerechtT("Vegan Curry", vegan, 700);
        Ingredient zoeteAardappel = new Ingredient("Zoete aardappel");
        Ingredient broccoli = new Ingredient("Broccoli");
        Ingredient kikkererwten = new Ingredient("Kikkererwten");
        Ingredient kokosmelk = new Ingredient("Kokosmelk");
        Ingredient curryKruiden = new Ingredient("Currykruiden");
        VeganCurry.addIngredient(zoeteAardappel);
        VeganCurry.addIngredient(broccoli);
        VeganCurry.addIngredient(kikkererwten);
        VeganCurry.addIngredient(kokosmelk);
        VeganCurry.addIngredient(curryKruiden);
        vegan.addGerecht(VeganCurry);

        GerechtT VeganChili = new GerechtT("Vegan Chili", vegan, 600);
        Ingredient kidneyBonens = new Ingredient("Kidneybonen");
        Ingredient mais = new Ingredient("Mais");
        Ingredient paprika = new Ingredient("Paprika");
        Ingredient tomaten = new Ingredient("Tomaten");
        Ingredient chiliPoeder = new Ingredient("Chilipoeder");
        VeganChili.addIngredient(kidneyBonens);
        VeganChili.addIngredient(mais);
        VeganChili.addIngredient(paprika);
        VeganChili.addIngredient(tomaten);
        VeganChili.addIngredient(chiliPoeder);
        vegan.addGerecht(VeganChili);

        GerechtT VeganSushi = new GerechtT("Vegan Sushi", vegan, 300);
        Ingredient sushirijst = new Ingredient("Sushirijst");
        Ingredient nori = new Ingredient("Nori");
        Ingredient avocado2 = new Ingredient("Avocado");
        Ingredient komkommer = new Ingredient("Komkommer");
        Ingredient wortel = new Ingredient("Wortel");
        Ingredient sojasaus = new Ingredient("Sojasaus");
        VeganSushi.addIngredient(sushirijst);
        VeganSushi.addIngredient(nori);
        VeganSushi.addIngredient(avocado2);
        VeganSushi.addIngredient(komkommer);
        VeganSushi.addIngredient(wortel);
        VeganSushi.addIngredient(sojasaus);
        vegan.addGerecht(VeganSushi);

        GerechtT VeganBurrito = new GerechtT("Vegan Burrito", vegan, 500);
        Ingredient rijst = new Ingredient("Rijst");
        Ingredient bonen = new Ingredient("Bonen");
        Ingredient tomatensalsa = new Ingredient("Tomatensalsa");
        Ingredient guacamole = new Ingredient("Guacamole");
        Ingredient sla2 = new Ingredient("Sla");
        Ingredient tortilla = new Ingredient("Tortilla");
        VeganBurrito.addIngredient(rijst);
        VeganBurrito.addIngredient(bonen);
        VeganBurrito.addIngredient(tomatensalsa);
        VeganBurrito.addIngredient(guacamole);
        VeganBurrito.addIngredient(sla2);
        VeganBurrito.addIngredient(tortilla);
        vegan.addGerecht(VeganBurrito);

        GerechtT SpaghettiBolognese = new GerechtT("Spaghetti Bolognese", vlees, 600);
        Ingredient spaghetti = new Ingredient("Spaghetti");
        Ingredient gehakt = new Ingredient("Gehakt");
        Ingredient tomatensaus = new Ingredient("Tomatensaus");
        Ingredient ui = new Ingredient("Ui");
        Ingredient knoflook = new Ingredient("Knoflook");
        SpaghettiBolognese.addIngredient(spaghetti);
        SpaghettiBolognese.addIngredient(gehakt);
        SpaghettiBolognese.addIngredient(tomatensaus);
        SpaghettiBolognese.addIngredient(ui);
        SpaghettiBolognese.addIngredient(knoflook);
        SpaghettiBolognese.addIngredient(wortel);
        vlees.addGerecht(SpaghettiBolognese);

        GerechtT Kippensoep = new GerechtT("Kippensoep", vlees, 800);
        Ingredient kippenbouillon = new Ingredient("Kippenbouillon");
        Ingredient kipfilet = new Ingredient("Kipfilet");
        Ingredient wortel2 = new Ingredient("Wortel");
        Ingredient prei = new Ingredient("Prei");
        Ingredient selderij = new Ingredient("Selderij");
        Ingredient noedels = new Ingredient("Noedels");
        Kippensoep.addIngredient(kippenbouillon);
        Kippensoep.addIngredient(kipfilet);
        Kippensoep.addIngredient(wortel2);
        Kippensoep.addIngredient(prei);
        Kippensoep.addIngredient(selderij);
        Kippensoep.addIngredient(noedels);
        vlees.addGerecht(Kippensoep);

        GerechtT Hamburger = new GerechtT("Hamburger", vlees, 400);
        Ingredient rundergehakt = new Ingredient("Rundergehakt");
        Ingredient hamburgerbroodje = new Ingredient("Hamburgerbroodje");
        Ingredient sla = new Ingredient("Sla");
        Ingredient tomaat2 = new Ingredient("Tomaat");
        Ingredient ui2 = new Ingredient("Ui");
        Ingredient cheddarkaas = new Ingredient("Cheddarkaas");
        Hamburger.addIngredient(rundergehakt);
        Hamburger.addIngredient(hamburgerbroodje);
        Hamburger.addIngredient(sla);
        Hamburger.addIngredient(tomaat2);
        Hamburger.addIngredient(ui2);
        Hamburger.addIngredient(cheddarkaas);
        vlees.addGerecht(Hamburger);

        GerechtT BiefstukMetGroenten = new GerechtT("Biefstuk met groenten", vlees, 600);
        Ingredient biefstuk = new Ingredient("Biefstuk");
        Ingredient champignons = new Ingredient("Champignons");
        Ingredient paprika2 = new Ingredient("Paprika");
        Ingredient ui3 = new Ingredient("Ui");
        Ingredient knoflook2 = new Ingredient("Knoflook");
        Ingredient broccoli2 = new Ingredient("Broccoli");
        BiefstukMetGroenten.addIngredient(biefstuk);
        BiefstukMetGroenten.addIngredient(champignons);
        BiefstukMetGroenten.addIngredient(paprika2);
        BiefstukMetGroenten.addIngredient(ui3);
        BiefstukMetGroenten.addIngredient(knoflook2);
        BiefstukMetGroenten.addIngredient(broccoli2);
        vlees.addGerecht(BiefstukMetGroenten);

        GerechtT VegetarischePasta = new GerechtT("Vegetarische pasta", vegetarisch, 400);
        Ingredient pasta = new Ingredient("Pasta");
        Ingredient courgette = new Ingredient("Courgette");
        Ingredient tomaten2 = new Ingredient("Tomaten");
        Ingredient basilicum = new Ingredient("Basilicum");
        VegetarischePasta.addIngredient(pasta);
        VegetarischePasta.addIngredient(courgette);
        VegetarischePasta.addIngredient(champignons);
        VegetarischePasta.addIngredient(ui);
        VegetarischePasta.addIngredient(knoflook);
        VegetarischePasta.addIngredient(tomaten2);
        VegetarischePasta.addIngredient(basilicum);
        vegetarisch.addGerecht(VegetarischePasta);

        GerechtT VegetarischeBurger = new GerechtT("Vegetarische burger", vegetarisch, 200);
        Ingredient burgerBroodje = new Ingredient("Burgerbroodje");
        Ingredient groenteburger = new Ingredient("Groenteburger");
        Ingredient sla3 = new Ingredient("Sla");
        Ingredient kaas = new Ingredient("Kaas");
        Ingredient ketchup = new Ingredient("Ketchup");
        VegetarischeBurger.addIngredient(burgerBroodje);
        VegetarischeBurger.addIngredient(groenteburger);
        VegetarischeBurger.addIngredient(tomaat2);
        VegetarischeBurger.addIngredient(sla3);
        VegetarischeBurger.addIngredient(kaas);
        VegetarischeBurger.addIngredient(ketchup);
        vegetarisch.addGerecht(VegetarischeBurger);

        GerechtT VegetarischeLasagne = new GerechtT("Vegetarische lasagne", vegetarisch, 600);
        Ingredient lasagnebladen = new Ingredient("Lasagnebladen");
        Ingredient spinazie = new Ingredient("Spinazie");
        Ingredient ricotta = new Ingredient("Ricotta");
        Ingredient mozzarella = new Ingredient("Mozzarella");
        Ingredient ParmezaanseKaas = new Ingredient("Parmezaanse kaas");
        VegetarischeLasagne.addIngredient(lasagnebladen);
        VegetarischeLasagne.addIngredient(spinazie);
        VegetarischeLasagne.addIngredient(ricotta);
        VegetarischeLasagne.addIngredient(tomatensaus);
        VegetarischeLasagne.addIngredient(mozzarella);
        VegetarischeLasagne.addIngredient(ParmezaanseKaas);
        vegetarisch.addGerecht(VegetarischeLasagne);

        GerechtT VegetarischeNasiGoreng = new GerechtT("Vegetarische Nasi Goreng", vegetarisch, 600);
        Ingredient ei = new Ingredient("Ei");
        Ingredient ketjap = new Ingredient("Ketjap");
        VegetarischeNasiGoreng.addIngredient(rijst);
        VegetarischeNasiGoreng.addIngredient(wortel);
        VegetarischeNasiGoreng.addIngredient(prei);
        VegetarischeNasiGoreng.addIngredient(ei);
        VegetarischeNasiGoreng.addIngredient(ketjap);
        vegetarisch.addGerecht(VegetarischeNasiGoreng);

        GerechtT VegetarischeSpinaziePasta = new GerechtT("Vegetarische SpinaziePasta", vegetarisch, 500);
        Ingredient roomkaas = new Ingredient("Roomkaas");
        Ingredient pijnboompitten = new Ingredient("Pijnboompitten");
        VegetarischeSpinaziePasta.addIngredient(pasta);
        VegetarischeSpinaziePasta.addIngredient(spinazie);
        VegetarischeSpinaziePasta.addIngredient(roomkaas);
        VegetarischeSpinaziePasta.addIngredient(knoflook);
        VegetarischeSpinaziePasta.addIngredient(pijnboompitten);
        vegetarisch.addGerecht(VegetarischeSpinaziePasta);


        Main();
    }

    enum Opties {
        VOEG_CLIENT_TOE(1),
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
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        for (Client info : clients) {
            System.out.println("- " + info.getNaam() + " Gewicht: " + info.getGewicht() + "kg" + " Caloriebehoefte: " + info.getCalorieBehoefte());
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
            case VOEG_CLIENT_TOE:
                voegClientToe();
                break;
            case WEIZIG_CLIENT:
                weizigGewicht();
                break;
            case GENEREER_SCHEMA:
                optiesSchema();
                break;
            case GENEREER_BOOSCHAPPENLIJST:
                System.out.println("\n---Genereer boodschappen---");
            default:
                System.out.println("maak een keuze");
                break;
        }
    }

    public static void clearScreen() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void voegClientToe() {
        clearScreen();
        System.out.println("---Voeg client toe---\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
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

    public void weizigGewicht() {
        clearScreen();
        System.out.println("---Weizig client---\n");
        Scanner scanner = new Scanner(System.in);
        int clientKeuze = kiesEenClient(scanner);
        System.out.println(clients.get(clientKeuze).getNaam());
        System.out.println("Nieuw gewicht in kg:");
        clients.get(clientKeuze).setGewicht(scanner.nextDouble());
        Main();
    }

    public int kiesEenClient(Scanner scanner) {
        System.out.println("Kies een client:");
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + 1 + ") " + clients.get(i).getNaam() + ", gewicht: " + clients.get(i).getGewicht() + "kg");
        }
        int clientKeuze = scanner.nextInt() - 1;
        return clientKeuze;
    }

    public int kiesEenDoel(Scanner scanner){
        System.out.println("\nKies een doel:");
        for (int i = 0; i < doelen.size(); i++) {
            System.out.println(i + 1 + ") " + doelen.get(i).getNaam());
        }
        int doelKeuze = scanner.nextInt() - 1;
        return doelKeuze;
    }

    public int kiesEenDieet(Scanner scanner){
        System.out.println("\nKies een dieet: ");
        for (int i = 0; i < dieet.size(); i++) {
            System.out.println(i + 1 + ") " + dieet.get(i).getNaam());
        }
        int dieetKeuze = scanner.nextInt() - 1;
        return dieetKeuze;
    }
    public int kiesDagenSporten(Scanner scanner){
        System.out.println("\nHoeveel dagen sport je?");
        return scanner.nextInt();
    }
    public boolean kiesShakes(Scanner scanner){
        boolean keuze;
        System.out.println("\nConsumeert u wel of geen proteïne shakes: wel/ niet");
            String text = scanner.nextLine();
            if (text == "wel"){
                keuze = true;
            }
            else {
                keuze = false;
            }
        return keuze;
    }

    public int berekenMaaltijden(int client, int doel, int dagenTrainen, boolean shakes){
        int calorieënShakes = 400;
        int aantalMaaltijden;
        int gemiddeldeCalMaaltijd = 550;
        double percentageExtraCaloriën;

        if (dagenTrainen <= 3){
            percentageExtraCaloriën = 1.0;
        } else {
            percentageExtraCaloriën = 1.25;
        }

        int calorieBehoefteDoel = (int) Math.round(clients.get(client).getCalorieBehoefte() * doelen.get(doel).getPercentage() * percentageExtraCaloriën);

        if (shakes){
            aantalMaaltijden = (calorieBehoefteDoel - calorieënShakes) / gemiddeldeCalMaaltijd;
        } else{
            aantalMaaltijden = calorieBehoefteDoel / gemiddeldeCalMaaltijd;
        }
        return aantalMaaltijden;
    }

    public int vindCalorieBehoefte(String naam){
        for (Client client : clients) {
            if (client.getNaam().equals(naam)) {
                return client.getCalorieBehoefte();
            }
        }
        return 0;
    }
    public double vindPercentageDoel(String naamDoel){
        for (Doel doel : doelen) {
            if (doel.getNaam().equals(naamDoel)) {
                return doel.getPercentage();
            }
        }
        return 0.0;
    }

    public void optiesSchema() {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---Genereer schema---\n");

        int clientKeuze = kiesEenClient(scanner);
        clearScreen();

        System.out.println("Client: " + clients.get(clientKeuze).getNaam());

        int doelKeuze = kiesEenDoel(scanner);
        clearScreen();

        System.out.println("Client: " + clients.get(clientKeuze).getNaam());
        System.out.println("Doel keuze:" + doelen.get(doelKeuze).getNaam());

        int dieetKeuze = kiesEenDieet(scanner);
        clearScreen();

        System.out.println("Client: " + clients.get(clientKeuze).getNaam());
        System.out.println("Doel keuze: " + doelen.get(doelKeuze).getNaam());
        System.out.println("Dieet keuze: " + dieet.get(dieetKeuze).getNaam());

        int dagenSporten = kiesDagenSporten(scanner);
        clearScreen();

        boolean shakesKeuze = kiesShakes(scanner);
        clearScreen();

        berekenMaaltijden(clientKeuze, doelKeuze, dagenSporten, shakesKeuze);

        int calorieBehoefteDoel = (int) Math.round(clients.get(clientKeuze).getCalorieBehoefte() * doelen.get(doelKeuze).getPercentage());
        System.out.println("calorieBehoefteDoel: " + calorieBehoefteDoel);
        System.out.println();
        genereerSchema(dieet.get(dieetKeuze));

    }

    public void genereerSchema(Dieet dieet) {
        System.out.println("Gerechten voor " + dieet.getNaam() + " dieet:");

        for (GerechtT gerecht : dieet.getGerechten()) {
            System.out.println("- " + gerecht.getNaam());
        }
    }

//    public void genereerBoodschappenlijstje(Dieet dieet) {
//        StringBuilder sb = new StringBuilder();
//        for (Gerecht gerecht : dieet.getGerechten()) {
//            for (Ingredient ingredient : gerecht.getIngredienten()) {
//                sb.append(ingredient).append("\n");
//            }
//        }
//        System.out.println(sb);
//    }
}




