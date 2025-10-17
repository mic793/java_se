package algoritmi_colloquio;

/**
 * Bubble Sort
 */
public class BubbleSort {

	public static void bubbleSort(int[] arr, int n) {

		// Dichiarazione delle variabili di supporto.
		int i, j, temp;
		
		boolean swapped = false;

		// Ciclo esterno: controlla le "passate". Ad ogni passata, l'elemento più grande
		// viene "spinto" alla fine.
		// Si ripete n-1 volte, perché dopo n-1 passate, tutti gli elementi sono al loro
		// posto.
		for (i = 0; i < n - 1; i++) {
			// All'inizio di ogni nuova passata, impostiamo 'swapped' a false.
			// Se rimarrà false, sapremo che l'array è ordinato.
			swapped = false;

			// Ciclo interno: esegue i confronti tra elementi adiacenti.
			// Ad ogni passata dell'esterno, l'ultimo elemento è già al suo posto, quindi
			// potremmo ottimizzare
			// il limite a 'n - 1 - i', ma questa versione funziona comunque correttamente.
			for (j = 0; j < n - 1 - i; j++) {
				// Confronta l'elemento corrente con il successivo.
				if (arr[j] > arr[j + 1]) {
					// Se sono nell'ordine sbagliato (l'elemento a sinistra è più grande di quello a
					// destra)...

					// ...esegui lo scambio.
					temp = arr[j]; // 1. Salva il valore di arr[j] in una variabile temporanea.
					arr[j] = arr[j + 1]; // 2. Copia il valore di arr[j+1] in arr[j].
					arr[j + 1] = temp; // 3. Copia il valore salvato in temp in arr[j+1].

					// Imposta il flag a 'true' per indicare che è avvenuto almeno uno scambio in
					// questa passata.
					swapped = true;
				}
			}

			// Controllo di ottimizzazione: se dopo un'intera passata del ciclo interno non
			// è avvenuto nessuno scambio...
			if (swapped == false)
				// ...l'array è già ordinato. Interrompiamo il ciclo esterno per evitare passate
				// inutili.
				break;
		}
	}

	
	//Metodo di utilità per stampare a video tutti gli elementi di un array.
	public static void printArray(int[] arr) {
		// Utilizza un ciclo for-each per scorrere ogni elemento 'i' dell'array.
		for (Integer i : arr) {
			// Stampa l'elemento corrente su una nuova riga.
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		int[] numbers = { 10, 56, 1, 42, 5 };
		System.out.println("Array prima dell'ordinamento: ");

		printArray(numbers);
		bubbleSort(numbers, numbers.length);

		System.out.println("array dopo l'ordinamento: ");
		printArray(numbers);

	}

}
