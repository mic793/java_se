package day_12.ex_09_campionato;

/**
 * Rappresenta uno stadio di calcio.
 * Questa classe è un "POJO" (Plain Old Java Object), il cui scopo principale
 * è contenere i dati relativi a uno stadio, come nome, capienza e città.
 */
public class Stadio {

	// Campo privato per memorizzare il nome dello stadio.
	private String nome;
	// Campo privato per memorizzare la capienza massima di spettatori.
	private int capienza;
	// Campo privato per memorizzare la città in cui si trova lo stadio.
	private String citta;

	/**
	 * Costruttore di default (senza argomenti).
	 * Permette di creare un'istanza vuota di Stadio. Gli attributi
	 * potranno essere impostati in seguito usando i metodi setter.
	 */
	public Stadio() {
		// Chiama il costruttore della classe genitore (Object).
		// Questa chiamata è spesso implicita e può essere omessa.
		super();
	}

	/**
	 * Costruttore parametrico.
	 * Permette di creare un oggetto Stadio fornendo subito tutti i suoi dati.
	 * @param aNome Il nome dello stadio.
	 * @param aCapienza La capienza massima di spettatori.
	 * @param aCitta La città in cui si trova lo stadio.
	 */
	public Stadio(String aNome, int aCapienza, String aCitta) {
		// Chiama il costruttore della classe genitore.
		super();
		// Inizializza gli attributi (campi) della classe con i valori passati come parametri.
		// 'this' serve a distinguere il campo della classe (es. this.nome) dal parametro del metodo (es. aNome).
		this.nome = aNome;
		this.capienza = aCapienza;
		this.citta = aCitta;
	}

	// --- Sezione dei metodi Getter e Setter ---
	// Questi metodi forniscono un accesso pubblico e controllato ai campi privati,
	// seguendo il principio dell'incapsulamento dei dati.

	/**
	 * Restituisce il nome dello stadio.
	 * @return il nome dello stadio.
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Imposta o modifica il nome dello stadio.
	 * @param nome il nuovo nome da impostare.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Restituisce la capienza dello stadio.
	 * @return la capienza massima.
	 */
	public int getCapienza() {
		return capienza;
	}

	/**
	 * Imposta o modifica la capienza dello stadio.
	 * @param capienza la nuova capienza da impostare.
	 */
	public void setCapienza(int capienza) {
		this.capienza = capienza;
	}

	/**
	 * Restituisce la città in cui si trova lo stadio.
	 * @return la città dello stadio.
	 */
	public String getCitta() {
		return citta;
	}

	/**
	 * Imposta o modifica la città dello stadio.
	 * @param citta la nuova città da impostare.
	 */
	public void setCitta(String citta) {
		this.citta = citta;
	}

	/**
	 * Override del metodo toString() della classe Object.
	 * Fornisce una rappresentazione testuale personalizzata e leggibile dell'oggetto Stadio,
	 * utile per operazioni di stampa e debug.
	 * @return una stringa formattata con tutti i dettagli dello stadio.
	 */
	@Override
	public String toString() {
		return "Stadio [nome=" + nome + ", capienza=" + capienza + ", citta=" + citta + "]";
	}
}