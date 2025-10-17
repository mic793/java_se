package day_12.ex_05_biblioteca;

/**
 * Rappresenta un Libro con i suoi dati bibliografici principali.
 * Questa è una classe "POJO" (Plain Old Java Object), utilizzata per contenere
 * e trasportare i dati relativi a un libro.
 */
public class Libro {
	
	// Campo privato per memorizzare il codice ISBN (International Standard Book Number) del libro.
	private String isbn; // attributo dichiarato privato-->accessibile solo dal codice scritto all'interno della stessa classe
	
	// Campo privato per memorizzare il nome della casa editrice.
	private String casaEditrice;
	
	// Campo privato per memorizzare il titolo del libro.
	private String titolo;
	
	// Campo privato per memorizzare l'autore del libro.
	private String autore;
	
	/**
	 * costruttore di default (senza argomenti).
	 * Permette di creare un oggetto Libro vuoto.
	 */
	public Libro() {
		// Chiama il costruttore della classe genitore (Object).
		super();
	}
	
	/**
	 * costruttore parametrico.
	 * Crea un oggetto Libro inizializzando subito i suoi attributi.
	 * @param isbn Il codice ISBN del libro.
	 * @param casaEditrice La casa editrice del libro.
	 * @param titolo Il titolo del libro.
	 * @param autore L'autore del libro.
	 */
	public Libro(String isbn, String casaEditrice, String titolo, String autore) {
		// Chiama il costruttore della classe genitore.
		super();
		// 'this' si usa per distinguere l'attributo della classe dal parametro del metodo.
		this.isbn = isbn; // inizializzazione degli attributi tramite i parametri passati al costruttore parametrico
		this.casaEditrice = casaEditrice;
		this.titolo = titolo;
		this.autore = autore;
	}

	// I metodi GET e SET permettono di accedere e modificare in modo controllato 
	// i campi privati di una classe, mantenendo l’incapsulamento.
	
	/**
	 * Restituisce il codice ISBN del libro.
	 * @return una stringa che rappresenta l'ISBN.
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Imposta o aggiorna il codice ISBN del libro.
	 * @param isbn Il nuovo codice ISBN da impostare.
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Restituisce la casa editrice del libro.
	 * @return una stringa che rappresenta la casa editrice.
	 */
	public String getCasaEditrice() {
		return casaEditrice;
	}

	/**
	 * Imposta o aggiorna la casa editrice del libro.
	 * @param casaEditrice La nuova casa editrice da impostare.
	 */
	public void setCasaEditrice(String casaEditrice) {
		this.casaEditrice = casaEditrice;
	}

	/**
	 * Restituisce il titolo del libro.
	 * @return una stringa che rappresenta il titolo.
	 */
	public String getTitolo() {
		return titolo;
	}

	/**
	 * Imposta o aggiorna il titolo del libro.
	 * @param titolo Il nuovo titolo da impostare.
	 */
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	/**
	 * Restituisce l'autore del libro.
	 * @return una stringa che rappresenta l'autore.
	 */
	public String getAutore() {
		return autore;
	}

	/**
	 * Imposta o aggiorna l'autore del libro.
	 * @param autore Il nuovo autore da impostare.
	 */
	public void setAutore(String autore) {
		this.autore = autore;
	}

	/**
	 * Override del metodo toString per fornire una rappresentazione testuale dell'oggetto Libro.
	 * @return una stringa formattata con i dettagli del libro.
	 */
	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", casaEditrice=" + casaEditrice + ", titolo=" + titolo + ", autore=" + autore
				+ "]";
	}
}