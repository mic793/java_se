package day_00_es_01_negozio_online;

import java.util.List;

public class Controller {
	
	public static String aggiungiProdotto(Carrello carrello, Prodotto aP) {
		carrello.getProdotti().add(aP);
		return aP.getNome() + " e' stato aggiunto nel carrello";
	}
	
	public static String rimuoviProdotto(Carrello carrello, Prodotto aP) {
		carrello.getProdotti().remove(aP);
		return aP.getNome() + " e' stato rimosso dal carrello";
	}	
	
	
	public static String visualizzaCarrello(Carrello carrello) {
		double importo = 0;
		for(Prodotto p : carrello.getProdotti()) {
			importo = importo + p.getPrezzo();
		}
		return carrello.getProdotti().toString() + "\n totale: " + importo; 
	}
	
	
	public static String effettuaAcquisto(Carrello carrello) {
		for(Prodotto pr : carrello.getProdotti()) {
			if(pr != null) {
				pr = null;
			}
		}
		return "carrello svuotato";
	}
	
	
}
