package day_12.ex_06_prenotazione;

import java.util.ArrayList;
import java.util.List;

/*
 * Rappresenta un singolo campo sportivo o una risorsa prenotabile,
 * gestendo l'aggiunta, la rimozione e il calcolo dell'utilizzo delle prenotazioni.
 */
public class Campo {
    // Lista privata che memorizza tutte le prenotazioni effettuate per questo campo.
    private List<Prenotazione> prenotazioni = new ArrayList<>();
    
    // Costante che definisce l'ora di apertura del campo (formato 24h).
    private static final int ORA_APERTURA = 8;
    // Costante che definisce l'ora di chiusura del campo (formato 24h).
    private static final int ORA_CHIUSURA = 20;

    /*
     * Aggiunge una nuova prenotazione se l'orario è valido e non si sovrappone con altre prenotazioni esistenti.
     */
    public boolean addPren(int inizio, int fine, String unNomeCliente) {
        // Controlla se gli orari inseriti sono validi (dentro l'orario di apertura/chiusura e con inizio < fine).
        if (inizio < ORA_APERTURA || fine > ORA_CHIUSURA || inizio >= fine) {
            return false; // Restituisce false se i dati non sono validi.
        }
        // Itera su tutte le prenotazioni esistenti per verificare eventuali sovrapposizioni.
        for (Prenotazione p : prenotazioni) {
            // Questa condizione controlla se c'è una sovrapposizione tra la nuova prenotazione e una esistente.
            // L'orario è libero solo se la nuova prenotazione finisce prima dell'inizio di un'altra (fine <= p.getInizio())
            // O se inizia dopo la fine di un'altra (inizio >= p.getFine()).
            // Se nessuna di queste due condizioni è vera, allora c'è una sovrapposizione.
            if (!(fine <= p.getInizio() || inizio >= p.getFine())) {
                return false; // Restituisce false perché è stata trovata una sovrapposizione.
            }
        }
        // Se tutti i controlli sono superati, crea una nuova prenotazione e la aggiunge alla lista.
        prenotazioni.add(new Prenotazione(unNomeCliente, inizio, fine));
        // Restituisce true per confermare che l'operazione è andata a buon fine.
        return true;
    }

    /**
     * Rimuove una prenotazione esistente che corrisponde esattamente ai parametri forniti.
     */
    public boolean removePren(int inizio, int fine, String unNomeCliente) {
        // Itera su tutte le prenotazioni per trovare quella da rimuovere.
        // NOTA: La rimozione all'interno di un ciclo for-each è sicura qui solo perché
        // l'istruzione 'return' interrompe immediatamente il ciclo, evitando una ConcurrentModificationException.
        for (Prenotazione p : prenotazioni) {
            // Controlla se la prenotazione corrente corrisponde a tutti i parametri forniti.
            if (p.getInizio() == inizio && p.getFine() == fine && p.getNomeCliente().equals(unNomeCliente)) {
                // Se viene trovata una corrispondenza, la rimuove dalla lista.
                prenotazioni.remove(p);
                // Restituisce true per indicare che la rimozione è avvenuta con successo.
                return true;
            }
        }
        // Se il ciclo termina senza trovare una prenotazione corrispondente, restituisce false.
        return false;
    }

    /**
     * Calcola la percentuale di utilizzo del campo in base alle ore prenotate.
     */
    public double utilizzo() {
        // Calcola il numero totale di ore di apertura del campo.
        int totaleOre = ORA_CHIUSURA - ORA_APERTURA;
        // Inizializza un contatore per le ore totali prenotate.
        int orePrenotate = 0;
        // Itera su tutte le prenotazioni per sommare la loro durata.
        for (Prenotazione p : prenotazioni) {
            orePrenotate += (p.getFine() - p.getInizio());//orePrenotate = orePrenotate + (p.getFine() - p.getInizio())
        }
        // Calcola la percentuale. Moltiplicare per 100.0 forza una divisione tra double
        // per ottenere un risultato con la virgola, invece di una divisione intera.
        return (orePrenotate * 100.0) / totaleOre;
    }

    /**
     * Restituisce una rappresentazione testuale dello stato del campo, mostrando tutte le prenotazioni.
     */
    @Override
    public String toString() {
        // Usa il metodo toString() della lista di prenotazioni per creare una stringa leggibile.
        return "Prenotazioni: " + prenotazioni.toString();
    }
}