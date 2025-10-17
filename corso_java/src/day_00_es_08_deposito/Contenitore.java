package day_00_es_08_deposito;

import day_00_es_06_aerodromo.Aeromobile;

/*
 * ESERCIZIO 8
 * Si vogliono mantenere le informazioni su un deposito di contenitori di liquidi.
 * Ogni contenitore (c) dotato di un codice univoco; i contenitori possono essere di due
 * tipi: lattine (L) e bidoni (B) entrambe queste categorie sono dotate di un campo nome
 * per identificare il liquido contenuto e di un campo qta per dichiarare la quantitå
 * contenuta.
 * E' richiesta la presenza di una interfaccia CMP che contenga un metodo confronta ( )
 * in grado di effettuare un confronto di peso fra due contenitori omologhi (L o B)
 * considerando che i bidoni hanno sempre una quantitå di liquido stoccato maggiore
 * delle lattine.
 * Realizzare poi una classe u (utils) contenente un metodo c filtra (c[] T, c c)
 * che riceve in ingresso un vettore T di contenitori ed un contenitore campione.
 * II metodo filtra deve restituire il vettore T ripulito di tutti i contenitori che contengono
 * lo stesso liquido del contenitore campione (c c) passato come parametro .
 */


public abstract class Contenitore implements Comparable<Contenitore>{
	
	private String codice;
	private String nome;
	private double quantita;
	
	public Contenitore() {
		super();
	}
	
	public Contenitore(String aCodice, String aNome, double aQuantita) {
		this.codice = aCodice;	
		this.nome = aNome;
		this.quantita = aQuantita;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String aNome) {
		this.nome = aNome;
	}

	public double getQuantita() {
		return quantita;
	}

	public void setQuantita(double aQuantita) {
		this.quantita = aQuantita;
	}

	public String getCodice() {
		return codice;
	}
	
	public void setCodice(String aCodice) {
		this.codice = aCodice;
	}
	
	public abstract int compareTo(Contenitore other);
	
	@Override
	public String toString() {
		return "codice=" + codice + ", nome=" + nome + ", quantita=" + quantita;
	}

}
