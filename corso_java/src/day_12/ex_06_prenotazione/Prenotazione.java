package day_12.ex_06_prenotazione;

/**
 * Rappresenta una singola prenotazione.
 * Contiene le informazioni relative al cliente e all'intervallo di tempo prenotato.
 * Questa è una classe POJO (Plain Old Java Object).
 */
public class Prenotazione {
	
	// Campo privato per memorizzare il nome del cliente.
	private String nomeCliente; // attributo dichiarato privato-->accessibile solo dal codice scritto all'interno della stessa classe
	
	// Campo privato per memorizzare l'ora di inizio della prenotazione.
	private int inizio; // attributo 
	
	// Campo privato per memorizzare l'ora di fine della prenotazione.
	private int fine; // attributo 
	
	/**
	 * Costruttore di default (senza argomenti).
	 * Viene fornito per flessibilità, anche se in questo contesto potrebbe non essere utilizzato.
	 */
	public Prenotazione(){
		// Chiama il costruttore della classe genitore (Object). Questa chiamata è spesso implicita.
		super();
	}
	
	/**
	 * Costruttore parametrico.
	 * Permette di creare un'istanza della classe fornendo subito tutti i valori necessari.
	 */
	public Prenotazione(String nomeCliente, int inizio, int fine) {
		// Chiama il costruttore della classe genitore (Object).
		super();
		// 'this.nomeCliente' si riferisce all'attributo della classe,
		// mentre 'nomeCliente' si riferisce al parametro passato al costruttore.
		this.nomeCliente = nomeCliente;
		this.inizio = inizio;
		this.fine = fine;
	}

	/**
	 * Metodo Getter: restituisce il nome del cliente.
	 * @return Il nome del cliente.
	 */
	public String getNomeCliente() {
		return nomeCliente;
	}

	/**
	 * Metodo Setter: imposta o modifica il nome del cliente.
	 * @param nomeCliente Il nuovo nome del cliente.
	 */
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	/**
	 * Metodo Getter: restituisce l'ora di inizio.
	 * @return L'ora di inizio.
	 */
	public int getInizio() {
		return inizio;
	}

	/**
	 * Metodo Setter: imposta o modifica l'ora di inizio.
	 * @param inizio La nuova ora di inizio.
	 */
	public void setInizio(int inizio) {
		this.inizio = inizio;
	}

	/**
	 * Metodo Getter: restituisce l'ora di fine.
	 * @return L'ora di fine.
	 */
	public int getFine() {
		return fine;
	}

	/**
	 * Metodo Setter: imposta o modifica l'ora di fine.
	 * @param fine La nuova ora di fine.
	 */
	public void setFine(int fine) {
		this.fine = fine;
	}

	/**
	 * Override del metodo toString().
	 * Fornisce una rappresentazione testuale dell'oggetto Prenotazione,
	 * utile per il debug e per la stampa a video.
	 */
	@Override
	public String toString() {
		return "Prenotazione [nomeCliente=" + nomeCliente + ", inizio=" + inizio + ", fine=" + fine + "]";
	}
}