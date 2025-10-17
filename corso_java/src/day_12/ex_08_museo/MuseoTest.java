package day_12.ex_08_museo;

import java.util.ListIterator;

public class MuseoTest {

	public static void main(String[] args) {
		//quadro: String aCodice, String aTitolo, String aAutore, boolean aEsposta, Tecnica aTecnicaUsata
		Opera gioconda = new Quadro("quad001", "gioconda", "leonardo", true, Tecnica.OLIO);
		Opera notteStellata = new Quadro("quad002", "Notte stellata", "Van Gogh", true, Tecnica.OLIO);
		Opera ultimaCena = new Quadro("quad003", "Ultima cena", "Leonardo da Vinci", true, Tecnica.AFFRESCO);
		Opera nascitaVenere= new Quadro("quad004", "Nascita di Venere", "Botticelli", true, Tecnica.TEMPERA);
		Opera guernica = new Quadro("quad005", "Guernica", "Picasso", true, Tecnica.OLIO);
			
		//statua: String aCodice, String aTitolo, String aAutore, boolean aEsposta, double aAltezza, Materiale aMaterialeUsato
		Opera laPieta = new Statua("stat001", "la pieta", "michelangelo", true, 2.3, Materiale.MARMO);
		Opera david = new Statua("stat002", "David", "Michelangelo", true, 5.2, Materiale.MARMO);
		Opera venereMilo = new Statua("stat003", "Venere di Milo", "Anonimo greco", true, 2.0, Materiale.MARMO);
		Opera pensatore = new Statua("stat004", "Il Pensatore", "Rodin", false, 1.9, Materiale.BRONZO);
		Opera discobolo = new Statua("stat005", "Discobolo", "Mirone", true, 1.6, Materiale.BRONZO);
		
	/*	Opera[] opere = {gioconda, laPieta};
		System.out.println("******STAMPA CON DUE SYSO  *******");
		System.out.println(gioconda.toString());
		System.out.println(laPieta);
		System.out.println();
		System.out.println("******STAMPA CON ENHANCED FOR  *******");
		for(Opera opera : opere) {
			System.out.println(opera);
		}
		System.out.println();
		System.out.println("******STAMPA CON FOR CLASSICO********");
		for(int i = 0; i < opere.length; i++) {
			System.out.println(opere[i]);
		}*/
		
		Museo uffizi = new Museo();
		
		MuseoController.caricaOpera(uffizi, discobolo);
		MuseoController.caricaOpera(uffizi, notteStellata);
		MuseoController.caricaOpera(uffizi, guernica);
		MuseoController.caricaOpera(uffizi, venereMilo);
		MuseoController.caricaOpera(uffizi, gioconda);
		MuseoController.caricaOpera(uffizi, laPieta);
		MuseoController.caricaOpera(uffizi, notteStellata);
		MuseoController.caricaOpera(uffizi, ultimaCena);
		MuseoController.caricaOpera(uffizi, david);
		MuseoController.caricaOpera(uffizi, pensatore);
		
		//System.out.println(uffizi);
		
		/*
		 * MuseoController.spostaOpera(uffizi, david);
		 * 
		 * System.out.println(uffizi);
		 * 
		 * MuseoController.cercaOpera(uffizi, david);
		 */
		
		MuseoController.stampaEsposizione(uffizi);
		System.out.println(uffizi);
	}

}
