package day_17.esercizio3;

/**
 * Rappresenta un singolo brano (o traccia) musicale.
 * Ogni brano è definito da un titolo e dall'appartenenza a un specifico CD.
 * Questa classe è un esempio di "composizione", poiché un Brano "ha un" Cd.
 */
public class Brano {
	
	// Campo privato per memorizzare il titolo del brano.
	private String titolo;
	// Campo privato per memorizzare un riferimento all'oggetto Cd a cui il brano appartiene.
	private Cd cd;
	
	/**
	 * Costruttore di default (senza argomenti).
	 * Permette di creare un'istanza vuota di Brano.
	 * In questo caso, i campi 'titolo' e 'cd' rimarranno nulli.
	 */
	public Brano() {
		// Chiama il costruttore della classe genitore (Object). Questa chiamata è implicita.
		super();
	}
	
	/**
	 * Costruttore parametrico.
	 * Crea un oggetto Brano inizializzando subito tutti i suoi campi.
	 * @param aTitolo Il titolo da assegnare al brano.
	 * @param aCd L'oggetto Cd a cui il brano appartiene.
	 */
	public Brano(String aTitolo, Cd aCd) {
		// Chiama il costruttore della classe genitore.
		super();
		// 'this.titolo' si riferisce all'attributo della classe,
		// mentre 'aTitolo' è il parametro passato al costruttore.
		this.titolo = aTitolo;
		this.cd = aCd;
	}

	/**
	 * Sovrascrive il metodo toString() della classe Object.
	 * Fornisce una rappresentazione testuale chiara e leggibile dell'oggetto Brano,
	 * utile per operazioni di stampa e di debug.
	 * @return una stringa formattata con i dettagli del brano.
	 */
	@Override
	public String toString() {
		// Questa stringa includerà implicitamente l'output del metodo toString() della classe Cd.
		return "Brano [titolo=" + titolo + ", cd=" + cd + "]";
	}
	
	// --- NOTE IMPORTANTI SUI METODI MANCANTI ---
	//
	// GETTERS e SETTERS:
	//    Questa classe non ha metodi Getter (es. getTitolo()) né Setter.
	//    - L'assenza di Getter significa che una volta creato un oggetto Brano,
	//      non è possibile leggere i suoi campi dall'esterno.
	//    - L'assenza di Setter rende i campi "immutabili" dopo la creazione tramite costruttore.
	//    A seconda dello scopo della classe, questo potrebbe essere voluto o una dimenticanza.
	//
	// 
}