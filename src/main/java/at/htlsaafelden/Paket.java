package at.htlsaafelden;

public class Paket implements Transportierbar{

    private String name;
    private boolean zerbrechlich;
    private float gewicht;
    private float laenge;
    private float hoehe;
    private float breite;

    public Paket(Transportierbar inhalt) {
        this.name = inhalt.beschriftung();
        this.zerbrechlich = inhalt.zerbrechlich();
        this.gewicht = inhalt.gewicht();
        this.laenge = inhalt.laenge();
        this.hoehe = inhalt.hoehe();
        this.breite = inhalt.breite();
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
        return "Eingepackt: " + this.name;
    }
}
