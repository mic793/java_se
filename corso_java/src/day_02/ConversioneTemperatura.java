package day_02;

/* Write a Java program that prompts the user to enter a temperature in Celsius and prints the corresponding 
 * temperature in Fahrenheit.
 * Use the formula: Fahrenheit = Celsius * 9/5 + 32.
*/

import java.util.Scanner;

//Dichiarazione della classe pubblica del programma.
/*
 * public class ConversioneTemperatura {
 * 
 * // Metodo principale (main), il punto di ingresso per l'esecuzione del
 * programma. public static void main(String[] args) {
 * 
 * // Crea un nuovo oggetto Scanner per leggere l'input dall'utente (tastiera).
 * Scanner scanner = new Scanner(System.in);
 * 
 * // Stampa un messaggio a schermo per chiedere all'utente di inserire la
 * temperatura.
 * System.out.println("Inserisci la temperatura in gradi Celsius: "); // Legge
 * il valore numerico (double) inserito dall'utente e lo assegna alla variabile
 * 'celsius'. double celsius = scanner.nextDouble();
 * 
 * // Converte la temperatura da Celsius a Fahrenheit usando la formula e salva
 * il risultato. double fahrenheit = celsius * 9 / 5 + 32;
 * 
 * // Stampa a schermo la temperatura convertita in Fahrenheit. (Riga aggiunta)
 * System.out.println("La temperatura in Fahrenheit e': " + fahrenheit);
 * 
 * // Chiude lo scanner per liberare le risorse di sistema. scanner.close(); }
 * 
 * }
 */

//ESERCIZIO 5
//Scrivi un programma Java che chieda all'utente di inserire una temperatura in gradi Celsius e stampi la corrispondente temperatura in gradi Fahrenheit. 
//Utilizza la formula: Fahrenheit = Celsius * 9/5 + 32.

public class ConversioneTemperatura{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la temperatura in gradi Celsius: ");
		double celsius = input.nextDouble();
		
		double fahrenheit = celsius * 9/5 + 32;
		System.out.println("La temperatura in gradi Fahrenheit e': " + fahrenheit);
		
		input.close();
	}
}
