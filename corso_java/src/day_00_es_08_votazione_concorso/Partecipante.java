package day_00_es_08_votazione_concorso;


/*
 * Esercizio 8: Sistema di votazione per un concorso
 * Obiettivo: Creare un sistema che gestisca i partecipanti a un concorso e il processo di votazione.
 * Requisiti
 * 1.	Classe Partecipante:
 * 		•	Attributi:
 * 			o	nome (String)
 * 			o	punteggioTotale (int, inizializzato a 0)
 * 		•	Metodi:
 * 			o	Un costruttore per inizializzare il nome del partecipante.
 * 			o	getNome(): restituisce il nome del partecipante.
 * 			o	aggiungiVoto(int voto): incrementa il punteggioTotale con il voto ricevuto.
 * 			o	getPunteggio(): restituisce il punteggioTotale.
 * 			o	toString(): restituisce una stringa che rappresenta il partecipante (es. "Nome: Mario, Punteggio: 50").
 * 
 * 2.	Classe Concorso:
 * 		•	Attributi:
 * 			o	Una collezione di partecipanti, ad esempio un ArrayList<Partecipante>.
 * 		•	Metodi:
 * 			o	iscriviPartecipante(Partecipante p): aggiunge un partecipante alla lista.
 * 			o	vota(String nomePartecipante, int voto): cerca il partecipante per nome e, se lo trova, 
 * 				aggiunge il voto chiamando il metodo aggiungiVoto del partecipante.
 * 			o	mostraClassifica(): stampa a console la lista dei partecipanti e i loro punteggi. Non è necessario ordinarla.
 * 
 * 3.	Classe TestConcorso:
 * 		•	Crea un'istanza della classe Concorso.
 * 		•	Iscrivi alcuni partecipanti al concorso creando oggetti Partecipante.
 * 		•	Simula la votazione, chiamando il metodo vota() del Concorso per assegnare voti a diversi partecipanti.
 * 		•	Mostra la classifica finale chiamando mostraClassifica()
 * 
 */

public class Partecipante {
	private String nome;
	private double punteggioTotale;
	
	public Partecipante() {
		super();
	}

	public Partecipante(String aNome) {
		super();
		this.nome = aNome;
		this.punteggioTotale = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public double getPunteggioTotale() {
		return punteggioTotale;
	}

	public void setPunteggioTotale(double aPunteggioTotale) {
		this.punteggioTotale = aPunteggioTotale;
	}

	@Override
	public String toString() {
		return "Partecipante nome=" + nome + ", punteggioTotale=" + punteggioTotale;
	}
	
		
}
