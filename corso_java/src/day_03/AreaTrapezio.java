package day_03;

/*
 * Implement a program that prompts the user for the lengths of the bases and the height of a trapezoid and calculates its area using geometric formulas.
 */
import java.util.Scanner;
/*
 * public class AreaTrapezio {
 * 
 * public static void main(String[] args) { Scanner scanner = new
 * Scanner(System.in); // Crea un oggetto Scanner per leggere input da tastiera
 * 
 * System.out.println("Inserisci la lunghezza della base maggiore: "); // Stampa
 * messaggio per richiedere la base maggiore double baseMaggiore =
 * scanner.nextDouble(); // Legge un numero decimale e lo assegna alla variabile
 * baseMaggiore
 * 
 * System.out.println("Inserisci la lunghezza della base minore: "); // Stampa
 * messaggio per richiedere la base minore double baseMinore =
 * scanner.nextDouble(); // Legge un numero decimale e lo assegna alla variabile
 * baseMinore
 * 
 * System.out.println("Inserisci l'altezza: "); // Stampa messaggio per
 * richiedere l'altezza double altezza = scanner.nextDouble(); // Legge un
 * numero decimale e lo assegna alla variabile altezza
 * 
 * double areaTrapezio = (baseMaggiore + baseMinore) * altezza / 2; // Calcola
 * l'area usando la formula: (b1 + b2) * h / 2
 * 
 * System.out.println("L'area del trapezio e': " + areaTrapezio); // Stampa il
 * risultato del calcolo
 * 
 * scanner.close(); // Chiude lo Scanner per liberare le risorse }
 * 
 * }
 */

//ESERCIZIO 4
//Implementa un programma che chieda all'utente di inserire la lunghezza delle basi e l'altezza di un trapezio e calcoli la sua area utilizzando le formule geometriche.
public class AreaTrapezio{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci la lunghezza della base maggiore: ");
		double baseMaggiore = input.nextDouble();
		
		System.out.println("Inserisci la lunghezza della base minore: ");
		double baseMinore = input.nextDouble();
		
		System.out.println("Inserisci l'altezza: ");
		double altezza = input.nextDouble();
		
		double calcoloArea = (baseMaggiore + baseMinore) *altezza/2;
		
		System.out.println("L'area del trapezio e': " + calcoloArea);
		
		input.close();
		
	}
	
}