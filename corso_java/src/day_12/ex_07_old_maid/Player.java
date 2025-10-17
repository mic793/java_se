package day_12.ex_07_old_maid;

import java.util.ArrayList;
import java.util.List;

/**
 * Rappresenta un giocatore in una partita di carte.
 * Ogni giocatore ha un nome e una "mano" di carte.
 */
public class Player {
	
	// Lista privata che rappresenta la "mano" del giocatore, ovvero le carte che possiede.
	private List<Carta> carte;
	// Campo privato per memorizzare il nome del giocatore.
	private String nome;
	
	/**
	 * Costruttore di default.
	 * Crea un giocatore con un nome predefinito ("anonymous").
	 * Utilizza la tecnica del "constructor chaining" chiamando l'altro costruttore.
	 */
	public Player() {
		// Chiama il costruttore più specifico (quello con il parametro String)
		// passando "anonymous" come nome di default.
		this("anonymous");
	}
	
	/**
	 * Costruttore parametrico.
	 * Crea un giocatore con un nome specifico e inizializza la sua mano come una lista vuota.
	 * @param nome Il nome da assegnare al giocatore.
	 */
	public Player(String nome) {
		// Inizializza la lista di carte come un nuovo ArrayList vuoto(carte in mano al giocatore).
		this.carte = new ArrayList<>();
		// Assegna il nome passato come parametro all'attributo della classe.
		this.nome = nome;
	}
	
	
	
	public List<Carta> getCarte() {
		return carte;
	}

	public void setCarte(List<Carta> carte) {
		this.carte = carte;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Aggiunge una carta alla mano del giocatore.
	 * @param carta La carta da aggiungere.
	 */
	public void aggiungeCarta(Carta carta) {
		// Utilizza il metodo .add() della lista per inserire la carta nella mano.
		carte.add(carta);
	}
	
	/**
	 * Controlla se la mano del giocatore è vuota (non ha carte).
	 * @return true se la mano è vuota, false altrimenti.
	 */
	public boolean isEmpty() {
		// Delega il controllo al metodo .isEmpty() della lista di carte.
		return carte.isEmpty();
	}
	
	/**
	 * Override del metodo toString() per fornire una rappresentazione testuale chiara
	 * del giocatore e delle carte nella sua mano.
	 * @return Una stringa formattata che descrive la mano del giocatore.
	 */
	@Override
	public String toString() {
		// Usa uno StringBuilder per costruire la stringa in modo efficiente.
		StringBuilder sb = new StringBuilder("La mano di " + nome);
		// Controlla se la mano è vuota.
		if(carte.isEmpty()) {
				// Se è vuota, aggiunge un messaggio specifico.
				sb.append(" e' vuota\n");
			} else {
				// Se non è vuota, aggiunge un'intestazione per la lista delle carte.
				sb.append(" contiene queste carte:\n");
				// Itera su ogni carta ('c') presente nella mano.
				for(Carta c : carte) {
					// Aggiunge la rappresentazione testuale di ogni carta (dal suo metodo toString())
					// seguita da un carattere di nuova riga.
					sb.append(c.toString()).append("\n");
				}
			}
			// Restituisce la stringa completa costruita dallo StringBuilder.
			return sb.toString();
		}
}
