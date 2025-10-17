package day_00_es_06_gestione_pagamento;

public class Test {

	public static void main(String[] args) {
		
		double importo = 100;
		
		//String aTitolare, int aNumero, int aCvv, String aScadenza
		MetodoPagamento carta = new CartaCredito("Paolo Rossi", "51465854654", "254", "25/08/2027");
		
		//String aEmail, double aSaldoDisponibile
		MetodoPagamento pay = new PayPal("martaneri@gmail.com", 15000.00);
		
		//String aIban, String aIntestatario
		MetodoPagamento bonifico = new BonificoBancario("IT0125453433", "Giovanni Verdi");	
		
		
		MetodoPagamento[] metodi = {carta, pay, bonifico};
		
		System.out.println(Controller.pagamenti(metodi, importo));
		
	}

}
