/*
 * package day_12.ex_07_old_maid;
 * 
 * public class Gioco extends Object{
 * 
 * private Mazzo mazzo;
 * 
 * public Gioco() { mazzo = new Mazzo(); mazzo.mescola(); }
 * 
 * public Mazzo getMazzo() { return mazzo; }
 * 
 * 
 * 
 * }
 */

package day_12.ex_07_old_maid;

/**
 * Inizializza un mazzo e lo mescola.
 */
public class Gioco {

    private final Mazzo mazzo;

    public Gioco() {
        mazzo = new Mazzo();
        mazzo.mescola();
    }

    public Mazzo getMazzo() { return mazzo; }
}
