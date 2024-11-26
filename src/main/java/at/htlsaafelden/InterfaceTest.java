package at.htlsaafelden;

public class InterfaceTest {
    public boolean transportMachbar(Transportierbar tDetails) {
        float gewicht = tDetails.gewicht();
        float laenge = tDetails.laenge();
        float breite = tDetails.breite();
        float gewichtProFlaeche = gewicht/(laenge*breite);

        return gewichtProFlaeche < Transportierbar.MAX_GEWICHT_PRO_FLAECHE;
    }

    public float berechneVolumen (Transportierbar tDetails)
    {
        return tDetails.laenge()*tDetails.breite()*tDetails.hoehe();
    }

    public String erstelleBeschriftung (Transportierbar tDetails)
    {
        String text = tDetails.beschriftung();
        if (tDetails.zerbrechlich())
        {
            return "-Zerbrechlich- " + text;
        }
        return text;
    }
}
