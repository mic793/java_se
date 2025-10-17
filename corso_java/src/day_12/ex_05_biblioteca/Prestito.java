package day_12.ex_05_biblioteca;

//Importa la classe LocalDate dal package java.time per poter gestire le date.
import java.time.LocalDate;

/**
* Rappresenta l'associazione tra un Abbonato e un Libro, ovvero un prestito.
* Contiene i riferimenti all'abbonato e al libro, la data di inizio del prestito
* e la durata standard.
*/
public class Prestito {

	// Campo privato per memorizzare l'oggetto Abbonato associato al prestito.
	private Abbonato abbonato;
	
	// Campo privato per memorizzare l'oggetto Libro associato al prestito.
	private Libro libro;
	
	// Campo privato per la data di inizio del prestito.
	// Viene inizializzato automaticamente con la data corrente al momento della creazione dell'oggetto.
	private LocalDate data = LocalDate.now();
	
	// Campo privato e finale (costante) che definisce la durata del prestito in giorni.
	// 'final' significa che il suo valore non può essere cambiato dopo l'inizializzazione.
	private final int giorniPrestito = 30;

	/**
	 * Costruttore di default (senza argomenti).
	 * Crea un oggetto Prestito vuoto con la data impostata al momento della creazione.
	 */
	public Prestito() {
		// Chiama il costruttore della classe genitore (Object).
		super();
	}

	/**
	 * Costruttore parametrico.
	 * Crea un oggetto Prestito associando subito un abbonato e un libro.
	 * La data viene impostata automaticamente.
	 * @param abbonato L'oggetto Abbonato che prende il libro in prestito.
	 * @param libro L'oggetto Libro che viene dato in prestito.
	 */
	public Prestito(Abbonato abbonato, Libro libro) {
		// Chiama il costruttore della classe genitore.
		super();
		// Assegna l'abbonato e il libro passati come parametri agli attributi della classe.
		this.abbonato = abbonato;
		this.libro = libro;
	}

	/**
	 * Metodo Getter: restituisce l'oggetto Abbonato associato a questo prestito.
	 * @return l'Abbonato del prestito.
	 */
	public Abbonato getAbbonato() {
		return abbonato;
	}

	/**
	 * Metodo Setter: imposta o modifica l'Abbonato associato a questo prestito.
	 * @param abbonato il nuovo Abbonato da associare.
	 */
	public void setAbbonato(Abbonato abbonato) {
		this.abbonato = abbonato;
	}

	/**
	 * Metodo Getter: restituisce l'oggetto Libro associato a questo prestito.
	 * @return il Libro del prestito.
	 */
	public Libro getLibro() {
		return libro;
	}

	/**
	 * Metodo Setter: imposta o modifica il Libro associato a questo prestito.
	 * @param libro il nuovo Libro da associare.
	 */
	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	/**
	 * Metodo Getter: restituisce la data di inizio del prestito.
	 * @return la data del prestito.
	 */
	public LocalDate getData() {
		return data;
	}

	/**
	 * Metodo Setter: imposta o modifica la data di inizio del prestito.
	 * @param data la nuova data da impostare.
	 */
	public void setData(LocalDate data) {
		this.data = data;
	}

	/**
	 * Metodo Getter: restituisce la durata fissa del prestito in giorni.
	 * Non c'è un metodo 'set' corrispondente perché il campo è 'final' (una costante).
	 * @return il numero di giorni di durata del prestito.
	 */
	public int getGiorniPrestito() {
		return giorniPrestito;
	}

	/**
	 * Override del metodo toString per fornire una rappresentazione testuale dell'oggetto Prestito.
	 * Chiama implicitamente i metodi toString() delle classi Abbonato e Libro.
	 * @return una stringa formattata con tutti i dettagli del prestito.
	 */
	@Override
	public String toString() {
		return "Prestito [\n  abbonato=" + abbonato + ",\n  libro=" + libro + ",\n  data=" + data + ", giorniPrestito="
				+ giorniPrestito + "\n]";
	}

}