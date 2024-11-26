package at.htlsaafelden;

public interface Transportierbar extends Comparable<Transportierbar>{
    public final float MAX_GEWICHT_PRO_FLAECHE = 29.99F;

    float gewicht();
    abstract float laenge();
    public float breite();
    public abstract float hoehe();

    boolean zerbrechlich();
    String beschriftung();

    @Override
    default int compareTo(Transportierbar o) {
        if(o.gewicht() > this.gewicht()) {
            return 1;
        }
        if(o.gewicht() < this.gewicht()) {
            return -1;
        }
        return 0;
    }
}
