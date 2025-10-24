package day_04;

/*
 * Il fattoriale di un numero serve per calcolare il prodotto di tutti i numeri interi positivi fino a quel numero.
 * 
 * Si indica con il punto esclamativo (!).
 * Per esempio:
 * 5! = 5×4×3×2×1=120
 * 4! = 4×3×2×1=24
 * 3! = 3×2×1=6
 * 1! = 1
 * E per convenzione, 0!=1
 * 
 * In pratica, il fattoriale serve per contare quante possibili combinazioni o permutazioni ci sono in certi problemi matematici o informatici 
 * (come disporre oggetti in tutti i modi possibili).
 * Esempio: se ci sono 3 libri diversi e si vogliono mettere in ordine su uno scaffale, ci sono
 * 3!=3×2×1 = 6 modi diversi per farlo.
 *
 * 
 * Write a Java program that calculates the factorial of a given number.
 * e.g. 9! = 9*8*7*6*5*4*3*2*1
 * 
 * */
//ESERCIZIO 9
public class FattorialeIterativo {
	
	public static void main(String[] args) {
        
        // Dichiara e imposta a 5 il numero di cui si desidera calcolare il fattoriale.
        int numero = 5;
        
        // Inizializza a 1 la variabile che accumulerà il risultato del calcolo.
        int fattoriale = 1;

        // Inizia un ciclo 'for' che parte da 1 e continua fino a quando 'i' è minore o uguale a 'numero'.
        for (int i = 1; i <= numero; i++) {
        	
            // Ad ogni iterazione, moltiplica il valore corrente di 'fattoriale' per l'indice 'i'.
            fattoriale = fattoriale * i;
        }

        // Stampa a video il risultato finale, indicando il numero e il suo fattoriale.
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);
    }
}


//ESERCIZIO 9
//Scrivi un programma Java che calcola il fattoriale di un numero dato.
//es. 9! = 9*8*7*6*5*4*3*2*1
//Il fattoriale di un numero intero positivo 𝑛, indicato con il simbolo n!, 
//è il prodotto di tutti i numeri interi positivi minori o uguali a n.

//Fattoriale iterativo: usa un ciclo for per moltiplicare progressivamente, senza chiamate a sé stesso.

/*
public class FattorialeIterativo {

	
	public static void main(String[] args) {
		int numero = 9;

		int fattoriale = 1;

		for (int i = 1; i <= numero; i++) {
			fattoriale = fattoriale * i;
		}

		System.out.println("Il fattoriale di " + numero + " e': " + fattoriale);

	}

}
*/
