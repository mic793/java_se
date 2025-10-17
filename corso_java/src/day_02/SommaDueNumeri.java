package day_02;

import java.util.Scanner;

/*
 * Sum of Two Numbers
 * Write a Java program that asks the user to enter two integer numbers and prints their sum.
 * Scrivi un programma Java che chieda all'utente di inserire due numeri interi e stampi la loro somma.
 */
/*public class SumTwoNumbers {

	*public static void main(String[] args) {
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Inserisci il primo numero: "); 
		 * 
		 * int x = input.nextInt();
		 * 
		 * System.out.println("Inserisci il secondo numero: "); 
		 * 
		 * int y = input.nextInt();
		 * 
		 * int somma = x + y;
		 * 
		 * System.out.println("La somma di x + y e': " + somma); inpu
		 * input.close();
		 */

//ESERCIZIO 1
public class SommaDueNumeri {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci il primo numero: ");

		int x = input.nextInt();

		System.out.println("Inserisci il secondo numero: ");

		int y = input.nextInt();

		int somma = x + y;

		System.out.println("La somma dei due numeri e': " + somma);

		input.close();

	}
}
