package day_00_es_01_negozio_online;

import java.util.List;

public class Test {

	public static void main(String[] args) {

		//String aId, String aNome, double aPrezzo, int aDisponibilita
		Prodotto p1 = new Prodotto("P01", "maglia", 10.5, 10);
		Prodotto p2 = new Prodotto("P02", "costume", 20.5, 11);
		Prodotto p3 = new Prodotto("P03", "scarpe", 30, 5);		

		Carrello carrello = new Carrello();
							//String aId, String aNome, Carrello aCarrello
		Cliente cliente1 = new Cliente("CL01", "Paolo Rossi", carrello);
		
		
		System.out.println(Controller.aggiungiProdotto(carrello, p1));
		System.out.println(Controller.aggiungiProdotto(carrello, p2));
		System.out.println(Controller.aggiungiProdotto(carrello, p3));
		
		
		System.out.println(Controller.rimuoviProdotto(carrello, p1));
		
		System.out.println(Controller.visualizzaCarrello(carrello));
		
		System.out.println(cliente1);
		
		
	}

}
