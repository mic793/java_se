package day_04;

/*Write a Java program that calculates the number of occurrences of a specified letter within a given string.*/

/*public class Occorrenze {

	public static void main(String[] args) {
		// Dichiara e inizializza una stringa di testo.
        String stringa = "Hello friends!";
        
        // Dichiara il carattere specifico da cercare all'interno della stringa.
        char lettera = 'e';
        
        // Inizializza un contatore a zero per tenere traccia delle occorrenze.
        int conteggio = 0;
        
        // Inizia un ciclo 'for' per scorrere ogni carattere della stringa, dalla posizione 0 all'ultima.
        for(int i = 0; i < stringa.length(); i++) {
        	
            // Controlla se il carattere nella posizione corrente 'i' è uguale alla lettera che stiamo cercando.
            if(stringa.charAt(i) == lettera) {
                // Se i caratteri corrispondono, incrementa il contatore.
                conteggio = conteggio +1;
            }
        }
        // Stampa il risultato finale, mostrando quante volte la lettera è stata trovata.
        System.out.println("Il numero delle occorrenze della lettera '" + lettera + "' nella stringa e': " + conteggio);
        }
	}
*/

//ESERCIZIO 2
//Scrivi un programma Java che calcoli il numero di occorrenze di una lettera specificata all'interno di una stringa data.
public class Occorrenza{
	public static void main(String[] args) {
		
		String frase = "Hello, Java!";
		
		char lettera = 'l';
		
		int conteggio = 0;
		
		for(int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) == lettera) {
				conteggio = conteggio + 1; //conteggio++;
			}			
		}
		System.out.println("Il numero di occorrenze della lettera '" + lettera + "' è : " + conteggio);
	}
	
}