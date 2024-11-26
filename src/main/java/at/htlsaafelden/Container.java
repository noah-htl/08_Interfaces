package at.htlsaafelden;

import java.util.List;

public class Container implements Transportierbar{

    private String bezeichnung;
    private boolean zerbrechlich;
    private float gewicht;
    private float laenge;
    private float hoehe;
    private float breite;

    public Container(String bezeichnung, float basisGewicht, float laenge, float hoehe, float breite, List<Transportierbar> inhalt) {
        this.bezeichnung = bezeichnung;

        this.gewicht = basisGewicht;
        for(Transportierbar element : inhalt) {
            this.gewicht += element.gewicht();
        }

        this.zerbrechlich = false;
        for(Transportierbar element : inhalt) {
            if(element.zerbrechlich()) {
                this.zerbrechlich = true;
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("Container: ");
        sb.append(bezeichnung);
        sb.append("\n");
        for(Transportierbar element : inhalt) {
            sb.append("\t");
            sb.append(element.beschriftung());
            sb.append("\n");
        }

        this.bezeichnung = sb.toString();

        this.laenge = laenge;
        this.hoehe = hoehe;
        this.breite = breite;
    }

    @Override
    public float gewicht() {
        return this.gewicht;
    }

    @Override
    public float laenge() {
        return this.laenge;
    }

    @Override
    public float breite() {
        return this.breite;
    }

    @Override
    public float hoehe() {
        return this.hoehe;
    }

    @Override
    public boolean zerbrechlich() {
        return this.zerbrechlich;
    }

    @Override
    public String beschriftung() {
        return this.bezeichnung;
    }
}
