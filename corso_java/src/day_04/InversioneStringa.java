package day_04;

import java.util.Scanner;

/*
 * Write a Java program that reverses a given string.
 */

/*public class InversioneStringa {

	public static void main(String[] args) {
		 // Dichiara e inizializza la stringa originale che si vuole invertire.
		String stringa = "Become a Java Developer!";
        
        // Dichiara una stringa vuota che conterrà il risultato invertito.
        String stringaInvertita = "";
        
        // Inizia un ciclo 'for' che parte dall'ultimo carattere della stringa e va a ritroso fino al primo.
        for(int i = stringa.length() - 1; i >= 0; i--) {
        	
            // Ad ogni iterazione, aggiunge (concatena) il carattere corrente alla stringa invertita.
            stringaInvertita += stringa.charAt(i);
        }
        
        // Stampa a video la stringa originale per confronto.
        System.out.println("Stringa originale: " + stringa);
        // Stampa a video la stringa dopo averla invertita.
        System.out.println("Stringa invertita: " + stringaInvertita);

    } // Chiusura del metodo main

} // Chiusura della classe StringReverser
*/

//ESERCIZIO 4
//Scrivi un programma Java che inverta una stringa data.
public class InversioneStringa {
	
	public static void main(String[] args) {
		String frase = "Become a Java Developer!";

		String fraseInvertita = "";

        // Inizia un ciclo 'for' che parte dall'ultimo carattere della stringa e va a ritroso fino al primo.
		for (int i = frase.length() - 1; i >= 0; i--) {

			// Ad ogni iterazione, aggiunge (concatena) il carattere corrente alla stringa invertita.
			fraseInvertita += frase.charAt(i);

		}

		System.out.println("Frase originale: " + frase);
		System.out.println("Frase invertita: " + fraseInvertita);

	}

}


/*
//SOLUZIONE CON FRASE INSERITA DA TASTIERA
public class InversioneStringa{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.println("Inserisci la frase: ");
		 
		// Elimina eventuali spazi all’inizio e alla fine
		String stringa = input.nextLine().trim();
		
		// Variabile che conterrà la stringa invertita
		String inversa = "";
		 
		// Ciclo che parte dall’ultimo carattere e arriva al primo
			for (int i = stringa.length() - 1; i >= 0; i--) {
		    	inversa = inversa + stringa.charAt(i);
			}
		 
	    System.out.println(inversa);
	    input.close();
	}
}
*/
