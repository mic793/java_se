package day_00_es_02_dipendenti;

/*
 * Esercizio 2: Sistema di gestione dei dipendenti
 * Progettare una gerarchia di classi per gestire diversi tipi di dipendenti in un'azienda, applicando concetti come ereditarietà, 
 * polimorfismo e classi astratte.
 * Istruzioni:
 * 1.Classe astratta Dipendente:
 * - Deve essere una classe abstract.
 * - Deve avere attributi privati per nome (stringa), id (stringa) e salarioBase (double).
 * - Deve avere un costruttore che inizializzi questi attributi.
 * - Deve avere un metodo getSalarioBase().
 * - Deve avere un metodo astratto calcolaStipendio() che restituisca lo stipendio totale del dipendente.
 * - Implementare un metodo toString() che fornisca una rappresentazione di base del dipendente.
 * 2.Sottoclasse ImpiegatoFullTime:
 * - Estende la classe Dipendente.
 * - Non ha attributi aggiuntivi.
 * - Implementa il metodo calcolaStipendio() in modo che restituisca semplicemente il salarioBase.
 * 3.Sottoclasse ImpiegatoPartTime:
 * - Estende la classe Dipendente.
 * - Deve avere un attributo privato per oreLavorate (intero).
 * - Il costruttore deve inizializzare gli attributi della classe base e oreLavorate.
 * - Implementa il metodo calcolaStipendio() considerando una paga oraria (ad es. $20/ora) e le oreLavorate.
 * 4.Sottoclasse Manager:
 * - Estende la classe Dipendente.
 * - Deve avere un attributo privato per bonus (double).
 * - Il costruttore deve inizializzare gli attributi della classe base e il bonus.
 * - Implementa il metodo calcolaStipendio() in modo che restituisca la somma del salarioBase e del bonus.
 * 5.Classe GestioneAzienda:
 * - Questa sarà la classe principale (main).
 * - Creare una lista (ArrayList) di oggetti Dipendente.
 * - Aggiungere alla lista istanze di ImpiegatoFullTime, ImpiegatoPartTime e Manager.
 * - Scorrere la lista e stampare per ogni dipendente il nome e lo stipendio calcolato, dimostrando così il polimorfismo.
 */

public abstract class Dipendente {
	
	private String nome;
	private String id;
	private double salarioBase;
	
	public Dipendente() {
		super();
	}
	
	public Dipendente(String aNome, String aId, double aSalarioBase) {
		this.nome = aNome;
		this.id = aId;
		this.salarioBase = aSalarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public abstract double calcolaStipendio();

//	public void setSalarioBase(double salarioBase) {
//		this.salarioBase = salarioBase;
//	}
	
	
	@Override
	public String toString() {
		return "Dipendente [nome=" + nome + ", id=" + id + ", salarioBase=" + salarioBase;
	}
	
	

}
