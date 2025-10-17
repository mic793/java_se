package day_00_es_07_spedizione;

/*
 * Esercizio 7: Gestione di un sistema di spedizione pacchi
 * Creare un sistema per gestire le spedizioni di pacchi di diverso tipo, calcolandone il costo in base alle loro caratteristiche.
 * Requisiti
 * 1.	Classe Indirizzo:
 * 		•	Attributi: via (String), città (String), cap (String).
 * 		•	Metodi:
 * 			o	Un costruttore per inizializzare tutti gli attributi.
 * 			o	Metodi get per accedere agli attributi.
 * 			o	Un metodo toString() per fornire una rappresentazione testuale completa dell'indirizzo.
 * 
 * 2.	Classe base Pacco:
 * 		•	Dovrebbe essere una classe astratta.
 * 		•	Attributi: peso (double), destinazione (oggetto Indirizzo).
 * 		•	Metodi:
 * 			o	Un costruttore per inizializzare il peso e la destinazione.
 * 			o	Un metodo astratto calcolaCosto() che restituisce un double.
 * 			o	Un metodo stampaDettagli() che stampa le informazioni base del pacco (peso, destinazione).
 * 
 * 3.	Sottoclassi concrete:
 * 		•	PaccoStandard: Estende Pacco. Il costo è fisso per ogni kg (es. 2,50€ al kg).
 * 		•	PaccoFragile: Estende Pacco. Aggiunge una percentuale di sovrapprezzo sul costo base (es. 15%). 
 * 			Sovrascrive il metodo calcolaCosto() per includere il sovrapprezzo.
 *  
 * 4.	Classe GestoreSpedizioni:
 * 		•	Attributi: Una collezione di pacchi in attesa di spedizione, ad esempio un LinkedList<Pacco>.
 * 		•	Metodi:
 * 			o	aggiungiPacco(Pacco pacco): aggiunge un pacco alla lista.
 * 			o	calcolaCostoTotale(): somma e restituisce il costo di spedizione di tutti i pacchi nella lista.
 * 			o	elencaSpedizioni(): stampa i dettagli di ogni pacco presente.
 * 
 * 5.	Classe TestSpedizioni:
 * 		•	Crea un'istanza di GestoreSpedizioni.
 * 		•	Aggiunge diversi pacchi (standard e fragili) al gestore.
 * 		•	Calcola e stampa il costo totale di tutte le spedizioni.
 * 		•	Elenca i dettagli di ogni spedizione.

 */
public class Indirizzo {
	
	private String via;
	private String citta;
	private String cap;
	
	public Indirizzo() {
		super();
	}
	
	public Indirizzo(String aVia, String aCitta, String aCap) {
		this.via = aVia;
		this.citta = aCitta;
		this.cap = aCap;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String aVia) {
		this.via = aVia;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String aCitta) {
		this.citta = aCitta;
	}

	public String getCap() {
		return cap;
	}

	public void setCap(String aCap) {
		this.cap = aCap;
	}

	@Override
	public String toString() {
		return " Indirizzo via=" + via + ", citta=" + citta + ", cap=" + cap;
	}
	
	

}
