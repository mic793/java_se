/*
 * package day_12.ex_07_old_maid;
 * 
 * import java.util.Objects;
 * 
 * public class Carta extends Object implements Comparable<Carta>{
 * 
 * public enum SEME {FIORI, QUADRI, CUORI, PICCHE}; public enum RANGO {
 * IMPOSSIBILE, ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE, OTTO, NOVE, DIECI,
 * JACK, REGINA, RE };
 * 
 * private SEME seme;//attributo dichiarato privato-->accessibile solo dal
 * codice scritto all'interno della stessa classe private RANGO
 * rango;//attributo dichiarato privato-->accessibile solo dal codice scritto
 * all'interno della stessa classe
 * 
 * public Carta() { this(null, null); }
 * 
 * public Carta(SEME seme, RANGO rango) { this.seme = seme; this.rango = rango;
 * }
 * 
 * public SEME getSeme() { return seme; }
 * 
 * public void setSeme(SEME seme) { this.seme = seme; }
 * 
 * public RANGO getRango() { return rango; }
 * 
 * public void setRango(RANGO rango) { this.rango = rango; }
 * 
 * 
 * @Override public boolean equals(Object other) { if(this == other) return
 * true; if(!(other instanceof Carta)) return false; Carta c = (Carta) other;
 * return this.seme == c.seme && this.rango == c.rango; }
 * 
 * @Override public int hashCode() { return Objects.hash(seme, rango); }
 * 
 * public int compareTo(Carta altro) { int cmp =
 * this.seme.compareTo(altro.seme); if(cmp != 0) return cmp; return
 * this.rango.compareTo(altro.rango); }
 * 
 * @Override public String toString() { return "" + rango + " di " + seme; } }
 */

package day_12.ex_07_old_maid;

import java.util.Objects;

public class Carta implements Comparable<Carta> {

    public enum SEME { FIORI, QUADRI, CUORI, PICCHE }
    public enum RANGO { IMPOSSIBILE, ASSO, DUE, TRE, QUATTRO, CINQUE, SEI, SETTE,
                        OTTO, NOVE, DIECI, JACK, REGINA, RE }

    private SEME seme;
    private RANGO rango;

    public Carta() { this(null, null); }

    public Carta(SEME seme, RANGO rango) {
        this.seme = seme;
        this.rango = rango;
    }

    public SEME getSeme() { return seme; }
    public void setSeme(SEME seme) { this.seme = seme; }

    public RANGO getRango() { return rango; }
    public void setRango(RANGO rango) { this.rango = rango; }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Carta)) return false;
        Carta c = (Carta) other;
        return seme == c.seme && rango == c.rango;
    }

    @Override
    public int hashCode() { return Objects.hash(seme, rango); }

    @Override
    public int compareTo(Carta altro) {
        int cmp = this.seme.compareTo(altro.seme);
        if (cmp != 0) return cmp;
        return this.rango.compareTo(altro.rango);
    }

    @Override
    public String toString() { return rango + " di " + seme; }
}
