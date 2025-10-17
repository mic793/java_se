package day_00_es_04_elettrodomestici;

import java.util.LinkedList;
import java.util.List;

import day_00_es_04_elettrodomestici.Frigorifero.Temperatura;
import day_00_es_04_elettrodomestici.Lavatrice.CicloLavaggio;

public class Test {

	public static void main(String[] args) {

		List<Elettrodomestico> elettrodomestici = new LinkedList<>();

		// String aMarca, String aModello, String aClasseEnergetica, int aPotenza,
		// boolean aStato, CicloLavaggio aProgramma
		Elettrodomestico l1 = new Lavatrice("LG", "LAV01", "AAA", 15, false, Lavatrice.CicloLavaggio.BREVE);
		Elettrodomestico l2 = new Lavatrice("LG", "LAV02", "AA", 14, false, Lavatrice.CicloLavaggio.DELICATO);

		// String aMarca, String aModello, String aClasseEnergetica, int aPotenza,
		// boolean aStato,Temperatura aValore
		Elettrodomestico f1 = new Frigorifero("Candy", "FRIG01", "AA", 30, false, Frigorifero.Temperatura.BASSA);
		Elettrodomestico f2 = new Frigorifero("Philips", "FRIG02", "A+", 30, false, Frigorifero.Temperatura.MEDIA);

		// String aMarca, String aModello, String aClasseEnergetica, int aPotenza,
		// boolean aStato, int aCanale
		Elettrodomestico t1 = new Televisione("Sony", "TV01", "AAA", 40, false, 1);
		Elettrodomestico t2 = new Televisione("Panasonic", "TV02", "AA", 30, false, 2);

		Controller.aggiungiElettrodomestico(elettrodomestici, l2);
		Controller.aggiungiElettrodomestico(elettrodomestici, f2);
		Controller.aggiungiElettrodomestico(elettrodomestici, t2);
		
		Controller.accendiElettrodomestico(elettrodomestici);
		
		System.out.println(elettrodomestici.toString());		

	}

}
