package at.htlsaafelden;

public class Main {
    public static void main(String[] args) {
        Tisch myTisch = new Tisch ("Esstisch", false, 27.3F, 3.0F, 2.2F, 1.3F);
        Schaf mySchaf = new Schaf ("Cloud", true, 42.9F, 1.1F, 0.82F, 0.55F);

        InterfaceTest interfaceTest = new InterfaceTest();

        print(myTisch, interfaceTest);
        print(mySchaf, interfaceTest);
    }

    public static void print(Transportierbar transportierbar, InterfaceTest interfaceTest) {
        System.out.println(interfaceTest.erstelleBeschriftung(transportierbar));
        System.out.println("\tVolument: " + interfaceTest.berechneVolumen(transportierbar));
        System.out.println("\tTransport machbar:" + interfaceTest.transportMachbar(transportierbar));
    }
}