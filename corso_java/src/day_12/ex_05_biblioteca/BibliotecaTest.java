package day_12.ex_05_biblioteca;

//Importa la classe ArrayList dal package java.util, necessaria per creare la lista dei prestiti.
import java.util.ArrayList;

/**
* Classe di test (chiamata anche "Driver" o "Runner") utilizzata per simulare
* il funzionamento della biblioteca, creando oggetti e invocando i metodi del controller.
*/
public class BibliotecaTest {

	/**
	 * Metodo principale 'main', il punto di avvio dell'esecuzione del programma di test.
	 */
	public static void main(String[] args) {
		
		// Creazione delle istanze (oggetti) che rappresentano i dati di partenza.
		
		// Crea una nuova istanza della classe Abbonato per 'Paolo Rossi', chiamando il costruttore parametrico.
		//String cF, String nome, String cognome
		Abbonato paoloRossi = new Abbonato("CF1", "Paolo", "Rossi");
		// Crea un'altra istanza di Abbonato per 'Maria Bianchi'.
		Abbonato mariaBianchi = new Abbonato("CF2", "Maria", "Bianchi");
		
		
		// Crea una nuova istanza della classe Libro per 'Pinocchio'.
		//String isbn, String casaEditrice, String titolo, String autore
		Libro pinocchio = new Libro("8994904094", "Mondadori", "Pinocchio", "Collodi");
		// Crea un'altra istanza di Libro per 'Il Signore degli Anelli'.
		Libro ilSignoreDegliAnelli = new Libro("87927489239", "Hoepli", "Il Signore degli Anelli", "Tolkien");
		
		// Crea una nuova lista vuota di tipo ArrayList che conterrà oggetti di tipo Prestito.
		ArrayList<Prestito> prestiti = new ArrayList<>();
			
		// Esecuzione delle operazioni logiche tramite il Controller.
		
		// Chiama il metodo statico 'creaPrestito' per registrare un prestito per Maria Bianchi.
		// Il nuovo prestito verrà aggiunto alla lista 'prestiti'.
		BibliotecaController.creaPrestito(prestiti, mariaBianchi, ilSignoreDegliAnelli);
		
		// Chiama nuovamente il metodo per registrare un secondo prestito, questa volta per Paolo Rossi.
		BibliotecaController.creaPrestito(prestiti, paoloRossi, pinocchio);

		// Stampa a video il contenuto completo della lista 'prestiti'.
		// L'output sarà leggibile grazie all'implementazione del metodo toString() nella classe Prestito.
		System.out.println(prestiti);
	}

}