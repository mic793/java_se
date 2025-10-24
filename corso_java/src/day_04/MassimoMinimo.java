package day_04;

/*Write a Java program that calculates the maximum and minimum values in an array of integers.*/

public class MassimoMinimo {

	public static void main(String[] args) {

        // Dichiara e inizializza un array di numeri interi.
        int[] numeri = {5, 10, -2, 8, 3};
        
        // Inizializza la variabile 'massimo' con il primo elemento dell'array come valore di partenza.
        int massimo = numeri[0];
        
        // Inizializza la variabile 'minimo' con il primo elemento dell'array come valore di partenza.
        int minimo = numeri[0];
        
        // Inizia un ciclo 'for' che parte dal secondo elemento (indice 1) fino alla fine dell'array.
        for(int i = 1; i < numeri.length; i++) {
        	
            // Se il numero corrente è maggiore del massimo attuale,
            if(numeri[i] > massimo) {
                // aggiorna il massimo con il valore del numero corrente.
                massimo = numeri[i];
            }
            // Se il numero corrente è minore del minimo attuale,
            if(numeri[i] < minimo) {
                // aggiorna il minimo con il valore del numero corrente.
                minimo = numeri[i];
            }
        }
        
        // Dopo aver controllato tutti gli elementi, stampa il valore massimo trovato.
        System.out.println("Il valore massimo dell'array e': " + massimo);
        // Stampa il valore minimo trovato.
        System.out.println("Il valore minimo dell'array e': " + minimo);
    } 
    
}



//ESERCIZIO 7
//Scrivi un programma Java che calcola il valore massimo e il valore minimo presenti in un array di interi.
/*
 public class MassimoMinimo {
	public static void main(String[] args) {

		int[] numeri = { 5, 10, -2, 8, 3 };

		int massimo = numeri[0];

		int minimo = numeri[0];

		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] > massimo) {
				massimo = numeri[i];

			} else if (numeri[i] < minimo) {
				minimo = numeri[i];
			}

		}
		System.out.println("Il valore massimo dell'array e': " + massimo);
		System.out.println("Il valore minimo dell'array e': " + minimo);

	}

}
*/
