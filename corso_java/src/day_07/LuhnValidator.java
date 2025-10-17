package day_07;

/*
 * Istruzioni
 * Dato un numero, determinare se è valido o meno secondo la formula di Luhn.
 * L' algoritmo di Luhn è una semplice formula di checksum utilizzata per convalidare vari numeri di identificazione, come i numeri di carte di credito e i numeri di previdenza sociale canadesi.
 * Il compito è verificare se una determinata stringa è valida.
 *
 * Convalidare un numero
 * Le stringhe di lunghezza 1 o inferiore non sono valide. Gli spazi sono consentiti nell'input, ma devono essere eliminati prima del controllo. Tutti gli altri caratteri non numerici non sono consentiti
 */


public class LuhnValidator {

    // Metodo che verifica se una stringa è valida secondo l'algoritmo di Luhn.
	public static boolean isValid(String input) {
		// Controlla se la stringa è nulla o contiene solo spazi bianchi.
		if (input == null || input.trim().isEmpty()) {
			return false;
		}

		// Rimuove tutti gli spazi dalla stringa per "pulirla".
		String sanitizedInput = input.replace(" ", "");

		// Controlla se la stringa pulita contiene solo caratteri numerici.
		if (!sanitizedInput.matches("\\d+")) {
			/*
			 * \\d+": Questa è l'espressione regolare.
			 * \d in una regex rappresenta una qualsiasi cifra numerica (equivalente a [0-9]).
			 * In Java, è necessario scrivere \\d perché il primo backslash (\) serve a "escapare" il secondo, 
			 * indicando che \d è un carattere speciale per le espressioni regolari.
			 * Il + è un quantificatore che significa "una o più volte".
			 * Quindi, \\d+ significa "una o più cifre numeriche"
			 */
			return false;
		}

		// Inizializza la somma che verrà usata per la validazione.
		int sum = 0;
		// Esempio di input e del suo indice:
		//8 2 7 3  1 2 3 2  7 3 5  2  0   5  6  9 sanitizedInput.length()=16
		//0 1 2 3  4 5 6 7  8 9 10 11 12 13 14 15 indice della stringa da verificare
		
		// Inizia un ciclo 'for' che scorre la stringa da destra verso sinistra.
		for (int j = sanitizedInput.length() - 1; j >= 0; j--) {
		
			// Converte il carattere corrente nel suo valore numerico intero.
			int digit = sanitizedInput.charAt(j) - '0';
			//codice ascii corrispondente 4=52    - 0=48 in questo caso digit=4

			// Controlla se l'indice del carattere (partendo da sinistra) è pari.
			if (j % 2 == 0) {
			//se il numero da verificare si trova su un indice di posizione pari
				// Raddoppia il valore della cifra.
				digit = digit * 2;
				// Se il risultato è maggiore di 9, sottrae 9.
				if (digit > 9) {
					digit = digit - 9;
				}
			}
			// Aggiunge la cifra (modificata o meno) alla somma totale.
			sum = sum + digit;
		}

		// L'input è valido se la somma totale è perfettamente divisibile per 10.
		return sum % 10 == 0;
		//il confronto sum % 10 == 0; restituisce true o false
		//e con return viene restituito al chiamante del metodo
	}

	// Metodo principale 'main', il punto di ingresso del programma.
	public static void main(String[] args) {
		// Dichiara un array di stringhe con diversi casi di test.
		String[] testCases = { 
				"4539 3195 0343 6467", // Valido
				"8273 1232 7352 0569", // Non valido
				"12345", // Non valido
				"0000 0000 0000 0000", // Valido
				"4539-3195-0343-6467" // Non valido a causa dei trattini

		};
		
		boolean luhnCheck = false;
		// Inizia un ciclo 'for-each' per iterare su ogni elemento dell'array di test.
		
		for (String element : testCases) {
			//in caso di for classico sarebbe: element = testCases[i]
			luhnCheck = isValid(element);
			// Per ogni elemento, stampa il risultato della validazione chiamando il metodo isValid.
			System.out.println("\"" + element + "\" e' valido?" + luhnCheck);
		}
	}
}