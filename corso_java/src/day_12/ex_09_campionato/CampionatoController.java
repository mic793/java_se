package day_12.ex_09_campionato; 

// Importa le interfacce e le classi necessarie dal package java.util.
import java.util.List;
import java.util.LinkedList;

/**
 * Classe di tipo "Controller" o "Service" che centralizza la logica di manipolazione
 * degli oggetti Campionato e Squadra.
 * L'uso di un controller permette di separare la logica di business (le operazioni)
 * dai dati stessi (le classi modello).
 * I metodi sono 'static' perché agiscono come funzioni di utilità che operano
 * sugli oggetti passati come parametri, senza bisogno di mantenere uno stato interno.
 */
public class CampionatoController {
    
    /**
     * Aggiunge un giocatore alla rosa di una squadra.
     * @param aSquadra La squadra a cui aggiungere il giocatore. Questo oggetto sarà modificato.
     * @param aGiocatore L'oggetto Giocatore da aggiungere.
     * @return true se il giocatore è stato aggiunto con successo, false altrimenti (es. se la collezione non è stata modificata).
     */
    public static boolean addGiocatore(Squadra aSquadra, Giocatore aGiocatore) {
        // Delega l'operazione di aggiunta direttamente alla collezione di giocatori della squadra.
        // Il valore booleano restituito dal metodo add() della collezione viene restituito direttamente.
        return aSquadra.getGiocatori().add(aGiocatore);        
    }
    
    /**
     * Rimuove un giocatore dalla rosa di una squadra.
     * @param aSquadra La squadra da cui rimuovere il giocatore. Questo oggetto sarà modificato.
     * @param aGiocatore L'oggetto Giocatore da rimuovere. La rimozione si basa sul metodo equals().
     * @return true se il giocatore era presente ed è stato rimosso, false altrimenti.
     */
    public static boolean rimuoviGiocatore(Squadra aSquadra, Giocatore aGiocatore) {
        // Delega l'operazione di rimozione alla collezione di giocatori della squadra.
        return aSquadra.getGiocatori().remove(aGiocatore);
    }
    
    /**
     * Aggiunge una squadra al campionato.
     * @param aCampionato Il campionato a cui aggiungere la squadra. Questo oggetto sarà modificato.
     * @param aSquadra La squadra da aggiungere.
     * @return true se la squadra è stata aggiunta con successo (non era già presente), false altrimenti.
     */
    public static boolean addSquadra(Campionato aCampionato, Squadra aSquadra) {
        // Delega l'operazione di aggiunta alla collezione di squadre del campionato.
        return aCampionato.getSquadre().add(aSquadra);        
    }
    
    /**
     * Rimuove una squadra dal campionato.
     * @param aCampionato Il campionato da cui rimuovere la squadra. Questo oggetto sarà modificato.
     * @param aSquadra La squadra da rimuovere. La rimozione si basa sul metodo equals().
     * @return true se la squadra era presente ed è stata rimossa, false altrimenti.
     */
    public static boolean rimuoviSquadra(Campionato aCampionato, Squadra aSquadra) {
        // Delega l'operazione di rimozione alla collezione di squadre del campionato.
        return aCampionato.getSquadre().remove(aSquadra);
    }
    
    /**
     * Cerca una squadra specifica all'interno di un campionato.
     * Questo metodo esegue una ricerca lineare.
     * @param aCampionato Il campionato in cui effettuare la ricerca.
     * @param aSquadra L'oggetto squadra da cercare. La ricerca si basa sul metodo equals().
     * @return L'oggetto Squadra trovato nella collezione del campionato, o null se non viene trovato.
     */
    public static Squadra ricercaSquadra(Campionato aCampionato, Squadra aSquadra) {
        // Itera su ogni squadra 's' presente nella collezione delle squadre del campionato.
        for (Squadra s : aCampionato.getSquadre()) {
            // Utilizza il metodo equals() per confrontare la squadra corrente con quella cercata.
            if (s.equals(aSquadra)) {
                // Se viene trovata una corrispondenza, restituisce subito l'oggetto.
                return s;
            }        
        }
        // Se il ciclo termina senza trovare una corrispondenza, restituisce null.
        return null;
    }
    
    /**
     * Cerca e restituisce una lista di squadre i cui stadi hanno una capienza uguale o superiore a un valore dato.
     * @param aCampionato Il campionato in cui cercare.
     * @param capienza La capienza minima richiesta per lo stadio.
     * @return Una nuova lista (LinkedList) contenente le squadre che soddisfano il criterio. La lista sarà vuota se non ne vengono trovate.
     */
    public static List<Squadra> ricercaSquadrePerCapienzaStadio(Campionato aCampionato, int capienza) {
       // Crea una nuova lista per memorizzare i risultati. 
       // Viene usata una LinkedList, anche se per questa operazione un ArrayList sarebbe altrettanto valido e più comune.
       List<Squadra> squadreTrovate = new LinkedList<>();
       // Itera su ogni squadra 's' nel campionato.
       for (Squadra s : aCampionato.getSquadre()) {
            // Controlla se la capienza dello stadio della squadra corrente è maggiore o uguale alla capienza richiesta.
            if (s.getStadio().getCapienza() >= capienza) {
                // Se la condizione è soddisfatta, aggiunge la squadra alla lista dei risultati.
                squadreTrovate.add(s);
            }
        }
        // Restituisce la lista con le squadre trovate.
        return squadreTrovate;
    }
}