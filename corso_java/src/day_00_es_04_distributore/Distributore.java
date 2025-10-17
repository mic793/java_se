package day_00_es_04_distributore;

/*
 * ESERCIZIO 4
 * Scrivi un programma che sia in grado di istanziare degli oggetti 'distributori di
 * benzina' di cui sia nota la citta, il proprietario, la capacita e la benzina attualmente
 * contenuta nel distributore. 
 * Dell'oggetto Distributore, deve essere possibile simulare le operazioni di erogazione del 
 * carburante e dei corrispondenti incassi. 
 * Implementa una interfaccia Comparable, in modo da consentire il confronto tra 2 distributori in base
 * alla capacita del serbatoio di carburante.
 */

public class Distributore implements Comparable<Distributore> {
	private String citta;
	private String proprietario;
	private double capacita;
	private double benzinaContenuta;
	private double incasso;
	
	public Distributore() {
		super();
	}
	
	public Distributore(String aCitta, String aProprietario, double aCapacita, double aBenzinaContenuta) {//PARAMETRO INCASSI TOTALI NON INSERITO
		this.citta = aCitta;
		this.proprietario = aProprietario;
		this.capacita = aCapacita;
		this.benzinaContenuta = aBenzinaContenuta;
		//this.incassiTotali = aIncassiTotali;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta(String aCitta) {
		this.citta = aCitta;
	}
	
	public String getProprietario() {
		return proprietario;
	}
	
	public void setProprietario(String aProprietario) {
		this.proprietario = aProprietario;
	}
	
	public double getCapacita() {
		return capacita;
	}
	
	public void setCapacita(double aCapacita) {
		this.capacita = aCapacita;
	}
	
	public double getBenzinaContenuta() {
		return benzinaContenuta;
	}
	
	public void setBenzinaContenuta(double aBenzinaContenuta) {
		this.benzinaContenuta = aBenzinaContenuta;
	}
	
	public double getIncasso() {
		return incasso;
	}
	
	public void setIncasso(double aImporto) {
		this.incasso = aImporto;
	}
	
	@Override
	public String toString() {
		return "Distributore [Citta = " + citta + ", proprietario = " + proprietario + ", capacita' = " + capacita + ", benzina contenuta = " + benzinaContenuta + ", incassi totali = " + incasso + "]";
	}
	
	@Override
	public int compareTo(Distributore other) {
		return Double.compare(this.capacita, other.capacita);
		//il metodo stampa:
		// <0 se l'istanza chiamante e' minore di altro;
		//  0 se l'istanza chiamante e' uguale ad altro;
		// >0 se l'istanza chiamata e' maggiore di altro.
		// nel nostro caso l'ouput sara' -1 (d1-5000 < d2-7000)
		
	}
	
}
