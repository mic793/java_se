package day_17.esercizio3;

// Importa la classe Objects, una classe di utilità che fornisce metodi statici
// per operare sugli oggetti, come il calcolo dell'hashCode e il confronto sicuro (null-safe).
import java.util.Objects;

/**
 * Rappresenta un CD musicale, definito da un titolo, un artista e un genere.
 * Questa classe è un "POJO" (Plain Old Java Object) che aggrega altre classi modello (Artista, Genere).
 * Sovrascrive i metodi equals() e hashCode() per definire l'uguaglianza basandosi su tutti i suoi campi.
 */
public class Cd {
	
	// Campo privato per memorizzare il titolo del CD.
	private String titolo;
	// Campo privato per memorizzare un riferimento all'oggetto Artista che ha creato il CD.
	private Artista artista;
	// Campo privato per memorizzare un riferimento all'oggetto Genere del CD.
	private Genere genere;
	
	/**
	 * Costruttore di default (senza argomenti).
	 * Permette di creare un'istanza vuota di Cd.
	 */
	public Cd() {
		// Chiama il costruttore della classe genitore (Object). Questa chiamata è implicita.
		super();
	}
	
	/**
	 * Costruttore parametrico.
	 * Crea un oggetto Cd inizializzando subito tutti i suoi campi.
	 * @param aTitolo Il titolo del CD.
	 * @param aArtista L'oggetto Artista del CD.
	 * @param aGenere L'oggetto Genere del CD.
	 */
	public Cd(String aTitolo, Artista aArtista, Genere aGenere) {
		// Chiama il costruttore della classe genitore.
		super();
		// Inizializza gli attributi della classe con i valori passati come parametri.
		this.titolo = aTitolo;
		this.artista = aArtista;
		this.genere = aGenere;
	}
	
	// --- Sezione dei Metodi Getter ---
	// Non ci sono Setter, il che rende l'oggetto "immutabile" dopo la sua creazione,
	// una buona pratica per gli oggetti usati in collezioni.

	/**
	 * Restituisce il titolo del CD.
	 * @return il titolo del CD.
	 */
	public String getTitolo() {
		return titolo;
	}
	
	/**
	 * Restituisce l'oggetto Artista del CD.
	 * @return l'Artista del CD.
	 */
	public Artista getArtista() {
		return artista;
	}
	
	/**
	 * Restituisce l'oggetto Genere del CD.
	 * @return il Genere del CD.
	 */
	public Genere getGenere() {
		return genere;
	}

	/**
	 * Sovrascrive il metodo hashCode() della classe Object.
	 * Calcola un codice hash per l'oggetto combinando gli hashCode di tutti i suoi campi (titolo, artista, genere).
	 * È fondamentale per il corretto funzionamento delle collezioni basate su hash (es. HashSet, HashMap).
	 * @return un intero che rappresenta il codice hash.
	 */
	@Override
	public int hashCode() {
		// Utilizza il metodo statico Objects.hash() che combina in modo sicuro gli hashCode
		// dei campi forniti, gestendo correttamente eventuali valori null.
		return Objects.hash(artista, genere, titolo);
	}

	/**
	 * Sovrascrive il metodo equals() della classe Object.
	 * Definisce la logica di uguaglianza: due oggetti Cd sono considerati uguali
	 * se e solo se hanno lo stesso titolo, lo stesso artista E lo stesso genere.
	 * @param obj L'oggetto da confrontare con l'istanza corrente.
	 * @return true se gli oggetti sono uguali, false altrimenti.
	 */
	@Override
	public boolean equals(Object obj) {
		// 1. Controllo di identità: se i due riferimenti puntano allo stesso oggetto, sono uguali.
		if (this == obj)
			return true;
		// 2. Controllo del null: un oggetto non può essere uguale a null.
		if (obj == null)
			return false;
		// 3. Controllo del tipo: se gli oggetti non sono della stessa classe, non possono essere uguali.
		if (getClass() != obj.getClass())
			return false;
		// 4. Cast dell'oggetto, ora sicuro grazie ai controlli precedenti.
		Cd other = (Cd) obj;
		// 5. Confronto di tutti i campi significativi.
		// Si usa Objects.equals per ogni confronto per gestire in modo sicuro i valori null.
		// La logica si basa sull'implementazione di equals() nelle classi Artista e Genere.
		return Objects.equals(artista, other.artista) && Objects.equals(genere, other.genere)
				&& Objects.equals(titolo, other.titolo);
	}
	
	/**
	 * Sovrascrive il metodo toString() della classe Object.
	 * Fornisce una rappresentazione testuale chiara e leggibile dell'oggetto CD,
	 * utile per operazioni di stampa e di debug.
	 * @return una stringa formattata con i dettagli del CD.
	 */
	@Override
	public String toString() {
		// Questa stringa includerà implicitamente l'output dei metodi toString() delle classi Artista e Genere.
		return "Cd [titolo=" + titolo + ", artista=" + artista + ", genere=" + genere + "]";
	}
}