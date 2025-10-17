package day_00_es_07_spedizione;

public class Test {
	
	public static void main(String[] args) {
		
		Indirizzo dest1 = new Indirizzo("Via Roma 10", "Napoli", "01120");
		
		//double aPeso, Indirizzo aDestinazione--String aVia, String aCitta, String aCap
		Pacco pacco1 = new PaccoStandard(30, dest1);
		
		//System.out.println(pacco1);
		
		Indirizzo dest2 = new Indirizzo("Piazza Torino 5", "Bari", "01578");
		Pacco pacco2 = new PaccoFragile(20, dest2);
		
		//System.out.println(pacco2);
		
		Indirizzo dest3 = new Indirizzo("Piazza Torino 5", "Bari", "01578");
		Pacco pacco3 = new PaccoStandard(1, dest3);
		
		GestoreSpedizione gs1 = new GestoreSpedizione();
		
		System.out.println(Controller.aggiungiPacco(gs1, pacco1));
		System.out.println(Controller.aggiungiPacco(gs1, pacco2));
		System.out.println(Controller.aggiungiPacco(gs1, pacco3));
		
		//System.out.println(gs1);
		
		System.out.println(Controller.calcolaCostoTotale(gs1));
		
		System.out.println(Controller.elencaSpedizioni(gs1));
		
		
		
	}
}
