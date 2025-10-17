package day_17.esercizio3;

// Importa la classe Objects, una classe di utilità che fornisce metodi statici
// per operare sugli oggetti, come il calcolo dell'hashCode e il confronto sicuro (null-safe).
import java.util.Objects;

/**
 * Rappresenta un Artista, definito principalmente dal suo nome.
 * Questa classe è un "POJO" (Plain Old Java Object) e sovrascrive i metodi equals() e hashCode()
 * per garantire un comportamento corretto quando utilizzata in collezioni come HashSet o HashMap.
 */
public class Artista {
	
	// Campo privato per memorizzare il nome dell'artista.
	private String nome;
	
	/**
	 * Costruttore di default (senza argomenti).
	 * Permette di creare un'istanza vuota di Artista.
	 */
	public Artista() {
		// Chiama il costruttore della classe genitore (Object). Questa chiamata è implicita.
		super();
	}
	
	/**
	 * Costruttore parametrico.
	 * Crea un oggetto Artista inizializzando subito il suo nome.
	 * @param aNome Il nome da assegnare all'artista.
	 */
	public Artista(String aNome) {
		// Chiama il costruttore della classe genitore.
		super();
		// 'this.nome' si riferisce all'attributo della classe,
		// mentre 'aNome' è il parametro passato al costruttore.
		this.nome = aNome;
	}
	
	/**
	 * Restituisce il nome dell'artista.
	 * @return il nome dell'artista.
	 */
	public String getNome() {
		return nome;
	}
	
	/**
	 * Imposta o modifica il nome dell'artista.
	 * @param nome il nuovo nome da impostare.
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Sovrascrive il metodo hashCode() della classe Object.
	 * Calcola un codice hash per l'oggetto basandosi unicamente sul campo 'nome'.
	 * È fondamentale per il corretto funzionamento delle collezioni basate su hash (es. HashSet, HashMap).
	 * Due oggetti uguali (secondo equals()) DEVONO avere lo stesso hashCode.
	 * @return un intero che rappresenta il codice hash.
	 */
	@Override
	public int hashCode() {
		// Utilizza il metodo statico Objects.hash() che gestisce in modo sicuro i valori null
		// e calcola un codice hash combinando i campi forniti (in questo caso, solo 'nome').
		return Objects.hash(nome);
	}

	/**
	 * Sovrascrive il metodo equals() della classe Object.
	 * Definisce la logica di uguaglianza: due oggetti Artista sono considerati uguali
	 * se e solo se hanno lo stesso nome.
	 * @param obj L'oggetto da confrontare con l'istanza corrente.
	 * @return true se gli oggetti sono uguali, false altrimenti.
	 */
	@Override
	public boolean equals(Object obj) {
		// 1. Controllo di identità: se i due riferimenti puntano allo stesso oggetto in memoria, sono uguali.
		if (this == obj)
			return true;
		// 2. Controllo del null: un oggetto non può essere uguale a null.
		if (obj == null)
			return false;
		// 3. Controllo del tipo: se gli oggetti non sono della stessa classe, non possono essere uguali.
		if (getClass() != obj.getClass())
			return false;
		// 4. Cast dell'oggetto, ora sicuro grazie ai controlli precedenti.
		Artista other = (Artista) obj;
		// 5. Confronto dei campi significativi: utilizza Objects.equals per confrontare i nomi in modo sicuro (gestisce correttamente i valori null).
		return Objects.equals(nome, other.nome);
	}

	/**
	 * Sovrascrive il metodo toString() della classe Object.
	 * Fornisce una rappresentazione testuale chiara e leggibile dell'oggetto,
	 * utile per operazioni di stampa e di debug.
	 * @return una stringa formattata con i dettagli dell'artista.
	 */
	@Override
	public String toString() {
		return "Artista [nome=" + nome + "]";
	}
	
}