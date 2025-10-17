package day_04;

/*
 * Write a Java program that checks whether a given string is a palindrome (i.e., whether it can be read 
 * equally from right to left and vice versa)
 */

/*public class Palindromo {

	public static void main(String[] args) {
		 // Dichiara e inizializza la stringa da controllare.
        String stringa = "RADAR";
        
        // Inizializza una variabile booleana a 'true', partendo dal presupposto che la parola sia palindroma.
        boolean isPalindromo = true;
        
        // Inizia un ciclo 'for' che itera fino a metà della lunghezza della stringa.
        for(int i = 0; i < stringa.length() / 2; i++) {
        	
            // Confronta il carattere all'indice 'i' con il carattere speculare alla fine della stringa.
            if(stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)) {
                // Se i caratteri non corrispondono, imposta la variabile a 'false'.
                isPalindromo = false;
                // Interrompe il ciclo immediatamente perché non è necessario continuare il controllo.
                break;
            }
        }
     
        // Controlla il valore finale della variabile booleana.
        if(isPalindromo) {
            // Se è 'true', stampa che la parola è un palindromo.
            System.out.println("La parola " + stringa + " e' un palindromo");
        } else {
            // Altrimenti, stampa che la parola non è un palindromo.
            System.out.println("La parola " + stringa + " non e' un palindromo.");
        }
    } // Chiusura del metodo main

} // Chiusura della classe PalindromeChecker
*/

//ESERCIZIO 3
//Scrivi un programma Java che verifichi se una stringa data è un palindromo (cioè se può essere letta allo stesso modo da destra a sinistra e viceversa)
public class Palindromo {
	public static void main(String[] args) {
		String stringa = "RADAR";

		boolean isPalindromo = true;

		for (int i = 0; i < stringa.length() / 2; i++) {

			// Confronta il carattere all'indice 'i' con il carattere speculare alla fine della stringa.
			if (stringa.charAt(i) != stringa.charAt(stringa.length() - 1 - i)) {

				isPalindromo = false;
				break;
			}
		}
		if (isPalindromo) {
			System.out.println("La stringa " + stringa + " e' un palindromo.");
		} else {
			System.out.println("La stringa " + stringa + " non e' un palindromo.");
		}
	}

}