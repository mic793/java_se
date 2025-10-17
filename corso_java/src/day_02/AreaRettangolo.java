package day_02;

import java.util.Scanner;

/* ESERCIZIO 2
 * Write a Java program that prompts the user for the length and width of a rectangle and prints the corresponding area.
 * Scrivi un programma Java che chieda all'utente di inserire la lunghezza e la larghezza di un 
 * rettangolo e stampi l'area corrispondente.
 */

/*
 * import java.util.Scanner;
 * 
 * public class CalculatingAreaRectangle {
 * 
 * public static void main(String[] args) { // Crea un oggetto Scanner per
 * leggere l'input dell'utente dalla console. [2, 3] Scanner scanner = new
 * Scanner(System.in);
 * 
 * System.out.println("Inserire la lunghezza del rettangolo"); // Stampa un
 * messaggio per chiedere all'utente di inserire la lunghezza. double lunghezza
 * = scanner.nextDouble();// Legge il valore decimale (double) inserito e lo
 * salva nella variabile 'lunghezza'.
 * 
 * System.out.println("Inserire la larghezza del rettangolo");// Stampa un
 * messaggio per chiedere all'utente di inserire la larghezza. double larghezza
 * = scanner.nextDouble();// Legge il valore decimale (double) inserito e lo
 * salva nella variabile 'larghezza'.
 * 
 * double calcoloArea = lunghezza * larghezza;// Calcola l'area moltiplicando
 * lunghezza per larghezza. System.out.println("L'area del rettangolo e': " +
 * calcoloArea);// Stampa il risultato del calcolo dell'area a video.
 * 
 * scanner.close();// Chiude lo scanner per rilasciare le risorse di sistema
 * associate. }
 * 
 * }
 */

//ESERCIZIO 2
//Scrivi un programma Java che chieda all'utente di inserire la lunghezza e la larghezza di un rettangolo e stampi l'area corrispondente.

public class AreaRettangolo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci la lunghezza del rettangolo: ");
		double lunghezza = input.nextDouble();

		System.out.println("Inserisci la larghezza del rettangolo: ");
		double larghezza = input.nextDouble();

		double area = lunghezza * larghezza;
		System.out.println("L'area del rettangolo e': " + area);

		input.close();

	}
}