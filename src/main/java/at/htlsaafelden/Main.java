package at.htlsaafelden;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Tisch myTisch = new Tisch ("Esstisch", false, 27.3F, 3.0F, 2.2F, 1.3F);
        Schaf mySchaf = new Schaf ("Cloud", true, 42.9F, 1.1F, 0.82F, 0.55F);

        Container container = new Container("Container1", 1010, 40, 20, 20, List.of(mySchaf, myTisch));
        Paket paket = new Paket(myTisch);

        List<Transportierbar> transportierbar = new ArrayList<>();
        transportierbar.add(mySchaf);
        transportierbar.add(myTisch);
        transportierbar.add(container);
        transportierbar.add(paket);

        transportierbar.sort(null);

        InterfaceTest interfaceTest = new InterfaceTest();


        for(Transportierbar element : transportierbar) {
            print(element, interfaceTest);
        }
    }

    public static void print(Transportierbar transportierbar, InterfaceTest interfaceTest) {
        System.out.println(interfaceTest.erstelleBeschriftung(transportierbar));
        System.out.println("\tVolumen: " + interfaceTest.berechneVolumen(transportierbar));
        System.out.println("\tTransport machbar:" + interfaceTest.transportMachbar(transportierbar));
    }
}