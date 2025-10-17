package day_12.ex_09_campionato;

/**
 * Rappresenta i ruoli che un giocatore può avere in una squadra.
 * Questo enum è arricchito con un nome completo e un'abbreviazione per ogni ruolo,
 * oltre a metodi di utilità per la conversione da stringa.
 */
public enum Ruolo {
    // Definizione delle costanti enum. Ognuna è un'istanza di Ruolo.
    // I valori tra parentesi sono gli argomenti passati al costruttore privato.
    POR("Portiere", "POR"),
    DC("Difensore", "DC"),
    CC("Centrocampista", "CC"),
    ATT("Attaccante", "ATT");
    
    // Campo privato e finale per memorizzare il nome completo del ruolo (es. "Portiere").
    // 'final' assicura che il valore non possa essere cambiato dopo l'inizializzazione.
    private final String nome;
    // Campo privato per memorizzare l'abbreviazione del ruolo (es. "POR").
    private String abbr;
    
    /**
     * Costruttore privato dell'enum.
     * Viene chiamato automaticamente per ogni costante definita (POR, DC, etc.).
     * @param aNome Il nome completo del ruolo.
     * @param aAbbr L'abbreviazione del ruolo.
     */
    private Ruolo(String aNome, String aAbbr) {
        // Assegna i parametri passati ai campi privati dell'istanza enum.
        this.nome = aNome;
        this.abbr = aAbbr;
    }
    
    /**
     * Metodo Getter per ottenere il nome completo del ruolo.
     * @return una stringa con il nome completo.
     */
    public String getNome() {
        return nome;
    }
   
    /**
     * Metodo Getter per ottenere l'abbreviazione del ruolo.
     * @return una stringa con l'abbreviazione.
     */
    public String getAbbr() {
        return abbr;
    }
    
    /**
     * Metodo statico di utilità (factory method) per trovare una costante Ruolo
     * a partire dal suo nome.
     * @param nome Il nome del ruolo da cercare.
     * @return L'oggetto Ruolo corrispondente se trovato, altrimenti null.
     */
    public static Ruolo fromNome(String nome) {
        // 'values()' è un metodo statico implicito che restituisce un array di tutte le costanti dell'enum.
        for (Ruolo r : values()) {
            // Il codice attuale confronta l'abbreviazione, rendendo questo metodo un duplicato di fromAbbr.
            // Codice corretto: if (r.nome.equalsIgnoreCase(nome))
            if (r.nome.equalsIgnoreCase(nome))
                return r;
        }
        // Se il ciclo termina senza trovare corrispondenze, restituisce null.
        return null;
    }
    
    /**
     * Metodo statico di utilità (factory method) per trovare una costante Ruolo
     * a partire dalla sua abbreviazione, ignorando maiuscole/minuscole.
     * @param abbr L'abbreviazione del ruolo da cercare (es. "dc").
     * @return L'oggetto Ruolo corrispondente se trovato, altrimenti null.
     */
    public static Ruolo fromAbbr(String abbr) {
        // Itera su tutte le costanti dell'enum.
        for (Ruolo r : values()) {
            // Confronta l'abbreviazione della costante enum corrente con la stringa fornita.
            if (r.abbr.equalsIgnoreCase(abbr))
                // Se trova una corrispondenza, restituisce la costante enum.
                return r;
        }
        // Se non viene trovata nessuna corrispondenza, restituisce null.
        return null;
    }
}