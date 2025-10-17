package day_00_es_01_negozio_online;

/*
 * Esercizio 1: Sistema di gestione di un negozio online
 * Progettare un sistema che gestisca prodotti, carrelli della spesa e clienti per un negozio online. 
 * Istruzioni:
 * 1.Classe Prodotto:
 * - Deve avere attributi privati per id (stringa), nome (stringa), prezzo (double) e disponibilità (intero).
 * - Fornire un costruttore per inizializzare tutti gli attributi.
 * - Implementare metodi getter per tutti gli attributi e metodi setter per prezzo e disponibilità.
 * - Aggiungere un metodo toString() per una rappresentazione testuale del prodotto.
 * 2.Classe Carrello:
 * - Deve contenere una lista (ad es. ArrayList) di oggetti Prodotto.
 * - Deve avere metodi per:
 * 		- aggiungiProdotto(Prodotto p): aggiunge un prodotto al carrello.
 * 		- rimuoviProdotto(Prodotto p): rimuove un prodotto dal carrello.
 * 		- calcolaTotale(): restituisce il costo totale dei prodotti nel carrello.
 * 		- visualizzaCarrello(): stampa tutti i prodotti e il totale nel carrello.
 * 3.Classe Cliente:
 * - Deve avere attributi privati per id (stringa), nome (stringa) e un oggetto Carrello.
 * - Fornire un costruttore che inizializzi il cliente e crei un nuovo carrello per lui.
 * - Implementare un metodo getCarrello() che restituisca il carrello del cliente.
 * 4. Classe Negozio - Main:
 * - Questa classe servirà come classe principale (main) per testare il sistema.
 * - Creare alcuni oggetti Prodotto.
 * - Creare un oggetto Cliente. 
 * - Aggiungere i prodotti al carrello del cliente.
 * - Visualizzare il contenuto del carrello e il totale.
 * - Simulare un acquisto.

 */

public class Prodotto {
	
	private String id;
	private String nome;
	private double prezzo;
	private int disponibilita;
	
	public Prodotto() {
		super();
	}

	public Prodotto(String aId, String aNome, double aPrezzo, int aDisponibilita) {
		super();
		this.id = aId;
		this.nome = aNome;
		this.prezzo = aPrezzo;
		this.disponibilita = aDisponibilita;
	}

	public String getId() {
		return id;
	}

	public void setId(String aId) {
		this.id = aId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double aPrezzo) {
		this.prezzo = aPrezzo;
	}

	public int getDisponibilita() {
		return disponibilita;
	}

	public void setDisponibilita(int aDisponibilita) {
		this.disponibilita = aDisponibilita;
	}

	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", prezzo=" + prezzo + ", disponibilita=" + disponibilita
				+ "]";
	}
	
	
	
}
