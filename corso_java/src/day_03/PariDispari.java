package day_03;

/*
 * Implement a program that prompts the user for an integer and checks whether it is even or odd using the modulo operator.
*/
import java.util.Scanner;

/*
 * public class PariDispari {
 * 
 * public static void main(String[] args) { // Crea un oggetto di tipo Scanner
 * per catturare l'input dell'utente. Scanner scanner = new Scanner(System.in);
 * 
 * // Stampa a video una richiesta per l'utente.
 * System.out.println("Inserisci un numero: "); // Legge il numero intero
 * inserito dall'utente e lo salva nella variabile 'numero'. int numero =
 * scanner.nextInt();
 * 
 * // Controlla se il resto della divisione del numero per 2 è uguale a 0.
 * if(numero % 2 == 0) { // Se il resto è 0, il numero è pari e stampa questo
 * messaggio. System.out.println(numero + " e' un numero pari."); } else { //
 * Altrimenti, il numero è dispari e stampa quest'altro messaggio.
 * System.out.println(numero + " e' un numero dispari. "); } // Chiude lo
 * scanner per liberare le risorse. scanner.close(); } }
 */


//ESERCIZIO 3
//Implementa un programma che chieda all'utente di inserire un numero intero e verifichi se è pari o dispari utilizzando l'operatore modulo.
public class PariDispari {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserire un numero intero: ");
		int numero = input.nextInt();

		if (numero % 2 == 0) {
			System.out.println(numero + " e' pari");
		} else {
			System.out.println(numero + " e' dispari");
		}
		input.close();

	}

}