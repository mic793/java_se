package day_04;

/*Write a Java program that calculates the power of a base number raised to a given exponent.*/

/*public class Potenza {

	public static void main(String[] args) {
		        
	        // Dichiara e inizializza la base della potenza.
	        int base = 2;
	        
	        // Dichiara e inizializza l'esponente.
	        int esponente = 5;
	        
	        // Inizializza la variabile che conterrà il risultato finale (parte da 1).
	        int risultato = 1;
	        
	        // Inizia un ciclo 'for' che si ripete un numero di volte pari al valore dell'esponente.
	        for(int i = 0; i < esponente; i++) {
	
	        	// Ad ogni ciclo, moltiplica il risultato corrente per la base.
	        	risultato = risultato * base; 
	        }
	        
	        // Stampa a video la frase con il risultato del calcolo.
	        System.out.println(base + " elevato alla potenza " + esponente + " e' uguale a: " + risultato);

	    } 

	} 
	
	*/


//ESERCIZIO 5
//Scrivi un programma Java che calcoli la potenza di un numero base elevato a un esponente dato.

public class Potenza{
	public static void main(String[] args) {
		
		int base = 2;
		
		int esponente = 5;
		
		int risultato = 1;
		
		for(int i = 0; i < esponente; i++) {
			
			risultato = risultato * base;
		}
		
		System.out.println(base + " elevato alla potenza " + esponente + " e' uguale a: " + risultato);
		
	}
	
}

