package day_00_es_07_spedizione;

public class Controller {
	
	public static String aggiungiPacco(GestoreSpedizione spedizioni, Pacco aP) {
		spedizioni.getSpedizioni().add(aP);
		return aP.toString() + " e' stato aggiunto alle spedizioni";
	}
	
	public static String calcolaCostoTotale(GestoreSpedizione spedizioni) {
		double costoTotale = 0;
		for(Pacco p : spedizioni.getSpedizioni()) {
			costoTotale = costoTotale + p.getCosto();
		}
		return "Il prezzo totale e' " + costoTotale;
	}
	
	
	public static String elencaSpedizioni(GestoreSpedizione spedizioni) {
		return spedizioni.getSpedizioni().toString();
	}
	
}
