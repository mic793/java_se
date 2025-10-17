package day_02;

/*
 * Write a Java program that prompts the user for the radius of a circle and prints the corresponding area. 
 * Use the constant value of π, such as 3.14159.
 */
import java.util.Scanner;

/*
 * //Dichiarazione della classe pubblica del programma. public class AreaCerchio
 * {
 * 
 * // Metodo principale (main), il punto di ingresso per l'esecuzione del
 * programma. public static void main(String[] args) { // Crea un nuovo oggetto
 * Scanner per leggere l'input fornito tramite la tastiera. Scanner scanner =
 * new Scanner(System.in);
 * 
 * // Stampa a schermo una richiesta per l'utente, invitandolo a inserire il
 * raggio. System.out.println("Inserisci il raggio del cerchio"); // Legge il
 * valore numerico (double) inserito dall'utente e lo memorizza nella variabile
 * 'raggio'. double raggio = scanner.nextDouble();
 * 
 * // Calcola l'area del cerchio usando la formula (π * raggio * raggio) e la
 * salva nella variabile 'areaCircle'. double areaCircle = Math.PI * raggio *
 * raggio; // Stampa a schermo la stringa di testo insieme al valore calcolato
 * dell'area. System.out.println("L'area del cerchio e': " + areaCircle);
 * 
 * // Chiude l'oggetto scanner per rilasciare le risorse di sistema.
 * scanner.close(); }
 * 
 * }
 */

//ESERCIZIO 4
//Scrivi un programma Java che chieda all'utente di inserire il raggio di un cerchio e stampi l'area corrispondente. Utilizza il valore costante di π come 3.14159.
public class AreaCerchio{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il raggio del cerchio: ");
		
		double raggio = input.nextDouble();
		
		double area = Math.PI * raggio * raggio;
		System.out.println("L'area del cerchio e': " + area);
		
		input.close();
	}
}