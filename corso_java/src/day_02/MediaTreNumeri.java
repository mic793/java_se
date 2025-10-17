package day_02;

import java.util.Scanner;

/* Write a Java program that prompts the user to enter three numbers and prints their average.*/

/*
 * public class MediaTreNumeri { public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * System.out.print("Inserisci il primo numero: "); double numero1 =
 * scanner.nextDouble(); System.out.print("Inserisci il secondo numero: ");
 * double numero2 = scanner.nextDouble();
 * System.out.print("Inserisci il terzo numero: "); double numero3 =
 * scanner.nextDouble(); double media = (numero1 + numero2 + numero3) / 3;
 * System.out.println("La media dei tre numeri è: " + media); scanner.close(); }
 * }
 */

//ESERCIZIO 6
//Scrivi un programma Java che chieda all'utente di inserire tre numeri e stampi la loro media.
public class MediaTreNumeri{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Inserisci il primo numero: ");
		double numero1 = input.nextDouble();
		
		System.out.println("Inserisci il secondo numero");
		double numero2 = input.nextDouble();
		
		System.out.println("Inserisci il terzo numero");
		double numero3 = input.nextDouble();
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("La media dei tre numeri e': " + media);
		
		input.close();
		
	}
}