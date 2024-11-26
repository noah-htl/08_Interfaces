package at.htlsaafelden;

public class Tisch implements Transportierbar{

    private String bezeichnung;
    private boolean zerbrechlich;
    private float gewicht;
    private float laenge;
    private float hoehe;
    private float breite;

    public Tisch(String bezeichnung, boolean zerbrechlich, float gewicht, float laenge, float hoehe, float breite) {
        this.bezeichnung = bezeichnung;
        this.zerbrechlich = zerbrechlich;
        this.gewicht = gewicht;
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
