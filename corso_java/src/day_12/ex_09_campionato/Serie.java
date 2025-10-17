package day_12.ex_09_campionato;

/**
 * Rappresenta le diverse serie (divisioni) di un campionato di calcio.
 * Questo enum definisce un insieme fisso di costanti (SERIE_A, SERIE_B, etc.)
 * e associa a ciascuna di esse una rappresentazione testuale (es. "A").
 */
public enum Serie {
    
    // Definizione delle costanti enum. Ognuna è un'istanza di Serie.
    // Il valore tra parentesi è l'argomento passato al costruttore privato.
    SERIE_A("A"),
    SERIE_B("B"),
    SERIE_C("C"),
    SERIE_D("D");
    
    // Campo privato e finale per memorizzare il nome (o simbolo) della serie.
    // 'final' assicura che il valore non possa essere cambiato dopo l'inizializzazione.
    private final String nome;
    
    /**
     * Costruttore privato dell'enum.
     * Viene chiamato automaticamente e solo internamente per ogni costante definita sopra.
     * @param aNome La stringa che rappresenta la serie (es. "A").
     */
    private Serie(String aNome) {
        // Assegna il parametro passato al campo privato 'nome'.
        this.nome = aNome;
    }
    
    /**
     * Metodo Getter pubblico per accedere al nome della serie.
     * @return una stringa che rappresenta il nome della serie (es. "A").
     */
    public String getNome() {
        return nome;
    }
    
    /**
     * Metodo statico di utilità (factory method) per trovare una costante Serie
     * a partire dalla sua rappresentazione testuale, ignorando maiuscole/minuscole.
     * @param nome La stringa da cui ricavare l'enum (es. "a", "B").
     * @return L'oggetto Serie corrispondente se trovato, altrimenti null.
     */
    public static Serie fromNome(String nome) {
        // 'values()' è un metodo statico implicito che restituisce un array di tutte le costanti dell'enum.
        for (Serie s : values()) {
            // Confronta il nome della costante enum corrente con la stringa fornita, in modo case-insensitive.
            if (s.nome.equalsIgnoreCase(nome)) {
                // Se trova una corrispondenza, restituisce la costante enum.
                return s;
            }
        }
        // Se il ciclo termina senza trovare corrispondenze, restituisce null.
        return null;
    }
}