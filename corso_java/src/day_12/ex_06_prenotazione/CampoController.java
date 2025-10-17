package day_12.ex_06_prenotazione;

/**
 * Classe di test (o Controller) per dimostrare e verificare il funzionamento della classe Campo.
 * Contiene il metodo main, che è il punto di ingresso per l'esecuzione del programma.
 */
public class CampoController {

	// Metodo principale 'main'.
	public static void main(String[] args) {
		// Crea una nuova istanza della classe Campo, che rappresenta il campo da prenotare.
		Campo campo = new Campo();
		
		// Tenta di aggiungere la prima prenotazione dalle 9 alle 11 per "Mario". Stampa 'true' se riesce.
		System.out.println("Prenotazione 1: " + campo.addPren(9, 11, "Mario"));
		
		// Tenta di aggiungere la seconda prenotazione dalle 11 alle 13 per "Luca". Stampa 'true' se riesce.
		System.out.println("Prenotazione 2: " + campo.addPren(11, 13, "Luca"));
		
		// Tenta di aggiungere la terza prenotazione dalle 10 alle 12 per "Gianni". 
		// Fallirà (e stamperà 'false') perché si sovrappone con la prenotazione di Mario.
		System.out.println("Prenotazione 3: " + campo.addPren(10, 12, "Gianni"));
		
		// Stampa lo stato attuale del campo, mostrando la lista delle prenotazioni valide inserite.
		// Utilizza implicitamente il metodo .toString() della classe Campo.
		System.out.println(campo);
		
		// Calcola e stampa la percentuale di utilizzo del campo con le prenotazioni attuali.
		System.out.println("Percentuale utilizzo: " + campo.utilizzo() + "%");
		
		// Tenta di rimuovere la prenotazione di "Luca". Riuscirà e stamperà 'true'.
		System.out.println("Rimuovo prenotazione di Luca: " + campo.removePren(11, 13, "Luca"));
		
		// Tenta di rimuovere una prenotazione che non esiste. Fallirà e stamperà 'false'.
		System.out.println("Rimuovo prenotazione inesistente: " + campo.removePren(14, 16, "Pippo"));
		
		// Stampa di nuovo lo stato del campo per verificare che la prenotazione di Luca sia stata rimossa.
		System.out.println(campo);
		
		// Ricalcola e stampa la nuova percentuale di utilizzo dopo la rimozione.
		System.out.println("Percentuale utilizzo: " + campo.utilizzo() + "%");
	}
}
