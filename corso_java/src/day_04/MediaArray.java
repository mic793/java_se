package day_04;

//ESERCIZIO 6
/*Write a Java program that calculates the average of the values in an array of floating-point numbers.*/

public class MediaArray {

	public static void main(String[] args) {
		// Dichiara e inizializza un array di numeri in virgola mobile (double).
        double[] numeri = {2.5, 3.8, 4.2, 1.9, 2.1};
        //                  0    1    2    3    4
        
        // Dichiara una variabile 'somma' e la inizializza a 0 per accumulare i valori.
        double somma = 0;
          
        for(int i = 0; i < numeri.length; i++) {
        	somma = somma + numeri[i];
        }

        // Calcola la media dividendo la somma totale per il numero di elementi nell'array.
        double media = somma / numeri.length;

        // Stampa a video il risultato finale. (Questa era la parte mancante)
        System.out.println("La media dei valori nell'array e': " + media);
    }
}


//ESERCIZIO 6
//Scrivi un programma Java che calcola la media dei valori presenti in un array di numeri in virgola mobile (double).
/*
public class MediaArray {
	public static void main(String[] args) {

		double[] numeri = { 2.5, 8.9, 7.6, 10.56 };

		double somma = 0;

		for (int i = 0; i < numeri.length; i++) {
			somma = somma + numeri[i];
		}

		double media = somma / numeri.length;

		System.out.println("La media dei valori nell'array e': " + media);
	}

}
*/