package day_03;

/*
 * Implement a program that prompts the user to enter a number and calculates its absolute value using the abs() method of the Math class.
 */

import java.util.Scanner;

/*
 * public class ValoreAssoluto {
 * 
 * public static void main(String[] args) { // Crea un nuovo oggetto Scanner per
 * leggere l'input dalla console. [2, 3, 8] Scanner scanner = new
 * Scanner(System.in);
 * 
 * // Stampa un messaggio per chiedere all'utente di inserire un numero.
 * System.out.println("Inserisci un numero: "); // Legge il prossimo numero
 * double inserito dall'utente e lo memorizza nella variabile 'numero'. double
 * numero = scanner.nextDouble();
 * 
 * // Calcola il valore assoluto del numero usando il metodo Math.abs() e lo
 * memorizza. [4, 5, 6, 7] double valoreAssoluto = Math.abs(numero);
 * 
 * // Stampa il valore assoluto del numero inserito.
 * System.out.println("Il valore assoluto di " + numero + " e' " +
 * valoreAssoluto);
 * 
 * scanner.close(); }
 * 
 * }
 */


//ESERCIZIO 2
//Implementa un programma che chieda all'utente di inserire un numero e calcoli il suo valore assoluto utilizzando il metodo abs() della classe Math.

public class ValoreAssoluto{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci un numero: ");
		double numero = input.nextDouble();
		
		double valoreAssoluto = Math.abs(numero);
		
		System.out.println("Il valore assoluto di " + numero + " e': " + valoreAssoluto);
		
		input.close();		
		
	}
	
}