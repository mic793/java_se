package day_12.ex_05_biblioteca;

//Importa la classe ArrayList dal package java.util per poter utilizzare liste dinamiche.
import java.util.ArrayList;

/**
* Classe di tipo "Controller" o "Service" che gestisce le operazioni logiche
* relative ai prestiti in una biblioteca.
* Fornisce metodi statici (utility) per creare e cancellare prestiti,
* modificando una lista di prestiti passata come argomento.
*/
public class BibliotecaController {

	/**
	 * Crea un nuovo oggetto Prestito e lo aggiunge a una lista di prestiti esistente.
	 * Questo metodo è 'static' perché agisce come una funzione di utilità e non dipende
	 * dallo stato di un'istanza specifica di BibliotecaController.
	 */
	public static void creaPrestito(ArrayList<Prestito> prestiti, Abbonato abbonato, Libro libro) {

		// Crea una nuova istanza della classe Prestito, associando l'abbonato e il libro.
		Prestito prestito = new Prestito(abbonato, libro);

		// Aggiunge il nuovo oggetto prestito alla lista passata come parametro.
		prestiti.add(prestito);
	}

	/**
	 * Rimuove un oggetto Prestito specifico da una lista di prestiti.
	 * Anche questo metodo è 'static' per coerenza, agendo come una funzione di servizio.
	 */
	public static void cancellaPrestito(ArrayList<Prestito> prestiti, Prestito prestito) {

		// Utilizza il metodo .remove() di ArrayList per trovare e cancellare
		// l'oggetto prestito specificato dalla lista.
		prestiti.remove(prestito);
	}
}