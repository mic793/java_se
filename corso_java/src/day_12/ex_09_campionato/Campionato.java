package day_12.ex_09_campionato;

// Importa le interfacce e le classi necessarie dal package java.util.
import java.util.Set; // Importa l'interfaccia Set, che rappresenta una collezione di elementi unici.
import java.util.TreeSet; // Importa la classe TreeSet, un'implementazione di Set che mantiene gli elementi ordinati.

/**
 * Rappresenta un campionato di calcio.
 * Questa classe contiene le informazioni sulla serie (es. Serie A) e gestisce
 * una collezione di squadre partecipanti, mantenendole ordinate.
 */
public class Campionato {
    
    // Campo privato per memorizzare la serie del campionato (es. SERIE_A, SERIE_B).
    private Serie serie;
    
    // Collezione di tipo Set per memorizzare le squadre che partecipano al campionato.
    // L'uso di Set garantisce che non ci siano squadre duplicate.
    // L'implementazione specifica TreeSet mantiene gli elementi (le squadre) costantemente ordinati
    // secondo il loro "ordinamento naturale".
    // ATTENZIONE: Perché questo funzioni, la classe Squadra DEVE implementare l'interfaccia Comparable<Squadra>.
    private Set<Squadra> squadre = new TreeSet<>();
    
    /**
     * Costruttore di default (senza argomenti).
     * Permette di creare un'istanza vuota di Campionato.
     */
    public Campionato() {
        // Chiama il costruttore della classe genitore (Object).
        super();
    }
    
    /**
     * Costruttore parametrico.
     * Permette di creare un campionato specificando subito la serie di appartenenza.
     * @param aSerie La serie del campionato (un valore dell'enum Serie).
     */
    public Campionato(Serie aSerie) {
        // Chiama il costruttore della classe genitore.
        super();
        // Inizializza l'attributo 'serie' con il valore passato come parametro.
        this.serie = aSerie;
    } 
    
    /**
     * Metodo Getter per ottenere la serie del campionato.
     * @return il valore dell'enum Serie che rappresenta la serie del campionato.
     */
    public Serie getSerie() {
        return serie;
    }    
    
    /**
     * Metodo Setter per impostare o modificare la serie del campionato.
     * @param aSerie la nuova serie da impostare.
     */
    public void setSerie(Serie serie) { // Ho corretto il nome del parametro per coerenza con le convenzioni Java
        this.serie = serie;
    }
    
    /**
     * Restituisce il Set delle squadre iscritte al campionato.
     * La collezione restituita è ordinata, grazie all'uso del TreeSet.
     * @return un Set<Squadra> ordinato.
     */
    public Set<Squadra> getSquadre() {
        return squadre;
    }
    
    /**
     * Override del metodo toString() per fornire una rappresentazione testuale dell'oggetto Campionato.
     * @return una stringa formattata con i dettagli del campionato.
     */
    @Override // Ho aggiunto l'annotazione @Override per chiarezza
    public String toString() {
        return "Campionato [serie=" + serie + ", squadre=" + squadre + "]";
    }
}