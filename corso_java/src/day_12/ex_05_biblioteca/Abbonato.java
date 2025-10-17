package day_12.ex_05_biblioteca;

/**
 * Rappresenta un Abbonato con i suoi dati anagrafici fondamentali.
 * Questa classe è un "POJO" (Plain Old Java Object), utilizzata principalmente
 * per contenere e trasportare dati.
 */
public class Abbonato {
	
	// Campo privato per memorizzare il Codice Fiscale dell'abbonato.
	private String cF; // attributo
	
	// Campo privato per memorizzare il nome dell'abbonato.
	private String nome; // attributo dichiarato privato-->accessibile solo dal codice scritto all'interno della stessa classe
	
	// Campo privato per memorizzare il cognome dell'abbonato.
	private String cognome; // attributo
	

	/**
	 * costruttore di default (senza argomenti).
	 * Permette di creare un oggetto Abbonato vuoto.
	 */
	public Abbonato() {
		// Chiama esplicitamente il costruttore della classe genitore (Object).
		// Questa chiamata è inserita automaticamente dal compilatore se non presente.
		super();
	}
	
	/**
	 * costruttore parametrico.
	 * Crea un oggetto Abbonato inizializzando subito i suoi attributi.
	 */
	public Abbonato(String cF, String nome, String cognome ) {
		// Chiama il costruttore della classe genitore.
		super();
		// 'this' si usa per distinguere l'attributo della classe dal parametro del metodo quando hanno lo stesso nome.
		this.cF = cF; // inizializzazione degli attributi tramite i parametri passati al costruttore parametrico
		this.nome = nome;
		this.cognome = cognome;
	}

	// I metodi GET e SET permettono di accedere e modificare in modo controllato 
	// i campi privati di una classe, mantenendo l’incapsulamento.
	
	/**
	 * Restituisce il Codice Fiscale dell'abbonato.
	 * @return una stringa che rappresenta il Codice Fiscale.
	 */
	public String getcF() {
		return cF;
	}

	/**
	 * Imposta o aggiorna il Codice Fiscale dell'abbonato.
	 * @param cF Il nuovo Codice Fiscale da impostare.
	 */
	public void setcF(String cF) {
		this.cF = cF;
	}

	/**
	 * Restituisce il nome dell'abbonato.
	 * @return una stringa che rappresenta il nome.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Imposta o aggiorna il nome dell'abbonato.
	 * @param nome Il nuovo nome da impostare.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce il cognome dell'abbonato.
	 * @return una stringa che rappresenta il cognome.
	 */
	public String getCognome() {
		return cognome;
	}

	/**
	 * Imposta o aggiorna il cognome dell'abbonato.
	 * @param cognome Il nuovo cognome da impostare.
	 */
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	// L'annotazione @Override indica che si sta sovrascrivendo il metodo toString ereditato, 
	// così da personalizzare la rappresentazione testuale dell’oggetto.
	@Override
	/**
	 * Serve per ottenere una rappresentazione testuale leggibile di un oggetto, 
	 * utile per stampe, debug e logging.
	 * @return una stringa formattata con i dettagli dell'abbonato.
	 */
	public String toString() {
		return "Abbonato [cF=" + cF + ", nome=" + nome + ", cognome=" + cognome + "]";
	}
}
