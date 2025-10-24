package day_04;

//ESERCIZIO 8
/*
 * Write a Java program that searches for a specific element within an internal array and returns its position (index).
 */

public class RicercaElemento {

    public static void main(String[] args) {
        // Dichiara e inizializza un array di numeri interi.
        int[] numeri = {10, 20, 30, 40, 50};
        
        // Dichiara la variabile contenente l'elemento da cercare.
        int elemento = 30;
        
        // Inizializza la posizione a -1, un valore standard per indicare "non trovato".
        int posizione = -1;
        
        // Inizia un ciclo 'for' per scorrere l'array dal primo all'ultimo elemento.
        for (int i = 0; i < numeri.length; i++) {
        	
            // Controlla se l'elemento corrente dell'array corrisponde a quello cercato.
            if (numeri[i] == elemento) {
                // Se c'è una corrispondenza, salva l'indice 'i' nella variabile 'posizione'.
                posizione = i;
                // Interrompe il ciclo immediatamente, poiché l'elemento è stato trovato.
                break;
            }
        }
        
        // Controlla se la variabile 'posizione' è stata modificata (se è diversa da -1).
        if (posizione != -1) {
            // Se l'elemento è stato trovato, stampa la sua posizione (indice).
            System.out.println("L'elemento " + elemento + " si trova alla posizione " + posizione);
        } else {
            // Altrimenti, comunica che l'elemento non è presente nell'array.
            System.out.println("L'elemento " + elemento + " non è presente nell'array.");
        }
    } 
    
} 



//ESERCIZIO 8
//Scrivi un programma Java che ricerca un elemento specifico all'interno di un array di interi e restituisce la sua posizione (indice).
/*
 public class RicercaElemento {
 
	public static void main(String[] args) {
		int[] numeri = { 10, 20, 30, 40, 50 };

		int elemento = 30;

		int posizione = -1;

		for (int i = 0; i < numeri.length; i++) {
			if (numeri[i] == elemento) {
				posizione = i;
				break;
			}

		}
		if (posizione != -1) {
			System.out.println("L'elemento " + elemento + " si trova alla posizione con indice " + posizione);
		} else {
			System.out.println("L'elemento non si trova nell'array");
		}

	}

}
*/
