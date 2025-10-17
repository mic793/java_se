package day_12.ex_07_old_maid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Rappresenta un mazzo di carte da gioco.
 * Questa classe gestisce la creazione, la mescolata, la distribuzione
 * e altre operazioni comuni su un mazzo di carte.
 */
public class Mazzo {

	// Lista privata che contiene tutte le carte presenti nel mazzo.
	private List<Carta> carte; // attributo

	/**
	 * Costruttore della classe Mazzo.
	 * Inizializza il mazzo creando un set completo di carte da gioco,
	 * una per ogni combinazione di Seme e Rango, escludendo il rango "IMPOSSIBILE".
	 */
	public Mazzo() {
		// Inizializza la lista di carte come un nuovo ArrayList.
		carte = new ArrayList<>();

		// Ciclo 'for-each' che itera su tutti i possibili valori dell'enum SEME.
		for (Carta.SEME seme : Carta.SEME.values()) {
			// Ciclo 'for-each' interno che itera su tutti i possibili valori dell'enum RANGO.
			for (Carta.RANGO rango : Carta.RANGO.values()) {
				// Controlla per escludere il valore speciale IMPOSSIBILE dal mazzo.
				if (rango != Carta.RANGO.IMPOSSIBILE) {
					// Crea una nuova carta con la combinazione corrente di seme e rango e la aggiunge alla lista.
					carte.add(new Carta(seme, rango));
				}
			}
		}
	}

	/**
	 * Mescola le carte nel mazzo in ordine casuale.
	 */
	public void mescola() {
		// Utilizza il metodo statico 'shuffle' della classe Collections per riordinare casualmente la lista.
		Collections.shuffle(carte);
	}

	/**
	 * Override del metodo toString() per fornire una rappresentazione testuale del mazzo,
	 * con le carte stampate in modo scalato.
	 * @return Una stringa che rappresenta l'intero mazzo.
	 */
	public String toString() {
		// Usa uno StringBuilder per costruire la stringa in modo efficiente.
		StringBuilder sb = new StringBuilder();
		// Cicla attraverso tutte le carte nella lista.
		for (int i = 0; i < carte.size(); i++) {
			// Aggiunge un numero di spazi pari all'indice della carta per creare un effetto visivo di "scalatura".
			sb.append(" ".repeat(i)).append(carte.get(i)).append("\n");
		}
		// Restituisce la stringa costruita.
		return sb.toString();
	}

	/**
	 * Rimuove una carta specifica dal mazzo.
	 * @param carta L'oggetto Carta da rimuovere.
	 * @return true se la carta era presente ed è stata rimossa, false altrimenti.
	 */
	public boolean rimuoviCarta(Carta carta) {
		// Utilizza il metodo .remove() della lista, che si basa sul metodo .equals() della classe Carta.
		return carte.remove(carta);
	}

	/**
	 * Estrae la prima carta disponibile dalla "cima" del mazzo (in questo caso, l'ultima della lista).
	 * @return La carta estratta, o null se il mazzo è vuoto.
	 */
	public Carta primaCarta() {
		// Controlla se il mazzo è vuoto per evitare eccezioni.
		if (carte.isEmpty())
			return null;
		// Rimuove e restituisce l'ultima carta della lista (simulando la pesca dalla cima di un mazzo reale).
		return carte.remove(carte.size() - 1);
	}

	/**
	 * Controlla se il mazzo è vuoto.
	 * @return true se non ci sono più carte nel mazzo, false altrimenti.
	 */
	public boolean isEmpty() {
		// Delega il controllo al metodo .isEmpty() della lista sottostante.
		return carte.isEmpty();
	}

	/**
	 * Distribuisce un numero specifico di carte ai giocatori, una alla volta in modo ciclico.
	 * @param playersList La lista dei giocatori a cui distribuire le carte.
	 * @param numCarte Il numero totale di carte da distribuire a ogni giocatore.
	 */
	public void distribuisci(List<Player> playersList, int numCarte) {
		// Ottiene il numero di giocatori.
		int playersNumber = playersList.size();
		// Cicla per il numero di carte da dare a ciascun giocatore.
		for (int i = 0; i < numCarte; i++) {
			// Cicla per ogni giocatore
			for(int j = 0; j < playersNumber; j++) {
				// Si ferma se il mazzo finisce.
				if (this.isEmpty())
					break;
				// Pesca una carta dal mazzo.
				Carta carta = primaCarta();
				// Aggiunge la carta al giocatore corrente.
				playersList.get(j).aggiungeCarta(carta);
			}
		}
	}

	/**
	 * Metodo sovraccaricato (overload) che distribuisce tutte le carte rimanenti nel mazzo
	 * ai giocatori, una alla volta in modo ciclico.
	 * @param listaGiocate La lista dei giocatori a cui distribuire le carte.
	 */
	public void distribuisci(List<Player> listaGiocate) {
		// Chiama il metodo più specifico passando un valore altissimo per assicurarsi
		// che tutte le carte vengano distribuite fino a esaurimento del mazzo.
		distribuisci(listaGiocate, Integer.MAX_VALUE);
	}
}