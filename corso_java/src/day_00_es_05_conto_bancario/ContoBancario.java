package day_00_es_05_conto_bancario;

/*
 * Esercizio 5: Gestione conto bancario
 * Creare un sistema per gestire un conto bancario con operazioni di deposito e prelievo.
 * Requisiti
 * 1.	Classe ContoBancario:
 * •	Attributi:
 * 		o	numeroConto (String)
 * 		o	titolare (String)
 * 		o	saldo (double)
 * •	Metodi:
 * 		o	Un costruttore per inizializzare numeroConto e titolare. Il saldo deve essere inizializzato a zero.
 * 		o	getSaldo(): restituisce il saldo attuale.
 * 		o	deposita(double importo): aggiunge l'importo al saldo.
 * 		o	preleva(double importo): tenta di prelevare un importo. Se il saldo è sufficiente, 
 * 			l'importo viene sottratto e il metodo restituisce true. Altrimenti, il prelievo non viene effettuato e il metodo restituisce false.
 * 		o	stampaDettagli(): stampa a console tutti i dettagli del conto.
 * 
 * 2.	Classe TestConto:
 * •	Crea un'istanza della classe ContoBancario con dati a scelta.
 * 		•	Esegui le seguenti operazioni:
 * 			o	Stampa i dettagli iniziali del conto.
 * 			o	Deposita una somma di denaro e stampa il nuovo saldo.
 * 			o	Prova a prelevare una somma di denaro inferiore al saldo e stampa il risultato e il nuovo saldo.
 * 			o	Prova a prelevare una somma di denaro superiore al saldo e stampa il risultato (dovrebbe essere false) e il saldo che rimane invariato.
 * 
 */

public class ContoBancario {
	
	private String numeroConto;
	private String titolare;
	private double saldo;
	
	public ContoBancario() {
		super();
	}

	public ContoBancario(String aNumeroConto, String aTitolare) {
		super();
		this.numeroConto = aNumeroConto;
		this.titolare = aTitolare;
		this.saldo = 0;
	}

	public String getNumeroConto() {
		return numeroConto;
	}

	public void setNumeroConto(String aNumeroConto) {
		this.numeroConto = aNumeroConto;
	}

	public String getTitolare() {
		return titolare;
	}

	public void setTitolare(String aTitolare) {
		this.titolare = aTitolare;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double aSaldo) {
		this.saldo = aSaldo;
	}

	@Override
	public String toString() {
		return "ContoBancario [numeroConto=" + numeroConto + ", titolare=" + titolare + ", saldo=" + saldo + "]";
	}
	
		

}
