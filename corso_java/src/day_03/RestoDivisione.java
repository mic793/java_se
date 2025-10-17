package day_03;

import java.util.Scanner;

/*
 * Implement a program that prompts the user to enter two numbers and calculates the remainder of the division 
 * between the first number and the second number using the modulo operator.*/

/*
 * public class RestoDivisione {
 * 
 * // Metodo principale (main), che viene eseguito quando il programma si avvia.
 * public static void main(String[] args) { // Crea un nuovo oggetto Scanner per
 * leggere l'input dalla console (tastiera). Scanner scanner = new
 * Scanner(System.in);
 * 
 * // Stampa a schermo un messaggio che chiede all'utente di inserire il primo
 * numero. System.out.println("Inserisci il primo numero"); // Legge il numero
 * intero inserito dall'utente e lo salva nella variabile 'numero1'. int numero1
 * = scanner.nextInt();
 * 
 * // Chiede all'utente di inserire il secondo numero.
 * System.out.println("Inserisci il secondo numero"); // Legge il secondo numero
 * intero e lo salva nella variabile 'numero2'. int numero2 = scanner.nextInt();
 * 
 * // Calcola il resto della divisione tra 'numero1' e 'numero2' usando
 * l'operatore modulo (%). int resto = numero1 % numero2;
 * 
 * // Stampa a schermo una frase che include i numeri inseriti e il resto
 * calcolato. System.out.println("Il resto della divisione tra " + numero1 +
 * " e " + numero2 + " e' " + resto);
 * 
 * // Chiude l'oggetto scanner per rilasciare le risorse di sistema.
 * scanner.close(); }
 * 
 * }
 */

//ESERCIZIO 1
//Implementa un programma che chieda all'utente di inserire due numeri e calcoli il resto della divisione tra il primo numero e il secondo numero utilizzando l'operatore modulo.
public class RestoDivisione{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserire il primo numero: ");		
		int numero1 = input.nextInt();
		
		System.out.println("Inserire il secondo numero: ");
		int numero2 = input.nextInt();
		
		int restoDivisione = numero1 % numero2;
		
		System.out.println("Il resto della divisione tra "+ numero1 + " e " + numero2 + " e': " + restoDivisione);
		
		input.close();
		
	}
	
}