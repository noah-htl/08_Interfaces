package at.htlsaafelden;

public interface Transportierbar {
    public final float MAX_GEWICHT_PRO_FLAECHE = 29.99F;

    float gewicht();
    abstract float laenge();
    public float breite();
    public abstract float hoehe();

    boolean zerbrechlich();
    String beschriftung();
}
