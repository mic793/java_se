package day_04;

/*
 * Write a Java program that calculates the number of words in a given string. 
 * A word is considered to be a sequence of characters separated by spaces.
 */

//PRIMA SOLUZIONE
/*
public class NumeroParole {

	public static void main(String[] args) {
		// Inizializza una variabile di tipo String con una frase di prova.
		String stringa = "Questa e' una frase di esempio";

		// Dichiara e inizializza a 0 un contatore per le parole.
		int numeroParole = 0;

		// Controlla se la stringa non è vuota.
		if (!stringa.isEmpty()) {
			// Se non è vuota, incrementa il contatore (assume che ci sia almeno una
			// parola).
			numeroParole = numeroParole + 1;
		}

		// Inizia un ciclo 'for' per scorrere ogni carattere della stringa.
		for (int i = 0; i < stringa.length(); i++) {
			// Controlla se il carattere alla posizione corrente è uno spazio.
			if (stringa.charAt(i) == ' ') {
				// Se è uno spazio, incrementa il contatore delle parole.
				numeroParole = numeroParole + 1;
			}
		} 
		// Stampa il numero totale di parole calcolato.
		System.out.println("Il numero di parole nella stringa e': " + numeroParole);
	}
}
*/

//ESERCIZIO 1
//Scrivi un programma Java che calcoli il numero di parole presenti in una stringa data. 
//Viene considerata una parola una sequenza di caratteri separati da spazi.

//SECONDA SOLUZIONE

public class NumeroParole {
	public static void main(String[] args) {

		String frase = "   Questa           e' una frase di esempio  ";

		int numeroParole = 0;

		boolean wasSpace = true;

		// conto una parola tutte le volte in cui charAt(i) passa da uno spazio alla
		// lettura di una lettera

		for (int i = 0; i < frase.length(); i++) {
			char c = frase.charAt(i);
			if (c != ' ' && wasSpace) {
				numeroParole = numeroParole + 1; // numeroParole++;
				wasSpace = false;

			} else if (c == ' ' && !wasSpace) {
				wasSpace = true;
			}
		}

		System.out.println("Il numero di parole nella frase e': " + numeroParole);
	}

}
