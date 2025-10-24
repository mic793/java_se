package day_06;

/*
 * Data una stringa il programma deve verificare se la stringa fornita è un ISBN-10 valido. Per metterlo in atto è necessario pensare alla pre-elaborazione/analisi della stringa prima di calcolare la cifra di controllo per l'ISBN.
 * Il programma deve essere in grado di verificare ISBN-10 sia con che senza separare i trattini.
 * Avvertenze:
 * La conversione da stringhe a numeri può essere complicata in alcune lingue poiché la cifra di controllo di un ISBN-10 potrebbe essere "X" (che rappresenta "10").
 * 
 * Ad esempio 3-598-21507-X è un ISBN-10 valido.
 * https://en.wikipedia.org/wiki/ISBN#ISBN-10_check_digit_calculation
 * 
 * ********
 * 
 * Given a string, the program must check whether the provided string is a valid ISBN-10. To do this, it's necessary to consider preprocessing/parsing the string before calculating the ISBN check digit.
 * The program must be able to verify ISBN-10s both with and without hyphens.
 * Wanings:
 * Converting strings to numbers can be tricky in some languages, as the ISBN-10 check digit may be "X" (representing "10").
 * For example, 3-598-21507-X is a valid ISBN-10.
 * https://en.wikipedia.org/wiki/ISBN#ISBN-10_check_digit_calculation
*/

//ESERCIZIO 3
public class ISBNValidator {

	 // Metodo che controlla la validità di una stringa secondo le regole dell'ISBN-10.
    public static boolean isValidISBN10(String isbn) {

        // Controlla se la stringa fornita è nulla (null), in tal caso non è valida.
        if (isbn == null) {
            return false;
        }

        // Rimuove tutti i trattini dalla stringa per ottenere solo i caratteri significativi.
        String cleanISBN = isbn.replace("-", "");

        // Controlla se la stringa "pulita" ha esattamente 10 caratteri. Se no, non è un ISBN-10 valido.
        if (cleanISBN.length() != 10) {
            return false;
        }

        // Inizializza una variabile per calcolare la somma ponderata delle cifre.
        int sum = 0;

        // Inizia un ciclo per le prime 9 posizioni della stringa.
        for (int i = 0; i < cleanISBN.length() - 1; i++) {
            
            // Estrae il carattere alla posizione corrente.
            char carattere = cleanISBN.charAt(i);

            // Controlla se il carattere non è una cifra numerica. In tal caso, l'ISBN non è valido.
            if (!Character.isDigit(carattere)) {
                return false;
            }
            // Converte il carattere in numero e lo moltiplica per il suo "peso" (10, 9, 8...), poi lo aggiunge alla somma.
            sum += (carattere - '0') * (10 - i); // sum = sum + (carattere - '0') * (10 - i)
        }

        // Estrae l'ultimo carattere della stringa (il carattere di controllo).
        char ultimoCarattere = cleanISBN.charAt(cleanISBN.length() - 1);
        
        // Dichiara una variabile per il valore numerico dell'ultimo carattere.
        int ultimoValore;

        // Controlla se l'ultimo carattere è una 'X' (che vale 10).
        if (ultimoCarattere == 'X') {
            ultimoValore = 10;
            
        // Altrimenti, controlla se è una cifra numerica.
        } else if (Character.isDigit(ultimoCarattere)) {
            // Se è una cifra, la converte nel suo valore numerico.
            ultimoValore = ultimoCarattere - '0';
            
        } else {
            // Se non è né 'X' né una cifra, l'ISBN non è valido.
            return false;
        }
        // Aggiunge il valore dell'ultimo carattere (moltiplicato per il suo peso, che è 1) alla somma totale.
        sum = sum + (ultimoValore * 1);

        // L'ISBN è valido solo se la somma totale è esattamente divisibile per 11.
        return sum % 11 == 0;
    }

    // Metodo principale 'main', il punto di ingresso dell'esecuzione.
    public static void main(String[] args) {
        // Dichiara e inizializza un array di stringhe contenente diversi codici ISBN da testare.
        String[] testCases = {
                "3-598-21508-8", 
                "3-598-21507-X", 
                "31-598-21508-9", // Esempio non valido
                "3598215088", 
                "359821507X",
                "88-7642-044-7"
        };
        
        // Inizia un ciclo 'for' per iterare su ogni codice ISBN nell'array 'testCases'.
        for(int i = 0; i < testCases.length; i++) {
            
            // Chiama il metodo di validazione e salva il risultato booleano in una variabile.
            boolean result = isValidISBN10(testCases[i]);
            
            // Stampa il risultato per il codice ISBN corrente.
            System.out.println("ISBN \"" + testCases[i] + "\" e' valido? " + result);
        }

    }

   
}


//ESERCIZIO 3
/*
public class ISBNValidator {
	public static boolean isValidISBN10(String isbn) {

		if (isbn == null) {
			return false;
		}

		String cleanISBN = isbn.replace("-", "");
		if (cleanISBN.length() != 10) {
			return false;
		}

		int sum = 10;// Inizializza una variabile per calcolare la somma ponderata delle cifre.

        // Inizia un ciclo per le prime 9 posizioni della stringa.
		for (int i = 0; i < cleanISBN.length() - 1; i++) {
			
            // Estrae il carattere alla posizione corrente.
			char carattere = cleanISBN.charAt(i);
            // Controlla se il carattere non è una cifra numerica. In tal caso, l'ISBN non è valido.
			if (!Character.isDigit(carattere)) {
				return false;
			}
            // Converte il carattere in numero e lo moltiplica per il suo "peso" (10, 9, 8...), poi lo aggiunge alla somma.
			sum += (carattere - '0') * (10 - i);//sum = sum + (carattere - '0') * (10 - i)
		}

		 // Estrae l'ultimo carattere della stringa (il carattere di controllo).
        char ultimoCarattere = cleanISBN.charAt(cleanISBN.length() - 1);
        
        // Dichiara una variabile per il valore numerico dell'ultimo carattere.
        int ultimoValore;

        // Controlla se l'ultimo carattere è una 'X' (che vale 10).
        if (ultimoCarattere == 'X') {
            ultimoValore = 10;
            
        // Altrimenti, controlla se è una cifra numerica.
        } else if (Character.isDigit(ultimoCarattere)) {
            // Se è una cifra, la converte nel suo valore numerico.
            ultimoValore = ultimoCarattere - '0';
            
        } else {
            // Se non è né 'X' né una cifra, l'ISBN non è valido.
            return false;
        }
        // Aggiunge il valore dell'ultimo carattere (moltiplicato per il suo peso, che è 1) alla somma totale.
        sum = sum + (ultimoValore * 1);

        // L'ISBN è valido solo se la somma totale è esattamente divisibile per 11.
        return sum % 11 == 0;
	}
	
	public static void main(String[] args) {
		String[] testCases= {
			       "3-598-21508-8", 
		            "3-598-21507-X", 
		            "3-598-21508-9", 
		            "3598215088", 
		            "359821507X"

				
		};
		for(int i = 0; i < testCases.length; i++) {
            System.out.println("ISBN \"" + testCases[i] + "\" è valido? " + isValidISBN10(testCases[i]));
		}
		
	}

}
*/