package day_02;

import java.util.Random;

/* Write a Java program that simulates rolling a six-sided die. 
 * The program should randomly generate a number between 1 and 6 and print it to the screen.
 * Scrivi un programma Java che simuli il lancio di un dado a sei facce. 
 * Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e stamparlo a schermo.
 */

/*//Dichiarazione della classe pubblica del programma.
public class DiceThrowingGame {

	// Metodo principale (main), il punto di ingresso per l'esecuzione del programma.
	public static void main(String[] args) {
		
		// Crea un nuovo oggetto (istanza) della classe Random.
		Random random = new Random();
		
		// Genera un numero intero casuale da 0 a 5, gli somma 1 e lo assegna alla variabile 'risultato'.
		int risultato = random.nextInt(6)+1;
		
		// Stampa sulla console la stringa di testo concatenata al valore della variabile 'risultato'.
		System.out.println("Il risultato del lancio del dado e': " + risultato);		
	}
}*/

//ESERCIZIO 3
//Scrivi un programma Java che simuli il lancio di un dado a sei facce. Il programma dovrà generare casualmente un numero compreso tra 1 e 6 e stamparlo a schermo.
public class LancioDado {

	// Metodo principale (main), il punto di ingresso per l'esecuzione del programma.
	public static void main(String[] args) {
		
		// Crea un nuovo oggetto (istanza) della classe Random.
		Random numCasuale = new Random();
		
		// Genera un numero intero casuale da 0 a 5, gli somma 1 e lo assegna alla variabile 'risultato'.
		int risultato = numCasuale.nextInt(6)+1;
		
		// Stampa sulla console la stringa di testo concatenata al valore della variabile 'risultato'.
		System.out.println("Il risultato del lancio del dado e': " + risultato);
	}
}